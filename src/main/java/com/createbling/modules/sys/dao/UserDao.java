package com.createbling.modules.sys.dao;

import java.util.List;

import com.createbling.common.persistence.CrudDao;
import com.createbling.common.persistence.annotation.MyBatisDao;
import com.createbling.modules.sys.entity.Gis;
import com.createbling.modules.sys.entity.User;

/**
 * 用户的Dao接口，通过mybatis的接口映射与UserDao.xml建立起关系
 * @author charles
 *
 */
@MyBatisDao
public interface UserDao extends CrudDao<User>{
	
	/**
	 * 根据登录名称查询用户
	 * @param loginName
	 * @return
	 */
	public User getByLoginName(User user);

	/**
	 * 通过OfficeId获取用户列表，仅返回用户id和name（树查询用户时用）
	 * @param user
	 * @return
	 */
	public List<User> findUserByTreeId(User user);
	
	/**
	 * 查询全部用户数目
	 * @return
	 */
	public long findAllCount(User user);
	
	/**
	 * 更新用户密码
	 * @param user
	 * @return
	 */
	public int updatePasswordById(User user);
	
	/**
	 * 更新登录信息，如：登录IP、登录时间
	 * @param user
	 * @return
	 */
	public int updateLoginInfo(User user);

	/**
	 * 删除用户角色关联数据
	 * @param user
	 * @return
	 */
	public int deleteUserRole(User user);
	
	/**
	 * 插入用户角色关联数据
	 * @param user
	 * @return
	 */
	public int insertUserRole(User user);
	
	/**
	 * 更新用户信息
	 * @param user
	 * @return
	 */
	public int updateUserInfo(User user);
	
	/**
	 * 取出该用户所有的坐标点信息
	 * @param user
	 * @return
	 */
	public List<Gis> getAllGis(User user);
	//取出user对应角色对应area的所有父节点
	public String getAreaParentIds();
}
