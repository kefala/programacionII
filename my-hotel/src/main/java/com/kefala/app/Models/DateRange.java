package com.kefala.app.Models;

public class DateRange {
    private Date since;
    private Date until;
    private Integer range;

    public DateRange(Date since, Date until) throws Exception {
        if (since.getNumberDay() >= until.getNumberDay())
            throw new Exception("La primer fecha no puede ser mayor a la segunda fecha del rango");

        this.since = since;
        this.until = until;
        this.range = until.getNumberDay() - since.getNumberDay();
    }

    public Date getSince() {
        return since;
    }

    public void setSince(Date since) {
        this.since = since;
    }

    public Date getUntil() {
        return until;
    }

    public void setUntil(Date until) {
        this.until = until;
    }

    public Integer getRange() {
        return range;
    }

    @Override
    public String toString() {
        return "DateRange{" +
                "since=" + since +
                ", until=" + until +
                ", range=" + range +
                '}';
    }
}
