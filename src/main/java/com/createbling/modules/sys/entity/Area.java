package com.createbling.modules.sys.entity;

import java.util.Date;
import java.util.List;

import org.hibernate.validator.constraints.Length;

import com.createbling.common.persistence.TreeEntity;
import com.createbling.modules.sys.entity.Area;
import com.createbling.modules.sys.entity.User;
/**
 * 区域Entity
 * @author MingSun
 * @version 2016-03-25
 */
public class Area extends TreeEntity<Area> {
	private static final long serialVersionUID = 1L;
	private String type; 	// 区域类型（1：国家；2：省份、直辖市；3：地市；4：区县）
	/////////////////////////////////////以下是detail表单的字段
	private String location;//datail_base
	private String point;//datail_base
	private String origin;//detail_plant
	private String unit;//detail_parameter
	private Date start;//detail_cycle
	private Date end;//detail_cycle
	private String unitSensor;//detail_sensor
	private String min;//detail_sensor
	private String max;//detail_sensor
	/////////////////////////////////////以下是office的部分字段
	private Area parentarea;		// 归属区域
	private String useable;//是否可用
	private User primaryPerson;//主负责人
	private User deputyPerson;//副负责人
	private String master; 	// 负责人
	private String phone; 	// 电话
	private String fax; 	// 传真
	private String email; 	// 邮箱
	private List<String> childDeptList;//快速添加子部门
	private String code; 	// 机构编码
	public Area(){
		super();
		this.sort = 30;
	}

	public Area(String id){
		super(id);
	}
	
public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPoint() {
		return point;
	}

	public void setPoint(String point) {
		this.point = point;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public String getUnitSensor() {
		return unitSensor;
	}

	public void setUnitSensor(String unitSensor) {
		this.unitSensor = unitSensor;
	}

	public String getMin() {
		return min;
	}

	public void setMin(String min) {
		this.min = min;
	}

	public String getMax() {
		return max;
	}

	public void setMax(String max) {
		this.max = max;
	}

	//	@JsonBackReference
//	@NotNull
	public Area getParent() {
		return parent;
	}

	public void setParent(Area parent) {
		this.parent = parent;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String getChildrenIds() {
		return childrenIds;
	}

	public void setChildrenIds(String childrenIds) {
		this.childrenIds = childrenIds;
	}

	@Override
	public String toString() {
		return name;
	}
	/////////////////////office的部分字段的setter&getter

	public String getUseable() {
		return useable;
	}

	public void setUseable(String useable) {
		this.useable = useable;
	}

	public User getPrimaryPerson() {
		return primaryPerson;
	}

	public void setPrimaryPerson(User primaryPerson) {
		this.primaryPerson = primaryPerson;
	}

	public User getDeputyPerson() {
		return deputyPerson;
	}

	public void setDeputyPerson(User deputyPerson) {
		this.deputyPerson = deputyPerson;
	}

	public String getMaster() {
		return master;
	}

	public void setMaster(String master) {
		this.master = master;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getChildDeptList() {
		return childDeptList;
	}

	public void setChildDeptList(List<String> childDeptList) {
		this.childDeptList = childDeptList;
	}

	public Area getParentarea() {
		return parentarea;
	}

	public void setParentarea(Area parentarea) {
		this.parentarea = parentarea;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
}
