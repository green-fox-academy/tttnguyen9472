package com.greenfoxacademy.programmerfoxclub.model;

public enum Food {
    ONE {
        @Override
        public String toString() {
            return "pizza";
        }
    },

    TWO {
        @Override
        public String toString() {
            return "burger";
        }
    }
}
