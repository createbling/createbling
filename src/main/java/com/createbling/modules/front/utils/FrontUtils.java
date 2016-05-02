package com.createbling.modules.front.utils;

import java.util.List;

import javax.servlet.ServletContext;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.InvalidSessionException;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;

import com.createbling.common.utils.CacheUtils;
import com.createbling.common.utils.SpringContextHolder;
import com.createbling.modules.sys.dao.BaseDetailDao;
import com.createbling.modules.sys.entity.BaseDetail;
import com.createbling.modules.sys.entity.User;
import com.createbling.modules.sys.utils.UserUtils;
import com.google.common.collect.Lists;

public class FrontUtils {
    private static ServletContext context = SpringContextHolder.getBean(ServletContext.class);
	private static BaseDetailDao baseDetailDao = SpringContextHolder.getBean(BaseDetailDao.class);
 
	//将缓存均写在frontcache中
	private static final String FRONT_CACHE = "frontCache";
	
	public static final String CACHE_BASE_DETAIL_LIST = "baseDetailList";

	
	/**
	 * 获得baseDetail信息
	 */
	public static List<BaseDetail> getBaseDetailList(){
		@SuppressWarnings("unchecked")
		List<BaseDetail> baseDetail = Lists.newArrayList();
		//获取当前用户
		User user = UserUtils.getUser();
		if(user != null){
			//根据user对象找出所有的baseutils信息
			baseDetail = baseDetailDao.getBaseByUser(user);
			putCache(CACHE_BASE_DETAIL_LIST,baseDetail);
		}
		return baseDetail;
	}
	
	
	// ============== Front Cache From CacheUtils==============
	
	public static Session getSession(){
		try{
			Subject subject = SecurityUtils.getSubject();
			//取出session
			Session session = subject.getSession(false);
			if (session == null){
				session = subject.getSession();
			}
			if (session != null){
				return session;
			}
		}catch (InvalidSessionException e){
			
		}
		return null;
	}
	
	public static Object getCache(String key) {
		return getCache(key, null);
	}
	
	public static Object getCache(String key, Object defaultValue) {
		Object obj = getSession().getAttribute(key);
		return obj==null?defaultValue:obj;
	}

	public static void putCache(String key, Object value) {
		getSession().setAttribute(key, value);
	}

	public static void removeCache(String key) {
		getSession().removeAttribute(key);
	}

}
