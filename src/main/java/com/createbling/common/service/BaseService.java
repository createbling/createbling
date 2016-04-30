package com.createbling.common.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Lists;
import com.createbling.common.persistence.BaseEntity;
import com.createbling.common.utils.StringUtils;
import com.createbling.modules.sys.entity.Role;
import com.createbling.modules.sys.entity.User;
import com.createbling.modules.sys.utils.UserUtils;

/**
 * Service基类
 * @author createbling
 * @version 2016-01-16
 */
@Transactional(readOnly = true)
public abstract class BaseService {
	
	/**
	 * 日志对象
	 */
	protected Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * 数据范围过滤
	 * @param user 当前用户对象，通过“entity.getCurrentUser()”获取，实际上就是UserUtils.getUser()
	 * @param officeAlias 机构表别名，多个用“,”逗号隔开。在原先的xml中office别名为o
	 * @param userAlias 用户表别名，多个用“,”逗号隔开，传递空，忽略此参数，在原先的xml中user别名为u
	 * @return 标准连接条件对象
	 */
	public static String dataScopeFilter(User user, String areaAlias, String userAlias) {

		StringBuilder sqlString = new StringBuilder();
		
		// 进行权限过滤，多个角色权限范围之间为或者关系。
		List<String> dataScope = Lists.newArrayList();
		
		// 超级管理员，跳过权限过滤
		if (!user.isAdministrator()){
			boolean isDataScopeAll = false;
			//取出用户角色列表
			for (Role r : user.getRoleList()){
				//将office（实际就是area）用","分隔开
				for (String ar : StringUtils.split(areaAlias, ",")){
					//如果数据范围域不包括角色所包含的数据范围域且area（office）别名不为空
					//如果数据范围不为空且数据表别名不为空
					if (!dataScope.contains(r.getDataScope()) && StringUtils.isNotBlank(ar)){
						//1：所有数据
						//这里比较的实际是id
						if (Role.DATA_SCOPE_ALL.equals(r.getDataScope())){
							isDataScopeAll = true;
						}
						//2：所在基地及以下数据
						else if (Role.DATA_SCOPE_BASE_AND_CHILD.equals(r.getDataScope())){
							//------其实就是or oa.id=user.office.id,这里是查出了office的信息
							sqlString.append(" OR " + ar + ".id = '" + user.getArea().getId() + "'");
							//查出parentids为当前用户所属office的parentids+当前用户id的所有信息，其实意思就是该office下所有子节点
							sqlString.append(" OR " + ar + ".parent_ids LIKE '" + user.getArea().getParentIds() + user.getArea().getId() + ",%'");
						}
						//3.所在基地数据和作物数据（意思是只能查看基地和作物信息，屏蔽周期和参数）
						//此时不能添加下属机构，只能进行修改和删除，甚至也不能进行删除，注意这里应该在页面中显示出来。
						else if (Role.DATA_SCOPE_BASE.equals(r.getDataScope())){
							sqlString.append(" OR " + ar + ".id = '" + user.getArea().getId() + "'");
							//------这里换成了等于，意思是只查询所在公司与公司直属部门数据，不能查看子公司数据
							//sqlString.append(" OR (" + oa + ".parent_id = '" + user.getArea().getId() + "' AND " + oa + ".type = '2')");
						    //这里能够查询直接子节点信息
							sqlString.append(" OR " + ar + ".parent_id= '" + user.getArea().getId() + "'");
						}
						//4.所属作物及以下数据
						else if (Role.DATA_SCOPE_PLANT_AND_CHILD.equals(r.getDataScope())){
							sqlString.append(" OR " + ar + ".id = '" + user.getArea().getId() + "'");
							sqlString.append(" OR " + ar + ".parent_ids LIKE '" + user.getArea().getParentIds() + user.getArea().getId() + ",%'");
						}
/*						//5.所属周期或参数（意思是只能查看周期和参数），这里应该设置查询相同type
						else if (Role.DATA_SCOPE_PLANT.equals(r.getDataScope())){
							sqlString.append(" OR " + ar + ".type = '" + user.getArea().getType() + "'");
						}*/
						//9：按明细设置
						else if (Role.DATA_SCOPE_CUSTOM.equals(r.getDataScope())){
//							String officeIds =  StringUtils.join(r.getOfficeIdList(), "','");
//							if (StringUtils.isNotEmpty(officeIds)){
//								sqlString.append(" OR " + ar + ".id IN ('" + officeIds + "')");
//							}
							sqlString.append(" OR EXISTS (SELECT 1 FROM sys_role_area WHERE role_id = '" + r.getId() + "'");
							sqlString.append(" AND area_id = " + ar +".id)");
						}
						//else if (Role.DATA_SCOPE_SELF.equals(r.getDataScope())){
						dataScope.add(r.getDataScope());
					}
				}
			}
			// 如果没有全部数据权限，并设置了用户别名，则当前权限为本人；如果未设置别名，当前无权限为已植入权限
			if (!isDataScopeAll){
				if (StringUtils.isNotBlank(userAlias)){
					for (String ua : StringUtils.split(userAlias, ",")){
						//只能查看user id相关的数据
						sqlString.append(" OR " + ua + ".id = '" + user.getId() + "'");
					}
				}else {
					for (String ar : StringUtils.split(areaAlias, ",")){
						//sqlString.append(" OR " + ar + ".id  = " + user.getOffice().getId());
						sqlString.append(" OR " + ar + ".id IS NULL");
					}
				}
			}else{
				// 如果包含全部权限，则去掉之前添加的所有条件，并跳出循环。
				sqlString = new StringBuilder();
			}
		}
		if (StringUtils.isNotBlank(sqlString.toString())){
			return " AND (" + sqlString.substring(4) + ")";
		}
		return "";
	}

