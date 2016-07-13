package com.kefala.app.Views.Reservations;

import com.kefala.app.Controllers.Reservations.Main;
import com.kefala.app.Controllers.Rooms.Types;
import com.kefala.app.Controllers.Router;
import com.kefala.app.Entities.ClientDAO;
import com.kefala.app.Models.*;
import com.kefala.app.Views.Clients.Menus;
import com.kefala.app.Views.Rooms.TypesMenus;
import com.kefala.app.Views.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kefala on 11/07/16.
 */
public class Menu {
    public static void showView(UserDTO user) {
        View.showTitle("RESERVAS - HOTEL APP");
        String option = showOptions();
        if (option.equals("1")) {
            createReservation();
            //roomsTypes = Types.getRoomTypes();
        }
        if (option.equals("2")) {
            //deleteRoomType(roomsTypes);
            //roomsTypes = Types.getRoomTypes();
        }
        if (option.equals("3")) {
            //editRoomtipes(roomsTypes);
            //roomsTypes = Types.getRoomTypes();
        }
        if (option.equals("4")) {
            Router.router("Home", user);
        }
        if (option.equals("1") || option.equals("2") || option.equals("3")) {
            showView(user);
        }
    }

    private static String showOptions() {
        String option = null;
        do {
            if (option != null) {
                View.showMsg("\nLa opcion ingresada es incorrecta \n");
            }
            ArrayList<String> menuOptions = new ArrayList<String>();
            menuOptions.add("Agregar reserva");
            menuOptions.add("Borrar reserva");
            menuOptions.add("Editar reserva");
            menuOptions.add("Volver al inicio");
            View.showOptionMenu(menuOptions);
            View.showMsg("\nIngrese la opción a elegir: ");
            option = View.listenMsg();
        } while (!(option.equals("1")|| option.equals("2") || option.equals("3") || option.equals("4")));
        return option;
    }
    private static void createReservation() {
        String option = null;
        ClientDTO client = null;
        View.showMsg("\nEl cliente vino alguna vez? (s/n)");
        option = View.listenMsg();
        while (!option.equals("s") && !option.equals("n")) {
            View.showMsg("\nEl cliente vino alguna vez? (s/n)");
            option = View.listenMsg();
        }
        if (option.equals("s")) {
            client = searchUser();

            while (client == null) {
                View.showMsg("\nNo se encontro al usuario, desea crear uno nuevo? (s/n)");
                option = View.listenMsg();
                while (!option.equals("s") && !option.equals("n")) {
                    View.showMsg("\nNo se encontro al usuario, desea crear uno nuevo? (s/n)");
                    option = View.listenMsg();
                }
                if (option.equals("s")) {
                    client = Menus.createClientToResevation();
                } else {
                    client = searchUser();
                }
            }
        } else {
            client = Menus.createClientToResevation();
        }
        thing(client);

    }

    private static void thing(ClientDTO client) {
        RoomTypeDTO roomType = getRoomType();
        while (roomType == null) {
            roomType = getRoomType();
        }
        List<DateDTO> days = consultByReservationDate();

        if (isRoomFree(roomType, days)) {
            ReservationDTO reservation = new ReservationDTO();
            DiscountDTO discount = new DiscountDTO();
            Double price = (client.getCommon()) ? roomType.getPrice().getAmount() * discount.getPercentage() : roomType.getPrice().getAmount();
            price = price * days.size();
            reservation.setClient(client);
            reservation.setDays(days);
            reservation.setRoom(getRoom(roomType, days));
            reservation.setFinalPrice(price);
            View.showMsg("Reserva \n");
            View.showMsg("Habitación: " + reservation.getRoom().getName() + ", Precio:" + reservation.getFinalPrice().toString());
        } else {
            View.showMsg("No se encontró una habitación, desea cancelar? (s/n) \n");
        }
    }

    private static RoomDTO getRoom(RoomTypeDTO roomType, List<DateDTO> reservationDate) {
        return Main.getRoom(roomType, reservationDate);
    }

    private static boolean isRoomFree(RoomTypeDTO roomType, List<DateDTO> reservationDate) {
        return Main.isRoomFree(roomType, reservationDate);
    }

    private static RoomTypeDTO getRoomType() {
        List<RoomTypeDTO> roomTypes = Types.getRoomTypes();
        TypesMenus.listRoomTypes(roomTypes);
        View.showMsg("\nTipo de habitación: ");
        Integer id = Integer.valueOf(View.listenMsg());
        RoomTypeDTO room = Types.find(id);
        return room;
    }

    private static List<DateDTO> consultByReservationDate() {
        List<DateDTO> days = new ArrayList<DateDTO>();
        DateDTO date = new DateDTO();
        date.setYear(2016);
        View.showMsg("\nDía de ingreso: ");
        date.setNumberDay(Integer.valueOf(View.listenMsg()));
        View.showMsg("\nCantidad de noches: ");
        Integer count = Integer.valueOf(View.listenMsg());
        for (int i = 0; i < count; i++) {
            try {
                days.add(new DateDTO(date.getNumberDay(), date.getYear()));
            } catch (Exception e) {
                e.printStackTrace();
            }
            date.setNumberDay(date.getNumberDay() + 1);
        }
        return days;
    }

    private static ClientDTO searchUser() {
        View.showTitle("Buscar usuario");
        ClientDTO client = new ClientDTO();
        View.showMsg("\nNombre: ");
        client.setFirstName(View.listenMsg());
        View.showMsg("Apellido: ");
        client.setLastName(View.listenMsg());
        ClientDAO clientDao = new ClientDAO();
        return clientDao.findByName(client);
    }
}
