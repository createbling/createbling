package com.createbling;

import java.io.Reader;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.jdbc.ScriptRunner;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.shiro.authz.annotation.RequiresGuest;
import org.apache.shiro.util.ThreadContext;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.restlet.resource.Get;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

import com.createbling.modules.sys.dao.AreaDao;
import com.createbling.modules.sys.dao.ExpertDao;
import com.createbling.modules.sys.entity.Area;
import com.createbling.modules.sys.entity.Expert;
import com.createbling.modules.sys.service.AreaService;
import com.createbling.modules.sys.service.ExpertService;
import com.createbling.modules.sys.web.ExpertController;
import com.google.common.collect.Maps;

import sun.tools.tree.ThisExpression;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations={"classpath*:spring-context.xml","classpath*:spring-context-shiro.xml"})
@TransactionConfiguration(transactionManager="transactionManager",defaultRollback=true)

public class ExpertTest extends AbstractJUnit4SpringContextTests{
	@Autowired
	 private ExpertService eService;
	@Autowired
	 private AreaService aService;
	@Autowired
	 private AreaDao aDao;

	@Test
	public void testService() {
		
/*		String p="4";
		List<Area> list=eService.findAllCycle(p);
		//System.out.println("sas"+aService.get(p).getName());
		for(int i=0;i<list.size();i++){
		System.out.println(list.get(i).getId()+"|"+list.get(i).getName()+"|"+list.get(i).getStart()+list.get(i).getEnd());
		}*/

		
		
		Map<String,Object> map = Maps.newHashMap();
		//作物节点
		Area area = new Area();
		Area plant = new Area();
		if(area.getId() == null){
			//加载首个基地首个作物所有数据，并添加到list中
			//找出该用户第一个作物,通过遍历
			List<Area> areal = aService.findList(true);
			for(Area a : areal){
				if(a.getType().equals("detail_plant")){
					plant = a;
					break;
				}
			}

		}else{
			//加载对应area的基地、作物及下面所有信息以及详细信息，并添加到list中
			
		}
		//根据该作物找出对应base、cycle、parameter信息
		Area base = aService.findBaseByPlant(plant);
		List<Area> cycleList = eService.findAllCycle(plant.getId());
		List<Area> paramList = eService.findAllParam(plant.getId());
		map.put("base",base);
		map.put("plant", plant);
		map.put("cycleList",cycleList);
		map.put("paramList", paramList);
		for(Area c : cycleList){
			System.out.println("cycleList值为："+c.getId()+c.getName()+c.getType());
		}
		for(Area p : paramList){
			System.out.println("paramList值为："+p.getId()+p.getName()+p.getType());
		}
	}
}

