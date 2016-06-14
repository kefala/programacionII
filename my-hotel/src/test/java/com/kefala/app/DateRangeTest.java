package com.kefala.app;

import com.kefala.app.Models.Date;
import com.kefala.app.Models.DateRange;
import org.junit.Test;

public class DateRangeTest {
    /**
     * Date class intance test
     */
    @Test (expected = Exception.class)
    public void testDateRangeClassExeption() throws Exception {
        Date since = new Date(0);
        Date until = new Date(2);

        try {
            DateRange range = new DateRange(since, until);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
