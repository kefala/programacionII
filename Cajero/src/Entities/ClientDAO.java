package com.kefala.app.Entities;

import com.kefala.app.Models.ClientDTO;

import java.util.List;

/**
 * Created by kefala on 19/06/16.
 */
public class ClientDAO extends DAO<ClientDTO> {
    private static final String FILE_NAME = "clients.dat";

    @Override
    public String getFileName() {
        return FILE_NAME;
    }

    public ClientDTO findByName(ClientDTO client) {
        List<ClientDTO> clients = getAll();
        for (ClientDTO myClient:clients) {
            if (myClient.getFirstName().equals(client.getFirstName()) && myClient.getLastName().equals(client.getLastName())) {
                return myClient;
            }
        }
        return null;
    }
}
