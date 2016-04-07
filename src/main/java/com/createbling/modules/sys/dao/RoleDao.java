package com.createbling.modules.sys.dao;

import com.createbling.common.persistence.CrudDao;
import com.createbling.common.persistence.annotation.MyBatisDao;
import com.createbling.modules.sys.entity.Role;
import com.createbling.modules.sys.entity.User;

/**
 * 角色的Dao，通过与xml映射进行操作数据库
 * @author charles
 * @version 2016-03-29
 */
@MyBatisDao
public interface RoleDao extends CrudDao<Role>{
	/*
	 * 通过中文或者英文名得到角色
	 */
	public Role getByName(User user);
	public Role getByEnname(User user);
	
	/*
	 * 插入或删除菜单相关的角色
	 */
	public int deleteRoleMenu();
	public int insertRoleMenu();
	/*
	 * 插入或删除树相关的角色
	 */
	public int deleteRoletree();
	public int insertRoletree();
	

}
