package com.greenfoxacademy.bankofsimba.model;

import java.text.DecimalFormat;

public class BankAccount {
    private String name;
    private Double balance;
    private String animalType;

    private static DecimalFormat df2 = new DecimalFormat("#.00");

    public BankAccount(String name, Double balance, String animalType) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getFormattedBalance() {
        return df2.format(balance).toString();
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
}
