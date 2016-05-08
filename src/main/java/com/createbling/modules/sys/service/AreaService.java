package com.createbling.modules.sys.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.createbling.common.service.BaseService;
import com.createbling.common.service.TreeService;
import com.createbling.modules.sys.dao.AreaDao;
import com.createbling.modules.sys.entity.Area;
import com.createbling.modules.sys.entity.User;
import com.createbling.modules.sys.utils.UserUtils;
/**
 * 区域Service
 * @author MingSun
 * @version 2016-03-26
 */
@Service
@Transactional(readOnly = true)
public class AreaService extends TreeService<AreaDao, Area> {
	/**
	 * 获取当前用户授权的区域
	 */
	public List<Area> findAll(){
		return UserUtils.getAreaList();
	}

	@Transactional(readOnly = false)
	public void save(Area area) {
		super.save(area);
		UserUtils.removeCache(UserUtils.CACHE_AREA_LIST);
	}
	
	@Transactional(readOnly = false)
	public void delete(Area area) {
		super.delete(area);
		UserUtils.removeCache(UserUtils.CACHE_AREA_LIST);
	}
	/////////////////////////////////////////////////////////////
	@Transactional(readOnly = true)
	public List<Area> findList(Area area){
		if(area != null){
			User user = UserUtils.getUser();
			area.setParentIds(area.getParentIds()+"%");
			//area.getSqlMap().put("dsf", BaseService.dataScopeFilter(user, "a", ""));
			return dao.findByParentIdsLike(area);
		}
		return  new ArrayList<Area>();
	}
	
	public List<Area> findList(Boolean isAll){
		return UserUtils.getAreaList();
	}
	
	public Area findBaseByPlant(Area area){
		return dao.findBaseByPlant(area);
	}
}
