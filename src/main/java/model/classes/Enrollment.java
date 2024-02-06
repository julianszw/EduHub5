package model.classes;

import java.util.ArrayList;

public class Enrollment {
    private Student student;
    private DegreeProgram degreeProgram;
    private ArrayList<Course> finishedCourses; //accredited/ approved

    public Enrollment(DegreeProgram degreeProgram, Student student) {
        this.degreeProgram = degreeProgram;
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public DegreeProgram getDegreeProgram() {
        return degreeProgram;
    }

    public ArrayList<Course> getFinishedCourses() {
        //TODO vale la pena que todas las instancias tengan esta lista?
        return finishedCourses;
    }
}
