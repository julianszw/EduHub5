package enrollments;

import auxiliar.classes.SchoolPeriodGenerator;
import model.classes.Course;
import model.classes.DegreeProgram;
import model.classes.SchoolPeriod;
import model.classes.Student;
import validators.ObjectValidator;
import java.util.ArrayList;

public class DegreeProgramEnrollment {
    private Student student;
    private DegreeProgram degreeProgram;
    private ArrayList<CourseEnrollment> courseEnrollments;

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

    public void enrollStudentInCourse(String courseCode) {
        Course course = degreeProgram.searchCourse(courseCode);
        ObjectValidator.checkCourseIsNotNull(course);
        this.courseEnrollments.add(new CourseEnrollment());
    }

    private SchoolPeriod nextPeriod() {
        return SchoolPeriodGenerator.generateSchoolPeriod();
    }




}
