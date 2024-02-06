package model.classes;

import validators.ObjectValidator;

import java.util.ArrayList;
import java.util.List;

public class Campus {
    private ArrayList<DegreeProgram> degreePrograms;
    private ArrayList<Professor> professors;
    private ArrayList<Student> students;
    private ArrayList<Employee> employees;
    private ArrayList<Course> courses;
    private ArrayList<Branch> branches;
    private ArrayList<Enrollment> enrollments;

    public Campus() {
        this.initializeLists();
    }

    private void initializeLists() {
        degreePrograms = new ArrayList<>();
        professors = new ArrayList<>();
        students = new ArrayList<>();
        employees = new ArrayList<>();
        courses = new ArrayList<>();
        branches = new ArrayList<>();
        enrollments = new ArrayList<>();
    }

    public DegreeProgram searchDegreeProgram(String searchedProgramCode) {
        return degreePrograms.stream()
                .filter(program -> program.getProgramCode().equals(searchedProgramCode))
                .findFirst()
                .orElse(null);
    }

    public Professor searchProfessor(String ID) {
        return professors.stream()
                .filter(professor -> professor.getID().equals(ID))
                .findFirst()
                .orElse(null);
    }

    public Student searchStudent(String ID) {
        return students.stream()
                .filter(student -> student.getID().equals(ID))
                .findFirst()
                .orElse(null);
    }

    public Employee searchEmployee(String ID) {
        return employees.stream()
                .filter(employee -> employee.getID().equals(ID))
                .findFirst()
                .orElse(null);
    }

    public Course searchCourse(String code) {
        return courses.stream()
                .filter(course -> course.getCode().equals(code))
                .findFirst()
                .orElse(null);
    }

    public Branch searchBranch(String code) {
        return branches.stream()
                .filter(branch -> branch.getCode().equals(code))
                .findFirst()
                .orElse(null);
    }

    public void addDegreeProgram(DegreeProgram degreeProgram) {
        //TODO handlear casos en los que sea nulo o bien preguntar directamente si es null para no hacer pasamanos
        if (ObjectValidator.isNotNull(degreeProgram)) {
            this.degreePrograms.add(degreeProgram);
        }
    }

    public void addProfessor(Professor professor) {
        if (ObjectValidator.isNotNull(professor)) {
            professors.add(professor);
        }
    }

    public void addStudent(Student student) {
        if (ObjectValidator.isNotNull(student)) {
            students.add(student);
        }
    }

    public void addEmployee(Employee employee) {
        if (ObjectValidator.isNotNull(employee)) {
            employees.add(employee);
        }
    }

    public void addCourse(Course course) {
        if (ObjectValidator.isNotNull(course)) {
            courses.add(course);
        }
    }

    public void addBranch(Branch branch) {
        if (ObjectValidator.isNotNull(branch)) {
            branches.add(branch);
        }
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

    public boolean removeBranch(String code) {
        return branches.removeIf(branch -> branch.getCode().equals(code));
    }

    public boolean addCourseToDegreeProgram(String courseCode, String programCode) {
        Course course = this.searchCourse(courseCode);
        ObjectValidator.checkCourseIsNotNull(course);
        DegreeProgram degreeProgram = this.searchDegreeProgram(programCode);
        ObjectValidator.checkDegreeProgramIsNotNull(degreeProgram);
        degreeProgram.addCourse(course);
        return true;
    }

    public boolean addDegreeProgramToBranch(String branchCode, String degreeProgramCode) {
        Branch branch = this.searchBranch(branchCode);
        ObjectValidator.checkBranchIsNotNull(branch);
        DegreeProgram degreeProgram = this.searchDegreeProgram(degreeProgramCode);
        ObjectValidator.checkDegreeProgramIsNotNull(degreeProgram);
        branch.addProgram(degreeProgram);
        return true;
    }

    public boolean setProgramDirectorToDegreeProgram(String professorID, String degreeProgramCode) {
        Professor programDirector = this.searchProfessor(professorID);
        ObjectValidator.checkProfessorIsNotNull(programDirector);
        DegreeProgram degreeProgram = this.searchDegreeProgram(degreeProgramCode);
        ObjectValidator.checkDegreeProgramIsNotNull(degreeProgram);
        degreeProgram.setProgramDirector(programDirector);
        return true;
    }

    public boolean enrollStudentInDegreeProgram(String studentID, String degreeProgramCode) {
        Student student = this.searchStudent(studentID);
        ObjectValidator.checkStudentIsNotNull(student);
        DegreeProgram degreeProgram = this.searchDegreeProgram(degreeProgramCode);
        ObjectValidator.checkDegreeProgramIsNotNull(degreeProgram);
        this.enrollments.add(new Enrollment(degreeProgram, student));
        return true;
    }

    public boolean unrollStudentInDegreeProgram(String studentID, String degreeProgramCode) {
        DegreeProgram degreeProgram = this.searchDegreeProgram(degreeProgramCode);
        ObjectValidator.checkDegreeProgramIsNotNull(degreeProgram);
        return degreeProgram.unrollStudent(this.searchStudent(studentID));
    }

    public ArrayList<Course> getFinishedCoursesOf(String degreeProgramCode, String studentID) {
        DegreeProgram degreeProgram = this.searchDegreeProgram(degreeProgramCode);
        ObjectValidator.checkDegreeProgramIsNotNull(degreeProgram);
        Student student = this.searchStudent(studentID);
        ObjectValidator.checkStudentIsNotNull(student);
        Enrollment enrollment = this.searchEnrollment(degreeProgram, student);
        return enrollment.getFinishedCourses();
    }

    private Enrollment searchEnrollment(DegreeProgram degreeProgram, Student student) {
        //TODO usar un array
        return enrollments.stream()
                .filter(enrollment -> enrollment.getDegreeProgram().equals(degreeProgram)
                        && enrollment.getStudent().equals(student))
                .findFirst()
                .orElse(null);
    }


    public void searchAllStudentsEnrollments(String studentID) {
        //TODO sobrecargar para poder buscar por número de inscripción
        //devolver List
    }

}
