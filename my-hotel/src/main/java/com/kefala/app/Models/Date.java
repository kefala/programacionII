package com.kefala.app.Models;

public class Date {
    private Integer numberDay;

    public Date(Integer numberDay) throws Exception {
        if (numberDay < 1 || numberDay > 365)
            throw new Exception("Algo falló");
        this.numberDay = numberDay;
    }

    /**
     * Get number day
     * @return number day
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

    /**
     * Class to string
     * @return string
     */
    @Override
    public String toString() {
        return this.numberDay.toString();
    }
}
