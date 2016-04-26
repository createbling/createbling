package com.createbling.modules.cms.web.front;

import java.util.List;

import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.createbling.modules.cms.service.RealValueService;
import com.createbling.modules.cms.utils.CmsUtils;
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
		return "modules/cms/front/themes/basic/frontIndex/gis";
		
	}
	

}
