package com.kefala.app.Controllers.Home;


import com.kefala.app.Controllers.Router;
import com.kefala.app.Models.UserDTO;
import com.kefala.app.Views.Home.Menus;


/**
 * Created by kefala on 15/06/16.
 */
public class Main {
    //TODO: create not found role exception
    public static void showView(UserDTO user) {
        String sectionOption = null;
        switch (user.getRole().getId()) {
            case 1:
                sectionOption = Menus.showMenuAdministrator();
                break;
            case 2:
                sectionOption = Menus.showMenuRecepcionist();
                break;
            default:
                System.out.printf("Ocurrió un error");
                break;
        }
        Router.router(sectionOption, user);
    }


}
