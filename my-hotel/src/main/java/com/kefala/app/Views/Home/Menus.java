package com.kefala.app.Views.Home;

import com.kefala.app.Views.View;

import java.util.ArrayList;

/**
 * Created by kefala on 19/06/16.
 */
public class Menus {
    public static String showMenuRecepcionist() {
        View.showTitle("INICIO - HOTEL APP");
        ArrayList<String> menuOptions = new ArrayList<String>();
        menuOptions.add("Clientes");
        menuOptions.add("Habitaciones");
        menuOptions.add("Reservas");
        menuOptions.add("Recepcionistas");
        menuOptions.add("Tarifas");
        View.showOptionMenu(menuOptions);
        View.showMsg("\n Ingrese la opción a elegir: ");
        return View.listenMsg();
    }

    public static String showMenuAdministrator() {
        View.showTitle("INICIO - HOTEL APP");
        ArrayList<String> menuOptions = new ArrayList<String>();
        menuOptions.add("Clientes");
        menuOptions.add("Habitaciones");
        menuOptions.add("Reservas");
        View.showOptionMenu(menuOptions);
        View.showMsg("\n Ingrese la opción a elegir: ");
        return View.listenMsg();
    }
}
