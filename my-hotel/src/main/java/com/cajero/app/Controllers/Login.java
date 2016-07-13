package com.cajero.app.Controllers;


import com.cajero.app.Entities.ClientDAO;
import com.cajero.app.Models.ClientDTO;

/**
 * Created by kefala on 13/07/16.
 */
public class Login {

    public static void login() {
        View.showMsg("\n\nIngrese su nro de tarjeta que le vamos a robar: ");
        Integer nroTarjeta = Integer.valueOf(View.listenMsg());
        View.showMsg("Ingrese su clave que le vamos a robar: ");
        Integer clave = Integer.valueOf(View.listenMsg());
        ClientDTO client = verifyClient(nroTarjeta, clave);

        while (client == null) {
            View.showMsg("Nro de tarjeta o clave incorrectas");
            login();
        }
        MainMenu.show(client);
    }

    private static ClientDTO verifyClient(Integer nro, Integer clave) {
        ClientDAO clientDAO = new ClientDAO();
        return clientDAO.findClient(nro, clave);
    }
}
