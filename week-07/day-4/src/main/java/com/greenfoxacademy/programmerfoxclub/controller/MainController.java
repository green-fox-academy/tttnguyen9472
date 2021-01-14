package com.greenfoxacademy.programmerfoxclub.controller;

import com.greenfoxacademy.programmerfoxclub.model.Fox;
import com.greenfoxacademy.programmerfoxclub.service.InformationService;
import com.greenfoxacademy.programmerfoxclub.service.LoginService;
import com.greenfoxacademy.programmerfoxclub.service.NutritionService;
import com.greenfoxacademy.programmerfoxclub.service.TrickService;
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
    public InformationService informationService;
    public NutritionService nutritionService;
    public TrickService trickService;

    @Autowired
    public MainController(LoginService loginService, InformationService informationService, NutritionService nutritionService, TrickService trickService) {
        this.loginService = loginService;
        this.informationService = informationService;
        this.nutritionService = nutritionService;
        this.trickService = trickService;
    }

    @GetMapping("/")
    public String mainPage(@RequestParam(defaultValue = "Mr. Green") String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("foxList", loginService.getFoxList());
        model.addAttribute("trickList", trickService.getTrickList());
        model.addAttribute("food", informationService.foxFood());
        model.addAttribute("drink", informationService.foxDrink());
        model.addAttribute("trickNumber", informationService.foxTricks());
        model.addAttribute("actualTricks", informationService.actualFoxTricks());

        return "index";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String postName(@RequestParam String name, Model model) {
        model.addAttribute("name", loginService.newFoxName(name));
        return "redirect:/?name=" + name;
    }

    @GetMapping("/nutrition-store")
    public String nutritionStore(Model model){
        model.addAttribute("foodList", nutritionService.getFoodList());
        model.addAttribute("drinkList", nutritionService.getDrinkList());
        return "nutrition";
    }

    @PostMapping("/nutrition-store")
    public String postNutrition(@RequestParam String food, String drink, Model model){
        model.addAttribute("food", nutritionService.foxFood(food));
        model.addAttribute("drink", nutritionService.foxDrink(drink));
        return "redirect:/?name=" + informationService.foxName();
    }

    @GetMapping("/trick-center")
    public String trickCenter(Model model){
        model.addAttribute("trickList", trickService.getTrickList());

        return "trickCenter";
    }

    @PostMapping("/trick-center")
    public String postTrick(@RequestParam String trick, Model model){
        model.addAttribute("trick", trickService.foxTricks(trick));

        return "redirect:/?name=" + informationService.foxName();
    }


}
