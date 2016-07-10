package com.kefala.app.Models;

/**
 * Created by kefala on 14/06/16.
 */
public class RoomTypeDTO extends DTO {
    private String name;
    private PriceDTO price;

    public RoomTypeDTO() {
    }

    public PriceDTO getPrice() {
        return price;
    }

    public void setPrice(PriceDTO price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
