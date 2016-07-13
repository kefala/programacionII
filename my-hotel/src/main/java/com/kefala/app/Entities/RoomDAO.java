package com.kefala.app.Entities;

import com.kefala.app.Models.RoomDTO;
import com.kefala.app.Models.RoomTypeDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kefala on 11/07/16.
 */
public class RoomDAO extends DAO<RoomDTO>{
    private static final String FILE_NAME = "rooms.dat";

    public List<RoomDTO> getByRoomType(RoomTypeDTO roomType) {
        RoomDAO roomDao = new RoomDAO();
        List<RoomDTO> rooms = roomDao.getAll();
        List<RoomDTO> roomFilter = new ArrayList<RoomDTO>();
        for (RoomDTO room:rooms) {
            if (room.getRoomType().getId().equals(roomType.getId())) {
                roomFilter.add(room);
            }
        }
        return roomFilter;
    }

    @Override
    public String getFileName() {
        return FILE_NAME;
    }
}
