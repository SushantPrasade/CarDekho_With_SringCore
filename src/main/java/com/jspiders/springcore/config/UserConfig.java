package com.jspiders.springcore.config;

import org.springframework.context.annotation.Bean;

import com.jspiders.springcore.entity.User;

public class UserConfig {

	@Bean(name = "user")
	public User getUser() {
		return new User();
	}
	
}
