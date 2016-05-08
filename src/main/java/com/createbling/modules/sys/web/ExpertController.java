package com.createbling.modules.sys.web;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.codehaus.jackson.JsonEncoding;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.createbling.common.web.BaseController;
import com.createbling.modules.sys.entity.Area;
import com.createbling.modules.sys.service.AreaService;
import com.createbling.modules.sys.service.ExpertService;
import com.createbling.modules.sys.utils.StringHandle;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.createbling.modules.sys.entity.Expert;
import com.createbling.common.utils.StringUtils;
/**
 * 机构Controller
 * @author MingSun
 * @version 2016-4-17
 */
@Controller
@RequestMapping("${adminPath}/sys/expert")
public class ExpertController extends BaseController {
	@Autowired
	private ExpertService eService;
	@Autowired
	private AreaService aService;
	
	@ModelAttribute("area")
	public Area get(@RequestParam(required = false)String id){
		if (StringUtils.isNotBlank(id)){
			return aService.get(id);
		}else{
			return new Area();
		}
	}
	
	/**
     * 展示相应某个基地的所有作物的下拉列表
     * @return 选择作物的页面
     */
	@RequiresPermissions("sys:expert:view")
	@RequestMapping(value = {"select",""})
	public String select(Area area, Model model) {
//        model.addAttribute("list", officeService.findAll());
		return "modules/sys/expertIndex";
	}
	
	@RequiresPermissions("sys:expert:view")
	@RequestMapping(value = "modify")
	public String modify(Area area, Model model) {
//        model.addAttribute("list", officeService.findAll());
		return "modules/sys/expertIndex2";
	}

	@RequiresPermissions("sys:expert:view")
	@RequestMapping(value = "listSelect")
	public String listSelect(Area area, Model model) {
		//前台传入了所选的某个作物的id和parentids
		//如果所选的节点的parentids有两个节点或者两个","则表明为作物节点
		//System.out.println("进入了listSelect，其中信息如下："+area.getId()+area.getParentIds());
		//System.out.println("信息如下："+(area.getParentIds() != null)+(area.getId() != null)+(StringHandle.countstr(area.getParentIds(), ","))+"type为："+area.getType());
		
		if(area != null && area.getId() != null && area.getType() != null && area.getType().equals("detail_plant")){
			//说明为作物节点
		//if(area.getType().equals("detail_plant")){
			System.out.println("传进来节点编号和节点父编号并查找数据库信息为："+aService.findNodeById(area.getId())+eService.findAllCycle(area.getId())+eService.findAllParam(area.getId()));
			model.addAttribute("plant", aService.findNodeById(area.getId()));//该作物
			model.addAttribute("timelist", eService.findAllCycle(area.getId()));//该作物所有周期
			model.addAttribute("paramlist",eService.findAllParam(area.getId()));//该作物所有参数
			model.addAttribute("plant_id", area.getId());//该作物id
		}
		return "modules/sys/expertSelect";
	}
	
	/**
	 * 专家值一览表对应controller
	 * @param area
	 * @param model
	 * @return
	 */
	@RequiresPermissions("sys:expert:view")
	@RequestMapping(value = "listModify")
	public String listModify(Area area, Model model) {
/*		if(area.getParentIds() != null && area.getId() != null && area.getParentIds().contains("0,") && StringHandle.countstr(area.getParentIds(), ",") == 2 ){
		  Area plant=aService.findNodeById(area.getId());
		  model.addAttribute("timelist", eService.findAllCycle(area.getId()));
		  model.addAttribute("paramlist",eService.findAllParam(area.getId()));
		  model.addAttribute("plant", plant);
		  model.addAttribute("plantlist",eService.findAllPlant(area.getId()));
		  System.out.println(eService.findAllCycle(area.getId()));
		  System.out.println(eService.findAllParam(area.getId()));		 
		  
		}*/
		if(area == null || area.getParentId() == null || area.getParentIds() == null || area.getType() == null){

		}else if(area.getType().equals("detail_plant")){
			String plant_id= area.getId();
			String base_id= area.getParentId();
			Area plant=aService.findNodeById(plant_id);
			List<Expert> list=eService.findAllValue("expert_"+plant_id);
			List<String[]> eList=new ArrayList<String[]>();	
			for(int i=0;i<list.size();i++){
				String s[]=new String[5];
				Area cycle=aService.findNodeById(list.get(i).getCycleId());
				Area param=aService.findNodeById(list.get(i).getParameterId());
				s[0]=param.getName();
				s[1]=cycle.getName();
				s[2]=list.get(i).getMinValue()+eService.findUnit(param.getId());
				s[3]=list.get(i).getMaxValue()+eService.findUnit(param.getId());
				s[4]=Integer.toString(list.get(i).getId());//存放该条记录的id值
				eList.add(s);
			}
			model.addAttribute("eList",eList);
			model.addAttribute("plant_id",plant_id);
			model.addAttribute("base_id",base_id);
			model.addAttribute("plantName",plant.getName());
			model.addAttribute("plantlist", eService.findAllPlant(base_id));
		}
		return "/modules/sys/expertModify";
	}
	
