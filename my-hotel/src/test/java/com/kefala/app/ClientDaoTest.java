package com.kefala.app;

import com.kefala.app.Entities.ClientDAO;
import com.kefala.app.Models.ClientDTO;
import org.junit.Test;

import java.util.List;

/**
 * Created by kefala on 02/07/16.
 */
public class ClientDaoTest {

    @Test
    public void getAll() throws Exception {
        ClientDAO clientDao = new ClientDAO();
        List<ClientDTO> clients = clientDao.getAll();
        for (ClientDTO client:clients) {
            System.out.printf("\n" + client.getId() + "." + client.getFirstName() + ", " + client.getLastName() + ", comun: " + client.getCommon() + "\n");
        }
    }

    @Test
    public void create() throws Exception {
        ClientDAO clientDao = new ClientDAO();
        ClientDTO clientDTO = new ClientDTO();
        clientDTO.setFirstName("M");
        clientDTO.setLastName("C");
        clientDTO.setCommon(true);
        clientDao.create(clientDTO);
    }
}
