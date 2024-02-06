package enrollments;

import model.classes.Course;
import model.classes.DegreeProgram;
import model.classes.Student;

import java.util.ArrayList;

public class DegreeProgramEnrollment {
    private Student student;
    private DegreeProgram degreeProgram;
    private ArrayList<Course> finishedCourses; //accredited/ approved

    public DegreeProgramEnrollment(DegreeProgram degreeProgram, Student student) {
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
