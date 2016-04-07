/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/createbling/jeesite">JeeSite</a> All rights reserved.
 */
package com.createbling.modules.sys.dao;

import java.util.List;

import com.createbling.common.persistence.CrudDao;
import com.createbling.common.persistence.annotation.MyBatisDao;
import com.createbling.modules.sys.entity.Dict;

/**
 * 字典DAO接口
 * @author createbling
 * @version 2016-03-31
 */
@MyBatisDao
public interface DictDao extends CrudDao<Dict> {

	//使用继承的方法与xml进行映射即可即可
	public List<String> findTypeList(Dict dict);
	
}
