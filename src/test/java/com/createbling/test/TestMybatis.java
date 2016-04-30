package com.createbling.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.createbling.modules.sys.entity.Area;
import com.createbling.modules.sys.entity.User;
import com.createbling.modules.sys.service.UserService;


@ContextConfiguration(locations={"classpath*:spring-context.xml","classpath*:spring-context-shiro.xml"})
@TransactionConfiguration(transactionManager="transactionManager",defaultRollback=true)

public class TestMybatis extends AbstractJUnit4SpringContextTests {
	@Autowired
	 private UserService userService;

	@Test
	public void testService() {
		User user = new User();
		
		user.setArea(new Area("2"));
		System.out.println("user area is:"+user.getArea());
		System.out.println("user area is:"+user.getArea().getId());
		List<User> userList = userService.findList(user);
		System.out.println("now begin test");
		for(User u : userList){
			System.out.println(u.getId());
			System.out.println(u.getName());
		}
		System.out.println("the test userList size is:"+userList.size());

	}

}
