/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/createbling/jeesite">JeeSite</a> All rights reserved.
 */
package com.createbling.modules.sys.dao;

import com.createbling.common.persistence.CrudDao;
import com.createbling.common.persistence.annotation.MyBatisDao;
import com.createbling.modules.sys.entity.Log;

/**
 * 日志DAO接口
 * @author createbling
 * @version 2014-05-16
 */
@MyBatisDao
public interface LogDao extends CrudDao<Log> {

}
