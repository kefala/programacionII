package com.kefala.app.Controllers.Reservations;

import com.kefala.app.Models.UserDTO;
import com.kefala.app.Views.Reservations.Menu;

/**
 * Created by kefala on 11/07/16.
 */
public class Main {
    public static void showView(UserDTO user) {
        Menu.showView(user);
    }
}
