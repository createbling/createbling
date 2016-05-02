package com.createbling.modules.sys.web;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.JsonEncoding;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.createbling.common.web.BaseController;
import com.createbling.modules.sys.entity.Area;
import com.createbling.modules.sys.service.AreaService;
import com.createbling.modules.sys.service.ExpertService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.javafx.collections.MappingChange.Map;
import com.createbling.modules.sys.entity.Expert;

/**
 * 机构Controller
 * @author MingSun
 * @version 2016-4-17
 */
@Controller
@RequestMapping("${adminPath}/expert")
public class ExpertController extends BaseController {
	@Autowired
	private ExpertService eService;
	@Autowired
	private AreaService aService;
	
	/**
     * 展示相应某个基地的所有作物的下拉列表
     * @return 选择作物的页面
     */
	@RequestMapping(value="/findPlantList.do",method={RequestMethod.GET})
	public String findPlantList(Model model,HttpServletRequest request,HttpServletResponse response) throws ServletRequestBindingException,IOException{
		String base_id=request.getParameter("base_id"); 
		System.out.println("第一次："+"base_id");
		System.out.println("base_id"+"某某基地的所有作物："+eService.findAllPlant(base_id));
		model.addAttribute("base_id", base_id);	//该基地
		model.addAttribute("plantlist", eService.findAllPlant(base_id));	//该基地的所有作物	
		 return "/modules/sys/expert_select";
	}
	/**
     * 展示某个作物的所有周期值和所有环境参数的下拉列表
     * @return 多选表单/modules/sys/expert_select
     */
	@RequestMapping(value="/findParamCycleList.do",method={RequestMethod.GET})
	public String findParamCycleList(Model model,HttpServletRequest request,HttpServletResponse response) throws ServletRequestBindingException,IOException{
		String base_id=request.getParameter("base_id");
		String plant_id=request.getParameter("plant_id");
		 model.addAttribute("plant", aService.findNodeById(plant_id));//该作物
		 model.addAttribute("timelist", eService.findAllCycle(plant_id));//该作物所有周期
		 model.addAttribute("paramlist",eService.findAllParam(plant_id));//该作物所有参数
		 model.addAttribute("plant_id", plant_id);//该作物id
		 model.addAttribute("base_id", base_id);//该基地id	
		 model.addAttribute("plantlist", eService.findAllPlant(base_id));//该基地所有作物			 
		 return "/modules/sys/expert_select";
	}
	/**
     * 展示某个作物的所有周期值和所有环境参数的下拉列表
     * @return 多选表单/modules/sys/expert_select
     */
	@RequestMapping(value="/findParamCycleList2.do",method={RequestMethod.GET})
	public String findParamCycleList2(Model model,HttpServletRequest request,HttpServletResponse response) throws ServletRequestBindingException,IOException{
		String plant_id=request.getParameter("plant");
		Area plant=aService.findNodeById(plant_id);
		model.addAttribute("timelist", eService.findAllCycle(plant_id));
		 model.addAttribute("paramlist",eService.findAllParam(plant_id));
		 model.addAttribute("plant", plant);
		 model.addAttribute("plantlist",eService.findAllPlant(plant_id));
		 System.out.println(eService.findAllCycle(plant_id));
		 System.out.println(eService.findAllParam(plant_id));		 
		 return "/modules/sys/expert_modif";
	}
	
	/**
     *为同作物的配置的专家值（将原来的flag=1的变成flag=0，本次传过来的设为flag=1）
     * @param request
	 * @param response
	 * @return 给管理员看表的页面/admin/expert_admin
     */
	@RequestMapping(value="/addSelectedExpert.do",method={RequestMethod.POST})
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
		return "/modules/sys/expert_json";
	}

	/**
     * 展示某个作物的所有配置的专家值数据表
     * @return 多选表单/modules/sys/expert_select
     */
	@SuppressWarnings("deprecation")
	@RequestMapping(value="/findSelectedValue.do",method={RequestMethod.GET})
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
	@RequestMapping(value="/findAllValue.do",method={RequestMethod.GET})
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
		 return "/modules/sys/expert_modif";
	}
	/**
     * 更新某条专家值
     * @return 
     */
	@RequestMapping(value="/updateExpertValue.do",method={RequestMethod.POST})
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
		 return "/modules/sys/expert_modif";
	}
	/**
     * 修改专家值的入口
     * @return 
     */
	@RequestMapping(value="/updateValue.do",method={RequestMethod.GET})
	public String updateValue(Model model,HttpServletRequest request,HttpServletResponse response) throws ServletRequestBindingException,IOException{
		String base_id=request.getParameter("base_id"); 
		String plant_id=request.getParameter("plant_id"); 	
		model.addAttribute("plant_id", plant_id);		
		model.addAttribute("base_id", base_id);		
		model.addAttribute("plantlist", eService.findAllPlant(base_id));	
		 return "/modules/sys/expert_modif";
	}
}
