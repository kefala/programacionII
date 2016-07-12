package com.kefala.app.Views.Home;

import com.kefala.app.Views.View;

import java.util.ArrayList;

/**
 * Created by kefala on 19/06/16.
 */
public class Menus {
    public static String showMenuRecepcionist() {
        String response = "";
        Integer id = 0;
        ArrayList<String> menuOptions = new ArrayList<String>();
        View.showTitle("INICIO - HOTEL APP");
        menuOptions.add("Clientes");
        menuOptions.add("Reservas");
        View.showOptionMenu(menuOptions);
        View.showMsg("\nIngrese la opción a elegir: ");
        id = Integer.valueOf(View.listenMsg());
        if (id < 4 && id > 0) {
            response = menuOptions.get((id - 1));
        }
        return response;
    }

    public static String showMenuAdministrator() {
        String response = "";
        Integer id = 0;
        ArrayList<String> menuOptions = new ArrayList<String>();
        View.showTitle("INICIO - HOTEL APP");
        menuOptions.add("Clientes");
        menuOptions.add("Habitaciones");
        menuOptions.add("Tipo de habitación");
        menuOptions.add("Reservas");
        menuOptions.add("Recepcionistas");
        View.showOptionMenu(menuOptions);
        View.showMsg("\nIngrese la opción a elegir: ");
        id = Integer.valueOf(View.listenMsg());
        if (id < 6 && id > 0) {
            response = menuOptions.get((id - 1));
        }
        return response;
    }
}
