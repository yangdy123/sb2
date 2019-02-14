package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.components.HikariConf;

@RestController
public class HomeController {
	@Autowired
	HikariConf hikariConf;

	@RequestMapping("/home")
	public String home() {
		System.out.println(hikariConf.url);
		return "ok";
	}
	
}
