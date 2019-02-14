package com.ydy.websocket;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InitController {

    @RequestMapping("/websocket")
    public String init() {
        return "websocket.html";

//        return "websocket";
    }
}