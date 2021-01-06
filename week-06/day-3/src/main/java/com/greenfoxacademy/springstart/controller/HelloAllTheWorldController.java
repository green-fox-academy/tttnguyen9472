package com.greenfoxacademy.springstart.controller;

import com.greenfoxacademy.springstart.model.SayHelloToAllTheWorld;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Controller
public class HelloAllTheWorldController {


    @RequestMapping("/web/randomhello")
    public String randomHelloFunction(SayHelloToAllTheWorld hellos, Model model, @RequestParam String fontColor, @RequestParam Integer fontSize) {

        model.addAttribute("randomHello", hellos.getRandomGreeting());
        model.addAttribute("fontColor", fontColor);
        model.addAttribute("fontSize", fontSize);

        return "randomhellos";
    }


}
