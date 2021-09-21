package com.zapp.zooplication.data.model;

import android.icu.util.CurrencyAmount;

import java.util.Date;

public class Expenditure {

    private Date date;
    private String category;
    private CurrencyAmount amount;
    private String item;

    public Expenditure(Date date, String category, CurrencyAmount amount, String item) {
        this.date = date;
        this.category = category;
        this.amount = amount;
        this.item = item;

    }

    public Expenditure(Date date, String category, CurrencyAmount amount) {
        this.date = date;
        this.category = category;
        this.amount = amount;
    }

    public Expenditure(Date date, CurrencyAmount amount, String item) {
        this.date = date;
        this.amount = amount;
        this.item = item;
    }
}
