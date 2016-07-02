package com.kefala.app.Entities;

import com.kefala.app.Models.RoomTypeDTO;

/**
 * Created by kefala on 02/07/16.
 */
public class RoomTypeDAO extends DAO<RoomTypeDTO> {
    private static final String FILE_NAME = "roomTypes.dat";

    @Override
    public String getFileName() {
        return FILE_NAME;
    }
}
