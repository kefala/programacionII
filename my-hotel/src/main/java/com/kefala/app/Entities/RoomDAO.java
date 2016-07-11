package com.kefala.app.Entities;

import com.kefala.app.Models.RoomDTO;

/**
 * Created by kefala on 11/07/16.
 */
public class RoomDAO extends DAO<RoomDTO>{
    private static final String FILE_NAME = "rooms.dat";

    @Override
    public String getFileName() {
        return FILE_NAME;
    }
}
