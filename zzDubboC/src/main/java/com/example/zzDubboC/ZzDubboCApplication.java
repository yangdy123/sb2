package com.example.zzDubboC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@SpringBootApplication
//public class ZzDubboCApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(ZzDubboCApplication.class, args);
//	}
//
//}

@SpringBootApplication
@ImportResource("classpath:dubbo.xml")
public class ZzDubboCApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ZzDubboCApplication.class, args);
    }
}