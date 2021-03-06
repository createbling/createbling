package com.createbling.modules.sys.utils;

import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.UnavailableSecurityManagerException;
import org.apache.shiro.session.InvalidSessionException;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;

import com.createbling.common.service.BaseService;
import com.createbling.common.utils.CacheUtils;
import com.createbling.common.utils.SpringContextHolder;
import com.createbling.modules.sys.dao.AreaDao;
import com.createbling.modules.sys.dao.MenuDao;
import com.createbling.modules.sys.dao.RoleDao;
import com.createbling.modules.sys.dao.UserDao;
import com.createbling.modules.sys.entity.Area;
import com.createbling.modules.sys.entity.Menu;
import com.createbling.modules.sys.entity.Role;
import com.createbling.modules.sys.entity.User;
import com.createbling.modules.sys.security.SystemAuthorizingRealm.Principal;

/**
 * 用户工具类
 * @author createbling
 * @version 2013-12-05
 */
public class UserUtils {

	private static UserDao userDao = SpringContextHolder.getBean(UserDao.class);
	private static RoleDao roleDao = SpringContextHolder.getBean(RoleDao.class);
	private static MenuDao menuDao = SpringContextHolder.getBean(MenuDao.class);
	private static AreaDao areaDao = SpringContextHolder.getBean(AreaDao.class);

	
	public static final String USER_CACHE = "userCache";
	public static final String USER_CACHE_ID_ = "id_";
	public static final String USER_CACHE_LOGIN_NAME_ = "ln";
	//chauncy修改了这里，因为office已经被area替换，但是这里的名字还未被替换，仍然沿用oid_
	public static final String USER_CACHE_LIST_BY_AREA_ID_ = "oid_";

	public static final String CACHE_ROLE_LIST = "roleList";
	public static final String CACHE_MENU_LIST = "menuList";
	public static final String CACHE_AREA_LIST = "areaList";
	public static final String CACHE_AREA_ALL_LIST = "areaAllList";
	
	/**
	 * 判断用户是否为管理员，不是系统管理员
	 */
	//判断是否为管理员
	public static boolean isAdmin(){
		Principal principal = getPrincipal();
		if (principal!=null){
			User user = get(principal.getId());
			if (user != null){
				//取出所有角色类型
				List<Role> roleList = user.getRoleList();
				for(Role r : roleList){
					//只要拥有的角色中包含admin即管理员角色，就说明是管理员
					if(r.getRoleType().equals("admin"))
						return true;
				}
			}
		}
		//当用户为空或者用户不是管理员
		return false;
	} 
	
	
	/**
	 * 根据ID获取用户
	 * @param id
	 * @return 取不到返回null
	 */
	public static User get(String id){
		//实际上是从缓存中获取用户ID
		User user = (User)CacheUtils.get(USER_CACHE, USER_CACHE_ID_ + id);
		if (user ==  null){
			System.out.println("get方法传进来的参数id为："+id);
			//然后从数据库中查询该用户所有信息
			user = userDao.get(id);
			System.out.println("从数据库中取出的user信息为："+user);
			if (user == null){
				return null;
			}
			//然后通过user查询其所有角色
			user.setRoleList(roleDao.findList(new Role(user)));
			//并写入缓存
			CacheUtils.put(USER_CACHE, USER_CACHE_ID_ + user.getId(), user);
			//并写入登录名，便于后面通过登录名获取用户
			CacheUtils.put(USER_CACHE, USER_CACHE_LOGIN_NAME_ + user.getLoginName(), user);
		}
		return user;
	}
	
	/**
	 * 根据登录名获取用户
	 * @param loginName
	 * @return 取不到返回null
	 */
	public static User getByLoginName(String loginName){
		System.out.println("getByLoginName方法中传过来的loginname为:"+loginName);
		User user = (User)CacheUtils.get(USER_CACHE, USER_CACHE_LOGIN_NAME_ + loginName);
		if (user == null){
			//如果缓存中没有用户信息，则根据用户名查找
			user = userDao.getByLoginName(new User(null, loginName));
			//System.out.println("取出的用户名为"+user.getName());
			//如果仍然为空，则返回空
			if (user == null){
				return null;
			}
			//同样查找用户所有角色信息
			user.setRoleList(roleDao.findList(new Role(user)));
			//将用户信息放入缓存中
			CacheUtils.put(USER_CACHE, USER_CACHE_ID_ + user.getId(), user);
			CacheUtils.put(USER_CACHE, USER_CACHE_LOGIN_NAME_ + user.getLoginName(), user);
		}
		return user;
	}
	
