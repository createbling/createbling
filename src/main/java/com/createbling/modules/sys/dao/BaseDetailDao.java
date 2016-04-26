package com.createbling.modules.sys.dao;

import java.util.List;

import com.createbling.common.persistence.CrudDao;
import com.createbling.common.persistence.annotation.MyBatisDao;
import com.createbling.modules.sys.entity.BaseDetail;
import com.createbling.modules.sys.entity.User;

@MyBatisDao
public interface BaseDetailDao extends CrudDao<BaseDetail>{
	
	public List<BaseDetail> getBaseByUser(User user);

}
