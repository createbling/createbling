package com.createbling.modules.sys.entity;

import java.util.List;
import java.util.Map;

import org.apache.poi.ss.formula.functions.T;

import com.createbling.modules.sys.utils.Lists;
import com.google.common.collect.Maps;

public class Coordinate {
	private String id;
	private List<Gis> gisList = Lists.newArrayList(); //坐标点，其key为user的id，值为坐标点，表明一个用户可拥有多个坐标点。
	public Coordinate(String id, List<Gis> gisList) {
		this.id = id;
		this.gisList = gisList;
	}
	public Coordinate() {

	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<Gis> getGisList() {
		return gisList;
	}
	public void setGisList(List<Gis> gisList) {
		this.gisList = gisList;
	}

}
