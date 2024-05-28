package com.jspiders.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.springcore.config.PersonConfig;
import com.jspiders.springcore.entity.Person;

public class personMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PersonConfig.class);
		Person person = (Person)applicationContext.getBean("person");
		System.out.println(person);
		Person person1 = (Person)applicationContext.getBean("person");
		System.out.println(person1);
		((AnnotationConfigApplicationContext)applicationContext).close();
	}
}
