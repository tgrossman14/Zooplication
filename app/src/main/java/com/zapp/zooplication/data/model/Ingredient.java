package com.zapp.zooplication.data.model;

public class Ingredient {

    private String name;
    private String description;
    private String amount;

    public Ingredient(String name, String description, String amount) {
        this.name = name;
        this.description = description;
        this.amount = amount;
    }

    public Ingredient(String name, String amount) {
        this.name = name;
        this.amount = amount;
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

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
