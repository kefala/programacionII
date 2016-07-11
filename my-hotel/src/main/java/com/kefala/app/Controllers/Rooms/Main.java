package com.kefala.app.Controllers.Rooms;

import com.kefala.app.Entities.RoomDAO;
import com.kefala.app.Models.RoomDTO;
import com.kefala.app.Models.UserDTO;
import com.kefala.app.Views.Rooms.RoomMenu;

import java.util.List;

/**
 * Created by kefala on 02/07/16.
 */
public class Main {

    public static void showView(UserDTO user) {
        RoomDAO roomTypeDao = new RoomDAO();
        List<RoomDTO> rooms = roomTypeDao.getAll();
        RoomMenu.showMenu(rooms, user);
    }

    public static void create(RoomDTO room) {
        RoomDAO roomDao = new RoomDAO();
        roomDao.create(room);
    }

    public static void update(RoomDTO room) {
        RoomDAO roomDao = new RoomDAO();
        roomDao.update(room);
    }

    public static void delete(RoomDTO room) {
        RoomDAO roomDao = new RoomDAO();
        roomDao.delete(room);
    }

    public static RoomDTO find(Integer id) {
        RoomDAO roomDao = new RoomDAO ();
        RoomDTO roomType = roomDao.find(id);
        return roomType;
    }

    public static List<RoomDTO> getRooms() {
        RoomDAO roomDao = new RoomDAO();
        List<RoomDTO> rooms = roomDao.getAll();
        return rooms;
    }
}
