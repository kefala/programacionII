package com.kefala.app.Models;

public class PriceDTO {
    private Double amount;

    public PriceDTO(Double amount) throws Exception {
        if (amount < 0) {
            throw new Exception("El precio no puede ser negetivo");
        }

        this.amount = amount;
    }
}
