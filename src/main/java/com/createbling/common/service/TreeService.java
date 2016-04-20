package com.createbling.common.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.createbling.common.persistence.TreeDao;
import com.createbling.common.persistence.TreeEntity;
import com.createbling.common.utils.Reflections;
import com.createbling.common.utils.StringUtils;

/**
 * Service基类
 * @author createbling
 * @version 2016-01-16
 */
@Transactional(readOnly = true)
public abstract class TreeService<D extends TreeDao<T>, T extends TreeEntity<T>> extends CrudService<D, T> {
	
	//保存该节点
	@Transactional(readOnly = false)
	public void save(T entity) {
		
		@SuppressWarnings("unchecked")
		
		Class<T> entityClass = Reflections.getClassGenricType(getClass(), 1);
		
		// 如果没有设置父节点，则代表为跟节点，有则获取父节点实体
		//如果父节点为空或者节点编号为空又或者节点编号为0，统一将其父节点置为null
		if (entity.getParent() == null || StringUtils.isBlank(entity.getParentId()) 
				|| "0".equals(entity.getParentId())){
			entity.setParent(null);
		}else{
			entity.setParent(super.get(entity.getParentId()));
		}

		//只要检测到父节点为空，就将父节点id初始化为0
		if (entity.getParent() == null){
			T parentEntity = null;
			try {
				parentEntity = entityClass.getConstructor(String.class).newInstance("0");
			} catch (Exception e) {
				throw new ServiceException(e);
			}
			entity.setParent(parentEntity);
			//为什么要这样？
			entity.getParent().setParentIds(StringUtils.EMPTY);
		}
		
		// 获取修改前的parentIds，用于更新子节点的parentIds
		String oldParentIds = entity.getParentIds(); 
		
		// 设置新的父节点串
		//取出父亲的所有父亲编号，并加上父亲自己，就形成了自己的所有祖宗
		entity.setParentIds(entity.getParent().getParentIds()+entity.getParent().getId()+",");
		
		// 保存或更新实体
		super.save(entity);
		
		// 更新子节点 parentIds
		T o = null;
		try {
			o = entityClass.newInstance();
		} catch (Exception e) {
			throw new ServiceException(e);
		}
		o.setParentIds("%,"+entity.getId()+",%");
		//查找该节点的所有子节点
		List<T> list = dao.findByParentIdsLike(o);
		for (T e : list){
			if (e.getParentIds() != null && oldParentIds != null){
				//将子节点的oldParentIds部分替换成父节点的新的所有父节点，因为直系父亲是没变的
				e.setParentIds(e.getParentIds().replace(oldParentIds, entity.getParentIds()));
				//在执行dao之前，即写入数据库之前，做一些操作
				preUpdateChild(entity, e);
				dao.updateParentIds(e);
			}
		}
		
	}
	
	/**
	 * 预留接口，用户更新子节前调用
	 * @param childEntity
	 */
	protected void preUpdateChild(T entity, T childEntity) {
		
	}

}
