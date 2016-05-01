package com.createbling.modules.front.utils;

import java.util.List;

import javax.servlet.ServletContext;

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
	
	public static Object getCache(String key) {
		return CacheUtils.get(FRONT_CACHE, key);
	}

	public static void putCache(String key, Object value) {
		CacheUtils.put(FRONT_CACHE, key, value);
	}

	public static void removeCache(String key) {
		CacheUtils.remove(FRONT_CACHE, key);
	}
	
	// ============== Front Cache ==============
	/**
	 * 清除当前用户缓存
	 */
	public static void clearCache(){
		removeCache(CACHE_ROLE_LIST);
		removeCache(CACHE_MENU_LIST);
		//注意，这里移除了office缓存，后面可能出现问题
		//chauncy修改了这里，因为area替换成了office
		removeCache(CACHE_AREA_LIST);
		removeCache(CACHE_AREA_ALL_LIST);
		//同时移除当前用户
		UserUtils.clearCache(getUser());
	}
	
	/**
	 * 清除指定用户缓存
	 * @param user
	 */
	public static void clearCache(User user){
		CacheUtils.remove(USER_CACHE, USER_CACHE_ID_ + user.getId());
		CacheUtils.remove(USER_CACHE, USER_CACHE_LOGIN_NAME_ + user.getLoginName());
		CacheUtils.remove(USER_CACHE, USER_CACHE_LOGIN_NAME_ + user.getOldLoginName());
		//因为用户跟office相关联，这里如果获取的office（实际就是area）不为空，则根据officeID删除user
		if (user.getArea() != null && user.getArea().getId() != null){
			CacheUtils.remove(USER_CACHE, USER_CACHE_LIST_BY_AREA_ID_ + user.getArea().getId());
		}
		//移除对应所有gis信息
		//CacheUtils.remove();
	}

}
