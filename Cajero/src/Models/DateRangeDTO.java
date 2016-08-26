package com.kefala.app.Models;

public class DateRangeDTO {
    private DateDTO since;
    private DateDTO until;
    private Integer range;

    public DateRangeDTO(DateDTO since, DateDTO until) throws Exception {
        if (since.getNumberDay() >= until.getNumberDay())
            throw new Exception("La primer fecha no puede ser mayor a la segunda fecha del rango");

        this.since = since;
        this.until = until;
        this.range = until.getNumberDay() - since.getNumberDay();
    }

    public DateDTO getSince() {
        return since;
    }

    public void setSince(DateDTO since) {
        this.since = since;
    }

    public DateDTO getUntil() {
        return until;
    }

    public void setUntil(DateDTO until) {
        this.until = until;
    }

    public Integer getRange() {
        return range;
    }

    @Override
    public String toString() {
        return "DateRangeDTO{" +
                "since=" + since +
                ", until=" + until +
                ", range=" + range +
                '}';
    }
}