	/**
     *为同作物的配置的专家值（将原来的flag=1的变成flag=0，本次传过来的设为flag=1）
     * @param request
	 * @param response
	 * @return 给管理员看表的页面/admin/expert_admin
     */
	@RequiresPermissions("sys:expert:edit")
	@RequestMapping(value="/addSelectedExpert",method={RequestMethod.POST})
	public String addSelectedExpert(Model model,HttpServletRequest request,HttpServletResponse response) throws ServletRequestBindingException,IOException{
		System.out.println("开始查找刚刚配置的专家值表");
		String time1=request.getParameter("time"); 
		String param1=request.getParameter("param");
		String plant_id=request.getParameter("plant_id");
		Area plant=aService.get(plant_id);
		String tableName="expert_"+plant_id;
		String time2= time1.substring(0,time1.length()-1);
		String param2= param1.substring(0,param1.length()-1);
		String[] time=time2.split("\\.");   
		String[] param=param2.split("\\.");   
		//清除上次配置的专家值
		List<Area> oldList=new ArrayList<Area>();
		oldList=eService.findAllSelected(plant_id);
		for(Area ol:oldList){
			eService.unSelected(ol);
			System.out.println("清除："+ol.getId());
		}	
		//配置本次专家值
		for(String t: time){			
			Area cycle=aService.get(t);
			eService.selected(cycle);			
			System.out.println("配置完一条周期");
		}	
		for(String p: param){ 
			Area para=aService.get(p);
			eService.selected(para);
			System.out.println("配置完一条参数");
		}
		System.out.println("diyige:"+plant.getId());
		model.addAttribute("plant",plant.getName());
		model.addAttribute("plant_id",plant.getId());
		return "/modules/sys/expertJson";
	}

