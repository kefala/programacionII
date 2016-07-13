package com.cajero.app.Models;

public class ClientDTO extends DTO {
    private Integer nroTarjeta;
    private Integer clave;
    private String nombrApellido;
    private Float saldo;

    public ClientDTO() {
    }

    public Integer getNroTarjeta() {
        return nroTarjeta;
    }

    public void setNroTarjeta(Integer nroTarjeta) {
        this.nroTarjeta = nroTarjeta;
    }

    public Integer getClave() {
        return clave;
    }

    public void setClave(Integer clave) {
        this.clave = clave;
    }

    public String getNombrApellido() {
        return nombrApellido;
    }

    public void setNombrApellido(String nombrApellido) {
        this.nombrApellido = nombrApellido;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }
}

