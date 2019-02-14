package com.example.zzDubboP;

import com.example.zzDubboCommon.TestService;

//@Service(version = "1.0.0")
@org.springframework.stereotype.Service
public class TestServiceImpl implements TestService {
    
    @Override
    public String sayHello(String name) {
        return name+"hello";
    }
}