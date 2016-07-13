package com.cajero.app.Entities;

import com.cajero.app.Models.ClientDTO;
import com.cajero.app.Models.MovimientoDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by kefala on 13/07/16.
 */
public class MovimientoDAO extends DAO<MovimientoDTO> {
    private static final String FILE_NAME = "movimientos.dat";

    @Override
    public String getFileName() {
        return FILE_NAME;
    }

    public List<MovimientoDTO> getLastByClient(ClientDTO client) {
        List<MovimientoDTO> movs = getAll();
        List<MovimientoDTO> movsFilter = new ArrayList<MovimientoDTO>();
        Integer index = 0;
        for (MovimientoDTO mov:movs) {
            if (mov.getClient().getId().equals(client.getId())) {
                movsFilter.add(mov);
                index++;
            }
        }
        Collections.sort(movsFilter, new Comparator<MovimientoDTO>() {
            public int compare(MovimientoDTO o1, MovimientoDTO o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });

        if (movsFilter.size() > 5) {
            movsFilter = movsFilter.subList(movsFilter.size() - 5, movsFilter.size());
        }

        return movsFilter;
    }
}
