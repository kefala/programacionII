package com.kefala.app.Models;

import java.io.Serializable;

public class PriceDTO implements Serializable{
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

    @Override
    public String toString() {
        return amount.toString();
    }
}
