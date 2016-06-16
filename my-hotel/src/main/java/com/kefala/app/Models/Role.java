package com.kefala.app.Models;

/**
 * Created by kefala on 16/06/16.
 */
public enum Role {
    ADMINISTRATOR("Administrador"),
    RECEPTIONIST("Recepcionista");

    private final String name;

    Role(String name) {
        this.name = name;
    }
}
