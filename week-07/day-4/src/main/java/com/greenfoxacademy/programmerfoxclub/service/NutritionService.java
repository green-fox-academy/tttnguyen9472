package com.greenfoxacademy.programmerfoxclub.service;

import com.greenfoxacademy.programmerfoxclub.model.Drink;
import com.greenfoxacademy.programmerfoxclub.model.Food;
import com.greenfoxacademy.programmerfoxclub.model.Fox;
import com.greenfoxacademy.programmerfoxclub.model.Tricks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class NutritionService {

    private LoginService loginService;

    @Autowired
    public NutritionService(LoginService loginService) {
        this.loginService = loginService;
    }

    public List<String> getFoodList() {
        return Arrays.stream(Food.values())
                .map(Enum::toString)
                .collect(Collectors.toList());
    }

    public List<String> getDrinkList() {
        return Arrays.stream(Drink.values())
                .map(Enum::toString)
                .collect(Collectors.toList());
    }

    public String foxFood(String food) {
        loginService.getFoxList().get(loginService.getFoxList().size() - 1).setFood(food);
        return loginService.getFoxList().get(loginService.getFoxList().size() - 1).getFood();
    }

    public String foxDrink(String drink) {
        loginService.getFoxList().get(loginService.getFoxList().size() - 1).setDrink(drink);
        return loginService.getFoxList().get(loginService.getFoxList().size() - 1).getDrink();
    }
}
