package com.cajero.app.Controllers;

import com.cajero.app.Entities.ClientDAO;
import com.cajero.app.Entities.MovimientoDAO;
import com.cajero.app.Models.ClientDTO;
import com.cajero.app.Models.Fecha;
import com.cajero.app.Models.MovimientoDTO;
import com.cajero.app.Models.TipoMovimiento;

/**
 * Created by kefala on 13/07/16.
 */
public class Extraccion {
    public static void make(ClientDTO client) {
        View.showTitle("Extracciones");
        View.showMsg("\nIngrese importe a extraer o escriba cancel para volver al menu: ");
        String response = View.listenMsg();
        if (!response.equals("cancel")) {
            Float montoASacar = Float.valueOf(response);
            if (client.getSaldo().floatValue() >= montoASacar.floatValue()) {
                client = extraer(montoASacar, client);
                View.showMsg("Su saldo actual es " + client.getSaldo().toString() + "\n");
            } else {
                View.showMsg("No tiene fondos suficientes.\n");
            }
        }
        MainMenu.show(client);
    }
    public static ClientDTO extraer(Float monto, ClientDTO client) {
        Float nuevoSaldo = client.getSaldo() - monto;
        ClientDAO clientDao = new ClientDAO();
        MovimientoDAO movDao = new MovimientoDAO();
        MovimientoDTO mov = new MovimientoDTO();

        client.setSaldo(nuevoSaldo);

        mov.setClient(client);
        mov.setFecha(new Fecha());
        mov.setImporte(monto);
        mov.setTipo(TipoMovimiento.EXTRACCION);

        clientDao.update(client);
        movDao.create(mov);
        return client;
    }
}
