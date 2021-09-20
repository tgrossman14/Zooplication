package com.zapp.zooplication.data.model;

import android.icu.util.CurrencyAmount;

import java.util.Date;

public class BudgetMod {
    private Date date;
    private CurrencyAmount amount;

    public BudgetMod(Date date, CurrencyAmount amount) {
        this.date = date;
        this.amount = amount;
    }
}
