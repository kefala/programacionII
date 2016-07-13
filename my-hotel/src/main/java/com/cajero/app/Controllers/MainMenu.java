package com.cajero.app.Controllers;

import com.cajero.app.Models.ClientDTO;

import java.util.ArrayList;

/**
 * Created by kefala on 13/07/16.
 */
public class MainMenu {

    public static void show(ClientDTO client) {
        String sectionOption = null;
        sectionOption = showMenu();
        Router.router(sectionOption, client);
    }

    private static String showMenu() {
        String response = "";
        Integer id = 0;
        ArrayList<String> menuOptions = new ArrayList<String>();
        View.showTitle("BIENVENIDO AL CAJERO MAS PRO DEL MUNDO");
        menuOptions.add("Extracción");
        menuOptions.add("Depósito");
        menuOptions.add("Consulta");
        menuOptions.add("Pago de Servicio");
        menuOptions.add("Salir");
        View.showOptionMenu(menuOptions);
        View.showMsg("\nIngrese la opción a elegir: ");
        id = Integer.valueOf(View.listenMsg());
        if (id < 6 && id > 0) {
            response = menuOptions.get((id - 1));
        }
        return response;
    }


}
