package com.greenfoxacademy.springstart.controller;

import com.greenfoxacademy.springstart.model.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWebController {


    @RequestMapping(value="web/greeting")

    public String greeting(Model model, @RequestParam String name){
        model.addAttribute("name", name);
        Greeting greeting = new Greeting("");
        model.addAttribute("greetCount", greeting.getGreetCount());
        return "greeting";
    }

}
