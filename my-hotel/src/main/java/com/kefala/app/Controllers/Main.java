package com.kefala.app.Controllers;

/**
 * Created by kefala on 15/06/16.
 */
public class Main {
    public static void start() {
        PreInit.load();
        com.kefala.app.Controllers.Login.Main.showView();
    }
}
