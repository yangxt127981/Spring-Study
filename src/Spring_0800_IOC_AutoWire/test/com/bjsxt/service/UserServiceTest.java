package com.bjsxt.service;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Dependency Injection
//Inverse of Control
public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		
		UserService service = (UserService)ctx.getBean("userService");
		UserService service2 = (UserService)ctx.getBean("userService");

		System.out.println("service==service2:"+String.valueOf(service==service2));

		System.out.println(service.getUserDAO());
		
		
		
	}

}
