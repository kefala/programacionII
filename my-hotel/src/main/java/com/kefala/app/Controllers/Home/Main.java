package com.kefala.app.Controllers.Home;


import com.kefala.app.Views.View;

import java.util.ArrayList;

/**
 * Created by kefala on 15/06/16.
 */
public class Main {

    public static void showMenuRecepcionist() {
        View.showTitle("HOTEL APP");
        ArrayList<String> menuOptions = new ArrayList<String>();
        menuOptions.add("Clientes");
        menuOptions.add("Habitaciones");
        menuOptions.add("Reservas");
        View.showOptionMenu(menuOptions);
    }
}
