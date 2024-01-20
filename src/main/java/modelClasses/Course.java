package modelClasses;

import validators.TextValidator;

import java.util.ArrayList;

public class Course {
    private String name;
    private String code;
    private Professor professor;
    private ArrayList<Course> requiredCourses;

    public Course(String name, String code) {
        setName(name);
        setCode(code);
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public void setCode(String code) {
        if (TextValidator.isValidCourseCode(code) && code != null) {
            this.code = code;
        }
    }

    public String getName() {
        return name;
    }
    public Professor getProfessor() {
        return professor;
    }
    public String getCode() {
        return code;
    }

    public ArrayList<Course> getRequiredCourses() {
        return requiredCourses;
    }
}
