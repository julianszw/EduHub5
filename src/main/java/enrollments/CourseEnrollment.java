package enrollments;

import auxiliar.classes.SchoolPeriodGenerator;
import enums.CourseEnrollmentStatus;
import model.classes.Course;
import model.classes.SchoolPeriod;
import model.classes.Professor;

public class CourseEnrollment {
    private Course course;
    private SchoolPeriod period;
    private Professor fullProfessor;
    private Professor teachingAssistant;
    private CourseEnrollmentStatus courseEnrollmentStatus;

    public CourseEnrollment(Course course, Professor fullProfessor, Professor teachingAssistant) {
        this.course = course;
        this.fullProfessor = fullProfessor;
        this.teachingAssistant = teachingAssistant;
        this.period = SchoolPeriodGenerator.generateSchoolPeriod();
        this.courseEnrollmentStatus = CourseEnrollmentStatus.CURSANDO_ACTUALMENTE;
    }

    public CourseEnrollment(Course course, Professor fullProfessor) {
        this(course, fullProfessor, null);
    }

    public Course getCourse() {
        return course;
    }

    public SchoolPeriod getPeriod() {
        return period;
    }

    public Professor getFullProfessor() {
        return fullProfessor;
    }

    public Professor getTeachingAssistant() {
        return teachingAssistant;
    }

    public CourseEnrollmentStatus getCourseEnrollmentStatus() {
        return courseEnrollmentStatus;
    }
}
