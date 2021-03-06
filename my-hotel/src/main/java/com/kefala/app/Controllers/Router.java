package com.kefala.app.Controllers;

import com.kefala.app.Controllers.Home.*;
import com.kefala.app.Models.UserDTO;

/**
 * Created by kefala on 19/06/16.
 */
public class Router {

    public static void router(String section, UserDTO user) {
        if (user == null) {
            com.kefala.app.Controllers.Login.Main.showView();
        } else {
            if (section.equals("Home")) {
                com.kefala.app.Controllers.Home.Main.showView(user);
            }
            if (section.equals("Clientes")) {
                com.kefala.app.Controllers.Clients.Main.showView(user);
            }
            if (section.equals("Tipo de habitación")) {
                com.kefala.app.Controllers.Rooms.Types.showView(user);
            }
            if (section.equals("Habitaciones")) {
                com.kefala.app.Controllers.Rooms.Main.showView(user);
            }
            if (section.equals("Reservas")) {
                com.kefala.app.Controllers.Reservations.Main.showView(user);
            }

            //TODO: create not found section exceptions
        }
    }

}
