package com.greenfoxacademy.groot.service;

import com.greenfoxacademy.groot.model.Food;
import com.greenfoxacademy.groot.repository.FoodRepository;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

import static org.mockito.Mockito.when;


public class GuardianServiceTest {

    @Test
    public void getCalorieTable() {

        FoodRepository mockFoodRepository = Mockito.mock(FoodRepository.class);
        GuardianService guardianService = new GuardianService(mockFoodRepository);
        List<Food> mockFoodList = new ArrayList<>(Arrays.asList(
                new Food("spaghetti", 1, 300),
                new Food("fries", 2, 750)
        ));
        when(mockFoodRepository.findAll()).thenReturn(mockFoodList);

        List<Food> foodList = guardianService.getCalorieTable();

        Assert.assertEquals(2, foodList.size());
    }
}