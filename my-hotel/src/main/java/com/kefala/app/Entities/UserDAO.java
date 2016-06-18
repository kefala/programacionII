package com.kefala.app.Entities;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by kefala on 17/06/16.
 */
public class UserDAO implements Serializable, FilesMapInterface {
    private Integer id;
    private String name;
    private Entity entity;

    public UserDAO() {
        this.entity = new Entity("users.ser");
    }

    public UserDAO(String name, Integer id) {
        this.entity = new Entity("users.ser");
        this.name = name;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void save() {
        entity.add(this);
    }

    public ArrayList getAll() {
        ArrayList list;
        System.out.printf("Sigue");
        list = entity.getAll();
        System.out.printf("No sigue");
        return list;
    }

    public Boolean login(String username) {
        ArrayList users = this.getAll();
        for (UserDAO user:users) {
            if (user.getName() == username) {
                return true;
            }
        }

        return false;
    }

    public Object getById(Integer id) {
        return null;
    }
}
