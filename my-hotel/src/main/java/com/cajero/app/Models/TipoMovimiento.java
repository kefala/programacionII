package com.cajero.app.Models;

/**
 * Created by kefala on 13/07/16.
 */
public enum TipoMovimiento {
    EXTRACCION(1, "Extracción"),
    DEPOSITO(2, "Depósito"),
    PAGO_DE_SERVICIOS_LUZ(3, "Pago de servicio: Luz"),
    PAGO_DE_SERVICIOS_AGUA(4, "Pago de servicio: Agua"),
    PAGO_DE_SERVICIOS_GAS(6, "Pago de servicio: Gas");

    private final Integer id;
    private final String name;

    TipoMovimiento(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
