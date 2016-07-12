package com.kefala.app.Views.Reservations;

import com.kefala.app.Controllers.Clients.Main;
import com.kefala.app.Controllers.Router;
import com.kefala.app.Entities.ClientDAO;
import com.kefala.app.Models.ClientDTO;
import com.kefala.app.Models.UserDTO;
import com.kefala.app.Views.Clients.Menus;
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
        View.showMsg("\nEl cliente vino alguna vez? (s/n)");
        option = View.listenMsg();
        while (!option.equals("s") && !option.equals("n")) {
            View.showMsg("\nEl cliente vino alguna vez? (s/n)");
            option = View.listenMsg();
        }
        if (option.equals("s")) {
            ClientDTO client = searchUser();
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
            ClientDTO client = Menus.createClientToResevation();
        }
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
