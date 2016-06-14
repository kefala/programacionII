package modelos;

import java.util.Date;

/**
 * Created by kefala on 17/05/16.
 */
public class Fecha {
    private Date fecha;

    public Fecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
