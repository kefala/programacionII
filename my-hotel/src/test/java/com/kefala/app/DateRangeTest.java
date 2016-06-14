package com.kefala.app;

import com.kefala.app.Models.Date;
import com.kefala.app.Models.DateRange;
import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by kefala on 14/06/16.
 */
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
            assertEquals(since.getNumberDay(), range.getSince());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
