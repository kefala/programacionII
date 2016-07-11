package com.kefala.app;

import com.kefala.app.Entities.FileManager;
import com.kefala.app.Entities.UserDAO;
import com.kefala.app.Models.RoleDTO;
import com.kefala.app.Models.UserDTO;
import com.kefala.app.Views.View;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;

/**
 * Created by kefala on 17/06/16.
 */
@RunWith(MockitoJUnitRunner.class)
public class UserDAOTest {

    @Mock
    FileManager<UserDTO> fileManager;
    private UserDAO userDao = new UserDAO();
    private List<UserDTO> users = new ArrayList<UserDTO>();

    @Before
    public void before(){
        userDao.setFileManager(fileManager);
        when(fileManager.readContent()).thenReturn(users);
    }

    @Test
    public void getAll() throws Exception {
        UserDAO user = new UserDAO();
        List<UserDTO> users = user.getAll();
        for (UserDTO user2:users) {
            System.out.printf("\n" + user2.getId() + "." + user2.getUsername() + ", " + user2.getRole().getName() +"\n");
        }
    }


    @Test
    public void createRecep() throws Exception {
        UserDAO userDao = new UserDAO();
        UserDTO userDto = new UserDTO("kefala", RoleDTO.ADMINISTRATOR);
        userDao.create(userDto);
    }
    /*
    */

    /*
    @Test
    public void login() throws Exception {
        UserDAO userDao = new UserDAO();
        System.out.printf("\n" + userDao.login("kefala").toString() + "\n");
    }
    */


    @Test
    public void createWithEmptyList() throws Exception {

        Integer esperado = 1;

        UserDTO userDto = userDao.create(new UserDTO("kefala", RoleDTO.ADMINISTRATOR));

        assertEquals(userDto.getId(), esperado);
    }

    @Test
    public void createWithNonEmptyList() throws Exception {

        UserDTO userDto = Mockito.mock(UserDTO.class);
        when(userDto.getId()).thenReturn(10);
        users.add(userDto);
        Integer esperado = 11;

        UserDTO response = userDao.create(new UserDTO("kefala", RoleDTO.ADMINISTRATOR));

        assertEquals(response.getId(), esperado);
    }
    /*
    */


    @Test
    public void deleteAll() throws Exception {
        UserDAO userDao = new UserDAO();
        userDao.deleteAll();
    }
/*
    */

}
