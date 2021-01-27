package com.greenfoxacademy.groot.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Yondu {

    private Double distance;
    private Double time;
    private Double speed;

    public Yondu(Double distance, Double time) {
        this.distance = distance;
        this.time = time;
        this.speed = distance / time;
    }
}
