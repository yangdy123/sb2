package com.example.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class Init2 {
	@Autowired
	HikariConf hikariConf;

	public Init2() {
		// TODO Auto-generated constructor stub
		System.out.println("Init2.test()");
	}
}
