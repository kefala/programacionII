package com.kefala.app;

import com.kefala.app.Models.Date;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by kefala on 14/06/16.
 */
public class DateTest {
    /**
     * Date class intance test
     */
    @Test
    public void testDateClassIntance() throws Exception {
        Date $date = new Date(1);
        Integer $param = new Integer(1);
        Assert.assertEquals($param, $date.getNumberDay());
    }

    /**
     * Date toString test
     */
    @Test
    public void testToString() throws Exception {
        Date $date = new Date(1);

        Assert.assertEquals($date.toString(), "1");
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
