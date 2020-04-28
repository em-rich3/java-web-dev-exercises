package org.launchcode.java.demos.lsn3classes1;

import java.util.HashMap;

public class Course {
    private String courseName;
    private String teacher;
    private HashMap roster;

    public Course(String courseName, String teacher, HashMap roster) {
        this.courseName = courseName;
        this.teacher = teacher;
        this.roster = roster;
    }

}
