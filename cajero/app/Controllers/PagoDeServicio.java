package com.cajero.app.Controllers;

import com.cajero.app.Entities.ClientDAO;
import com.cajero.app.Entities.MovimientoDAO;
import com.cajero.app.Models.ClientDTO;
import com.cajero.app.Models.Fecha;
import com.cajero.app.Models.MovimientoDTO;
import com.cajero.app.Models.TipoMovimiento;

import java.util.ArrayList;

/**
 * Created by kefala on 13/07/16.
 */
public class PagoDeServicio {

    public static void make(ClientDTO client) {
        View.showTitle("Pago mis cuentas");
        String sectionOption = null;
        sectionOption = showMenu();
        TipoMovimiento tipo = null;

        if (sectionOption.equals("Volver al menu principal")) {
            MainMenu.show(client);
        } else {
            View.showMsg("Ingrese el monto: ");
            Float monto = Float.valueOf(View.listenMsg());
            if (sectionOption.equals("Luz")) {
                tipo = TipoMovimiento.PAGO_DE_SERVICIOS_LUZ;
            }
            if (sectionOption.equals("Agua")) {
                tipo = TipoMovimiento.PAGO_DE_SERVICIOS_AGUA;
            }
            if (sectionOption.equals("Gas")) {
                tipo = TipoMovimiento.PAGO_DE_SERVICIOS_GAS;
            }
            client =  pagarServicio(monto, client, tipo);
        }
        make(client);
    }

    private static String showMenu() {
        String response = "";
        Integer id = 0;
        ArrayList<String> menuOptions = new ArrayList<String>();
        menuOptions.add("Luz");
        menuOptions.add("Agua");
        menuOptions.add("Gas");
        menuOptions.add("Volver al menu principal");
        View.showOptionMenu(menuOptions);
        View.showMsg("\nIngrese la opción a elegir: ");
        id = Integer.valueOf(View.listenMsg());
        if (id < 5 && id > 0) {
            response = menuOptions.get((id - 1));
        }
        return response;
    }

    public static ClientDTO pagarServicio(Float monto, ClientDTO client, TipoMovimiento tipoMov) {
        Float nuevoSaldo = client.getSaldo() - monto;
        ClientDAO clientDao = new ClientDAO();
        MovimientoDAO movDao = new MovimientoDAO();
        MovimientoDTO mov = new MovimientoDTO();

        client.setSaldo(nuevoSaldo);

        mov.setClient(client);
        mov.setFecha(new Fecha());
        mov.setImporte(monto);
        mov.setTipo(tipoMov);

        clientDao.update(client);
        movDao.create(mov);
        return client;
    }
}
