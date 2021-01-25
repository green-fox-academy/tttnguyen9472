package com.greenfoxacademy.rest.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AppendA {

    private String appended;

    public AppendA(String appended) {
        this.appended = appended + "a";
    }
}
