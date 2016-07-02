package com.kefala.app.Models;

public class DateDTO {
    private Integer numberDay;
    private Integer year;

    public DateDTO(Integer numberDay, Integer year) throws Exception {
        if (numberDay < 1 || numberDay > 365)
            throw new Exception("Solo se aceptan numeros de fecha entre 1 y 365");
        this.numberDay = numberDay;
        this.year = year;
    }

    /**
     * Get number day
     * @return numberDay
     */
    public Integer getNumberDay() {
        return numberDay;
    }

    /**
     * Set number day
     * @param numberDay
     */
    public void setNumberDay(Integer numberDay) {
        this.numberDay = numberDay;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    /**
     * Class to string
     * @return string
     */
    @Override
    public String toString() {
        return this.numberDay.toString();
    }
}
