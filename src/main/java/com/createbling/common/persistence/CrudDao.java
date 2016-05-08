package com.createbling.common.persistence;

import java.util.List;
/**
 * DAO支持类实现
 * @author MingSun
 * @version 2016-03-27
 * @param <T>
 */
public interface CrudDao<T> extends BaseDao {
	/**
	 * 
	 */
	public T findBaseByPlant(T entity);
	
	/**
	 * 修改/删除某个节点
	 * @param id
	 * @return
	 */
	public void updateNode(T entity);
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
	
	//添加base
	public int insertBase(T entity);
			
	//添加plant
	public int insertPlant(T entity);
			
	//添加parameter
	public int insertParameter(T entity);
			
	//添加cycle
	public int insertCycle(T entity);
			
	//添加sensor
	public int insertSensor(T entity);
			
	//更新base
	public int updateBase(T entity);
					
	//更新plant
	public int updatePlant(T entity);
					
	//更新parameter
	public int updateParameter(T entity);
					
	//更新cycle
	public int updateCycle(T entity);
					
	//更新sensor
	public int updateSensor(T entity);
}