package com.createbling.modules.cms.utils;

import java.util.List;

import com.createbling.common.utils.SpringContextHolder;
import com.createbling.modules.sys.dao.BaseDetailDao;
import com.createbling.modules.sys.entity.BaseDetail;
import com.createbling.modules.sys.entity.User;
import com.createbling.modules.sys.utils.UserUtils;
import com.google.common.collect.Lists;

public class FrontUtils {
	private static BaseDetailDao baseDetailDao = SpringContextHolder.getBean(BaseDetailDao.class);
	
	/**
	 * 获得baseDetail信息
	 */
	public static List<BaseDetail> getBaseDetailList(){
		List<BaseDetail> baseDetail = Lists.newArrayList();
		//获取当前用户
		User user = UserUtils.getUser();
		
		return baseDetail;
	}
}
