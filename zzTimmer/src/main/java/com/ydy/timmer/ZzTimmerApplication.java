package com.ydy.timmer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@MapperScan("com.fantj.mapper")
@EnableScheduling  //启动定时任务
public class ZzTimmerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZzTimmerApplication.class, args);
	}

}