	/**
     * 展示某个作物的所有配置的专家值数据表
     * @return 多选表单/modules/sys/expert_select
     */
	@RequiresPermissions("sys:expert:view")
	@SuppressWarnings("deprecation")
	@RequestMapping(value="/findSelectedValue",method={RequestMethod.GET})
	public void findSelectedValue(Model model,HttpServletRequest request,HttpServletResponse response) throws ServletRequestBindingException,IOException{
		String plant_id=request.getParameter("plant_id");
		System.out.println("作物id："+plant_id);
		ObjectMapper objectMapper = new ObjectMapper();
		Area plant=aService.get(plant_id);
		List<Expert> list=eService.findSelectedValue("expert_"+plant_id);
		List eList=new ArrayList();	
		for(int i=0;i<list.size();i++){
			String s[]=new String[3];
			Area cycle=aService.get(list.get(i).getCycleId());
			System.out.println("list.get(i).getParamId()"+list.get(i).getParameterId());
			Area param=aService.get(list.get(i).getParameterId());
			s[0]=param.getName();
			s[1]=cycle.getName();
			s[2]=list.get(i).getMinValue()+eService.findUnit(param.getId())+"~"+list.get(i).getMaxValue()+eService.findUnit(param.getId());
			System.out.println("数据:"+s[0]+s[1]+s[2]);
			eList.add(s);
		}

		 try {
			 System.out.println( "直接输出字符串："+objectMapper.writeValueAsString(eList)); 
			 objectMapper.writeValue(response.getWriter(),eList);	
		}catch (JsonParseException e) {
            // 异常时，记录日志，不中断程序
            e.printStackTrace();
        } catch (JsonMappingException e) {
            // 异常时，记录日志，不中断程序
            e.printStackTrace();
        } catch (IOException e) {
            // 异常时，记录日志，不中断程序
            e.printStackTrace();
        }	
		model.addAttribute("plant_id",plant_id);
		model.addAttribute("plantName",plant.getName()); 
	}
	/**
     * 展示某个作物的所有可见专家值数据表
     * @return 多选表单/modules/sys/expert_select
     */
/*	@RequiresPermissions("sys:expert:view")
	@RequestMapping(value="/findAllValue",method={RequestMethod.GET})
	public String findAllValue(Model model,HttpServletRequest request,HttpServletResponse response) throws ServletRequestBindingException,IOException{
		String plant_id=request.getParameter("plant_id");
		String base_id=request.getParameter("base_id");
		Area plant=aService.findNodeById(plant_id);
		List<Expert> list=eService.findAllValue("expert_"+plant_id);
		List<String[]> eList=new ArrayList<String[]>();	
		for(int i=0;i<list.size();i++){
			String s[]=new String[5];
			Area cycle=aService.findNodeById(list.get(i).getCycleId());
			Area param=aService.findNodeById(list.get(i).getParameterId());
			s[0]=param.getName();
			s[1]=cycle.getName();
			s[2]=list.get(i).getMinValue()+eService.findUnit(param.getId());
			s[3]=list.get(i).getMaxValue()+eService.findUnit(param.getId());
			s[4]=Integer.toString(list.get(i).getId());//存放该条记录的id值
			eList.add(s);
		}
		model.addAttribute("eList",eList);
		model.addAttribute("plant_id",plant_id);
		model.addAttribute("base_id",base_id);
		model.addAttribute("plantName",plant.getName());
		model.addAttribute("plantlist", eService.findAllPlant(base_id));	
		 return "/modules/sys/expertModify";
	}*/
	/**
     * 更新某条专家值
     * @return 
     */
	@RequiresPermissions("sys:expert:edit")
	@RequestMapping(value="/updateExpertValue",method={RequestMethod.POST})
	public String updateExpertValue(Model model,HttpServletRequest request,HttpServletResponse response) throws ServletRequestBindingException,IOException{
		String base_id=request.getParameter("base_id"); 
		String plant_id=request.getParameter("plant_id"); 
		String tableName="expert_"+plant_id; 
		String id=request.getParameter("id"); 
		String min_value=request.getParameter("min"); 
		String max_value=request.getParameter("max"); 
		eService.updateValue(tableName,min_value,max_value,Integer.parseInt(id));	
		Area plant=aService.findNodeById(plant_id);
		List<Expert> list=eService.findAllValue("expert_"+plant_id);
		List<String[]> eList=new ArrayList<String[]>();	
		for(int i=0;i<list.size();i++){
			String s[]=new String[5];
			Area cycle=aService.findNodeById(list.get(i).getCycleId());
			Area param=aService.findNodeById(list.get(i).getParameterId());
			s[0]=param.getName();
			s[1]=cycle.getName();
			s[2]=list.get(i).getMinValue()+eService.findUnit(param.getId());
			s[3]=list.get(i).getMaxValue()+eService.findUnit(param.getId());
			s[4]=Integer.toString(list.get(i).getId());//存放该条记录的id值
			eList.add(s);
		}
		model.addAttribute("eList",eList);
		model.addAttribute("plant_id", plant_id);		
		model.addAttribute("base_id", base_id);		
		model.addAttribute("plantlist", eService.findAllPlant(base_id));	
		 return "/modules/sys/expertModify";
	}
	/**
     * 修改专家值的入口
     * @return 
     */
	@RequiresPermissions("sys:expert:edit")
	@RequestMapping(value="/updateValue",method={RequestMethod.GET})
	public String updateValue(Model model,HttpServletRequest request,HttpServletResponse response) throws ServletRequestBindingException,IOException{
		String base_id=request.getParameter("base_id"); 
		String plant_id=request.getParameter("plant_id"); 	
		model.addAttribute("plant_id", plant_id);		
		model.addAttribute("base_id", base_id);		
		model.addAttribute("plantlist", eService.findAllPlant(base_id));	
		 return "/modules/sys/expertModify";
	}
	
	
	@RequiresPermissions("admin")
	@ResponseBody
	@RequestMapping(value = "treeData")
	public List<Map<String, Object>> treeData(@RequestParam(required=false) String extId, @RequestParam(required=false) String type,
			@RequestParam(required=false) Long grade, @RequestParam(required=false) Boolean isAll, HttpServletResponse response) {
		List<Map<String, Object>> mapList = Lists.newArrayList();
		List<Area> list = aService.findList(isAll);
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
