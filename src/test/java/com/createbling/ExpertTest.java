package com.createbling;

import java.io.Reader;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
import com.sun.javafx.collections.MappingChange.Map;
import com.sun.javafx.geom.AreaOp;

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
		/**查找所有基地节点名称
           List<Area> experts = eService.findAllCycle("5");  
           for(int i=0;i<experts.size();i++){
        	   System.out.println(experts.get(i).getName());
           }  
        } 
**/
		/**存储过程自动建表
		Area area=new Area("5");
		String tableName="real_"+"5";
		aDao.createRealProcedure(tableName);

		Area area_parent=new Area("2");
		Area area=new Area();
		area.setName("猴头菇");
		area.setType("detail_plant");
		area.setParent(area_parent);
		aService.save(area);
		**/
		/**
		Area a=aService.get("2e73a48794494239bb7d1582be699002");
		eService.selected(a);
	
        System.out.println(a.getName());
		String tableName="expert_"+"5";
		HashMap map=new HashMap();
		map.put("tableName","expert_5");
		System.out.println("2e73a48794494239bb7d1582be699002".length());
		map.put("cycle_id","2e73a48794494239bb7d1582be699002");			
		map.put("parameter_id","15");
		Expert e=eService.findOneValue(map).get(0);	
		System.out.println(e.getId());
		System.out.println(e.getCycleId());
		System.out.println(e.getParamId());
		System.out.println(e.getMinValue());
		System.out.println(e.getMaxValue());
        **/
		
		String p="5";
		List<Area> list=eService.findAllPlant(p);
		//System.out.println("sas"+aService.get(p).getName());
		for(int i=0;i<list.size();i++){
		System.out.println(list.get(i).getId()+"|"+list.get(i).getName());
		}
		//eService.updateValue("expert_5","13","14",1);	
		/**
		Area ol=new Area("14");
		eService.unSelected(ol);
		List<Expert> list=new ArrayList<>();
		list=eService.findSelectedValue("expert_5");
		System.out.println(list.get(0).getId()+list.get(0).getMaxValue());**/
	}
}

