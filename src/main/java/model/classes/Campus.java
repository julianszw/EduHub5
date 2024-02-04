package model.classes;

import validators.ObjectValidator;

import java.util.ArrayList;

public class Campus {
    private ArrayList<DegreeProgram> degreePrograms;
    private ArrayList<Professor> professors;
    private ArrayList<Student> students;
    private ArrayList<Employee> employees;
    private ArrayList<Course> courses;
    private ArrayList<Branch> branches;

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
    }

    public ArrayList<DegreeProgram> getDegreePrograms() {
        return this.degreePrograms;
    }
    public ArrayList<Professor> getProfessors() {
        return this.professors;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
    public ArrayList<Course> getCourses() {
        return courses;
    }
    public ArrayList<Branch> getBranches() {
        return branches;
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
        //TODO crear jerarquía de excepciones
        Course course = this.searchCourse(courseCode);
        if (course == null) {
            throw new IllegalArgumentException("El curso buscado no existe");
        }
        DegreeProgram degreeProgram = this.searchDegreeProgram(programCode);
        if (degreeProgram == null) {
            throw new IllegalArgumentException("La carrera buscada no existe");
        }
        degreeProgram.addCourse(course);
        return true;
    }

    public boolean addDegreeProgramToBranch(String branchCode, String degreeProgramCode) {
        Branch branch = this.searchBranch(branchCode);
        if (branch == null) {
            throw new IllegalArgumentException("Sucursal no encontrada");
        }
        DegreeProgram degreeProgram = this.searchDegreeProgram(degreeProgramCode);
        if (degreeProgram == null) {
            throw new IllegalArgumentException("La carrera buscada no existe");
        }
        branch.addProgram(degreeProgram);
        return true;
    }

    public boolean setProgramDirectorToDegreeProgram(String professorID, String degreeProgramCode) {
        Professor programDirector = this.searchProfessor(professorID);
        if (programDirector == null) {
            throw new IllegalArgumentException("Profesor no encontrado");
        }
        DegreeProgram degreeProgram = this.searchDegreeProgram(degreeProgramCode);
        if (degreeProgram == null) {
            throw new IllegalArgumentException("La carrera buscada no existe");
        }
        degreeProgram.setProgramDirector(programDirector);
        return true;
    }

    public boolean enrollStudentInDegreeProgram(String studentID, String degreeProgramCode) {
        Student student = this.searchStudent(studentID);
        if (student == null) {
            throw new IllegalArgumentException("Estudiante no encontrado");
        }
        DegreeProgram degreeProgram = this.searchDegreeProgram(degreeProgramCode);
        if (degreeProgram == null) {
            throw new IllegalArgumentException("La carrera buscada no existe");
        }
        degreeProgram.enrollStudent(student);
        return true;
    }

    public boolean unrollStudentInDegreeProgram(String studentID, String degreeProgramCode) {
        DegreeProgram degreeProgram = this.searchDegreeProgram(degreeProgramCode);
        if (degreeProgram == null) {
            throw new IllegalArgumentException("La carrera buscada no existe");
        }
        return degreeProgram.unrollStudent(this.searchStudent(studentID));
    }

}
