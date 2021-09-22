package com.zapp.zooplication.data.model;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.List;


public class DailyStats {

    private Date date;
    private BigDecimal average;
    private BigDecimal dailyHigh;
    private List<BigDecimal> averageByCategory;

    public DailyStats(Date date, BigDecimal average, BigDecimal dailyHigh, List<BigDecimal> averageByCategory) {
        this.date = date;
        this.average = average;
        this.dailyHigh = dailyHigh;
        this.averageByCategory = averageByCategory;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getAverage() {
        return average;
    }

    public BigDecimal calculateAverage(List<Expenditure> expenditureList){
        BigDecimal avg = BigDecimal.valueOf(0.0);
        int i = 0;
        for (Expenditure expenditure : expenditureList){
            if (expenditure.getDate() == this.getDate()) {
                avg = avg.add(expenditure.getAmount());
                i++;
            }
        }
        return avg.divide(BigDecimal.valueOf(i)).setScale(2, RoundingMode.CEILING);
    }

    public void setAverage(BigDecimal average) {
        this.average = average;
    }

    public BigDecimal getDailyHigh() {
        return dailyHigh;
    }

    public void setDailyHigh(BigDecimal dailyHigh) {
        this.dailyHigh = dailyHigh;
    }

    public List<BigDecimal> getAverageByCategory() {
        return averageByCategory;
    }

    public void setAverageByCategory(List<BigDecimal> averageByCategory) {
        this.averageByCategory = averageByCategory;
    }
}
