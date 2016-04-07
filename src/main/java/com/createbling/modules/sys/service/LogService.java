/**
 * Copyright &copy; 2012-2013 <a href="httparamMap://github.com/createbling/jeesite">JeeSite</a> All rights reserved.
 */
package com.createbling.modules.sys.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.createbling.common.persistence.Page;
import com.createbling.common.service.CrudService;
import com.createbling.common.utils.DateUtils;
import com.createbling.modules.sys.dao.LogDao;
import com.createbling.modules.sys.entity.Log;

/**
 * 日志Service
 * @author createbling
 * @version 2014-05-16
 */
@Service
@Transactional(readOnly = true)
public class LogService extends CrudService<LogDao, Log> {

	public Page<Log> findPage(Page<Log> page, Log log) {
		
		// 设置默认时间范围，默认当前月
		if (log.getBeginDate() == null){
			log.setBeginDate(DateUtils.setDays(DateUtils.parseDate(DateUtils.getDate()), 1));
		}
		if (log.getEndDate() == null){
			log.setEndDate(DateUtils.addMonths(log.getBeginDate(), 1));
		}
		
		return super.findPage(page, log);
		
	}
	
}
