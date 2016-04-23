/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.createbling.common.persistence.proxy;

import java.util.List;

import com.createbling.common.persistence.BaseDao;

/**
 * DAO支持类实现
 * @author MingSun
 * @version 2016-03-27
 * @param <T>
 */
public interface CrudDao<T> extends BaseDao {

	/**
	 * 修改/删除某个节点
	 * @param id
	 * @return
	 */
	public void updateNode(T entity);
	
	/**
	 * 配置专家值的参数和周期
	 * @param id
	 * @return
	 */
	public int selected(T entity);
	
	/**
	 * 查找所有的基地
	 * @param id
	 * @return
	 */
	public List<T> findNodeBase();
	/**
	 * 查找某个节点的可见直系子节点
	 * @param T
	 * @return List<T>
	 */
	public List<T> findNodeByParent1(T entity);
	/**
	 * 查找某个节点的可见且属于专家配置的直系子节点
	 * @param T
	 * @return List<T>
	 */
	public List<T> findNodeByParent2(T entity);
	/**
	 * 按照id查询某个节点的所有信息
	 * @param T
	 * @return T
	 */
	public T findNodeById(String id) ;
	/**
	 *  为某个节点添加一个子节点（插入一个节点 ，记得把父节点的Children_ids进行修改）
	 * @param T
	 * @return 
	 */
	public void insertNode(T entity) ;
	/**
	 *  为某个节点添加一个子节点（插入一个节点 ，记得把父节点的Children_ids进行修改）
	 * @param T
	 * @return 
	 */
	public void createRealProcedure(String tableName) ;
	/**
	 *  为某个节点添加一个子节点（插入一个节点 ，记得把父节点的Children_ids进行修改）
	 * @param T
	 * @return 
	 */
	public void createExpertProcedure(String tableName) ;
	/**
	 * 删除某个节点
	 * @param id
	 * @return
	 */
	public void delete(T entity);
	
///////////////////////////////////////////////////////////////////////////////////
	/**
	 * 获取单条数据
	 * @param id
	 * @return
	 */
	public T get(String id);
	
	/**
	 * 获取单条数据
	 * @param entity
	 * @return
	 */
	public T get(T entity);
	/**
	 * 查询数据列表，如果需要分页，请设置分页对象，如：entity.setPage(new Page<T>());
	 * @param entity
	 * @return
	 */
	public List<T> findList(T entity);
	
	/**
	 * 查询所有数据列表
	 * @param entity
	 * @return
	 */
	public List<T> findAllList(T entity);
	
	/**
	 * 查询所有数据列表
	 * @see public List<T> findAllList(T entity)
	 * @return
	 */
	@Deprecated
	public List<T> findAllList();
	
	/**
	 * 插入数据
	 * @param entity
	 * @return
	 */
	public int insert(T entity);
	
	/**
	 * 更新数据
	 * @param entity
	 * @return
	 */
	public int update(T entity);
	
	

	
}