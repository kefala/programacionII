package com.kefala.app.Entities;

import com.kefala.app.Models.UserDTO;

import java.util.List;

/**
 * Created by kefala on 17/06/16.
 */
public class UserDAO extends DAO<UserDTO> {
    private static final String FILE_NAME = "usuarios.txt";

    @Override
    public String getFileName() {
        return FILE_NAME;
    }

}
