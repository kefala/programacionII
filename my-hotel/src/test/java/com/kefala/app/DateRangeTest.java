package com.kefala.app;

import com.kefala.app.Models.Date;
import com.kefala.app.Models.DateRange;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DateRangeTest {

    /**
     * Test range
     */
    @Test
    public void testRange() throws Exception {
        Date since = new Date(2);
        Date until = new Date(3);
        DateRange range = new DateRange(since, until);
        assertEquals(range.getRange(), new Integer(1));
    }

    /**
     * Test exception to invalid range
     */
    @Test(expected = Exception.class)
    public void testDateRangeException() throws Exception {
        Date since = new Date(3);
        Date until = new Date(3);
        DateRange range = new DateRange(since, until);
    }

    /**
     * Test exception to invalid range
     */
    @Test(expected = Exception.class)
    public void testDateRangeException2() throws Exception {
        Date since = new Date(6);
        Date until = new Date(3);
        DateRange range = new DateRange(since, until);
    }

}
