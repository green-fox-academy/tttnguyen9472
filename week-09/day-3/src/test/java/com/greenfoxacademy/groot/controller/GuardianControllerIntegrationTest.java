package com.greenfoxacademy.groot.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.greenfoxacademy.groot.model.Food;
import com.greenfoxacademy.groot.repository.FoodRepository;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest
public class GuardianControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    private FoodRepository foodRepository;

    @Test
    public void ableToAddItemToCalorieTable() throws Exception {
        Assert.assertEquals(2, foodRepository.findAll().size());

        Food postedFood = new Food("testFood", 5, 1000);
        mockMvc.perform(post("/drax")
        .contentType(MediaType.APPLICATION_JSON)
        .content(objectMapper.writeValueAsString(postedFood)))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("name", is("testFood")))
                .andExpect(jsonPath("amount", is(5)))
                .andExpect(jsonPath("calorie", is(1000)))
                .andDo(print());

        Assert.assertEquals(3, foodRepository.findAll().size());



    }
}
