package com.jspiders.springcore.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class User {

	@Value("1")
	private int id;
	@Value("Sushant")
	private String userName;
	@Value("sush@gmail.com")
	private String Email;
	@Value("766169398")
	private long Contact;
	
	
}
