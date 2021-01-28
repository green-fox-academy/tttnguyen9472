package com.greenfoxacademy.groot.repository;

import com.greenfoxacademy.groot.model.Food;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class FoodRepository {

    private List<Food> foodList = new ArrayList<>(Arrays.asList(
            new Food("spaghetti", 1, 300),
            new Food("fries", 2, 750)
    ));

    public List<Food> findAll(){
        return foodList;
    }

    public void save(Food food){
        foodList.add(food);
    }

    public void delete(Food food){
        foodList.remove(food);
    }

    public void update(Food food){
        for (int i = 0; i < foodList.size(); i++) {
            foodList.get(i).setAmount(food.getAmount());
        }

    }
}
