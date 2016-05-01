package com.createbling.modules.front.dao;

import java.util.List;

import com.createbling.common.persistence.CrudDao;
import com.createbling.common.persistence.annotation.MyBatisDao;
import com.createbling.modules.front.entity.RealInfo;
import com.createbling.modules.front.entity.RealValue;


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
	 * @return 返回一段时间的数据list
	 */
	public List<RealValue> getBeforeValueList(RealInfo realInfo);
	
	/**
	 * 这里传入的是realInfo
	 * @param realValue
	 * @return 查找某一段时间的一个数据，并求取这段时间的平均值
	 */
	public RealValue get(RealInfo realInfo);

}
