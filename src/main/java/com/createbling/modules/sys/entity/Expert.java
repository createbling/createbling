package com.createbling.modules.sys.entity;

public class Expert {
	private Integer id;
	private String cycleId;//对应tree表中的相应节点的id
	private String parameterId;//对应tree表中的相应节点的id
	private String minValue;//最小值
	private String maxValue;//最大值
		
	public Expert() {
		super();
	}

	public Expert(Integer id) {
		this.id = id;
	}

	public Expert(Integer id, String cycleId, String parameterId, String minValue, String maxValue) {
		super();
		this.id = id;
		this.cycleId = cycleId;
		this.parameterId = parameterId;
		this.minValue = minValue;
		this.maxValue = maxValue;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCycleId() {
		return cycleId;
	}

	public void setCycleId(String cycleId) {
		this.cycleId = cycleId;
	}

	public String getParameterId() {
		return parameterId;
	}

	public void setParameterId(String parameterId) {
		this.parameterId = parameterId;
	}

	public String getMinValue() {
		return minValue;
	}

	public void setMinValue(String minValue) {
		this.minValue = minValue;
	}

	public String getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(String maxValue) {
		this.maxValue = maxValue;
	}


	
}
