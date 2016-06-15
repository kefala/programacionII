package com.kefala.app;

import com.kefala.app.Models.Date;
import com.kefala.app.Models.DateRange;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class DateRangeTest {
    private Date since;
    private Date until;
    /**
     * Test range
     */
    @Test
    public void testRange() throws Exception {
        Integer range = 2;
        since = new Date(range);
        until = new Date(4);
        DateRange dateRange = new DateRange(since, until);
        assertEquals(dateRange .getRange(), range);
    }

    /**
     * Test exception to invalid range
     */
    @Test(expected = Exception.class)
    public void testDateRangeException() throws Exception {
        since = new Date(3);
        until = new Date(3);
        DateRange range = new DateRange(since, until);
    }

    /**
     * Test exception to invalid range
     */
    @Test(expected = Exception.class)
    public void testDateRangeException2() throws Exception {
        since = new Date(6);
        until = new Date(3);
        DateRange range = new DateRange(since, until);
        fail("Falló testDateRangeException2");
    }

}
