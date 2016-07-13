package com.cajero.app.Controllers;

import com.cajero.app.Entities.MovimientoDAO;
import com.cajero.app.Models.ClientDTO;
import com.cajero.app.Models.MovimientoDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kefala on 13/07/16.
 */
public class Consulta {
    public static void make(ClientDTO client) {
        View.showTitle("Consultas");
        String sectionOption = null;
        sectionOption = showMenu();
        if (sectionOption.equals("Saldo")) {
            showSaldo(client);
        }
        if (sectionOption.equals("Ultimos movimientos")) {
            showMovimientos(client);
        }
        if (sectionOption.equals("Volver al menu principal")) {
            MainMenu.show(client);
        }
    }

    private static void showMovimientos(ClientDTO client) {
        MovimientoDAO movDao = new MovimientoDAO();
        List<MovimientoDTO> movs = movDao.getLastByClient(client);
        View.showTitle("Ultimos movimientos");
        if (movs.size() > 0) {
            for (MovimientoDTO mov:movs) {
                View.showMsg(mov.getTipo().getName() + " en el día " + mov.getFecha().toString() + "\n");
                View.showMsg(mov.getImporte().toString() +"\n");
            }
        } else {
            View.showMsg("No posee movimientos aun\n");
        }
        make(client);
    }

    private static void showSaldo(ClientDTO client) {
        View.showMsg("\nSu saldo actual es de " + client.getSaldo() + "\n\n");
        make(client);
    }

    private static String showMenu() {
        String response = "";
        Integer id = 0;
        ArrayList<String> menuOptions = new ArrayList<String>();
        menuOptions.add("Saldo");
        menuOptions.add("Ultimos movimientos");
        menuOptions.add("Volver al menu principal");
        View.showOptionMenu(menuOptions);
        View.showMsg("\nIngrese la opción a elegir: ");
        id = Integer.valueOf(View.listenMsg());
        if (id < 5 && id > 0) {
            response = menuOptions.get((id - 1));
        }
        return response;
    }
}
