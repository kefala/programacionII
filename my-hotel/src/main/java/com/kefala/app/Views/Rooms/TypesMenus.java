package com.kefala.app.Views.Rooms;

import com.kefala.app.Controllers.Rooms.Main;
import com.kefala.app.Controllers.Rooms.Types;
import com.kefala.app.Controllers.Router;
import com.kefala.app.Models.PriceDTO;
import com.kefala.app.Models.RoomTypeDTO;
import com.kefala.app.Models.UserDTO;
import com.kefala.app.Views.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kefala on 02/07/16.
 */
public class TypesMenus {
    public static void showMenu(List<RoomTypeDTO> roomsTypes, UserDTO user) {
        View.showTitle("TIPOS DE HABITACIONES - HOTEL APP");
        listRoomTypes(roomsTypes);
        String option = showOptions();
        if (option.equals("1")) {
            createRoomType();
            roomsTypes = Types.getRoomTypes();
        }
        if (option.equals("2")) {
            deleteRoomType(roomsTypes);
            roomsTypes = Types.getRoomTypes();
        }
        if (option.equals("3")) {
            updateRoomType(roomsTypes);
            roomsTypes = Types.getRoomTypes();
        }
        if (option.equals("4")) {
            Router.router("Home", user);
        }
        if (option.equals("1") || option.equals("2") || option.equals("3")) {
            showMenu(roomsTypes, user);
        }
    }

    public static void createRoomType() {
        RoomTypeDTO roomTypeDTO = new RoomTypeDTO();
        View.showMsg("\nNombre del tipo de habitación: ");
        roomTypeDTO.setName(View.listenMsg());
        View.showMsg("\nPrecio por noche del nuevo tipo: ");
        PriceDTO price = new PriceDTO();
        try {
            price.setAmount(Double.valueOf(View.listenMsg()));
        } catch (Exception e) {
            View.showMsg("\nIngrese un precio correcto: ");
            price.setAmount(Double.valueOf(View.listenMsg()));
        }
        roomTypeDTO.setPrice(price);
        Types.create(roomTypeDTO);
        View.showMsg("\n\nSe guardo con exito el nuevo tipo de habitación.\n\n");
    }

    public static void deleteRoomType(List<RoomTypeDTO> roomsTypes) {
        listRoomTypes(roomsTypes);
        String response;
        View.showMsg("\nIngrese el numero de tipo de habitación a eliminar: ");
        Integer id = Integer.valueOf(View.listenMsg());

        RoomTypeDTO room = Types.find(id);
        if (room != null) {
            View.showMsg("\nEl tipo de habitación " + room.getName() + " va a ser eliminado. Confirme para continuar. (s/n)\n");
            response = View.listenMsg();
            if (response.equals("s")) {
                Types.delete(room);
            }
        } else {
            View.showMsg("\n\nEl codigo de habitación no existe, desea borrar otro usuario? (s/n)");
            response = View.listenMsg();
            if (response.equals("s")) {
                deleteRoomType(roomsTypes);
            }
        }
    }

    public static void updateRoomType(List<RoomTypeDTO> roomsTypes) {
        listRoomTypes(roomsTypes);
        String response;
        View.showMsg("\nIngrese el numero de tipo de habitación a editar: ");
        Integer id = Integer.valueOf(View.listenMsg());
        RoomTypeDTO room = Types.find(id);
        if (room != null) {
            View.showMsg("\nNombre(" + room.getName() + "): ");
            room.setName(View.listenMsg());
            View.showMsg("\nPrecio(" + room.getPrice().toString() + "): ");
            PriceDTO price = new PriceDTO();
            try {
                price.setAmount(Double.valueOf(View.listenMsg()));
            } catch (Exception e) {
                View.showMsg("\nIngrese un precio correcto: ");
                price.setAmount(Double.valueOf(View.listenMsg()));
            }
            room.setPrice(price);

            View.showMsg("\nEl tipo de habitacion " + room.getName() + " va a ser guardado. Confirme para continuar. (s/n)\n");
            response = View.listenMsg();
            if (response.equals("s")) {
                Types.update(room);
            }
        } else {
            View.showMsg("\n\nEl codigo de usuario no existe, desea eidtar otro usuario? (s/n)");
            response = View.listenMsg();
            if (response.equals("s")) {
                updateRoomType(roomsTypes);
            }
        }
    }

    public static void listRoomTypes(List<RoomTypeDTO> roomsTypes) {
        for (RoomTypeDTO roomType:roomsTypes) {
            if (roomType.getId() != null) {
                View.showMsg("\n" + roomType.getId());
                View.showMsg(". " + roomType.getName() + ", " + roomType.getPrice().toString());
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
            menuOptions.add("Agregar tipo de habitación");
            menuOptions.add("Borrar tipo de habitación");
            menuOptions.add("Editar tipo de habitación");
            menuOptions.add("Volver al inicio");
            View.showOptionMenu(menuOptions);
            View.showMsg("\nIngrese la opción a elegir: ");
            option = View.listenMsg();
        } while (!(option.equals("1")|| option.equals("2") || option.equals("3") || option.equals("4")));
        return option;
    }
}
