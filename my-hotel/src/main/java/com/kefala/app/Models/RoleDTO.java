package com.kefala.app.Models;

/**
 * Created by kefala on 16/06/16.
 */
public enum RoleDTO {
    ADMINISTRATOR(1, "Administrador"),
    RECEPTIONIST(2, "Recepcionista");

    private final Integer id;
    private final String name;

    RoleDTO(Integer id, String name) {
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
