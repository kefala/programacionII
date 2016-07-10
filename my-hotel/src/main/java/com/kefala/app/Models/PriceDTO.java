package com.kefala.app.Models;

public class PriceDTO {
    private Double amount;

    public PriceDTO(Double amount) throws Exception {
        this.amount = amount;
    }

    public PriceDTO() {
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
