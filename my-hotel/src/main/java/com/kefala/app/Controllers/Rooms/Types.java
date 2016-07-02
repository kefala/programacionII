package com.kefala.app.Controllers.Rooms;

import com.kefala.app.Entities.RoomTypeDAO;
import com.kefala.app.Models.RoomTypeDTO;
import com.kefala.app.Models.UserDTO;
import com.kefala.app.Views.Rooms.TypesMenus;

import java.util.List;

/**
 * Created by kefala on 02/07/16.
 */
public class Types {
    public static void showView(UserDTO user) {
        RoomTypeDAO clientDAO = new RoomTypeDAO();
        List<RoomTypeDTO> roomTypes =clientDAO.getAll();
        TypesMenus.showMenu(roomTypes, user);
    }

    public static void create(RoomTypeDTO roomType) {
        RoomTypeDAO roomTypesDao = new RoomTypeDAO();
        roomTypesDao.create(roomType);
    }

    public static void update(RoomTypeDTO roomType) {
        RoomTypeDAO roomTypesDao = new RoomTypeDAO();
        roomTypesDao.update(roomType);
    }

    public static void delete(RoomTypeDTO roomType) {
        RoomTypeDAO roomTypesDao = new RoomTypeDAO();
        roomTypesDao.delete(roomType);
    }

    public static RoomTypeDTO find(Integer id) {
        RoomTypeDAO roomTypesDao = new RoomTypeDAO();
        RoomTypeDTO roomType = roomTypesDao.find(id);
        return roomType;
    }

    public static List<RoomTypeDTO> getRoomTypes() {
        RoomTypeDAO roomTypesDao = new RoomTypeDAO();
        List<RoomTypeDTO> roomTypes = roomTypesDao.getAll();
        return roomTypes;
    }
}
