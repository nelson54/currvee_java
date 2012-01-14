package com.currvee.resume.transfer;

/**
 * Created by IntelliJ IDEA.
 * User: Derek
 * Date: 1/13/12
 * Time: 8:12 PM
 * To change this template use File | Settings | File Templates.
 */

import java.util.List;

public class ResumeTransferObject {
    String name;
    String address;
    String email;
    String website;
    String objective;
    List<String> highlights;
    List<String> professionalAccomplishments;
    List<String> personalAccomplishments;
    List<SchoolTransferObject> education;
    List<JobTransferObject> work;

    public static ResumeTransferObject create(){
        return new ResumeTransferObject();
    }


    
}
