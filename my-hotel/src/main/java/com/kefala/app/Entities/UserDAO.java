package com.kefala.app.Entities;

import com.kefala.app.Models.UserDTO;

import java.util.List;

/**
 * Created by kefala on 17/06/16.
 */
public class UserDAO extends DAO<UserDTO> {
    private static final String FILE_NAME = "users.dat";

    @Override
    public String getFileName() {
        return FILE_NAME;
    }

    public Boolean login (String username) {
        List<UserDTO> users = getAll();
        for (UserDTO user:users) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    public UserDTO getDto (String username) {
        List<UserDTO> users = getAll();
        for (UserDTO user:users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

}
