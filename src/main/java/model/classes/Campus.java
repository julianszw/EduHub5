package model.classes;

import enrollments.DegreeProgramEnrollment;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;

public class Campus {
    private final ArrayList<DegreeProgram> degreePrograms;
    private final ArrayList<Professor> professors;
    private final ArrayList<Student> students;
    private final ArrayList<Employee> employees;
    private final ArrayList<Course> courses;
    private final ArrayList<DegreeProgramEnrollment> enrollments;

    public Campus() {
        degreePrograms = new ArrayList<>();
        professors = new ArrayList<>();
        students = new ArrayList<>();
        employees = new ArrayList<>();
        courses = new ArrayList<>();
        enrollments = new ArrayList<>();
    }

    public static Professor findProfessorForCourse(DegreeProgram degreeProgram, String courseCode) {
        Optional<Course> courseOptional = degreeProgram.findCourseByCode(courseCode);
        return
    }


    public void addDegreeProgram(DegreeProgram degreeProgram) {
        if (Objects.nonNull(degreeProgram)) {
            this.degreePrograms.add(degreeProgram);
        }
    }


    public void addProfessor(Professor professor) {
        if (Objects.nonNull(professor)) {
            professors.add(professor);
        }
    }


    public void addStudent(Student student) {
        if (Objects.nonNull(student)) {
            students.add(student);
        }
    }


    public void addEmployee(Employee employee) {
        if (Objects.nonNull(employee)) {
            employees.add(employee);
        }
    }


    public void addCourse(Course course) {
        if (Objects.nonNull(course)) {
            courses.add(course);
        }
    }


    public Optional<DegreeProgram> findDegreeProgramByCode(String searchedProgramCode) {
        return degreePrograms.stream()
                .filter(program -> program.getProgramCode().equals(searchedProgramCode))
                .findFirst();
    }


    public Optional<Professor> findProfessorByID(String ID) {
        return professors.stream()
                .filter(professor -> professor.getID().equals(ID))
                .findFirst();
    }


    public Optional<Student> findStudentByID(String ID) {
        return students.stream()
                .filter(student -> student.getID().equals(ID))
                .findFirst();
    }


    public Optional<Employee> findEmployeeByID(String ID) {
        return employees.stream()
                .filter(employee -> employee.getID().equals(ID))
                .findFirst();
    }


    public Optional<Course> findCourseByCode(String code) {
        return courses.stream()
                .filter(course -> course.getCode().equals(code))
                .findFirst();
    }


    private Optional<DegreeProgramEnrollment> findEnrollmentByDegreeProgramAndByStudent(DegreeProgram degreeProgram, Student student) {
        return enrollments.stream()
                .filter(enrollment -> enrollment.getDegreeProgram().equals(degreeProgram) && enrollment.getStudent().equals(student))
                .findFirst();
    }


    public boolean removeDegreeProgram(String code) {
        return this.degreePrograms.removeIf(program -> program.getProgramCode().equals(code));
    }


    public boolean removeProfessor(String ID) {
        return professors.removeIf(professor -> professor.getID().equals(ID));
    }


    public boolean removeStudent(String ID) {
        return students.removeIf(student -> student.getID().equals(ID));
    }


    public boolean removeEmployee(String employeeID) {
        return employees.removeIf(employee -> employee.getID().equals(employeeID));
    }


    public boolean removeCourse(String code) {
        return courses.removeIf(course -> course.getCode().equals(code));
    }


    public boolean unrollStudentFromDegreeProgram(String degreeProgramCode, String studentID) {
        DegreeProgram degreeProgram = this.findDegreeProgramByCode(degreeProgramCode).orElseThrow();
        Student student = this.findStudentByID(studentID).orElseThrow();
        this.findEnrollmentByDegreeProgramAndByStudent(degreeProgram, student).orElseThrow().unrollStudent();
        return true;
    }


    public boolean addCourseToDegreeProgram(String courseCode, String programCode) {
        Course course = this.findCourseByCode(courseCode).orElseThrow();
        DegreeProgram degreeProgram = this.findDegreeProgramByCode(programCode).orElseThrow();
        degreeProgram.addCourse(course);
        return true;
    }


    public boolean setProgramDirectorToDegreeProgram(String professorID, String degreeProgramCode) {
        DegreeProgram degreeProgram = this.findDegreeProgramByCode(degreeProgramCode).orElseThrow();
        Professor programDirector = this.findProfessorByID(professorID).orElseThrow();
        degreeProgram.setProgramDirector(programDirector);
        return true;
    }


    public boolean enrollStudentInDegreeProgram(String studentID, String degreeProgramCode) {
        this.enrollments.add(new DegreeProgramEnrollment(
                this.findDegreeProgramByCode(degreeProgramCode).orElseThrow(),
                this.findStudentByID(studentID).orElseThrow()
        ));
        return true;
    }

}
