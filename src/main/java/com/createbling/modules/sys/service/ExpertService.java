package com.createbling.modules.sys.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.createbling.common.service.TreeService;
import com.createbling.modules.sys.dao.AreaDao;
import com.createbling.modules.sys.dao.ExpertDao;
import com.createbling.modules.sys.entity.Area;
import com.createbling.modules.sys.entity.Expert;
import com.createbling.modules.sys.utils.UserUtils;
import com.sun.javafx.collections.MappingChange.Map;

@Service
@Transactional(rollbackFor=Exception.class)
public class ExpertService {
	private final static Logger logger = LoggerFactory.getLogger(ExpertDao.class);
	
	@Autowired
	private ExpertDao eDao;
	@Autowired
	private AreaDao aDao;

	//查找所有基地节点
	public List<Area> findAllBase(){
		return eDao.findAllBase();
	}
	//查找某个基地下面的所有可见作物节点
   public List<Area> findAllPlant(String base_id){
	    return eDao.findAllPlant(base_id);
   }
	//查找某个作物下面的所有可见参数节点
	public List<Area> findAllParam(String plant_id){
		return eDao.findAllParam(plant_id);		
	}
	//查找某个作物下面的所有可见周期节点
	public List<Area> findAllCycle(String plant_id){
		return eDao.findAllCycle(plant_id)	;
	}
	//查某个作物的所有配置的专家值
	
	public List<Area> findAllSelected(String plant_id){
		return eDao.findAllSelected(plant_id);		
	}
	//查找某个作物的所有可见专家值记录 
	public List<Expert> findAllValue(String tableName){
		 return eDao.findAllValue(tableName);
	}
	//查找某个作物的某条专家值记录 
		public List<Expert> findOneValue(HashMap map){			
			    return eDao.findOneValue(map);
		}
	//查找所某作物的所有配置的专家值记录
		public List<Expert> findSelectedValue(String tableName){			
		    return eDao.findSelectedValue(tableName);
	}
		

		//查找某个参数的单位
				public String findUnit(String id){
					 return eDao.findUnit(id);
				}
				
	//修改某条专家值记录
	public boolean updateValue(String tableName,String min_value,String max_value,int id){
		try{
			eDao.updateValue(tableName,min_value,max_value,id);
			return true;
			}catch(Exception e){
				logger.error("[updateValue] expert Id is "+id);
				logger.error(e.getMessage(),e);
				return false;
			}
	}
	//配置专家值的参数和周期
	public boolean selected(Area area){
		try{
			eDao.selected(area);
			return true;
			}catch(Exception e){
				logger.error("[selected] area Id is "+area.getId());
				logger.error(e.getMessage(),e);
				return false;
			}
	}
	//清除配置专家值的参数和周期
		public boolean unSelected(Area area){
			try{
				eDao.unSelected(area);
				return true;
				}catch(Exception e){
					logger.error("[unselected] area Id is "+area.getId());
					logger.error(e.getMessage(),e);
					return false;
				}
		}
	
}

