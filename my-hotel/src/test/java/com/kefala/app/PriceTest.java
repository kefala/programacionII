package com.kefala.app;

import com.kefala.app.Models.Price;
import org.junit.Test;

public class PriceTest {

    @Test(expected = Exception.class)
    public void notNegative() throws Exception {
        Double valor = (double) -1;
        Price price = new Price(valor);
    }

    @Test(expected = Exception.class)
    public void notNegative2() throws Exception {
        Double valor = new Double("-1.5");
        Price price = new Price(valor);
    }
}
