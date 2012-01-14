package com.currvee.resume.models;

/**
 * Created by IntelliJ IDEA.
 * User: Derek
 * Date: 1/12/12
 * Time: 9:55 PM
 * To change this template use File | Settings | File Templates.
 */
import com.currvee.resume.components.Job;
import com.currvee.resume.components.School;
import com.google.gson.Gson;
import junit.framework.*;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import org.joda.time.DateMidnight;
import java.util.List;


import static com.currvee.resume.models.Resume.FunctionalResume;

public class ResumeTest extends TestCase{
    public void testContainer(){
        SimpleDateFormat dateFormatter = new SimpleDateFormat("y-M-d");
        
        String name = "Derek Nelson";
        String address = "1333 E. Gaylord St. Mount Pleasant MI 48858";
        String email = "nelson54@ferris.edu";
        String website = "www.jsbits.com";
        String objective = "I want to write clean, maintainable code and have a good time doing it.";
        
        List<String> highlights = new ArrayList<String>();
        highlights.add("");
        highlights.add("");
        highlights.add("");        
        
        List<String> professionalAccomplishments = new ArrayList<String>();
        professionalAccomplishments.add("");
        professionalAccomplishments.add("");
        professionalAccomplishments.add("");
        professionalAccomplishments.add("");
        
        List<String> personalAccomplishments = new ArrayList<String>();
        personalAccomplishments.add("");
        personalAccomplishments.add("");
        personalAccomplishments.add("");
        personalAccomplishments.add("");

        List<Job> work = new ArrayList<Job>();
        DateMidnight workStart = new DateMidnight(2006, 9, 1);
        DateMidnight workEnd = new DateMidnight(2011, 12, 1);
        work.add(new Job("Admissions Department - Ferris State University", workStart, workEnd, "Web Developer", "Developed web applications"));

        List<School> education = new ArrayList<School>();
        DateMidnight schoolStart = new DateMidnight(2006, 9, 1);
        DateMidnight schoolEnd = new DateMidnight(2011, 12, 1);
        education.add(new School("Ferris State University", schoolStart, schoolEnd));

        Resume resume = FunctionalResume(name, address, email, website, objective, highlights, professionalAccomplishments, personalAccomplishments, education, work);

        Gson gson = new Gson();
        System.out.println( gson.toJson(resume) );
    }
}
