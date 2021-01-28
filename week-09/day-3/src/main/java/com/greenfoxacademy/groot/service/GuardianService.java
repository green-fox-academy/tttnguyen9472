package com.greenfoxacademy.groot.service;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.greenfoxacademy.groot.model.*;
import com.greenfoxacademy.groot.model.Error;
import com.greenfoxacademy.groot.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class GuardianService {

    private FoodRepository foodRepository;

    @Autowired
    public GuardianService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public Groot translateToGroot(String message){
        return new Groot(message);
    }

    public Error errorMessage(){
        return new Error("This is an error message!");
    }

    public Arrow getArrow(Double distance, Double time){
        return new Arrow(distance, time);
    }

    public Rocket cargoStatus(){
        return new Rocket();
    }

    public RocketStatus cargoFilling(String caliber, Integer amount){
        return new RocketStatus(caliber, amount);
    }

    public Double getPercentage(Integer amount){
        return (amount) / 12500.0 * 100;
    }


    public String getShipStatus(Integer amount){
        if (getPercentage(amount) == 0){
            return "empty";
        } else if (getPercentage(amount) > 0 && getPercentage(amount) < 100) {
            return getPercentage(amount) + "%";
        } else if (getPercentage(amount) == 100) {
            return "full";
        }
        return "overloaded";
    }


    public Boolean getReady(Integer amount){
        return getShipStatus(amount).equals("full");
    }

    public List<Food> getCalorieTable(){
        return foodRepository.findAll();
    }

    public void addFood(Food food){
        foodRepository.save(food);
    }

    public void deleteFood(Food food){
        foodRepository.delete(food);
    }

    public void updateFood(Food food){
        foodRepository.update(food);
    }


}
