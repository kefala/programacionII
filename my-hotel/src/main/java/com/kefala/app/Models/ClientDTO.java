package com.kefala.app.Models;

import java.io.Serializable;

public class ClientDTO extends DTO {

    private String firstName;
    private String lastName;
    private Boolean isCommon;

    public ClientDTO() {}

    @Override
    public String toString() {
        return "ClientDTO{" +
                "id=" + getId() +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", isCommon=" + isCommon +
                '}';
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

