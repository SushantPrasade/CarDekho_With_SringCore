package com.jspiders.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.springcore.config.UserConfig;
import com.jspiders.springcore.config.UserConfig1;
import com.jspiders.springcore.entity.User;

public class UserMain1 {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(UserConfig.class);
		User user = (User) applicationContext.getBean(User.class);
		System.out.println(user);
		((AnnotationConfigApplicationContext)applicationContext).close();
		
		ApplicationContext applicationContext1 = new AnnotationConfigApplicationContext("com.jspiders.springcore");
		User user1 = (User) applicationContext1.getBean("user");
		System.out.println(user1);
		((AnnotationConfigApplicationContext)applicationContext1).close();
		
		ApplicationContext applicationContext2 = new AnnotationConfigApplicationContext(UserConfig.class);
		User user2 = (User) applicationContext2.getBean("user");
		System.out.println(user2);
		((AnnotationConfigApplicationContext)applicationContext2).close();
		
		ApplicationContext applicationContext3 = new AnnotationConfigApplicationContext(UserConfig1.class);
		User user3 = (User) applicationContext3.getBean("user");
		System.out.println(user3);
		((AnnotationConfigApplicationContext)applicationContext).close();
	
	}
	
}
