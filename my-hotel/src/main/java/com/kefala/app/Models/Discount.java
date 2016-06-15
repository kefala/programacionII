package com.kefala.app.Models;

public class Discount {
    private Double percentage;

    public Discount(Double percentage) {
        this.percentage = percentage;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }
}
