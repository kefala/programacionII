package com.kefala.app.Views.Rooms;

import com.kefala.app.Controllers.Rooms.Main;
import com.kefala.app.Controllers.Rooms.Types;
import com.kefala.app.Controllers.Router;
import com.kefala.app.Models.RoomDTO;
import com.kefala.app.Models.RoomTypeDTO;
import com.kefala.app.Models.UserDTO;
import com.kefala.app.Views.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kefala on 11/07/16.
 */
public class RoomMenu {
    public static void showMenu(List<RoomDTO> rooms, UserDTO user) {
        View.showTitle("TIPOS DE HABITACIONES - HOTEL APP");
        listRooms(rooms);
        String option = showOptions();
        if (option.equals("1")) {
            createRoom();
            rooms = Main.getRooms();
        }
        if (option.equals("2")) {
            deleteRoom(rooms);
            rooms = Main.getRooms();
        }
        if (option.equals("3")) {
            updateRoom(rooms);
            rooms = Main.getRooms();
        }
        if (option.equals("4")) {
            Router.router("Home", user);
        }
        if (option.equals("1") || option.equals("2") || option.equals("3")) {
            showMenu(rooms, user);
        }
    }

    public static void listRooms(List<RoomDTO> rooms) {
        for (RoomDTO room:rooms) {
            if (room != null && room.getId() != null) {
                View.showMsg("\n" + room.getId());
                View.showMsg(". " + room.getName() + ", " +room.getRoomType().getName() +" "+ room.getRoomType().getPrice().toString());
            }
        }
        View.showMsg("\n\n");
    }

    public static String showOptions() {
        String option = null;
        do {
            if (option != null) {
                View.showMsg("\nLa opcion ingresada es incorrecta \n");
            }
            ArrayList<String> menuOptions = new ArrayList<String>();
            menuOptions.add("Agregar habitación");
            menuOptions.add("Borrar habitación");
            menuOptions.add("Editar habitación");
            menuOptions.add("Volver al inicio");
            View.showOptionMenu(menuOptions);
            View.showMsg("\nIngrese la opción a elegir: ");
            option = View.listenMsg();
        } while (!(option.equals("1")|| option.equals("2") || option.equals("3") || option.equals("4")));
        return option;
    }

    public static void createRoom() {
        RoomDTO roomDto = new RoomDTO();
        View.showMsg("\nNombre de la habitación: ");
        roomDto.setName(View.listenMsg());
        View.showMsg("\nTipos de habitación:");
        List<RoomTypeDTO> roomTypes= Types.getRoomTypes();
        TypesMenus.listRoomTypes(roomTypes);
        View.showMsg("Ingrese el tipo de habitación: ");
        Integer id = Integer.valueOf(View.listenMsg());
        RoomTypeDTO roomTypeDto = Types.find(id);
        roomDto.setRoomType(roomTypeDto);
        Main.create(roomDto);
        View.showMsg("\nSe guardo con exito la habitación.\n\n");
    }

    public static void deleteRoom(List<RoomDTO> rooms) {
        listRooms(rooms);
        String response;
        View.showMsg("Ingrese el numero de habitación a eliminar: ");
        Integer id = Integer.valueOf(View.listenMsg());
        RoomDTO room = Main.find(id);
        if (room != null) {
            View.showMsg("\nLa habitación " + room.getName() + " va a ser eliminada. Confirme para continuar. (s/n) ");
            response = View.listenMsg();
            if (response.equals("s")) {
                Main.delete(room);
            }
        } else {
            View.showMsg("\n\nEl codigo de habitación no existe, desea borrar otro habitación? (s/n)");
            response = View.listenMsg();
            if (response.equals("s")) {
                deleteRoom(rooms);
            }
        }
    }

    public static void updateRoom(List<RoomDTO> rooms) {
        listRooms(rooms);
        String response;
        View.showMsg("Ingrese el numero de habitación a editar: ");
        Integer id = Integer.valueOf(View.listenMsg());
        RoomDTO room = Main.find(id);
        if (room != null) {
            View.showMsg("\nNombre(" + room.getName() + "): ");
            room.setName(View.listenMsg());
            List<RoomTypeDTO> roomTypes = Types.getRoomTypes();
            TypesMenus.listRoomTypes(roomTypes);
            View.showMsg("Tipo de habitación(" + room.getRoomType().getId().toString() + "): ");
            Integer idType = Integer.valueOf(View.listenMsg());
            RoomTypeDTO roomTypeDto = Types.find(idType);
            room.setRoomType(roomTypeDto);
            View.showMsg("La habitación " + room.getName() + " va a ser guardada. Confirme para continuar. (s/n) ");
            response = View.listenMsg();
            if (response.equals("s")) {
                Main.update(room);
            }
        } else {
            View.showMsg("\nLa habitación no existe, desea editar otra habitación? (s/n)");
            response = View.listenMsg();
            if (response.equals("s")) {
                updateRoom(rooms);
            }
        }
    }
}
