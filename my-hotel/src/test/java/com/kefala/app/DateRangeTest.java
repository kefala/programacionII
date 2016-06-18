package com.kefala.app;

import com.kefala.app.Models.DateDTO;
import com.kefala.app.Models.DateRangeDTO;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DateRangeTest {

    /**
     * Test range
     */
    @Test
    public void testRange() throws Exception {
        DateDTO since = new DateDTO(2);
        DateDTO until = new DateDTO(3);
        DateRangeDTO range = new DateRangeDTO(since, until);
        assertEquals(range.getRange(), new Integer(1));
    }

    /**
     * Test exception to invalid range
     */
    @Test(expected = Exception.class)
    public void testDateRangeException() throws Exception {
        DateDTO since = new DateDTO(3);
        DateDTO until = new DateDTO(3);
        DateRangeDTO range = new DateRangeDTO(since, until);
    }

    /**
     * Test exception to invalid range
     */
    @Test(expected = Exception.class)
    public void testDateRangeException2() throws Exception {
        DateDTO since = new DateDTO(6);
        DateDTO until = new DateDTO(3);
        DateRangeDTO range = new DateRangeDTO(since, until);
    }

}
