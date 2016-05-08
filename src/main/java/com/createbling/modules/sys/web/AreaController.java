package com.createbling.modules.sys.web;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.createbling.common.config.Global;
import com.createbling.common.utils.StringUtils;
import com.createbling.common.web.BaseController;
import com.createbling.modules.sys.entity.Area;

import com.createbling.modules.sys.entity.User;
import com.createbling.modules.sys.service.AreaService;

import com.createbling.modules.sys.utils.DictUtils;
import com.createbling.modules.sys.utils.UserUtils;

/**
 * 机构Controller
 * @author createbling
 * @version 2016-2-15
 */
@Controller
@RequestMapping(value ="${adminPath}/sys/area")
public class AreaController extends BaseController {

	@Autowired
	private AreaService areaService;
	
	@ModelAttribute("area")
	public Area get(@RequestParam(required=false) String id) {
		if (StringUtils.isNotBlank(id)){
			return areaService.get(id);
		}else{
			return new Area();
		}
	}

	@RequiresPermissions("sys:area:view")
	@RequestMapping(value = {""})
	public String index(Area area, Model model) {
//        model.addAttribute("list", officeService.findAll());
		return "modules/sys/areaIndex";
	}

	@RequiresPermissions("sys:area:view")
	@RequestMapping(value = {"list"})
	public String list(Area area, Model model) {
		Boolean isAll = true;
        model.addAttribute("list", areaService.findList(isAll));
		return "modules/sys/areaList";
	}
	
	@RequiresPermissions("sys:area:view")
	@RequestMapping(value = "form")
	public String form(Area area, Model model,HttpServletRequest request,HttpServletResponse response) {
		String id=request.getParameter("id"); 
		String parent_id=request.getParameter("parent_id"); 
		Area a=areaService.findNodeById(id);
		Area ap=areaService.findNodeById(parent_id);
		if (id!=null){
			area=a;
		}
		if(parent_id!=null){
			area.setParent(ap);
		}
		
		User user = UserUtils.getUser();
		if (area.getParent()==null || area.getParent().getId()==null){
			area.setParent(user.getArea());
		}
		area.setParent(areaService.get(area.getParent().getId()));
		if (StringUtils.isBlank(area.getId())&&area.getParent()!=null){
			int size = 0;
			List<Area> list = areaService.findAll();
			for (int i=0; i<list.size(); i++){
				Area e = list.get(i);
				if (e.getParent()!=null && e.getParent().getId()!=null
						&& e.getParent().getId().equals(area.getParent().getId())){
					size++;
				}
			}
			//area.setCode(area.getParent().getCode() + StringUtils.leftPad(String.valueOf(size > 0 ? size+1 : 1), 3, "0"));
		}
		//System.out.println("area的爸爸："+area.getParent().getName());
		model.addAttribute("area", area);
		if(a!=null){
			if(a.getType().equals("detail_base"))//修改基地
				return "modules/sys/detail_base";
			else if(a.getType().equals("detail_plant"))//修改or修改作物
				return "modules/sys/detail_plant";
			else if(a.getType().equals("detail_parameter"))//修改or修改周期
				return "modules/sys/detail_parameter";
			else if(a.getType().equals("detail_cycle"))//修改or修改参数
				return "modules/sys/detail_cycle";
			else 
				return "modules/sys/detail_sensor";
		}
		
		else if(ap!=null){
			if(ap.getType().equals("detail_base"))//添加or修改作物
				return "modules/sys/detail_plant";
			else if(ap.getType().equals("detail_plant"))//添加参数or周期
				return "modules/sys/detail_cycle_param";
			else 
				return "modules/sys/detail_sensor";
		}
		else return  "modules/sys/areaForm";
		
	} 
	
	@RequiresPermissions("sys:area:edit")
	@RequestMapping(value = "save")
	public String save(Area area, Model model, RedirectAttributes redirectAttributes) {
		if(Global.isDemoMode()){
			addMessage(redirectAttributes, "演示模式，不允许操作！");
			return "redirect:" + adminPath + "/sys/area/";
		}
		if (!beanValidator(model, area)){
			return form(area, model,null,null);
		}
		
		areaService.save(area);
		
		if(area.getChildDeptList()!=null){
			Area childArea = null;
			for(String id : area.getChildDeptList()){
				childArea = new Area();
				childArea.setName(DictUtils.getDictLabel(id, "sys_area_common", "未知"));
				childArea.setParent(area);
				childArea.setParent(area);
				childArea.setType("detail_plant");
				childArea.setType(String.valueOf(Integer.valueOf(area.getType())+1));
				childArea.setUseable(Global.YES);
				areaService.save(childArea);
			}
		}
		
		addMessage(redirectAttributes, "保存机构'" + area.getName() + "'成功");
		String id = "0".equals(area.getParentId()) ? "" : area.getParentId();
		return "redirect:" + adminPath + "/sys/area/list?id="+id+"&parentIds="+area.getParentIds();
	}
	
	@RequiresPermissions("sys:area:edit")
	@RequestMapping(value = "delete")
	public String delete(Area area, RedirectAttributes redirectAttributes) {
		if(Global.isDemoMode()){
			addMessage(redirectAttributes, "演示模式，不允许操作！");
			return "redirect:" + adminPath + "/sys/area/list";
		}
		areaService.delete(area);
			addMessage(redirectAttributes, "删除机构成功");
		return "redirect:" + adminPath + "/sys/area/list?id="+area.getParentId()+"&parentIds="+area.getParentIds();
	}

	/**
	 * 获取机构JSON数据。
	 * @param extId 排除的ID
	 * @param type	类型（1：公司；2：部门/小组/其它：3：用户）
	 * @param grade 显示级别
	 * @param response
	 * @return
*/
	@RequiresPermissions("admin")
	@ResponseBody
	@RequestMapping(value = "treeData")
	public List<Map<String, Object>> treeData(@RequestParam(required=false) String extId,@RequestParam(required=false) Boolean isAll, HttpServletResponse response) {
		List<Map<String, Object>> mapList = Lists.newArrayList();
		List<Area> list = areaService.findList(isAll);
		for (int i=0; i<list.size(); i++){
			//一次取出每一个area
			Area e = list.get(i);
			//如果当前传进来的ID为空、或者此ID不等于取出来的areaID且也不是areaID的父节点且（type为detail_base或者detail_plant且getUseable的
			if ((StringUtils.isBlank(extId) || (extId!=null && !extId.equals(e.getId()) && e.getParentIds().indexOf(","+extId+",")==-1))
					//chauncy修改了这一行，因为type现在有特殊意义，只选择type为detai_base或者detai_plant
					//chauncy注释掉了这一行，因为不需要type作为判断，但是
					//&& (type == null || (type != null && (type.equals("detail_base") || type.equals("detail_plant"))))
					//&& (grade == null || (grade != null && Integer.parseInt(e.getGrade()) <= grade.intValue()))
					//注意：chauncy暂时删除了这一字段，因为我们数据表中并未建立这一字段
					//&& Global.YES.equals(e.getUseable())){
					){
				Map<String, Object> map = Maps.newHashMap();
				System.out.println("从数据库area表中取出的id："+ e.getId());
				map.put("id", e.getId());
				System.out.println("从数据库area表中取出的pId："+ e.getParentId());
				map.put("pId", e.getParentId());
				System.out.println("从数据库area表中取出的pIds："+ e.getParentIds());
				map.put("pIds", e.getParentIds());
				map.put("name", e.getName());
				mapList.add(map);
			}
		}
		return mapList;
	}	 
}
