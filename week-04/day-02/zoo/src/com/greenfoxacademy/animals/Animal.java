package com.greenfoxacademy.animals;

public abstract class Animal {
    protected String name;
    protected int age;
    protected String gender;

    public abstract String getName();

    public abstract String breed();

    public abstract void sleep();

    public abstract void eat();
}
