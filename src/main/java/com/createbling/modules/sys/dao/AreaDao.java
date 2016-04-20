package com.createbling.modules.sys.dao;

import com.createbling.common.persistence.TreeDao;
import com.createbling.common.persistence.annotation.MyBatisDao;
import com.createbling.modules.sys.entity.Area;

/**
 * 区域DAO接口
 * @author MingSun
 * @version 2016-03-26
 */
@MyBatisDao
public interface AreaDao extends TreeDao<Area> {
	
}

