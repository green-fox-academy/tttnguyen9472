package com.greenfoxacademy.springstart.controller;

import com.greenfoxacademy.springstart.model.SayHelloToAllTheWorld;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class HelloAllTheWorldController {

    @RequestMapping(value="/web/greeting2")
    public String greeting(){
        SayHelloToAllTheWorld helloToAllTheWorld = new SayHelloToAllTheWorld();
        return helloToAllTheWorld.getGreet();
    }


}
