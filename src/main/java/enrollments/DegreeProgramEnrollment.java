package enrollments;

import enums.CourseEnrollmentStatus;
import enums.StudentStatus;
import model.classes.*;

import java.util.ArrayList;
import java.util.Optional;

public class DegreeProgramEnrollment {
    private final Student student;
    private final DegreeProgram degreeProgram;
    private StudentStatus studentStatus;
    private final ArrayList<CourseEnrollment> courseEnrollments;

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
        Optional<Course> courseOptional = degreeProgram.findCourseByCode(courseCode);
        courseOptional.ifPresent(course -> {
            this.courseEnrollments.add(new CourseEnrollment(course, Campus.findProfessorForCourse(degreeProgram, courseCode)));
        });
    }

    public ArrayList<Course> getFinishedCourses() {
        ArrayList<Course> finishedCourses = new ArrayList<>();
        for (CourseEnrollment courseEnrollment : courseEnrollments) {
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
