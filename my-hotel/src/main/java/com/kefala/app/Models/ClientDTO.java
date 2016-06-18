package com.kefala.app.Models;

public class ClientDTO {
    private Integer code;
    private String firstName;
    private String lastName;
    private Boolean isCommon;

    public ClientDTO(Integer code, String firstName, String lastName, Boolean isCommon) throws Exception {
        if (code < 1 )
            throw new Exception("El código de cliente no puede ser negativo");
        this.code = code;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isCommon = isCommon;
    }

    @Override
    public String toString() {
        return "ClientDTO{" +
                "code=" + code +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", isCommon=" + isCommon +
                '}';
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getCommon() {
        return isCommon;
    }

    public void setCommon(Boolean common) {
        isCommon = common;
    }
}
