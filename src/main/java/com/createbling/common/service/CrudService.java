package com.createbling.common.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.createbling.common.persistence.CrudDao;
import com.createbling.common.persistence.DataEntity;
import com.createbling.common.persistence.Page;

/**
 * Service基类
 * @author MingSun
 * @version 2016-03-27
 */
@Transactional(readOnly = true)
public abstract class CrudService<D extends CrudDao<T>, T extends DataEntity<T>> extends BaseService {
	/**
	 * 持久层对象
	 */
	@Autowired
	protected D dao;	
	/**
	 * 修改某个节点
	 * @param id
	 * @return
	 */
	public void updateNode(T entity){
		entity.preUpdate();
		dao.updateNode(entity);
	}
	/**
	 * 删除某个节点
	 * @param id
	 * @return
	 */
	public void delete(T entity){
		//entity.preUpdate();
		dao.delete(entity);
	}
	/**
	 * 查找所有的基地
	 * @param 
	 * @return List<T>
	 */
	public List<T> findNodeBase() {
		return dao.findNodeBase();
	}
	/**
	 * 查找某个节点的可见直系子节点
	 * @param T
	 * @return List<T>
	 */
	public List<T> findNodeByParent1(T entity) {
		return dao.findNodeByParent1(entity);
	}
	/**
	 * 查找某个节点的可见且属于专家配置的直系子节点
	 * @param T
	 * @return List<T>
	 */
	public List<T> findNodeByParent2(T entity) {
		return dao.findNodeByParent2(entity);
	}
	/**
	 * 按照id查询某个节点的所有信息
	 * @param T
	 * @return T
	 */
	public T findNodeById(String id) {
		return dao.findNodeById(id);
	}
	/**
	 *  为某个节点添加一个子节点（插入一个节点 ，记得把父节点的Children_ids进行修改）
	 * @param T,String,String,String
	 * @return 
	 */
	public void insertNode(T entity,String id,String tableNameReal,String tableNameExpert) {
		entity.preInsert();
		if(id.equals(null)){//若id为空则表明添加的是某一个基地则表明要激发存储过程
			dao.insertNode(entity);
			dao.createRealProcedure(tableNameReal);
			dao.createExpertProcedure(tableNameExpert);
		}else{
			dao.insertNode(entity);
		}
	}
//////////////////////////////////////////////////////////////////////////////////////////

	
	/**
	 * 获取单条数据
	 * @param id
	 * @return
	 */
	public T get(String id) {
		return dao.get(id);
	}
	
	/**
	 * 获取单条数据
	 * @param entity
	 * @return
	 */
	public T get(T entity) {
		return dao.get(entity);
	}
	
	/**
	 * 查询列表数据
	 * @param entity
	 * @return
	 */
	public List<T> findList(T entity) {
		return dao.findList(entity);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param entity
	 * @return
	 */
	public Page<T> findPage(Page<T> page, T entity) {
		entity.setPage(page);
		page.setList(dao.findList(entity));
		return page;
	}

	/**
	 * 保存数据（插入或更新）
	 * @param entity
	 */
	@Transactional(readOnly = false)
	public void save(T entity) {
		if (entity.getIsNewRecord()){
			entity.preInsert();
			dao.insert(entity);
		}else{
			entity.preUpdate();
			dao.update(entity);
		}
	}
}
