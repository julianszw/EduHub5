package enrollments;

import auxiliar.classes.SchoolPeriodGenerator;
import enums.CourseEnrollmentStatus;
import enums.StudentStatus;
import model.classes.*;
import validators.ObjectValidator;
import java.util.ArrayList;

public class DegreeProgramEnrollment {
    private Student student;
    private DegreeProgram degreeProgram;
    private StudentStatus studentStatus;
    private ArrayList<CourseEnrollment> courseEnrollments;

    public DegreeProgramEnrollment(DegreeProgram degreeProgram, Student student) {
        this.degreeProgram = degreeProgram;
        this.student = student;
        this.studentStatus = StudentStatus.ENROLLED;
        this.courseEnrollments = new ArrayList<>();
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
          //TODO estoy pasando null en Professor, resolver responsabilidades
        this.courseEnrollments.add(new CourseEnrollment(course, null));
    }

        public ArrayList<Course> getFinishedCourses() {
        ArrayList<Course> finishedCourses = new ArrayList<>();
        for (CourseEnrollment courseEnrollment: courseEnrollments) {
            if (courseEnrollment.getCourseEnrollmentStatus().equals(CourseEnrollmentStatus.FINALIZADO)) {
                finishedCourses.add(courseEnrollment.getCourse());
            }
        }
        return finishedCourses;
    }

    public void takeAnExam(String courseCode) {

    }

    public void unrollStudent() {
        this.studentStatus = StudentStatus.ON_LEAVE;
    }
}
