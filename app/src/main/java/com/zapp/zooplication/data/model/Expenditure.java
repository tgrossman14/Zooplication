package com.zapp.zooplication.data.model;

import java.math.BigDecimal;

import java.util.Date;

public class Expenditure {

    private Date date;
    private String category;
    private BigDecimal amount;
    private String item;

    public Expenditure(Date date, String category, BigDecimal amount, String item) {
        this.date = date;
        this.category = category;
        this.amount = amount;
        this.item = item;

    }

    public Expenditure(Date date, String category, BigDecimal amount) {
        this.date = date;
        this.category = category;
        this.amount = amount;
    }

    public Expenditure(Date date, BigDecimal amount, String item) {
        this.date = date;
        this.amount = amount;
        this.item = item;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
