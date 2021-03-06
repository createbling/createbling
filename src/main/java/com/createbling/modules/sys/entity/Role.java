package com.createbling.modules.sys.entity;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.validator.constraints.Length;

import com.createbling.common.persistence.DataEntity;
import com.google.common.collect.Lists;
import com.createbling.common.config.Global;
import com.createbling.modules.sys.entity.Menu;
import com.createbling.modules.sys.entity.Role;
import com.createbling.modules.sys.entity.User;

public class Role extends DataEntity<Role> {
	
	private static final long serialVersionUID = 1L;
	private Area area; //归属树
	private String name; 	// 角色名称
	private String enname;	// 英文名称
	private String roleType;// 权限类型
	private String dataScope;// 数据范围
	
	private String oldName; 	// 原角色名称
	private String oldEnname;	// 原英文名称
	private String sysData; 		//是否是系统数据
	private String useable; 		//是否是可用
	
	private User user;		// 根据用户ID查询角色列表

    //private List<User> userList = Lists.newArrayList(); // 拥有用户列表
	private List<Menu> menuList = Lists.newArrayList(); // 拥有菜单列表
	//private List<Office> officeList = Lists.newArrayList(); // 按明细设置数据范围
	private List<Area> areaList = Lists.newArrayList(); // 按明细设置数据范围
	

	
	// 数据范围（1：所有数据；2：所在公司及以下数据；3：所在公司数据；4：所在部门及以下数据；5：所在部门数据；8：仅本人数据；9：按明细设置）
	/*
	 * 现在数据范围改为
	 * 1.所有数据，2.所在基地及以下数据，3.所在基地数据（意思是只能查看基地数据），4.所属作物及以下数据，5.所属周期和参数（意思是只能查看周期和参数）
	 * 8：仅本人数据；9：按明细设置
	 */
	public static final String DATA_SCOPE_ALL = "1";
	public static final String DATA_SCOPE_BASE_AND_CHILD = "2";
	public static final String DATA_SCOPE_BASE = "3";
	public static final String DATA_SCOPE_PLANT_AND_CHILD = "4";
	//public static final String DATA_SCOPE_PLANT = "5";
	public static final String DATA_SCOPE_SELF = "8";
	public static final String DATA_SCOPE_CUSTOM = "9";
	
	public Role() {
		super();
		//默认的数据范围为本身
		this.dataScope = DATA_SCOPE_SELF;
		this.useable=Global.YES;
	}
	
	public Role(String id){
		super(id);
	}
	
	public Role(User user) {
		this();
		this.user = user;
	}

	public String getUseable() {
		return useable;
	}

	public void setUseable(String useable) {
		this.useable = useable;
	}

	public String getSysData() {
		return sysData;
	}

	public void setSysData(String sysData) {
		this.sysData = sysData;
	}

/*	public Office getOffice() {
		return office;
	}

	public void setOffice(Office office) {
		this.office = office;
	}*/
	public Area getArea() {
	    return area;
    }

    public void setArea(Area area) {
	    this.area = area;
    }

	@Length(min=1, max=100)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Length(min=1, max=100)
	public String getEnname() {
		return enname;
	}

	public void setEnname(String enname) {
		this.enname = enname;
	}
	
	@Length(min=1, max=100)
	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public String getDataScope() {
		return dataScope;
	}

	public void setDataScope(String dataScope) {
		this.dataScope = dataScope;
	}

	public String getOldName() {
		return oldName;
	}

	public void setOldName(String oldName) {
		this.oldName = oldName;
	}

	public String getOldEnname() {
		return oldEnname;
	}

	public void setOldEnname(String oldEnname) {
		this.oldEnname = oldEnname;
	}

//	public List<User> getUserList() {
//		return userList;
//	}
//
//	public void setUserList(List<User> userList) {
//		this.userList = userList;
//	}
//	
//	public List<String> getUserIdList() {
//		List<String> nameIdList = Lists.newArrayList();
//		for (User user : userList) {
//			nameIdList.add(user.getId());
//		}
//		return nameIdList;
//	}
//
//	public String getUserIds() {
//		return StringUtils.join(getUserIdList(), ",");
//	}

	public List<Menu> getMenuList() {
		return menuList;
	}

	public void setMenuList(List<Menu> menuList) {
		this.menuList = menuList;
	}

	public List<String> getMenuIdList() {
		List<String> menuIdList = Lists.newArrayList();
		for (Menu menu : menuList) {
			menuIdList.add(menu.getId());
		}
		return menuIdList;
	}

	public void setMenuIdList(List<String> menuIdList) {
		menuList = Lists.newArrayList();
		for (String menuId : menuIdList) {
			Menu menu = new Menu();
			menu.setId(menuId);
			menuList.add(menu);
		}
	}

	public String getMenuIds() {
		return StringUtils.join(getMenuIdList(), ",");
	}
	
	public void setMenuIds(String menuIds) {
		menuList = Lists.newArrayList();
		if (menuIds != null){
			String[] ids = StringUtils.split(menuIds, ",");
			setMenuIdList(Lists.newArrayList(ids));
		}
	}
	
	public List<Area> getAreaList() {
		return areaList;
	}

	public void setAreaList(List<Area> areaList) {
		this.areaList = areaList;
	}

	public List<String> getAreaIdList() {
		List<String> areaIdList = Lists.newArrayList();
		for (Area area : areaList) {
			areaIdList.add(area.getId());
		}
		return areaIdList;
	}

	public void setAreaIdList(List<String> areaIdList) {
		areaList = Lists.newArrayList();
		for (String areaId : areaIdList) {
			Area area = new Area();
			area.setId(areaId);
			areaList.add(area);
		}
	}

	public String getAreaIds() {
		return StringUtils.join(getAreaIdList(), ",");
	}
	
	public void setAreaIds(String areaIds) {
		areaList = Lists.newArrayList();
		if (areaIds != null){
			String[] ids = StringUtils.split(areaIds, ",");
			setAreaIdList(Lists.newArrayList(ids));
		}
	}
	
	/**
	 * 获取权限字符串列表
	 */
	public List<String> getPermissions() {
		List<String> permissions = Lists.newArrayList();
		for (Menu menu : menuList) {
			if (menu.getPermission()!=null && !"".equals(menu.getPermission())){
				permissions.add(menu.getPermission());
			}
		}
		return permissions;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
