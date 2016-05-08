package com.createbling.modules.front.web;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.createbling.common.persistence.BaseEntity;
import com.createbling.common.utils.StringUtils;
import com.createbling.modules.front.entity.RealInfo;
import com.createbling.modules.front.entity.RealValue;
import com.createbling.modules.front.service.RealValueService;
import com.createbling.modules.front.utils.FrontUtils;
import com.createbling.modules.sys.entity.Area;
import com.createbling.modules.sys.entity.BaseDetail;
import com.createbling.modules.sys.service.AreaService;
import com.createbling.modules.sys.service.ExpertService;
import com.createbling.modules.sys.service.SystemService;
import com.createbling.modules.sys.utils.Lists;
import com.google.common.collect.Maps;

@Controller
@RequestMapping(value = "${frontPath}")
public class FrontPageController {
	@Autowired
	private RealValueService realValueService;
	@Autowired
	private AreaService areaService;
	@Autowired 
	private ExpertService expertService;
    @Autowired
    private SystemService systemService;
	
	@ModelAttribute("area")
	public Area get(@RequestParam(required=false) String id) {
		System.out.println("get传进来的id为："+id);
		if (StringUtils.isNotBlank(id)){
			return areaService.get(id);
		}else{
			return new Area();
		}
	}
	
	/**
	 * 网站首页页面初始化数据的加载
	 */
	@RequiresPermissions(value={"user","admin"},logical=Logical.OR)
	@ResponseBody
	@RequestMapping(value = "loadPageData" , method = RequestMethod.GET)
	public Map<String,Object> loadPageData(Area area, Model model,HttpServletRequest request,HttpServletResponse response){
		//List<Map<String,List<Area>>> areaList = Lists.newArrayList();
		//创造键值对
		Map<String,Object> map = Maps.newHashMap();
		//作物节点
		//System.out.println("loadPageData中传过来的area的id为："+area.getId());
		Area plant = new Area();
		if(area.getParentId() == null || area.getParentIds() == null){
			//加载首个基地首个作物所有数据，并添加到list中
			//找出该用户第一个作物,通过遍历
			List<Area> areal = areaService.findList(true);
			for(Area a : areal){
				if(a.getType().equals("detail_plant")){
					plant = a;
					System.out.println("loadPageData中传过来的area的id为："+plant);
					break;
				}
			}

		}else{
			//加载对应area的基地、作物及下面所有信息以及详细信息，并添加到list中
			plant = area;
		}
		//根据该作物找出对应base、cycle、parameter信息
		Area base = areaService.findBaseByPlant(new Area(plant.getParentId()));
		List<Area> cycleList = expertService.findAllCycle(plant.getId());
		List<Area> paramList = expertService.findAllParam(plant.getId());
		map.put("base",base);
		map.put("plant", plant);
		map.put("cycleList",cycleList);
		map.put("paramList", paramList);
		for(Area c : cycleList){
			System.out.println("cycleList值为："+c.getId()+c.getName()+c.getType());
		}
		for(Area p : paramList){
			System.out.println("paramList值为："+p.getId()+p.getName()+p.getType());
		}
		return map;
	}
	
	
	
	@RequiresPermissions(value={"user","admin"},logical=Logical.OR)
	@RequestMapping(value = "${newPathOfFront}")
	public String index(Model model) {
		//加载GIS数据
		System.out.println("下面进行加载GIS数据");
		//找出所有的GIS坐标
		List<BaseDetail> baseDetailList = FrontUtils.getBaseDetailList();
		model.addAttribute("baseDetailList", baseDetailList);
		System.out.println(baseDetailList.size());
		System.out.println("从index跳转到gis页面"); 
		//记载实时数据
		RealInfo realInfo = new RealInfo();
		realInfo.setParameterId("3");
		realInfo.setTableName("carbon");
		realInfo.setStartTime("2015-10-23 15:35:19");
		realInfo.setEndTime("2015-10-23 15:36:10");
		RealValue realValue = realValueService.getInitailValue(realInfo);
		System.out.println("测试的实时数据值为："+realValue.getValue());
		System.out.println("测试的实时数据值为：");
		
		return "modules/cms/front/themes/basic/frontIndex/gis";
		
	}
	

	@RequiresPermissions(value={"user","admin"},logical=Logical.OR)
	@RequestMapping(value = "warning${urlSuffix}")
	public String warning(Model model) {
		//加载树形数据
		//这里的例外ID写的是null，以后可以增加例外ID
		String extId = null;
		List<Map<String,Object>> areaListMap = systemService.getAreaTreeData(extId);
		model.addAttribute("areaListMap", areaListMap);
		return "modules/front/warning";
		
	}
	
	@RequiresPermissions(value={"user","admin"},logical=Logical.OR)
	@RequestMapping(value = "comparison${urlSuffix}")
	public String comparison(Model model) {
		//加载树形数据
		//这里的例外ID写的是null，以后可以增加例外ID
		String extId = null;
		List<Map<String,Object>> areaListMap = systemService.getAreaTreeData(extId);
		model.addAttribute("areaListMap", areaListMap);
		return "modules/front/comparison";
		
	}
	
	@RequiresPermissions(value={"user","admin"},logical=Logical.OR)
	@RequestMapping(value = "forecast${urlSuffix}")
	public String forecast(Model model) {
		//加载树形数据
		//这里的例外ID写的是null，以后可以增加例外ID
		String extId = null;
		List<Map<String,Object>> areaListMap = systemService.getAreaTreeData(extId);
		model.addAttribute("areaListMap", areaListMap);
		return "modules/front/forecast";
		
	}
	
	@RequiresPermissions(value={"user","admin"},logical=Logical.OR)
	@RequestMapping(value = "program${urlSuffix}")
	public String program(Model model) {
		//加载树形数据
		//这里的例外ID写的是null，以后可以增加例外ID
/*		String extId = null;
		List<Map<String,Object>> areaListMap = systemService.getAreaTreeData(extId);
		model.addAttribute("areaListMap", areaListMap);*/
		return "modules/front/program";
		
	}
	
	

}
