package com.createbling.common.persistence;

import java.util.Date;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.validator.constraints.Length;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.createbling.common.utils.IdGen;
import com.createbling.modules.sys.entity.User;
import com.createbling.modules.sys.utils.UserUtils;
/**
 * 数据Entity类
* @author MingSun
 * @version 2016-03-25
 */
public abstract class DataEntity<T> extends BaseEntity<T> {
	private static final long serialVersionUID = 1L;
	protected String description;	// 备注描述
	protected User createBy;	// 创建者
	protected Date createDate;	// 创建日期
	protected User updateBy;	// 更新者
	protected Date updateDate;	// 更新日期
	protected String flag; 	// 删除标记（-1：不可见；0：可见非专家配置；1：可见且专家配）
	protected String type;
	
	protected String location;//datail_base
	protected String longitude;//datail_base
	protected String latitude;//datail_base
	protected String point;//datail_base
	protected String origin;//detail_plant
	protected String unit;//detail_parameter
	protected Date start;//detail_cycle
	protected Date end;//detail_cycle
	protected String unitSensor;//detail_sensor
	protected String min;//detail_sensor
	protected String max;//detail_sensor
	protected String detailId;//随机产生在detail详情中的id
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
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
	public String getDetailId() {
		return detailId;
	}
	public void setDetailId(String detailId) {
		this.detailId = detailId;
	}
	
	
	public DataEntity() {
		super();
		this.flag = DEL_FLAG_NORMAL;
	}
	public DataEntity(String id) {
		super(id);
	}
	/**
	 * 插入之前执行方法，需要手动调用
	 */
	@Override
	public void preInsert(){
		// 不限制ID为UUID，调用setIsNewRecord()使用自定义ID
		if (!this.isNewRecord){
			setId(IdGen.uuid());
		}
		User user = UserUtils.getUser();
		if (StringUtils.isNotBlank(user.getId())){
			this.updateBy = user;
			this.createBy = user;
		}
		this.updateDate = new Date();
		this.createDate = this.updateDate;
	}
	/**
	 * 更新之前执行方法，需要手动调用
	 */
	@Override
	public void preUpdate(){
		User user = UserUtils.getUser();
		if (StringUtils.isNotBlank(user.getId())){
			this.updateBy = user;
		}
		this.updateDate = new Date();
	}
	@Length(min=0, max=255)
	public String getRemarks() {
		return description;
	}

	public void setRemarks(String v) {
		this.description = description;
	}
	@JsonIgnore
	public User getCreateBy() {
		return createBy;
	}
	public void setCreateBy(User createBy) {
		this.createBy = createBy;
	}
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	@JsonIgnore
	public User getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(User updateBy) {
		this.updateBy = updateBy;
	}
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	@JsonIgnore
	@Length(min=1, max=1)
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
