package com.greenfoxacademy.hellobeanworld.controller;

import com.greenfoxacademy.hellobeanworld.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class AppController {

    private UtilityService utilityService;

    @Autowired
    public AppController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @GetMapping("/useful")
    public String utilities() {
        return "index";
    }

    @GetMapping("/useful/colored")
    public String coloredBackground(Model model) {
        model.addAttribute("color", utilityService.randomColor());
        return "colored";
    }

    @GetMapping("/useful/email")
    public String emailValidator(@RequestParam String email, Model model) {
        model.addAttribute("validateEmail", utilityService.validateEmail(email).get(0));
        model.addAttribute("color", utilityService.validateEmail(email).get(1));
        return "email";
    }

    @GetMapping ("/useful/caesar-encoding")
    public String caesarEncoder(@RequestParam String encodedText, Integer encodedNumber, Model model) {
        model.addAttribute("text", utilityService.caesar(encodedText, encodedNumber));
        return "caesar";
    }

    @GetMapping("/useful/caesar-decoding")
    public String caesarDecoder(@RequestParam String decodedText, Integer decodedNumber, Model model) {
        model.addAttribute("text", utilityService.caesar(decodedText, (-1)*decodedNumber));
        return "caesar";
    }



}
