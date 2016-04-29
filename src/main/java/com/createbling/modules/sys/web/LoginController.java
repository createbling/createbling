/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/createbling/jeesite">JeeSite</a> All rights reserved.
 */
package com.createbling.modules.sys.web;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.createbling.common.config.Global;
import com.createbling.common.security.shiro.session.SessionDAO;
import com.createbling.common.servlet.ValidateCodeServlet;
import com.createbling.common.utils.CacheUtils;
import com.createbling.common.utils.CookieUtils;
import com.createbling.common.utils.IdGen;
import com.createbling.common.utils.StringUtils;
import com.createbling.common.web.BaseController;
import com.createbling.modules.cms.entity.RealInfo;
import com.createbling.modules.cms.entity.RealValue;
import com.createbling.modules.cms.service.RealValueService;
import com.createbling.modules.cms.utils.CmsUtils;
import com.createbling.modules.cms.utils.DateUtils;
import com.createbling.modules.sys.entity.BaseDetail;
import com.createbling.modules.sys.security.FormAuthenticationFilter;
import com.createbling.modules.sys.security.SystemAuthorizingRealm.Principal;
import com.createbling.modules.sys.utils.UserUtils;
import com.google.common.collect.Maps;

/**
 * 登录Controller
 * @author createbling
 * @version 2016-4-25
 */
@Controller
public class LoginController extends BaseController{
	
	@Autowired
	private SessionDAO sessionDAO;
	@Autowired
	private RealValueService realValueService;
	
	/**
	 * 管理登录，换成了前台路径
	 */
	@RequestMapping(value = "${frontPath}/login", method = RequestMethod.GET)
	public String login(HttpServletRequest request, HttpServletResponse response, Model model) {
		//获得当前登录用户对象
		Principal principal = UserUtils.getPrincipal();

//		// 默认页签模式
//		String tabmode = CookieUtils.getCookie(request, "tabmode");
//		if (tabmode == null){
//			CookieUtils.setCookie(response, "tabmode", "1");
//		}
		
		if (logger.isDebugEnabled()){
			logger.debug("login, active session size: {}", sessionDAO.getActiveSessions(false).size());
		}
		
		// 如果已登录，再次访问主页，则退出原账号。
		// notAllowRefreshIndex不允许刷新主页，在配置文件中为flase，如果设置为true，则在登陆的时候设置LOGINED为flase 
		if (Global.TRUE.equals(Global.getConfig("notAllowRefreshIndex"))){
			CookieUtils.setCookie(response, "LOGINED", "false");
		}
		
		// 如果已经登录，则跳转到管理首页
		//用户不为空且不为移动端登陆
		if(principal != null && !principal.isMobileLogin()){
			//跳转到/a下面去
			return "redirect:" + frontPath;
		}
//		String view;
//		view = "/WEB-INF/views/modules/sys/sysLogin.jsp";
//		view = "classpath:";
//		view += "jar:file:/D:/GitHub/jeesite/src/main/webapp/WEB-INF/lib/jeesite.jar!";
//		view += "/"+getClass().getName().replaceAll("\\.", "/").replace(getClass().getSimpleName(), "")+"view/sysLogin";
//		view += ".jsp";
		//如果上面都未通过的话，说明用户为首次登陆，则跳转到登录页面中
		return "modules/sys/sysLogin";
	}

