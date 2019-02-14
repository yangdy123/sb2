package com.example.zzDubboC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.zzDubboCommon.TestService;

@RestController
@RequestMapping(produces="application/json;charset=UTF-8")
public class HomeController {
    @Autowired
    private TestService testService;

	@RequestMapping("/dubbotest")
	public String test(String name) {
		return testService.sayHello(name);
	}
}
