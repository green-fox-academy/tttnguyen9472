package com.greenfoxacademy.programmerfoxclub.controller;

import com.greenfoxacademy.programmerfoxclub.model.Fox;
import com.greenfoxacademy.programmerfoxclub.service.LoginService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    public LoginService loginService;

    @Autowired
    public MainController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping("/")
    public String mainPage(@RequestParam String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("foxList", loginService.getFoxList());
        return "index";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String postName(@RequestParam String name, Model model) {
        model.addAttribute("name", loginService.newFox(name));
        return "redirect:/?name=" + name;
    }
}
