package com.greenfoxacademy.springstart.controller;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class HelloWorldController {

    @RequestMapping(value="/hello")
    @ResponseBody
    public String hello(){
        return "Hello World!";
    }
}