	/**
	 * 数据范围过滤（符合业务表字段不同的时候使用，采用exists方法）
	 * @param entity 当前过滤的实体类
	 * @param sqlMapKey sqlMap的键值，例如设置“dsf”时，调用方法：${sqlMap.sdf}
	 * @param officeWheres office表条件，组成：部门表字段=业务表的部门字段
	 * @param userWheres user表条件，组成：用户表字段=业务表的用户字段
	 * @example
	 * 		dataScopeFilter(user, "dsf", "id=a.office_id", "id=a.create_by");
	 * 		dataScopeFilter(entity, "dsf", "code=a.jgdm", "no=a.cjr"); // 适应于业务表关联不同字段时使用，如果关联的不是机构id是code。
	 */
	public static void dataScopeFilter(BaseEntity<?> entity, String sqlMapKey, String areaWheres, String userWheres) {
        //取出当前用户
		User user = entity.getCurrentUser();
		
		// 如果是超级管理员，则不过滤数据
		if (user.isAdministrator()) {
			return;
		}

		// 数据范围（1：所有数据；2：所在公司及以下数据；3：所在公司数据；4：所在部门及以下数据；5：所在部门数据；8：仅本人数据；9：按明细设置）
		StringBuilder sqlString = new StringBuilder();
		
		// 获取到最大的数据权限范围
		String roleId = "";
		int dataScopeInteger = 8;
		for (Role r : user.getRoleList()){
			int ds = Integer.valueOf(r.getDataScope());
			if (ds == 9){
				roleId = r.getId();
				dataScopeInteger = ds;
				break;
			}else if (ds < dataScopeInteger){
				roleId = r.getId();
				dataScopeInteger = ds;
			}
		}
		String dataScopeString = String.valueOf(dataScopeInteger);
		
/*		// 生成部门权限SQL语句
		for (String where : StringUtils.split(officeWheres, ",")){
			if (Role.DATA_SCOPE_COMPANY_AND_CHILD.equals(dataScopeString)){
				// 包括本公司下的部门 （type=1:公司；type=2：部门）
				sqlString.append(" AND EXISTS (SELECT 1 FROM SYS_OFFICE");
				sqlString.append(" WHERE type='2'");
				sqlString.append(" AND (id = '" + user.getCompany().getId() + "'");
				sqlString.append(" OR parent_ids LIKE '" + user.getCompany().getParentIds() + user.getCompany().getId() + ",%')");
				sqlString.append(" AND " + where +")");
			}
			else if (Role.DATA_SCOPE_COMPANY.equals(dataScopeString)){
				sqlString.append(" AND EXISTS (SELECT 1 FROM SYS_OFFICE");
				sqlString.append(" WHERE type='2'");
				sqlString.append(" AND id = '" + user.getCompany().getId() + "'");
				sqlString.append(" AND " + where +")");
			}
			else if (Role.DATA_SCOPE_OFFICE_AND_CHILD.equals(dataScopeString)){
				sqlString.append(" AND EXISTS (SELECT 1 FROM SYS_OFFICE");
				sqlString.append(" WHERE (id = '" + user.getOffice().getId() + "'");
				sqlString.append(" OR parent_ids LIKE '" + user.getOffice().getParentIds() + user.getOffice().getId() + ",%')");
				sqlString.append(" AND " + where +")");
			}
			else if (Role.DATA_SCOPE_OFFICE.equals(dataScopeString)){
				sqlString.append(" AND EXISTS (SELECT 1 FROM SYS_OFFICE");
				sqlString.append(" WHERE id = '" + user.getOffice().getId() + "'");
				sqlString.append(" AND " + where +")");
			}
			else if (Role.DATA_SCOPE_CUSTOM.equals(dataScopeString)){
				sqlString.append(" AND EXISTS (SELECT 1 FROM sys_role_office ro123456, sys_office o123456");
				sqlString.append(" WHERE ro123456.office_id = o123456.id");
				sqlString.append(" AND ro123456.role_id = '" + roleId + "'");
				sqlString.append(" AND o123456." + where +")");
			}
		}*/
		// 生成个人权限SQL语句
		for (String where : StringUtils.split(userWheres, ",")){
			if (Role.DATA_SCOPE_SELF.equals(dataScopeString)){
				sqlString.append(" AND EXISTS (SELECT 1 FROM sys_user");
				sqlString.append(" WHERE id='" + user.getId() + "'");
				sqlString.append(" AND " + where + ")");
			}
		}

//		System.out.println("dataScopeFilter: " + sqlString.toString());

		// 设置到自定义SQL对象
		entity.getSqlMap().put(sqlMapKey, sqlString.toString());
		
	}

}
