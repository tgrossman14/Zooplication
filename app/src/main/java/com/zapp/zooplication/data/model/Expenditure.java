package com.zapp.zooplication.data.model;

import android.icu.util.CurrencyAmount;

import java.util.Date;

public class Expenditure {

    private Date date;
    private String category;
    private String item;
    private CurrencyAmount amount;

    public Expenditure(Date date, String category, String item, CurrencyAmount amount) {
        this.date = date;
        this.category = category;
        this.item = item;
        this.amount = amount;
    }

    public Expenditure(Date date, String category, CurrencyAmount amount) {
        this.date = date;
        this.category = category;
        this.amount = amount;
    }
}