	/**
	 * 清除当前用户缓存
	 */
	public static void clearCache(){
		removeCache(CACHE_ROLE_LIST);
		removeCache(CACHE_MENU_LIST);
		//注意，这里移除了office缓存，后面可能出现问题
		//chauncy修改了这里，因为area替换成了office
		removeCache(CACHE_AREA_LIST);
		removeCache(CACHE_AREA_ALL_LIST);
		//同时移除当前用户
		UserUtils.clearCache(getUser());
	}
	
	/**
	 * 清除指定用户缓存
	 * @param user
	 */
	public static void clearCache(User user){
		CacheUtils.remove(USER_CACHE, USER_CACHE_ID_ + user.getId());
		CacheUtils.remove(USER_CACHE, USER_CACHE_LOGIN_NAME_ + user.getLoginName());
		CacheUtils.remove(USER_CACHE, USER_CACHE_LOGIN_NAME_ + user.getOldLoginName());
		//因为用户跟office相关联，这里如果获取的office（实际就是area）不为空，则根据officeID删除user
		if (user.getArea() != null && user.getArea().getId() != null){
			CacheUtils.remove(USER_CACHE, USER_CACHE_LIST_BY_AREA_ID_ + user.getArea().getId());
		}
		//移除对应所有gis信息
		//CacheUtils.remove();
	}
	
	/**
	 * 获取当前用户
	 * @return 取不到返回 new User()
	 */
	public static User getUser(){
		Principal principal = getPrincipal();
		if (principal!=null){
			//System.out.println("principal中取出的id为："+principal.getId());
			User user = get(principal.getId());
			if (user != null){
				//System.out.println("principal中取出user对象为："+user.getName());
				return user;
			}
			return new User();
		}
		// 如果没有登录，则返回实例化空的User对象。
		return new User();
	}

	
/*	public static Coordinate getCoordinate(){
		@SuppressWarnings("unchecked")
		User user = getUser();
		Coordinate coordinate = new Coordinate();
		//根据当前用户取出其最高父节点
		String maxParentId = StringUtils.getSecondIndexOf(userDao.getAreaParentIds(), ",");
		//根据父节点查出对应所有坐标信息
		List<Gis> allGis = userDao.getAllGis(new User(maxParentId));
		if(allGis != null){
			coordinate.setId(user.getId());
			coordinate.setGisList(allGis);
			putCache(CACHE_COORDINATE, coordinate);
		}
		//封装成坐标
		return coordinate;
	}*/ 
	
	
	/**
	 * 获取当前用户角色列表
	 * @return
	 */
	public static List<Role> getRoleList(){
		@SuppressWarnings("unchecked")
		//从缓存中直接取出角色列表
		List<Role> roleList = (List<Role>)getCache(CACHE_ROLE_LIST);
		if (roleList == null){
			User user = getUser();
			if (user.isAdministrator()){
				//如果是admin则拥有所有角色
				roleList = roleDao.findAllList(new Role());
			}else{
				//否则的话
				Role role = new Role();
				//否则的话，使用自定义SQL（SQL标识，SQL内容）
				//注意：这里的o u 分别与roledao.xml的findlist方法中的sys_area和sys_user相对应
				role.getSqlMap().put("dsf", BaseService.dataScopeFilter(user.getCurrentUser(), "o", "u"));
				roleList = roleDao.findList(role);
			}
			putCache(CACHE_ROLE_LIST, roleList);
		}
		return roleList;
	}
	
	/**
	 * 获取当前用户授权菜单
	 * @return
	 */
	public static List<Menu> getMenuList(){
		@SuppressWarnings("unchecked")
		List<Menu> menuList = (List<Menu>)getCache(CACHE_MENU_LIST);
		if (menuList == null){
			User user = getUser();
			//这里是chauncy为了查看当前用户所做的测试
			System.out.println("当前用户的ID是："+user.getId());
			if (user.isAdministrator()){
				
				menuList = menuDao.findAllList(new Menu());
				//这里是chauncy为了查看当前菜单列表所做的测试
				System.out.println("菜单列表如下："+menuList.size());
			}else{
				Menu m = new Menu();
				m.setUserId(user.getId());
				menuList = menuDao.findByUserId(m);
			}
			putCache(CACHE_MENU_LIST, menuList);
		}
		return menuList;
	}
	
	/**
	 * 获取当前用户授权的区域
	 * @return
	 */
/*	public static List<Area> getAreaList(){
		@SuppressWarnings("unchecked")
		List<Area> areaList = (List<Area>)getCache(CACHE_AREA_LIST);
		if (areaList == null){
			areaList = areaDao.findAllList(new Area());
			putCache(CACHE_AREA_LIST, areaList);
		}
		return areaList;
	}*/
	
