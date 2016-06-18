package com.kefala.app;

import com.kefala.app.Models.ClientDTO;
import org.junit.Test;

public class ClientDTOTest {
    @Test(expected = Exception.class)
    public void notNegativeAttributeCode() throws Exception {
        Integer code = -1;
        ClientDTO clientDTO = new ClientDTO(code, new String("Martín"), new String("Lobo"), new Boolean(false));
    }
}
