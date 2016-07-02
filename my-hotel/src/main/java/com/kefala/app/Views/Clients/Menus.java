package com.kefala.app.Views.Clients;

import com.kefala.app.Controllers.Clients.Main;
import com.kefala.app.Controllers.Router;
import com.kefala.app.Entities.ClientDAO;
import com.kefala.app.Models.ClientDTO;
import com.kefala.app.Models.UserDTO;
import com.kefala.app.Views.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kefala on 19/06/16.
 */
public class Menus {
    public static void showMenu(List<ClientDTO> clients, UserDTO user) {
        View.showTitle("CLIENTES - HOTEL APP");

        listClients(clients);
        String option = showOptions();
        if (option.equals("1")) {
            createClient();
            clients = Main.getClients();
        }
        if (option.equals("2")) {
            deleteClient(clients);
            clients = Main.getClients();
        }
        if (option.equals("3")) {
            updateClient(clients);
            clients = Main.getClients();
        }
        if (option.equals("4")) {
            Router.router("Home", user);
        }
        if (option.equals("1") || option.equals("2") || option.equals("3")) {
            showMenu(clients, user);
        }
    }

    public static void createClient() {
        ClientDTO client = new ClientDTO();
        View.showMsg("\nNombre: ");
        client.setFirstName(View.listenMsg());
        View.showMsg("\nApellido: ");
        client.setLastName(View.listenMsg());
        client.setCommon(true);
        Main.create(client);
        View.showMsg("\n\nSe guardo con exito al nuevo cliente.\n\n");
    }

    public static void deleteClient(List<ClientDTO> clients) {
        listClients(clients);
        String response;
        View.showMsg("\nIngrese el numero de cliente a eliminar: ");
        Integer id = Integer.valueOf(View.listenMsg());
        ClientDTO clientDTO = Main.find(id);
        if (clientDTO != null) {
            View.showMsg("\nEl cliente " + clientDTO.getFirstName() + " " + clientDTO.getLastName() + " va a ser eliminado. Confirme para continuar. (s/n)\n");
            response = View.listenMsg();
            if (response.equals("s")) {
                Main.delete(clientDTO);
            }
        } else {
            View.showMsg("\n\nEl codigo de usuario no existe, desea borrar otro usuario? (s/n)");
            response = View.listenMsg();
            if (response.equals("s")) {
                deleteClient(clients);
            }
        }
    }

    public static void updateClient(List<ClientDTO> clients) {
        listClients(clients);
        String response;
        View.showMsg("\nIngrese el numero de cliente a editar: ");
        Integer id = Integer.valueOf(View.listenMsg());
        ClientDTO clientDTO = Main.find(id);
        if (clientDTO != null) {
            View.showMsg("\nNombre(" + clientDTO.getFirstName() + "): ");
            clientDTO.setFirstName(View.listenMsg());
            View.showMsg("\nApellido(" + clientDTO.getLastName() + "): ");
            clientDTO.setLastName(View.listenMsg());
            View.showMsg("\nEl cliente " + clientDTO.getFirstName() + " " + clientDTO.getLastName() + " va a ser guardado. Confirme para continuar. (s/n)\n");
            response = View.listenMsg();
            if (response.equals("s")) {
                Main.update(clientDTO);
            }
        } else {
            View.showMsg("\n\nEl codigo de usuario no existe, desea eidtar otro usuario? (s/n)");
            response = View.listenMsg();
            if (response.equals("s")) {
                updateClient(clients);
            }
        }

    }

    public static void listClients(List<ClientDTO> clients) {

        for (ClientDTO client:clients) {
            if (client.getId() != null) {
                View.showMsg("\n" + client.getId());
                View.showMsg(". " + client.getFirstName() + " " + client.getLastName());
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
            menuOptions.add("Agregar cliente");
            menuOptions.add("Borrar cliente");
            menuOptions.add("Editar cliente");
            menuOptions.add("Volver al inicio");
            View.showOptionMenu(menuOptions);
            View.showMsg("\nIngrese la opción a elegir: ");
            option = View.listenMsg();
        } while (!(option.equals("1")|| option.equals("2") || option.equals("3") || option.equals("4")));

        return option;
    }
}