	public static Area getAreaById(String id){
		List<Area> areaList = getAreaList();
		//循环取出
		for(Area area : areaList){
			if(area.getId().equals(id)){
				return area;
			}
		}
		return new Area();
	}
	
	/**
	 * 获取当前用户有权限访问的AREA
	 * @return
	 */
	public static List<Area> getAreaList(){
		@SuppressWarnings("unchecked")
		//首先从缓存中取出area_list,在这里由于不知道还有哪些地方应用了，故先保留CACHE_OFFICE_LIST
		//CHAUNCY修改了这里，因为改成了area
		List<Area> areaList = (List<Area>)getCache(CACHE_AREA_LIST);
		//如果areaList等于空
		if (areaList == null){
			//取出当前用户
			User user = getUser();
			//如果用户是管理员
			if (user.isAdministrator()){
				//取出所有areaList，表明对管理员而言没有限制
				areaList = areaDao.findAllList(new Area());
			}else{
				//否则
				Area area = new Area();
				area.getSqlMap().put("dsf", BaseService.dataScopeFilter(user, "a", ""));
				areaList = areaDao.findList(area);
			}
			putCache(CACHE_AREA_LIST, areaList);
		}
		return areaList;
	}
	
	
	/**
	 * 获取当前用户有权限访问的部门
	 * @return
	 */
/*	public static List<Office> getOfficeList(){
		@SuppressWarnings("unchecked")
		List<Office> officeList = (List<Office>)getCache(CACHE_OFFICE_LIST);
		if (officeList == null){
			User user = getUser();
			if (user.isAdmin()){
				officeList = officeDao.findAllList(new Office());
			}else{
				Office office = new Office();
				office.getSqlMap().put("dsf", BaseService.dataScopeFilter(user, "a", ""));
				officeList = officeDao.findList(office);
			}
			putCache(CACHE_OFFICE_LIST, officeList);
		}
		return officeList;
	}*/

	
	/**
	 * 获取当前用户有权限访问的树
	 * @return
	 */
	public static List<Area> getAreaAllList(){
		@SuppressWarnings("unchecked")
		List<Area> areaList = (List<Area>)getCache(CACHE_AREA_ALL_LIST);
		if (areaList == null){
			areaList = areaDao.findAllList(new Area());
		}
		return areaList;
	}
	
	/**
	 * 获取当前用户有权限访问的部门
	 * @return
	 */
/*	public static List<Office> getOfficeAllList(){
		@SuppressWarnings("unchecked")
		List<Office> officeList = (List<Office>)getCache(CACHE_OFFICE_ALL_LIST);
		if (officeList == null){
			officeList = officeDao.findAllList(new Office());
		}
		return officeList;
	}*/
	
	/**
	 * 获取授权主要对象
	 */
	public static Subject getSubject(){
		return SecurityUtils.getSubject();
	}
	
	/**
	 * 获取当前登录者对象
	 */
	public static Principal getPrincipal(){
		try{
			Subject subject = SecurityUtils.getSubject();
			Principal principal = (Principal)subject.getPrincipal();
			if (principal != null){
				return principal;
			}
//			subject.logout();
		}catch (UnavailableSecurityManagerException e) {
			
		}catch (InvalidSessionException e){
			
		}
		return null;
	}
	
	public static Session getSession(){
		try{
			Subject subject = SecurityUtils.getSubject();
			//取出session
			Session session = subject.getSession(false);
			if (session == null){
				session = subject.getSession();
			}
			if (session != null){
				return session;
			}
//			subject.logout();
		}catch (InvalidSessionException e){
			
		}
		return null;
	}
	
	// ============== User Cache ==============
	
	public static Object getCache(String key) {
		return getCache(key, null);
	}
	
	public static Object getCache(String key, Object defaultValue) {
//		Object obj = getCacheMap().get(key);
		Object obj = getSession().getAttribute(key);
		return obj==null?defaultValue:obj;
	}

	public static void putCache(String key, Object value) {
//		getCacheMap().put(key, value);
		getSession().setAttribute(key, value);
	}

	public static void removeCache(String key) {
//		getCacheMap().remove(key);
		getSession().removeAttribute(key);
	}
	
//	public static Map<String, Object> getCacheMap(){
//		Principal principal = getPrincipal();
//		if(principal!=null){
//			return principal.getCacheMap();
//		}
//		return new HashMap<String, Object>();
//	}
	
}

