package com.kefala.app.Controllers.Login;

import com.kefala.app.Views.View;

/**
 * Created by kefala on 16/06/16.
 */
public class Main {
    public static void showView() {
        View.showTitle("LOGIN HOTEL APP");
        View.showMsg("Ingrese su usuario: ");
        String userName = View.listenMsg();
        View.showMsg("Verificando al usuario " + userName + "\n");
    }
}
