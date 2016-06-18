package com.kefala.app;

import com.kefala.app.Models.DateDTO;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class DateTest {

    /**
     * DateDTO toString test
     */
    @Test
    public void testToString() throws Exception {
        DateDTO $date = new DateDTO(1);
        assertEquals($date.toString(), "1");
    }

    /**
     * DateDTO toString test
     */
    @Test
    public void testToStringFail() throws Exception {
        DateDTO $date = new DateDTO(2);
        assertThat($date.toString(), not("1"));
    }

    /**
     * DateDTO exeption invalid param with cero
     */
    @Test(expected = Exception.class)
    public void testExceptionLessNumber() throws Exception {
        new DateDTO(0);
    }

    /**
     * DateDTO exeption invalid param with 365
     */
    @Test(expected = Exception.class)
    public void testExceptionMoreNumber() throws Exception {
        new DateDTO(366);
    }
}
