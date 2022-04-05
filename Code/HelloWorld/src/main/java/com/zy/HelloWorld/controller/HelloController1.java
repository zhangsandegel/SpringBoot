package com.zy.HelloWorld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// 热部署
@Controller
@RequestMapping("/hello")
public class HelloController1 {

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }
}
