package com.kefala.app.Models;

/**
 * Created by kefala on 16/06/16.
 */
public enum RoleDTO {
    ADMINISTRATOR("Administrador"),
    RECEPTIONIST("Recepcionista");

    private final String name;

    RoleDTO(String name) {
        this.name = name;
    }
}
