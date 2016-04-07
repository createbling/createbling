package com.createbling.modules.sys.dao;

import java.util.List;

import com.createbling.common.persistence.CrudDao;
import com.createbling.common.persistence.annotation.MyBatisDao;
import com.createbling.modules.sys.entity.Menu;

@MyBatisDao
public interface MenuDao extends CrudDao<Menu>{
	/**
	 * 根据parentids查询所有的父节点
	 * @param menu
	 * @return
	 */
	public List<Menu> findByParentIdsLike(Menu menu);
	
	/**
	 * 根据用户不同返回不同的彩单
	 * @param user
	 * @return
	 */
	public List<Menu> findByUserId(Menu menu);
	
	/**
	 * 更新父节点
	 * @return
	 */
	public int updateParentIds();
	
	/**
	 * 更新节点排序
	 * @return
	 */
	public int updateSort();
	
}
