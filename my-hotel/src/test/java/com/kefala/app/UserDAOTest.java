package com.kefala.app;

import com.kefala.app.Entities.UserDAO;
import com.kefala.app.Views.View;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by kefala on 17/06/16.
 */
public class UserDAOTest {

    @Test
    public void notNegative() throws Exception {
        UserDAO userDao = new UserDAO("Fachota", 1);
        if (userDao.login("asfas"))
            System.out.printf("SI");
        else
            System.out.printf("NO");
    }

}
