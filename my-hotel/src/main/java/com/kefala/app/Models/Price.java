package com.kefala.app.Models;

public class Price {
    private Double amount;

    public Price(Double amount) throws Exception {
        if (amount < 0) {
            throw new Exception("El precio no puede ser negetivo");
        }

        this.amount = amount;
    }
}
