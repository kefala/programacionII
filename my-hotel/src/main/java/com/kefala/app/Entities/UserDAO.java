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
        this.entity = new Entity("users.dat");
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
        UserDAO user = new UserDAO();
        user.setId(1);
        user.setName("Fachita");
        entity.add(user);
    }

    public ArrayList<UserDAO> getAll() {
        ArrayList<UserDAO> list;
        list = (ArrayList) entity.getAll();
        return list;
    }

    public Object getById(Integer id) {
        return null;
    }
}
