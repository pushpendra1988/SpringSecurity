package com.pusp.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pusp.security.dto.User;
import com.pusp.security.service.UserService;
import com.pusp.security.service.UserServiceImpl;
import com.pusp.security.util.UserServiceUtil;

@SpringBootApplication
public class PasswordhashingApplication {

	public static void main(String[] args) {
		SpringApplication.run(PasswordhashingApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		UserService service = context.getBean("userService",UserService.class);
		User user = new User();
		/*user.setUser("pushpendra.yadavi@gmail.com");
		user.setPassword("Chetak&2700");
		service.generateLoginDetails(user);*/
		System.out.println(UserServiceUtil.passwordCheck("Chetak&2700"));
		
	}
}
