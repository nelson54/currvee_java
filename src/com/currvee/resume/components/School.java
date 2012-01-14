package com.currvee.resume.components;

/**
 * Created by IntelliJ IDEA.
 * User: Derek
 * Date: 1/12/12
 * Time: 9:09 PM
 * To change this template use File | Settings | File Templates.
 */

import org.joda.time.DateMidnight;

public class School {
    private String name;
    private String degree;
    private DateMidnight startDate;
    private DateMidnight endDate;

    public School(String name, DateMidnight startDate, DateMidnight endDate, String degree) {
        this.degree = degree;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public School(String name, DateMidnight startDate, DateMidnight endDate) {
        this.endDate = endDate;
        this.name = name;
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public DateMidnight getStartDate() {
        return startDate;
    }

    public void setStartDate(DateMidnight startDate) {
        this.startDate = startDate;
    }

    public DateMidnight getEndDate() {
        return endDate;
    }

    public void setEndDate(DateMidnight endDate) {
        this.endDate = endDate;
    }
}
