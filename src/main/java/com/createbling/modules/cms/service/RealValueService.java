package com.createbling.modules.cms.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.createbling.modules.cms.dao.RealValueDao;
import com.createbling.modules.cms.entity.RealInfo;
import com.createbling.modules.cms.entity.RealValue;
import com.createbling.modules.cms.utils.DateUtils;
import com.createbling.modules.sys.entity.Area;
import com.createbling.modules.sys.utils.StringUtils;
import com.createbling.modules.sys.utils.UserUtils;

@Service
public class RealValueService {
	@Autowired
	private RealValueDao realValueDao;
	
	/**
	 * 取出当前时间的实时数据
	 * @param realInfo
	 * @return
	 * 只读的事物
	 */
/*	@Transactional(readOnly = true)
	public RealValue getRealValue(RealInfo realInfo){
		//这里取出的实时数据仅仅在当前时间的一小段范围内，并对间隔5秒的数据进行处理
		realInfo.setEndTime(DateUtils.getNowDate());
		realInfo.setStartTime(DateUtils.cutSecondsToNowDate(5));
		RealValue realValue = realValueDao.get(realInfo);
		return realValue;
	}*/
	
	/**
	 * 取出多少天以前的实时数据
	 * @param realInfo
	 * @return
	 */
/*	@Transactional(readOnly = true)
	public RealValue getBeforeValue(RealInfo realInfo){
		//取出历史实时数据,在现有的时间上减去n天
		Date endTime = DateUtils.cutDaysToNowDate(300);
		Date startTime = DateUtils.cutSecondsToOneDate(endTime, 5);
		realInfo.setEndTime(endTime);
		realInfo.setStartTime(startTime);
		RealValue realValue = realValueDao.get(realInfo);
		return realValue;
		
	}
	*/
	/**
	 * 取出一段时间以前1个小时的数据，并对每分钟内数据求取平均值，再返回60组数据放入列表中
	 * @param realInfo
	 * @return
	 */
/*	@Transactional(readOnly = true)
	public List<RealValue> getRealValueList(RealInfo realInfo){
		List<RealValue> realValueList = new ArrayList<RealValue>();
		int minutes = 60;
		//这里取出的实时数据为一个小时内的数据列表，并对其中每分钟的数据进行了求取平均值
		//realInfo.setEndTime(DateUtils.getNowDate());
		//realInfo.setStartTime(DateUtils.cutMinutesToNowDate(minutes));
		//如果取出的getrealValueList为空怎么办？
		List<RealValue> getrealValueList = realValueDao.getRealValueList(realInfo);
		//如果getrealValueList为空，则将值置为0并返回
		if(getrealValueList == null){
			Date timeNull = realInfo.getStartTime();
			//新建minutes个RealValue并放入getrealValueList中
			for(int i = 1; i<= minutes;i++){
				RealValue realNull = new RealValue();
				realNull.setValue("0");
				realNull.setTime(timeNull);
				realNull.setTableName(realInfo.getTableName());
				realNull.setParameterId(realInfo.getParameterId());
				//增加1分钟
				timeNull = DateUtils.addSecondsToOneDate(timeNull,i);
				realValueList.add(realNull);
			}
			//返回这个realValueList
			return realValueList;
		}
		//如果realValueList不为空
		//循环取出每间隔一分钟的
		Date start = realInfo.getStartTime();
		for(int i = 1;i<=minutes;i++){
			RealValue realOne = new RealValue();
			//每段时间内所添加的RealValue列表
			List<RealValue> realTest = new ArrayList<RealValue>();
			//平均值
			int sum = 0;
			//每次增加一分钟
			Date end = DateUtils.addSecondsToOneDate(start,1);
			//取出list中位于时间间隔内的数据
			for(RealValue real : getrealValueList){
				if(real.getTime().getTime() >= start.getTime() && real.getTime().getTime() < end.getTime()){
					realTest.add(real);
				}
			}
			//如果realTest为空，则将realOne设置为0，并continue
			if(realTest == null){
				realOne.setValue("0");
			}else{
				//如果realTest为空,则将realTest中值取出并求取平均值
				int length = realTest.size();
				for(RealValue real : realTest){
					//对取出的值进行累加
					//万一转换错误这里没有处理
					sum += Integer.parseInt(real.getValue());
				}
				//将平均值添加到realOne中
				sum = sum/length;
				realOne.setValue(""+sum+"");
			}
			realOne.setTime(start);
			realOne.setTableName(realInfo.getTableName());
			realOne.setParameterId(realInfo.getParameterId());
			realValueList.add(realOne);
			start = end;
		}
		return realValueList;
	}*/
/*	
	@Transactional(readOnly = true)
	public List<RealValue> getBeforeValueList(RealInfo realInfo){
		//这里取出的实时数据仅仅在当前时间的一小段范围内
		//RealValue realValue = realValueDao.get(realInfo);
		List<RealValue> realValueList = getRealValueList(realInfo);
		return realValueList;
	}*/
	
	/**
	 * 取出初始值，返回的是对应作物对应参数的的对应数据
	 */
	@Transactional(readOnly = true)
	public RealValue getInitailValue(RealInfo realInfo){
/*		List<Area> areaList = UserUtils.getAreaList();
		//循环取出第一个作物的第一个参数
		for(Area area : areaList){
			if(area.getType().equals("detail_parameter")){
				//取出该节点的直接父节点，即所对应的作物
				String secondParentId = StringUtils.getIndexOf(area.getParentIds(), ",",3);
			    Area areaParent = UserUtils.getAreaById(secondParentId);
			    
			}
		}*/
		//取出历史实时数据,在现有的时间上减去n天
		RealValue realValue = realValueDao.get(realInfo);
		System.out.println("到了这一步");
		return realValue;
	}

}
