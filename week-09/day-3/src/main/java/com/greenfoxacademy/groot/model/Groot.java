package com.greenfoxacademy.groot.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class Groot {

    private String received;
    private String translated;

    public Groot(){
        this.translated = "I am Groot!";
    }

    public Groot(String received) {
        this.received = received;
        this.translated = "I am Groot!";
    }
}
