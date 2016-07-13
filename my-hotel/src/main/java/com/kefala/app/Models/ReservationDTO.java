package com.kefala.app.Models;

import java.util.List;

/**
 * Created by kefala on 12/07/16.
 */
public class ReservationDTO extends DTO {
    private ClientDTO client;
    private RoomDTO room;
    private List<DateDTO> days;
    private Double finalPrice;

    public ReservationDTO() {
    }

    public ClientDTO getClient() {
        return client;
    }

    public void setClient(ClientDTO client) {
        this.client = client;
    }

    public RoomDTO getRoom() {
        return room;
    }

    public void setRoom(RoomDTO room) {
        this.room = room;
    }

    public List<DateDTO> getDays() {
        return days;
    }

    public void setDays(List<DateDTO> days) {
        this.days = days;
    }

    public Double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(Double finalPrice) {
        this.finalPrice = finalPrice;
    }
}
