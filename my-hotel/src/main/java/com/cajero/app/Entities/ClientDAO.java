package com.cajero.app.Entities;

import com.cajero.app.Models.ClientDTO;

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

    public ClientDTO findClient(Integer nro, Integer clave) {
        List<ClientDTO> clients = getAll();
        for (ClientDTO client:clients) {
            if (client.getNroTarjeta().equals(nro) && client.getClave().equals(clave)) {
                return client;
            }
        }
        return null;
    }
}
