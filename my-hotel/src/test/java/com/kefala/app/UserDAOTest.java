package com.kefala.app;

import com.kefala.app.Entities.UserDAO;
import org.junit.Test;

/**
 * Created by kefala on 17/06/16.
 */
public class UserDAOTest {

    @Test
    public void notNegative() throws Exception {
        UserDAO userDao = new UserDAO();
        try {
            userDao.save();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
