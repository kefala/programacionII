package com.cajero.app.Models;

/**
 * Created by kefala on 13/07/16.
 */
public class MovimientoDTO extends DTO{
    private ClientDTO client;
    private Float importe;
    private TipoMovimiento tipo;
    private Fecha fecha;


    public MovimientoDTO() {
    }

    public ClientDTO getClient() {
        return client;
    }

    public void setClient(ClientDTO client) {
        this.client = client;
    }

    public Float getImporte() {
        return importe;
    }

    public void setImporte(Float importe) {
        this.importe = importe;
    }

    public TipoMovimiento getTipo() {
        return tipo;
    }

    public void setTipo(TipoMovimiento tipo) {
        this.tipo = tipo;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
}
