package com.web_spring_boot.lovlam_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class helloController {
    
    @RequestMapping("/")
    public String index(){
        return "index";

    }
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }
}
