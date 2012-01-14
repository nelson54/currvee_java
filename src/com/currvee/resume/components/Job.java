package com.currvee.resume.components;

/**
 * Created by IntelliJ IDEA.
 * User: Derek
 * Date: 1/12/12
 * Time: 9:23 PM
 * To change this template use File | Settings | File Templates.
 */

import com.currvee.resume.transfer.JobTransferObject;
import org.joda.time.DateMidnight;

public class Job {
    private String businessName;
    private String positionTitle;
    private String positionDescription;
    private DateMidnight startDate;
    private DateMidnight endDate;

    public Job(String businessName, DateMidnight startDate, DateMidnight endDate, String positionTitle, String positionDescription) {
        this.businessName = businessName;
        this.positionTitle = positionTitle;
        this.positionDescription = positionDescription;
        this.endDate = endDate;
        this.startDate = startDate;
    }

    public Job(String businessName, String startDate, String endDate, String positionTitle, String positionDescription) {
        this.businessName = businessName;
        this.positionTitle = positionTitle;
        this.positionDescription = positionDescription;
        this.endDate = DateMidnight.parse(endDate);
        this.startDate = DateMidnight.parse(startDate);
    }

    public JobTransferObject toTransferObject(){
        return JobTransferObject.create(this);
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
