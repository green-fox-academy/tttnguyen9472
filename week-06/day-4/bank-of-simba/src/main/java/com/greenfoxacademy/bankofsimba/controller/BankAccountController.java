package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class BankAccountController {

    BankAccount bankAccount = new BankAccount("Simba", 2000.345, "lion", false);
    List<BankAccount> accountList = new ArrayList<>();

    public BankAccountController(){
        accountList.add(new BankAccount("Mufasa", 1200.45, "lion", true));
        accountList.add(new BankAccount("Timon", 400.80, "meerkat", false));
        accountList.add(new BankAccount("Pumbaa", 759.50, "warthog", false));
        accountList.add(new BankAccount("Rafiki", 2000.76, "mandrill", false));
        accountList.add(new BankAccount("Banzai", 30.12, "hyena", false));
    }


    @GetMapping("/show")
    public String addOneBankAccount(Model model){
        model.addAttribute("name", bankAccount.getName());
        model.addAttribute("balance", bankAccount.getFormattedBalance());
        model.addAttribute("animalType", bankAccount.getAnimalType());

        return "index";
    }

    @GetMapping("/show/list")
    public String showBankAccountList(Model model){
        model.addAttribute("account", accountList);
        return "index";
    }

    @GetMapping("/htmltext")
    public String htmlText(Model model){

        return "HTMLception";
    }
}
