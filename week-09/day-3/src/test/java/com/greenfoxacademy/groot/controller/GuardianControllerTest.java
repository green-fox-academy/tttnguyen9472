package com.greenfoxacademy.groot.controller;

import com.greenfoxacademy.groot.model.Error;
import com.greenfoxacademy.groot.model.Groot;
import com.greenfoxacademy.groot.model.Yondu;
import com.greenfoxacademy.groot.service.GuardianService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@RunWith(SpringRunner.class)
@WebMvcTest
public class GuardianControllerTest {

    @MockBean
private GuardianService guardianService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void canTranslateToGroot() throws Exception {
        String message = "somemessage";
                Groot mockGroot = new Groot(message);
        when(guardianService.translateToGroot(message)).thenReturn(mockGroot);

        mockMvc.perform(get("/groot").param("message", "somemessage"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("translated", is("I am Groot!")))
                .andDo(print());
    }

    @Test
    public void noParameterForGroot() throws Exception {
        Error mockError = new Error("This is an error message!");
        when(guardianService.errorMessage()).thenReturn(mockError);

        mockMvc.perform(get("/groot"))
                .andExpect(status().is4xxClientError())
                .andExpect(jsonPath("error", is("This is an error message!")))
                .andDo(print());
    }

    @Test
    public void canGetYondusArrow() throws Exception {
        Double distance = 100.0;
        Double time = 10.0;
        Yondu mockYondu = new Yondu(distance, time);
        when(guardianService.getArrow(distance, time)).thenReturn(mockYondu);

        mockMvc.perform(get("/yondu").param("distance", String.valueOf(100.0)).param("time", String.valueOf(10.0)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("speed", is(10.0)))
                .andDo(print());
    }

    @Test
    public void noParameterForYondu() throws Exception {
        Error mockError = new Error("This is an error message!");
        when(guardianService.errorMessage()).thenReturn(mockError);

        mockMvc.perform(get("/yondu"))
                .andExpect(status().is4xxClientError())
                .andExpect(jsonPath("error", is("This is an error message!")))
                .andDo(print());
    }
}