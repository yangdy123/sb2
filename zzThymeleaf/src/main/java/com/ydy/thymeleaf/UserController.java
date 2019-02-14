package com.ydy.thymeleaf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    @RequestMapping(value = "/getUserInfo",method = RequestMethod.GET)
    public String getUserInfo(Model model){
        User user = new User(100L,"admin",18);
        User user2 = new User(101L,"李四",19);
        User user3 = new User(102L,"张三",20);
        User user4 = new User(103L,"王五",21);
        List<User> list = new ArrayList<>();
        list.add(user2);
        list.add(user3);
        list.add(user4);
        model.addAttribute("user",user);
        model.addAttribute("list",list);
        return "userinfo";
    }
}
