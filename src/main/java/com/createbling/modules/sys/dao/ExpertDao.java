package com.createbling.modules.sys.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.createbling.common.persistence.TreeDao;
import com.createbling.common.persistence.annotation.MyBatisDao;
import com.createbling.modules.sys.entity.Area;
import com.createbling.modules.sys.entity.Expert;
import com.sun.javafx.collections.MappingChange.Map;

/**
 * 区域DAO接口
 * @author MingSun
 * @version 2016-03-26
 */
@MyBatisDao
public interface ExpertDao {
		//查找所有基地节点名称
		public List<Area> findAllBase();
		
		//查找某个基地下面的所有可见作物节点名称
		public List<Area> findAllPlant(@Param(value="id") String id);
		
		//查找某个作物下面的所有可见参数节点名称
		public List<Area> findAllParam(@Param(value="id") String id);
		
		//查找某个作物的所有已经配置环境参数节点名称
		public List<Area> findSelectedParam(@Param(value="id") String id);
		
		//查找某个作物下面的所有可见周期节点名称
		public List<Area> findAllCycle(@Param(value="id") String id);
		
		//查找某个作物的所有已经配置周期节点名称
		public List<Area> findSelectedCycle(@Param(value="id") String id);
		
		//查找某个参数的单位
		public String findUnit(@Param(value="id") String id);
		
		//查找某个作物一个可见专家值记录  
		public List<Expert> findOneValue(HashMap map);
	
		//查找某个作物的所有可见专家值记录
		public List<Expert> findAllValue(@Param(value="tableName") String tableName);
		
		//查找某个作物所有已经配置的专家值（在sys_area中查找）
		public List<Area> findAllSelected(@Param(value="id")String plant_id);
		
		//查找某个作物的所有已经配置的专家值记录 （在exper_中查找）
		public List<Expert> findSelectedValue(@Param(value="tableName") String tableName);
		
		//修改某条专家值记录
		public int updateValue(@Param(value="tableName") String tableName,@Param(value="min_value") String min_value,@Param(value="max_value") String max_value,@Param(value="id") int id);

		//配置专家值
		public int selected(Area area);
		
		//清除配置专家值
		public int unSelected(Area area);
}
