package com.kefala.app;

import com.kefala.app.Models.Date;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DateTest {

    /**
     * Date toString test
     */
    @Test
    public void testToString() throws Exception {
        Date $date = new Date(1);
        assertEquals($date.toString(), "1");
    }

    /**
     * Date exeption invalid param with cero
     */
    @Test(expected = Exception.class)
    public void testExceptionLessNumber() throws Exception {
        new Date(0);
    }

    /**
     * Date exeption invalid param with 365
     */
    @Test(expected = Exception.class)
    public void testExceptionMoreNumber() throws Exception {
        new Date(366);
    }
}
