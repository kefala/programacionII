package com.kefala.app;

import com.kefala.app.Models.Client;
import org.junit.Test;

public class ClientTest {
    @Test(expected = Exception.class)
    public void notNegativeAttributeCode() throws Exception {
        Integer code = -1;
        Client client = new Client(code, new String("Martín"), new String("Lobo"), new Boolean(false));
    }
}
