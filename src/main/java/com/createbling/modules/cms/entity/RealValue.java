package com.createbling.modules.cms.entity;

import java.util.Date;

import com.createbling.common.persistence.DataEntity;

public class RealValue extends DataEntity<RealValue> {
	private String tableName;   //对应于哪个作物
	private  String parameterId;  //对应作物位于树中的id
	private  String time;   //检测的时间，据擦判断属于哪个周期
	private  String value;  //检测的实时数据值
	public String getParameterId() {
		return parameterId;
	}
	public void setParameterId(String parameterId) {
		this.parameterId = parameterId;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	
	


}
