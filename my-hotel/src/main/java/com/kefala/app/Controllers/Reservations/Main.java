package com.kefala.app.Controllers.Reservations;

import com.kefala.app.Entities.ReservationDAO;
import com.kefala.app.Entities.RoomDAO;
import com.kefala.app.Models.*;
import com.kefala.app.Views.Reservations.Menu;

import java.util.List;

/**
 * Created by kefala on 11/07/16.
 */
public class Main {
    public static void showView(UserDTO user) {
        Menu.showView(user);
    }

    public static boolean isRoomFree(RoomTypeDTO roomType, List<DateDTO> reservationDate) {
        ReservationDAO reservationDao = new ReservationDAO();
        RoomDAO roomDao = new RoomDAO();
        List<RoomDTO> rooms = roomDao.getByRoomType(roomType);
        System.out.printf("Paso por aca \n");
        List<ReservationDTO> reservations = reservationDao.getByRoomType(roomType);

        if (rooms.size() > 0 && reservations.size() == 0) {
            return true;
        }
        return false;
    }

    public static RoomDTO getRoom(RoomTypeDTO roomType, List<DateDTO> reservationDate) {
        ReservationDAO reservationDao = new ReservationDAO();
        RoomDAO roomDao = new RoomDAO();
        List<RoomDTO> rooms = roomDao.getByRoomType(roomType);
        System.out.printf("Paso por aca \n");
        List<ReservationDTO> reservations = reservationDao.getByRoomType(roomType);

        if (rooms.size() > 0 && reservations.size() == 0) {
            return rooms.get(0);
        }
        return null;
    }
}
