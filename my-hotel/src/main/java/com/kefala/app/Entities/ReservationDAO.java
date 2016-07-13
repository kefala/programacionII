package com.kefala.app.Entities;

import com.kefala.app.Models.ReservationDTO;

/**
 * Created by kefala on 12/07/16.
 */
public class ReservationDAO extends  DAO<ReservationDTO> {
    private static final String FILE_NAME = "reservations.dat";

    @Override
    public String getFileName() {
            return FILE_NAME;
        }
}
