package com.createbling.modules.cms.entity;
import java.util.Date;

public class RealInfo {
	private String tableName;  //实时数据信息对应的传入作物表名
	private String parameterId; //传入的对应环境参数名
	private Date startTime;   //开始查询的时间
	private Date endTime;   //结束查询的时间

	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getParameterId() {
		return parameterId;
	}
	public void setParameterId(String parameterId) {
		this.parameterId = parameterId;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		Date currentTime = new Date();
		System.out.println(currentTime);
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
/*	public static void main(String [] args){
		Date currentTime = new Date();
		System.out.println(currentTime);
	}*/


}
