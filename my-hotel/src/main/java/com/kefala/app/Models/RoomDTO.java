package com.kefala.app.Models;

import java.util.List;

/**
 * Created by kefala on 14/06/16.
 */
public class RoomDTO extends DTO {
    private RoomTypeDTO roomType;
    private String name;

    public RoomDTO() {
    }

    public RoomTypeDTO getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomTypeDTO roomType) {
        this.roomType = roomType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
