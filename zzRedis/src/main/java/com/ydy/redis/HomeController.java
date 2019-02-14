package com.ydy.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@Autowired
    UserService userService;
 
    @RequestMapping("/")
    public String getUser() {
        return userService.getUser(001);
    }
}
