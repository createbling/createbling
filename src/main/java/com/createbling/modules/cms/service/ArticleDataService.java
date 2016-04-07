/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/createbling/jeesite">JeeSite</a> All rights reserved.
 */
package com.createbling.modules.cms.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.createbling.common.service.CrudService;
import com.createbling.modules.cms.dao.ArticleDataDao;
import com.createbling.modules.cms.entity.ArticleData;

/**
 * 站点Service
 * @author createbling
 * @version 2013-01-15
 */
@Service
@Transactional(readOnly = true)
public class ArticleDataService extends CrudService<ArticleDataDao, ArticleData> {

}
