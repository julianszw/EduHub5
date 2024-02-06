package enrollments;

import model.classes.Branch;
import model.classes.Course;
import model.classes.Period;
import model.classes.Professor;

public class CourseEnrollment {
    private Course course;
    private Period period;
    private Branch branch;
    private Professor fullProfessor;
    private Professor teachingAssistant;

    public CourseEnrollment(Course course, Period period, Branch branch, Professor fullProfessor, Professor teachingAssistant) {
        this.course = course;
        this.period = period;
        this.branch = branch;
        this.fullProfessor = fullProfessor;
        this.teachingAssistant = teachingAssistant;
    }

    public CourseEnrollment(Course course, Period period, Branch branch, Professor fullProfessor) {
        this(course, period, branch, fullProfessor, null);
    }

}