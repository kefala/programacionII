package com.kefala.app.Controllers.Clients;

import com.kefala.app.Entities.ClientDAO;
import com.kefala.app.Models.ClientDTO;
import com.kefala.app.Models.UserDTO;
import com.kefala.app.Views.Clients.Menus;

import java.util.List;

/**
 * Created by kefala on 19/06/16.
 */
public class Main {
    public static void showView(UserDTO user) {
        ClientDAO clientDAO = new ClientDAO();
        List<ClientDTO> clients =clientDAO.getAll();
        Menus.showMenu(clients, user);
    }

    public static void create(ClientDTO client) {
        ClientDAO clientDAO = new ClientDAO();
        clientDAO.create(client);
    }

    public static void update(ClientDTO client) {
        ClientDAO clientDAO = new ClientDAO();
        clientDAO.update(client);
    }

    public static void delete(ClientDTO client) {
        ClientDAO clientDAO = new ClientDAO();
        clientDAO.delete(client);
    }

    public static ClientDTO find(Integer id) {
        ClientDAO clientDAO = new ClientDAO();
        ClientDTO clientDTO = clientDAO.find(id);
        return clientDTO;
    }

    public static List<ClientDTO> getClients() {
        ClientDAO clientDAO = new ClientDAO();
        List<ClientDTO> clients = clientDAO.getAll();
        return clients;
    }
}
