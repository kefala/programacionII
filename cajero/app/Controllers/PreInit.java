package com.cajero.app.Controllers;

import com.cajero.app.Models.ClientDTO;
import com.cajero.app.Entities.ClientDAO;

import java.io.File;
import java.util.List;

/**
 * Created by kefala on 02/07/16.
 */
public class PreInit {

    public static void load() {

        File directory = new File("cajeroFiles/");
        if (! directory.exists()){
            directory.mkdir();
        }
        File archivo = new File("cajeroFiles/clients.dat");
        if(!archivo.exists()) {
            System.out.printf("\n---Se ejecutó un pre script para crear listado de clientes---\n");
            ClientDAO clientDAO = new ClientDAO();

            ClientDTO client = new ClientDTO();
            client.setClave(1234);
            client.setNombrApellido("Martín Lobo");
            client.setNroTarjeta(1234);
            client.setSaldo(Float.valueOf("100000"));
            clientDAO.create(client);

            client = new ClientDTO();
            client.setClave(1234);
            client.setNombrApellido("Mónica Kuhn");
            client.setNroTarjeta(1111);
            client.setSaldo(Float.valueOf("10"));
            clientDAO.create(client);

            List<ClientDTO> clients = clientDAO.getAll();
            for (ClientDTO clientItem:clients) {
                System.out.printf("Se creó el cliente " + clientItem.getNombrApellido() + " con nro de tarjeta " + clientItem.getNroTarjeta() + ", clave "+ clientItem.getClave() + " y saldo " + clientItem.getSaldo() + "\n\n");
            }
        }

    }

}
