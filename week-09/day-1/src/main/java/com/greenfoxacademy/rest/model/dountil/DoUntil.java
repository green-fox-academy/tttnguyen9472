package com.greenfoxacademy.rest.model.dountil;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DoUntil {

    private Integer result;

    public DoUntil(String action, Integer until) {
        if (action.equals("sum")) {
            Integer sum = 0;
            for (int i = 1; i <= until; i++) {
                sum = sum + i;
            }
            this.result = sum;
        } else if (action.equals("factor")){
            Integer factor = 1;
            for (int i = 1; i <= until; i++) {
                factor = factor * i;
            }
            this.result = factor;
        }
    }

}
