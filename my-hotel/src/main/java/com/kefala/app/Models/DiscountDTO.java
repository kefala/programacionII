package com.kefala.app.Models;

public class DiscountDTO {
    private Double percentage;

    public DiscountDTO(Double percentage) {
        this.percentage = percentage;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }
}
