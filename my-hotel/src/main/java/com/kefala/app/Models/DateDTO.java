package com.kefala.app.Models;

public class DateDTO {
    private Integer numberDay;
    private Integer year;

    public DateDTO(Integer numberDay, Integer year) throws Exception {
        this.numberDay = numberDay;
        this.year = year;
    }

    public DateDTO() {
    }


    public Integer getNumberDay() {
        return numberDay;
    }

    public void setNumberDay(Integer numberDay) {
        this.numberDay = numberDay;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return this.numberDay.toString();
    }
}
