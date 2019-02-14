package com.example.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix ="hikari")
@PropertySource(ignoreResourceNotFound = true, value = "classpath:conffig/application.yml")
public class HikariConf {
	@Value("${hikari.url}")
	public String url;
	@Value("${hikari.port}")
	public String port;
	@Value("${hikari.user}")
	public String user;
	@Value("${hikari.pwd}")
	public String pwd;
	@Value("${hikari.db}")
	public String db;
	@Value("${hikari.type}")
	public String type;
}
