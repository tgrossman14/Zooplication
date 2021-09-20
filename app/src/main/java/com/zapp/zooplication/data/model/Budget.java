package com.zapp.zooplication.data.model;

import android.icu.util.CurrencyAmount;

import java.util.Date;
import java.util.List;

public class Budget {
    private Date startDate;
    private Date endDate;
    private CurrencyAmount budgetTarget;
    private CurrencyAmount budgetCurrent;
    private List<Expenditure> expenses;
    private List<BudgetMod> budgetChanges;

    public Budget(Date startDate, Date endDate, CurrencyAmount budgetTarget, CurrencyAmount budgetCurrent) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.budgetTarget = budgetTarget;
        this.budgetCurrent = budgetCurrent;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public CurrencyAmount getBudgetTarget() {
        return budgetTarget;
    }

    public void setBudgetTarget(CurrencyAmount budgetTarget) {
        this.budgetTarget = budgetTarget;
    }

    public CurrencyAmount getBudgetCurrent() {
        return budgetCurrent;
    }

    public void setBudgetCurrent(CurrencyAmount budgetCurrent) {
        this.budgetCurrent = budgetCurrent;
    }

    public List<Expenditure> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<Expenditure> expenses) {
        this.expenses = expenses;
    }

    public List<BudgetMod> getBudgetChanges() {
        return budgetChanges;
    }

    public void setBudgetChanges(List<BudgetMod> budgetChanges) {
        this.budgetChanges = budgetChanges;
    }
}
