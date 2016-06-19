package com.kefala.app.Models;

import java.io.Serializable;

/**
 * Created by kefala on 16/06/16.
 */
public class UserDTO extends DTO {
    private Integer id;
    private String username;
    private RoleDTO role;


    public UserDTO(String username, RoleDTO role) {
        this.username = username;
        this.role = role;
    }

    public Serializable getId() {
        return id;
    }
}
