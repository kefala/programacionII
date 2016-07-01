package com.kefala.app.Entities;

import com.kefala.app.Models.ClientDTO;

/**
 * Created by kefala on 19/06/16.
 */
public class ClientDAO extends DAO<ClientDTO> {
    private static final String FILE_NAME = "clients.dat";

    @Override
    public String getFileName() {
        return FILE_NAME;
    }
}
