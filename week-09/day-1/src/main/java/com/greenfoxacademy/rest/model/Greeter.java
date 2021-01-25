package com.greenfoxacademy.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Greeter {
    @JsonProperty(value = "welcome_message")
    private String welcomeMessage;

    public Greeter(String name, String title) {
        this.welcomeMessage = "Oh, hi there " + name + ", my dear " + title + "!";
    }
}
