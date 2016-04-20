package com.createbling.modules.sys.web;

import java.util.List;
import java.util.Map;

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

	@RequiresPermissions("sys:office:view")
	@RequestMapping(value = {"list"})
	public String list(Area area, Model model) {
        model.addAttribute("list", areaService.findList(area));
		return "modules/sys/areaList";
	}
	
	@RequiresPermissions("sys:office:view")
	@RequestMapping(value = "form")
	public String form(Area area, Model model) {
		User user = UserUtils.getUser();
		if (area.getParent()==null || area.getParent().getId()==null){
			area.setParent(user.getArea());
		}
		area.setParent(areaService.get(area.getParent().getId()));
		//if (office.getArea()==null){
			//office.setArea(user.getOffice().getArea());
		//}
		// 自动获取排序号
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
			area.setCode(area.getParent().getCode() + StringUtils.leftPad(String.valueOf(size > 0 ? size+1 : 1), 3, "0"));
		}
		model.addAttribute("area", area);
		return "modules/sys/areaForm";
	}
	
	@RequiresPermissions("sys:area:edit")
	@RequestMapping(value = "save")
	public String save(Area area, Model model, RedirectAttributes redirectAttributes) {
		if(Global.isDemoMode()){
			addMessage(redirectAttributes, "演示模式，不允许操作！");
			return "redirect:" + adminPath + "/sys/area/";
		}
		if (!beanValidator(model, area)){
			return form(area, model);
		}
		areaService.save(area);
		
		if(area.getChildDeptList()!=null){
			Area childArea = null;
			for(String id : area.getChildDeptList()){
				childArea = new Area();
				childArea.setName(DictUtils.getDictLabel(id, "sys_area_common", "未知"));
				childArea.setParent(area);
				childArea.setParentarea(area);
				childArea.setType("2");
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
//		if (Office.isRoot(id)){
//			addMessage(redirectAttributes, "删除机构失败, 不允许删除顶级机构或编号空");
//		}else{
		areaService.delete(area);
			addMessage(redirectAttributes, "删除机构成功");
//		}
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
	@RequiresPermissions("user")
	@ResponseBody
	@RequestMapping(value = "treeData")
	public List<Map<String, Object>> treeData(@RequestParam(required=false) String extId, @RequestParam(required=false) String type,
			@RequestParam(required=false) Long grade, @RequestParam(required=false) Boolean isAll, HttpServletResponse response) {
		List<Map<String, Object>> mapList = Lists.newArrayList();
		List<Area> list = areaService.findList(isAll);
		for (int i=0; i<list.size(); i++){
			Area e = list.get(i);
			if ((StringUtils.isBlank(extId) || (extId!=null && !extId.equals(e.getId()) && e.getParentIds().indexOf(","+extId+",")==-1))
					&& (type == null || (type != null && (type.equals("1") ? type.equals(e.getType()) : true)))
					//&& (grade == null || (grade != null && Integer.parseInt(e.getGrade()) <= grade.intValue()))
					&& Global.YES.equals(e.getUseable())){
				Map<String, Object> map = Maps.newHashMap();
				map.put("id", e.getId());
				map.put("pId", e.getParentId());
				map.put("pIds", e.getParentIds());
				map.put("name", e.getName());
				if (type != null && "3".equals(type)){
					map.put("isParent", true);
				}
				mapList.add(map);
			}
		}
		return mapList;
	}	 
}
