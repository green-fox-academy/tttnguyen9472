package com.greenfoxacademy.rest.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DoUntil {

    private Integer result;

//    public DoUntil(String action, Integer until) {
//        if (action.equals("sum")) {
//            Integer sum = 0;
//            for (int i = 1; i < until; i++) {
//                sum = sum + i;
//            }
//            this.result = sum;
//        } else if (action.equals("factor")){
//            Integer factor = 1;
//            for (int i = 1; i < until; i++) {
//                factor = factor * i;
//            }
//            this.result = factor;
//        }
//    }

    public DoUntil(String action, Integer until) {

        if (action.equals("sum")) {
            int num = until, sum = 0;

            for (int i = 1; i <= num; ++i) {
                sum += i;
            }
            this.result = sum;
        } else if (action.equals("factor")) {
            int number = until;
            int fact = 1;
            for (int i = 1; i <= number; i++) {
                fact = fact * i;
            }
            this.result = fact;
        }

    }

}
