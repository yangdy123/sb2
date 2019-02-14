package com.example.hikari;

import java.util.Properties;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class DBFactory {
	private static DBFactory instance = new DBFactory();	
	private static HikariDataSource ds = null;
	
	private DBFactory() {
		
	}
	
	public static DBFactory GetInstance() {
		return instance;
	}
	
	public void init(Properties properties) {
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl("jdbc:mysql://" + 
			properties.getProperty("url") + ":" +
			Integer.parseInt(properties.getProperty("port")) + "/" +
			properties.getProperty("db"));// "jdbc:mysql://localhost:3306/legend_game");
		config.setUsername(properties.getProperty("user"));//"root");
		config.setPassword(properties.getProperty("pwd"));//"qwe123");
		config.addDataSourceProperty("cachePrepStmts", "true");
		config.addDataSourceProperty("prepStmtCacheSize", "250");
		config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
	
		ds = new HikariDataSource(config);
	}
	
	public void test() {
		try {
			ds.getConnection();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
