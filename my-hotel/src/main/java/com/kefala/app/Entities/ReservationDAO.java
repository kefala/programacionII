package com.kefala.app.Entities;

import com.kefala.app.Models.ReservationDTO;
import com.kefala.app.Models.RoomTypeDTO;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by kefala on 12/07/16.
 */
public class ReservationDAO extends  DAO<ReservationDTO> {
    private static final String FILE_NAME = "reservations.dat";

    public List<ReservationDTO> getByRoomType(RoomTypeDTO roomType) {
        ReservationDAO reservationDao = new ReservationDAO();
        List<ReservationDTO> reservations = reservationDao.getAll();
        List<ReservationDTO> reservationFilter = new ArrayList<ReservationDTO>();
        for (ReservationDTO reservation:reservations) {
            if (reservation.getRoom().getRoomType().getId().equals(roomType.getId())) {
                reservationFilter.add(reservation);
            }
        }
        return reservationFilter;
    }

    @Override
    public String getFileName() {
            return FILE_NAME;
        }
}
