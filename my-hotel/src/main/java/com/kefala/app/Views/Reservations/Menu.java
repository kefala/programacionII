package com.kefala.app.Views.Reservations;

import com.kefala.app.Controllers.Router;
import com.kefala.app.Models.UserDTO;
import com.kefala.app.Views.View;

import java.util.ArrayList;

/**
 * Created by kefala on 11/07/16.
 */
public class Menu {
    public static void showView(UserDTO user) {
        View.showTitle("RESERVAS - HOTEL APP");
        String option = showOptions();
        if (option.equals("1")) {
            //createRoomType();
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
}
