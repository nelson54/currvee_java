package com.currvee.resume.transfer;

import com.currvee.resume.components.Job;
import com.google.gson.Gson;
import org.joda.time.DateMidnight;

/**
 * Created by IntelliJ IDEA.
 * User: Derek
 * Date: 1/13/12
 * Time: 8:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class JobTransferObject {
    private String businessName = null;
    private String positionTitle = null;
    private String positionDescription = null;
    private String startDate = null;
    private String endDate = null;

    public static JobTransferObject create(){
        return new JobTransferObject();
    }

    public static JobTransferObject create(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, JobTransferObject.class);
    }

    public static JobTransferObject create(Job job){
        JobTransferObject jto = new JobTransferObject();

        jto.setBusinessName(job.getBusinessName());
        jto.setPositionTitle(job.getPositionTitle());
        jto.setPositionDescription(job.getPositionDescription());
        jto.setStartDate(job.getStartDate());
        jto.setEndDate(job.getEndDate());

        return jto;
    }
    
    public Job toModel(){
        return new Job(businessName, startDate, endDate, positionTitle, positionDescription);
    }
    
    public String toJson(){
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getPositionTitle() {
        return positionTitle;
    }

    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
    }

    public String getPositionDescription() {
        return positionDescription;
    }

    public void setPositionDescription(String positionDescription) {
        this.positionDescription = positionDescription;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setStartDate(DateMidnight startDate) {
        this.startDate = startDate.toString();
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setEndDate(DateMidnight endDate) {
        this.endDate = endDate.toString();
    }
}
