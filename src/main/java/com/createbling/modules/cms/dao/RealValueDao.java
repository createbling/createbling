package com.createbling.modules.cms.dao;

import java.util.List;

import com.createbling.common.persistence.CrudDao;
import com.createbling.common.persistence.annotation.MyBatisDao;
import com.createbling.modules.cms.entity.RealInfo;
import com.createbling.modules.cms.entity.RealValue;

@MyBatisDao
public interface RealValueDao extends CrudDao<RealValue>{
	/**
	 * 取出一段实时数据列表
	 * @param realValue
	 * @return
	 */
	public List<RealValue> getRealValueList(RealInfo realInfo);
	
	/**
	 * 取出一段实时数据列表
	 * @param realValue
	 * @return
	 */
	public List<RealValue> getBeforeValueList(RealInfo realInfo);
	/**
	 * 这里传入的是realInfo
	 * @param realValue
	 * @return
	 */
	public RealValue get(RealInfo realInfo);

}
