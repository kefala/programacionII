package com.kefala.app.Models;

/**
 * Created by kefala on 14/06/16.
 */
public class DateRange {
    private Date since;
    private Date until;

    public DateRange(Date since, Date until) throws Exception {
        if (since.getNumberDay() > until.getNumberDay())
            throw new Exception("Entro en el error");
        this.since = since;
        this.until = until;
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
}
