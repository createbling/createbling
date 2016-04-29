package com.createbling.modules.cms.web.front;

import java.util.List;

import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.createbling.modules.cms.entity.RealInfo;
import com.createbling.modules.cms.entity.RealValue;
import com.createbling.modules.cms.service.RealValueService;
import com.createbling.modules.cms.utils.CmsUtils;
import com.createbling.modules.cms.utils.DateUtils;
import com.createbling.modules.sys.entity.BaseDetail;

@Controller
@RequestMapping(value = "${frontPath}")
public class FrontIndexController {
	@Autowired
	private RealValueService realValueService;
	
	/**
	 * 网站首页
	 */
/*	@RequiresPermissions(value={"user","admin"},logical=Logical.OR)
	@RequestMapping
	public String index(Model model) {
		//默认站点是1
		Site site = CmsUtils.getSite(Site.defaultSiteId());
		model.addAttribute("site", site);
		model.addAttribute("isIndex", true);
		return "modules/cms/front/themes/"+site.getTheme()+"/frontIndex";
	}*/
	
	/**
	 * 网站首页,前台实际上是跳转到了这里，newindex-1.htm
	 * 这里比之前的用了新的newindex
	 */
	@RequiresPermissions(value={"user","admin"},logical=Logical.OR)
	@RequestMapping(value = "${newPathOfFront}")
	public String index(Model model) {
		//找出所有的GIS坐标
		List<BaseDetail> baseDetailList = CmsUtils.getBaseDetailList();
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
		
		return "modules/cms/frontIndex/warning";
		
	}
	
	@RequiresPermissions(value={"user","admin"},logical=Logical.OR)
	@RequestMapping(value = "comparison${urlSuffix}")
	public String comparison(Model model) {
		
		return "modules/cms/frontIndex/comparison";
		
	}
	
	@RequiresPermissions(value={"user","admin"},logical=Logical.OR)
	@RequestMapping(value = "forecast${urlSuffix}")
	public String forecast(Model model) {
		
		return "modules/cms/frontIndex/forecast";
		
	}
	
	@RequiresPermissions(value={"user","admin"},logical=Logical.OR)
	@RequestMapping(value = "program${urlSuffix}")
	public String program(Model model) {
		
		return "modules/cms/frontIndex/program";
		
	}
}
