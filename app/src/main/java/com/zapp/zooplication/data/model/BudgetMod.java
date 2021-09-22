package com.zapp.zooplication.data.model;

import java.math.BigDecimal;

import java.util.Date;

public class BudgetMod {
    private Date date;
    private BigDecimal amount;

    public BudgetMod(Date date, BigDecimal amount) {
        this.date = date;
        this.amount = amount;
    }
}
