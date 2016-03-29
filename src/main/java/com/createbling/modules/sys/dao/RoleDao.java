package com.createbling.modules.sys.dao;

import com.createbling.common.persistence.TreeDao;
import com.createbling.common.persistence.annotation.MyBatisDao;
import com.createbling.modules.sys.entity.Role;

/**
 * 角色的Dao，通过与xml映射进行操作数据库
 * @author charles
 * @version 2016-03-29
 */
@MyBatisDao
public interface RoleDao extends TreeDao{
	/*
	 * 通过中文或者英文名得到角色
	 */
	public Role getByName();
	public Role getByEnname();
	
	/*
	 * 插入或删除菜单相关的角色
	 */
	public void deleteRoleMenu();
	public void insertRoleMenu();
	/*
	 * 插入或删除树相关的角色
	 */
	public void deleteRoletree();
	public void insertRoletree();
	

}
