package com.greenfoxacademy.rest.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class Doubling {
    private Integer received;
    private Integer result = received;

    public Doubling(Integer received) {
        this.received = received;
        this.result = received * 2;
    }
}
