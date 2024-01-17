package modelClasses;

import auxiliarClasses.ObjectValidator;

import java.util.ArrayList;

public class Campus {
    private ArrayList<DegreeProgram> degreePrograms;
    private ArrayList<Professor> professors;
    private ArrayList<Student> students;
    private ArrayList<Course> courses;
    private ArrayList<Branch> branches;

    public Campus() {
        this.initializeLists();
    }

    private void initializeLists() {
        degreePrograms = new ArrayList<>();
        professors = new ArrayList<>();
        students = new ArrayList<>();
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

    public void addDegreeProgram(DegreeProgram degreeProgram) {
        if (ObjectValidator.validateIsNotNull(degreeProgram)) {
            this.degreePrograms.add(degreeProgram);
        }
    }
    public void addProfessor(Professor professor) {
        if (professor != null) {
            this.professors.add(professor);
        }
    }
    public void addStudent(Student student) {
        if (student != null) {
            this.students.add(student);
        }
    }
    public void addCourse(Course course) {
        if (course != null) {
            this.courses.add(course);
        }
    }
    public void addBranch(Branch branch) {
        if (branch != null) {
            this.branches.add(branch);
        }
    }

    public DegreeProgram searchDegreeProgram(String searchedProgramCode) {
        //TODO probar con for-each y luego con Streams

        DegreeProgram foundDegreeProgram = null;
        int i = 0;
        while (i < this.degreePrograms.size() && foundDegreeProgram == null) {
            if (this.degreePrograms.get(i).getProgramCode().equals(searchedProgramCode)) {
                foundDegreeProgram = this.degreePrograms.get(i);
            }
            i++;
        }
        return foundDegreeProgram;
    }
    public Professor searchProfessor(String ID) {
        int i = 0;
        Professor foundProfessor = null;
        while (i < this.professors.size() && foundProfessor == null) {
            if (this.professors.get(i).getID().equals(ID)) {
                foundProfessor = this.professors.get(i);
            }
            i++;
        }
        return foundProfessor;
    }
    public Student searchStudent(String ID) {
        int i = 0;
        Student foundStudent = null;
        while (i < this.students.size() && foundStudent == null) {
            if (this.students.get(i).getID().equals(ID)) {
                foundStudent = this.students.get(i);
            }
            i++;
        }
        return foundStudent;
    }
    public Course searchCourse(String code) {
        int i = 0;
        Course foundCourse = null;
        while (i < this.courses.size() && foundCourse == null) {
            if (this.courses.get(i).getCode().equals(code)) {
                foundCourse = this.courses.get(i);
            }
            i++;
        }
        return foundCourse;
    }
    public Branch searchBranch(String code) {
        int i = 0;
        Branch foundBranch = null;
        while (i < this.branches.size() && foundBranch == null) {
            if (this.branches.get(i).getCode().equals(code)) {
                foundBranch = this.branches.get(i);
            }
            i++;
        }
        return foundBranch;
    }

    public boolean removeDegreeProgram(String code) {
        boolean wasRemoved = false;
        DegreeProgram foundDegreeProgram = this.searchDegreeProgram(code);
        if (foundDegreeProgram != null) {
            this.degreePrograms.remove(foundDegreeProgram);
            wasRemoved = true;
        }
        return wasRemoved;
    }
    public boolean removeProfessor(String ID) {
        boolean wasRemoved = false;
        Professor foundProfessor = this.searchProfessor(ID);
        if (foundProfessor != null) {
            this.professors.remove(foundProfessor);
            wasRemoved = true;
        }
        return wasRemoved;

    }
    public boolean removeStudent(String ID) {
        boolean wasRemoved = false;
        Student foundStudent = this.searchStudent(ID);
        if (foundStudent != null) {
            this.students.remove(ID);
            wasRemoved = true;
        }
        return wasRemoved;
    }
    public boolean removeCourse(String code) {
        boolean wasRemoved = false;
        Course foundCourse = this.searchCourse(code);
        if (foundCourse != null) {
            this.courses.remove(foundCourse);
            wasRemoved = true;
        }
        return wasRemoved;
    }
    public boolean removeBranch(String code) {
        boolean wasRemoved = false;
        Branch foundBranch = this.searchBranch(code);
        if (foundBranch != null) {
            this.courses.remove(foundBranch);
            wasRemoved = true;
        }
        return wasRemoved;
    }

}
