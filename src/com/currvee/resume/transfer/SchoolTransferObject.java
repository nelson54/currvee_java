package com.currvee.resume.transfer;

import com.currvee.resume.components.School;

/**
 * Created by IntelliJ IDEA.
 * User: Derek
 * Date: 1/13/12
 * Time: 8:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class SchoolTransferObject {
    private String name;
    private String degree;
    private String startDate;
    private String endDate;

    public static SchoolTransferObject create(){
        return new SchoolTransferObject();
    }

    public static SchoolTransferObject create(School school){
        SchoolTransferObject sto = new SchoolTransferObject();

        sto.setName(school.getName());
        sto.setDegree(school.getDegree());
        sto.setStartDate(school.getStartDate().toString());
        sto.setEndDate(school.getEndDate().toString());

        return sto;
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

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
