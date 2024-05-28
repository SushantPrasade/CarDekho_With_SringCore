package com.jspiders.springcore.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;

//@Data
@Component(value="person")
@Scope(value = "prototype")
public class Person {

	@Value("1")
	private int id;
	@Value("Sushant")
	private String Name;
	@Value("23")
	private int age;
	@Autowired
	private Addhar addhar;
	@Autowired
	private PanCard panCard;
	
	
}
