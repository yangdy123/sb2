package com.example.components;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.example.hikari.DBFactory;

@Component
@Order(1)
public class Init1 {
	@Autowired
	HikariConf hikariConf;
	
	public Init1() {
		// TODO Auto-generated constructor stub
		System.out.println("Init1.test()");
		
		Properties properties = new Properties();
		properties.setProperty("url", hikariConf.url);
		properties.setProperty("port", hikariConf.port);
		properties.setProperty("db", hikariConf.db);
		properties.setProperty("user", hikariConf.user);
		properties.setProperty("pwd", hikariConf.pwd);
		
//		HikariConfig config = new HikariConfig();
//		config.setJdbcUrl("jdbc:mysql://localhost:3306/simpsons");
//		config.setUsername("bart");
//		config.setPassword("51mp50n");
//		config.addDataSourceProperty("cachePrepStmts", "true");
//		config.addDataSourceProperty("prepStmtCacheSize", "250");
//		config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

//		HikariDataSource ds = new HikariDataSource(config);
		
		DBFactory dbFactory = DBFactory.GetInstance();
		dbFactory.init(properties);
		dbFactory.test();
	}
}
