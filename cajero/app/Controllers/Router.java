package com.cajero.app.Controllers;


import com.cajero.app.Models.ClientDTO;

/**
 * Created by kefala on 19/06/16.
 */
public class Router {

    public static void router(String section, ClientDTO client) {
        if (client == null) {
            Login.login();
        } else {

            if (section.equals("Extracción")) {
                Extraccion.make(client);
            }
            if (section.equals("Depósito")) {
                Deposito.make(client);
            }
            if (section.equals("Consulta")) {
                Consulta.make(client);
            }
            if (section.equals("Pago de Servicio")) {
                PagoDeServicio.make(client);
            }
            if (section.equals("Salir")) {
                Login.login();
            }
        }
    }

}
