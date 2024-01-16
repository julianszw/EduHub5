package modelClasses;

import java.util.ArrayList;

public class Course {
    private String name;
    private String code;
    private ArrayList<Course> requiredCourses;
    private Professor professor;

    public Course(String name, String code) {
        setName(name);
        setCode(code);
    }

    public Course(String name) {
        this(name, null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Course> getRequiredCourses() {
        return requiredCourses;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
