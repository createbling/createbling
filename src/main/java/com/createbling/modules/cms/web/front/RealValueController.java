package com.createbling.modules.cms.web.front;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.createbling.common.web.BaseController;
import com.createbling.modules.cms.entity.RealInfo;
import com.createbling.modules.cms.entity.RealValue;
import com.createbling.modules.cms.service.RealValueService;
import com.createbling.modules.cms.utils.DateUtils;
import com.createbling.modules.sys.entity.Area;
import com.createbling.modules.sys.utils.StringUtils;
import com.createbling.modules.sys.utils.UserUtils;

/**
 * 实时数据的控制器
 * @author charles
 * @version 2016-04-22
 */
@Controller
@RequestMapping("${frontPath}")
public class RealValueController extends BaseController{
	@Autowired
	private RealValueService realValueService;
	
/*	@RequestMapping(value = {"/getRealListAndInitialValue"})
	public String getRealListAndInitialValue(Model model,HttpServletRequest request,HttpServletResponse response){
		//必须通过parameterId、startTime、endTime以及tableName来取出对应的实时数据
		//首先tableName表示的是作物名
		//首先通过用户账号判断所属的作物有哪些，如果账号属于作物或者作物一下的级别，则只展示该作物的信息
		//如果账号属于基地级别，则可以展示该基地所有作物信息。
		//取出了该账户所能拥有的全部树
		List<Area> areaList = UserUtils.getAreaList();
		model.addAttribute("areaList",areaList);
		//取出第一个作物的第一个参数的相关信息
		//循环取出第一个作物的第一个参数
		for(Area area : areaList){
			if(area.getType().equals("detail_parameter")){
				//取出该节点的直接父节点，即所对应的作物
				String secondParentId = StringUtils.getIndexOf(area.getParentIds(), ",",3);
			    Area areaParent = UserUtils.getAreaById(secondParentId);
			    RealInfo realInfo = new RealInfo();
			    realInfo.setTableName(areaParent.getName());
			    realInfo.setParameterId(secondParentId);
				Date endTime = DateUtils.cutDaysToNowDate(300);
				Date startTime = DateUtils.cutMinutesToOneDate(endTime, 60);
				realInfo.setEndTime(endTime);
				realInfo.setStartTime(startTime);
			    //取出一个小时的数据
				List<RealValue> realValue = realValueService.getBeforeValueList(realInfo);
			    model.addAttribute("realValue",realValue);
			    break;
			}
		}
		return "";
	}*/
	
	@RequestMapping(value = {"/getRealValue"})
	public String getRealValue(Model model,HttpServletRequest request,HttpServletResponse response){
		List<Area> areaList = UserUtils.getAreaList();
		
		return "";
	}
	
	
	
	

}
 