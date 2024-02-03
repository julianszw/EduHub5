package model.classes;

import validators.TextValidator;

import java.util.ArrayList;

public class Course {
    private String name;
    private String code;
    private ArrayList<Course> requiredCourses;

    public Course(String name, String code) {
        setName(name);
        setCode(code);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        if (TextValidator.isValidCourseCode(code)) {
            this.code = code;
        }
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public ArrayList<Course> getRequiredCourses() {
        return requiredCourses;
    }
}
