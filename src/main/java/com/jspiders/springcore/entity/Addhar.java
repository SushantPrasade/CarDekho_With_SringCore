package com.jspiders.springcore.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Addhar {

	@Value("1")
	private int id;
	@Value("123456789987")
	private long addharNumber;
}
