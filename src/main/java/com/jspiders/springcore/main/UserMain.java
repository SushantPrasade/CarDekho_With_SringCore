package com.jspiders.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.springcore.entity.User;

public class UserMain {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("user_config.xml");
		User user = (User)applicationContext.getBean("user");
		System.out.println(user);
		((ClassPathXmlApplicationContext)applicationContext).close();
		
		ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("user_config.xml");
		User user1 =(User) applicationContext2.getBean("user1");
		System.out.println(user1);
		((ClassPathXmlApplicationContext)applicationContext).close();
		
		ApplicationContext applicationContext3 = new ClassPathXmlApplicationContext("user_config.xml");
		User user2 = (User) applicationContext3.getBean("user2");
		System.out.println(user2);
		((ClassPathXmlApplicationContext)applicationContext).close();
	}
}
