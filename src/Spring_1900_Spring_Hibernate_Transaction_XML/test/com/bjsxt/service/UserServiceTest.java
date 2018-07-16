package com.bjsxt.service;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Dependency Injection
//Inverse of Control
public class UserServiceTest {

	@Test 
	public void testAdd() throws Exception {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		UserService service = (UserService)ctx.getBean("userService");
		System.out.println(service.getClass());
		User u = new User();
		u.setName("hh");
		service.add(u);
		
		ctx.destroy();
		
	}

}
