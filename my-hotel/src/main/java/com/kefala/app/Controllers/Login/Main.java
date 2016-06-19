package com.kefala.app.Controllers.Login;

import com.kefala.app.Entities.UserDAO;
import com.kefala.app.Views.View;

/**
 * Created by kefala on 16/06/16.
 */
public class Main {
    public static void showView() {
        View.showTitle("LOGIN HOTEL APP");
        View.showMsg("Ingrese su usuario: ");
        String userName = View.listenMsg();
        View.showMsg("Verificando al usuario: " + userName + "\n");
        com.kefala.app.Controllers.Login.Main.login(userName);
    }

    public static void login(String userName) {
        UserDAO user = new UserDAO();
        if (false) {
            com.kefala.app.Controllers.Home.Main.showMenuRecepcionist();
        } else {
            View.showMsg("\n\n\n\nEl usuario es invalido\n\n");
            com.kefala.app.Controllers.Login.Main.showView();
        }
    }
}
