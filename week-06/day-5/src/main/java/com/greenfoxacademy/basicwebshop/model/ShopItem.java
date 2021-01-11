package com.greenfoxacademy.basicwebshop.model;

public class ShopItem {
    private String name;
    private String description;
    private Double price;
    private Integer quantityOfStock;
    private String type;
    private String currency;



    public ShopItem(String name, String type, String description, Double price, Integer quantityOfStock) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.price = price;
        this.currency = "Ft";
        this.quantityOfStock = quantityOfStock;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantityOfStock() {
        return quantityOfStock;
    }

    public void setQuantityOfStock(Integer quantityOfStock) {
        this.quantityOfStock = quantityOfStock;
    }

    public String getCurrency() {
        return currency;
    }

    public String getFormattedPrice(){
        return getPrice().toString() + " " + getCurrency();
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

}
