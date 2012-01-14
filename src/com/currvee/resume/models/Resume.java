package com.currvee.resume.models;

import com.currvee.resume.components.Job;
import com.currvee.resume.components.School;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Derek
 * Date: 1/12/12
 * Time: 9:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class Resume {
    String name;
    String address;
    String email;
    String website;
    String objective;
    List<String> highlights;
    List<String> professionalAccomplishments;
    List<String> personalAccomplishments;
    List<School> education;
    List<Job> work;

    private Resume(String name, String address, String email, String website, String objective, List<String> highlights, List<String> professionalAccomplishments, List<String> personalAccomplishments, List<School> education, List<Job> work){
        this.name = name;

        this.address = address;
        this.email = email;
        this.website = website;
        this.objective = objective;
        //this.education = education;
        //this.work = work;
        this.highlights = highlights;
        this.professionalAccomplishments = professionalAccomplishments;
        this.personalAccomplishments = personalAccomplishments;
    }

    private Resume(String name, String address, String email, String website, String objective, List<School> education, List<Job> work){
        this.name = name;
        this.address = address;
        this.email = email;
        this.website = website;
        this.objective = objective;
        //this.education = education;
        //this.work = work;
    }


    public static Resume FunctionalResume(String name, String address, String email, String website, String objective, List<String> highlights, List<String> professionalAccomplishments, List<String> personalAccomplishments, List<School> education, List<Job> work){

        return new Resume(name, address, email, website, objective, highlights, professionalAccomplishments, personalAccomplishments, education, work);
    }

    public static Resume TraditionalResume(String name, String address, String email, String website, String objective, List<School> education, List<Job> work){

        return new Resume(name, address, email, website, objective, education, work);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public List<String> getHighlights() {
        return highlights;
    }

    public void setHighlights(List<String> highlights) {
        this.highlights = highlights;
    }

    public List<String> getProfessionalAccomplishments() {
        return professionalAccomplishments;
    }

    public void setProfessionalAccomplishments(List<String> professionalAccomplishments) {
        this.professionalAccomplishments = professionalAccomplishments;
    }

    public List<String> getPersonalAccomplishments() {
        return personalAccomplishments;
    }

    public void setPersonalAccomplishments(List<String> personalAccomplishments) {
        this.personalAccomplishments = personalAccomplishments;
    }

    public List<School> getEducation() {
        return education;
    }

    public void setEducation(List<School> education) {
        this.education = education;
    }

    public List<Job> getWork() {
        return work;
    }

    public void setWork(List<Job> work) {
        this.work = work;
    }
}
