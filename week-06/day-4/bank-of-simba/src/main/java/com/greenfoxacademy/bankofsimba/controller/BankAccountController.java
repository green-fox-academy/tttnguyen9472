package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankAccountController {

    BankAccount bankAccount = new BankAccount("Simba", 2000.345, "lion");

    @GetMapping("/show")
    public String addBankAccount(Model model){
        model.addAttribute("name", bankAccount.getName());
        model.addAttribute("balance", bankAccount.getFormattedBalance());
        model.addAttribute("animalType", bankAccount.getAnimalType());
        return "index";
    }
}
