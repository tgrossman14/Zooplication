package com.zapp.zooplication.data.model;

import java.math.BigDecimal;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Budget {
    private Date startDate;
    private Date endDate;
    private BigDecimal budgetTarget;
    private BigDecimal budgetCurrent;
    private List<Expenditure> expenses;
    private List<BudgetMod> budgetChanges;

    public Budget(Date startDate, Date endDate, BigDecimal budgetTarget, BigDecimal budgetCurrent) {
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

    public BigDecimal getBudgetTarget() {
        return budgetTarget;
    }

    public void setBudgetTarget(BigDecimal budgetTarget) {
        this.budgetTarget = budgetTarget;
    }

    public BigDecimal getBudgetCurrent() {
        return budgetCurrent;
    }

    public void setBudgetCurrent(BigDecimal budgetCurrent) {
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
