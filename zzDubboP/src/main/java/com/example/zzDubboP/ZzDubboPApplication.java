package com.example.zzDubboP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;



@SpringBootApplication
@ImportResource("classpath:dubbo.xml")
public class ZzDubboPApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ZzDubboPApplication.class, args);
    }

}