	/**
	 * 登录失败，真正登录的POST请求由Filter完成
	 */
	@RequestMapping(value = "${frontPath}/login", method = RequestMethod.POST)
	public String loginFail(HttpServletRequest request, HttpServletResponse response, Model model) {
		Principal principal = UserUtils.getPrincipal();
		
		// 如果已经登录，则跳转到管理首页
		if(principal != null){
			return "redirect:" + frontPath;
		}
        //对parameter名为username、rememberMe、mobileLogin、shiroLoginFailure的属性进行清理
		//如果为空字符串则置为null，不为空则除去前后空格message
		String username = WebUtils.getCleanParam(request, FormAuthenticationFilter.DEFAULT_USERNAME_PARAM);
		boolean rememberMe = WebUtils.isTrue(request, FormAuthenticationFilter.DEFAULT_REMEMBER_ME_PARAM);
		boolean mobile = WebUtils.isTrue(request, FormAuthenticationFilter.DEFAULT_MOBILE_PARAM);
		String exception = (String)request.getAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);
		String message = (String)request.getAttribute(FormAuthenticationFilter.DEFAULT_MESSAGE_PARAM);
		//如果message为空或，message为null
		if (StringUtils.isBlank(message) || StringUtils.equals(message, "null")){
			message = "用户或密码错误, 请重试.";
		}
		//将各属性添加到model中
		model.addAttribute(FormAuthenticationFilter.DEFAULT_USERNAME_PARAM, username);
		model.addAttribute(FormAuthenticationFilter.DEFAULT_REMEMBER_ME_PARAM, rememberMe);
		model.addAttribute(FormAuthenticationFilter.DEFAULT_MOBILE_PARAM, mobile);
		model.addAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME, exception);
		model.addAttribute(FormAuthenticationFilter.DEFAULT_MESSAGE_PARAM, message);
		
		if (logger.isDebugEnabled()){
			logger.debug("login fail, active session size: {}, message: {}, exception: {}", 
					sessionDAO.getActiveSessions(false).size(), message, exception);
		}
		
		// 非授权异常，登录失败，验证码加1。
		if (!UnauthorizedException.class.getName().equals(exception)){
			model.addAttribute("isValidateCodeLogin", isValidateCodeLogin(username, true, false));
		}
		
		// 验证失败清空验证码
		request.getSession().setAttribute(ValidateCodeServlet.VALIDATE_CODE, IdGen.uuid());
		
		// 如果是手机登录，则返回JSON字符串
		if (mobile){
	        return renderString(response, model);
		}
		
		return "modules/sys/sysLogin";
	}


	
	/**
	 * 登录成功，进入管理首页
	 * 在shiro那里设置了permission，我说为什么不是角色，原来是因为这里单独用了user
	 * 这里的permission可以让admin和user角色同时通过
	 */
	@RequiresPermissions(value={"admin","user"},logical = Logical.OR)
	@RequestMapping(value = "${frontPath}")
	public String index(Model model,HttpServletRequest request, HttpServletResponse response) {
		Principal principal = UserUtils.getPrincipal();

		// 登录成功后，验证码计算器清零
		isValidateCodeLogin(principal.getLoginName(), false, true);
		
		if (logger.isDebugEnabled()){
			logger.debug("show index, active session size: {}", sessionDAO.getActiveSessions(false).size());
		}
		
		// 如果已登录，再次访问主页，则退出原账号。
		//notAllowRefreshIndex在配置文件中为false,如果为true，由于进入登录页面时设置了LOGINED为false
		if (Global.TRUE.equals(Global.getConfig("notAllowRefreshIndex"))){
			String logined = CookieUtils.getCookie(request, "LOGINED");
			//logined如果为空或为假，则置为真。当直接进入index时，则会退出当前帐号而重新登录。
			//notAllowRefreshIndex此时是不是意味着不允许刷新index，即不允许对当前主页url重新发送请求？
			//是否是为了防止页面刷新？
			if (StringUtils.isBlank(logined) || "false".equals(logined)){
				CookieUtils.setCookie(response, "LOGINED", "true");
			}else if (StringUtils.equals(logined, "true")){
				UserUtils.getSubject().logout();
				return "redirect:" + frontPath + "/login";
			}
		}
		
		// 如果是手机登录，则返回JSON字符串
		if (principal.isMobileLogin()){
			if (request.getParameter("login") != null){
				return renderString(response, principal);
			}
			if (request.getParameter("index") != null){
				return "modules/sys/sysIndex";
			}
			return "redirect:" + frontPath + "/login";
		}
		
//		// 登录成功后，获取上次登录的当前站点ID
//		UserUtils.putCache("siteId", StringUtils.toLong(CookieUtils.getCookie(request, "siteId")));

//		System.out.println("==========================a");
//		try {
//			byte[] bytes = com.createbling.common.utils.FileUtils.readFileToByteArray(
//					com.createbling.common.utils.FileUtils.getFile("c:\\sxt.dmp"));
//			UserUtils.getSession().setAttribute("kkk", bytes);
//			UserUtils.getSession().setAttribute("kkk2", bytes);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
////		for (int i=0; i<1000000; i++){
////			//UserUtils.getSession().setAttribute("a", "a");
////			request.getSession().setAttribute("aaa", "aa");
////		}
//		System.out.println("==========================b");
		//做进入首页前的一些工作
		//加载GIS数据
		System.out.println("下面进行加载GIS数据");
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
		realInfo.setEndTime("2015-10-23 15:35:19");
		RealValue realValue = realValueService.getInitailValue(realInfo);
		System.out.println("测试的实时数据值为："+realValue.getValue());
		System.out.println("测试的实时数据值为：");
		//进入页面
		
		return "modules/cms/frontIndex/frontIndex";
	}

	/**
	 * 登录成功，进入管理首页
	 */
	@RequiresPermissions("admin")
	@RequestMapping(value = "${adminPath}",method = RequestMethod.GET)
	public String adminIndex(HttpServletRequest request, HttpServletResponse response) {
		Principal principal = UserUtils.getPrincipal();
		System.out.println("进入了后台页面");
		if (logger.isDebugEnabled()){
			logger.debug("show index, active session size: {}", sessionDAO.getActiveSessions(false).size());
		}
		return "modules/sys/sysIndex";
	}
	
	/**
	 * 获取主题方案
	 */
	@RequestMapping(value = "/theme/{theme}")
	public String getThemeInCookie(@PathVariable String theme, HttpServletRequest request, HttpServletResponse response){
		if (StringUtils.isNotBlank(theme)){
			CookieUtils.setCookie(response, "theme", theme);
		}else{
			theme = CookieUtils.getCookie(request, "theme");
		}
		return "redirect:"+request.getParameter("url");
	}
	
	/**
	 * 是否是验证码登录
	 * @param useruame 用户名
	 * @param isFail 计数加1
	 * @param clean 计数清零
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static boolean isValidateCodeLogin(String useruame, boolean isFail, boolean clean){
		Map<String, Integer> loginFailMap = (Map<String, Integer>)CacheUtils.get("loginFailMap");
		if (loginFailMap==null){
			loginFailMap = Maps.newHashMap();
			CacheUtils.put("loginFailMap", loginFailMap);
		}
		Integer loginFailNum = loginFailMap.get(useruame);
		if (loginFailNum==null){
			loginFailNum = 0;
		}
		if (isFail){
			loginFailNum++;
			loginFailMap.put(useruame, loginFailNum);
		}
		if (clean){
			loginFailMap.remove(useruame);
		}
		return loginFailNum >= 3;
	}
}
