package com.createbling.modules.sys.entity;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Value;

import com.createbling.common.persistence.DataEntity;

public class BaseDetail extends DataEntity<BaseDetail>{
	private String areaId;   //该经纬度对应的base节点
	private String longitude;   //经度
	private String latitude;    //纬度
	private String text;     //该点信息
	
	@Value("${gis.apiName}")
	private String apiName;  //使用的什么api
	
	@Value("${gis.ak}")
	private String ak;   //访问的密钥
	
	
	public String getAreaId() {
		return areaId;
	}
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}
	@NotNull(message="经度不能为空")
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	@NotNull(message="纬度不能为空")
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	@NotNull(message = "api的名字不能为空")
	public String getApiName() {
		return apiName;
	}
	
	@NotNull(message = "api的key不能为空")
	public String getAk() {
		return ak;
	}
	
}
