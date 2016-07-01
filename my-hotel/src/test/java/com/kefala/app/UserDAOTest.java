package com.kefala.app;

import com.kefala.app.Entities.UserDAO;
import com.kefala.app.Models.RoleDTO;
import com.kefala.app.Models.UserDTO;
import com.kefala.app.Views.View;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kefala on 17/06/16.
 */
public class UserDAOTest {

    @Test
    public void getAll() throws Exception {
        UserDAO user = new UserDAO();
        List<UserDTO> users = user.getAll();
        System.out.printf("\n" + users.toString() + "\n");
    }

    /*
    @Test
    public void createRecep() throws Exception {
        UserDAO userDao = new UserDAO();
        UserDTO userDto = new UserDTO("juan", RoleDTO.RECEPTIONIST);
        userDao.create(userDto);
    }
    */

    /*
    @Test
    public void login() throws Exception {
        UserDAO userDao = new UserDAO();
        System.out.printf("\n" + userDao.login("kefala").toString() + "\n");
    }
    */

    /*
    @Test
    public void create() throws Exception {
        UserDAO userDao = new UserDAO();
        UserDTO userDto = new UserDTO("kefala", RoleDTO.ADMINISTRATOR);
        userDao.create(userDto);
    }
    */

    /*
    @Test
    public void deleteAll() throws Exception {
        UserDAO userDao = new UserDAO();
        userDao.deleteAll();
    }
    */

}
