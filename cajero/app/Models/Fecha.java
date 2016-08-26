package com.cajero.app.Models;

import java.io.Serializable;

/**
 * Created by kefala on 13/07/16.
 */
public class Fecha implements Serializable {
    private final String dia = "13";
    private final String mes = "7";

    public Fecha() {
    }

    public Integer getFechaToCompare() {
        return Integer.valueOf((mes + dia));
    }

    @Override
    public String toString() {
        return dia + "/" + mes;
    }
}
