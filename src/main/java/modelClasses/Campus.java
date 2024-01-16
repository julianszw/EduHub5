package modelClasses;

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

    public void addDegreeProgram(DegreeProgram degreeProgram) {
        if (degreeProgram != null) {
            this.degreePrograms.add(degreeProgram);
        }
    }

    public void addProfessor(Professor professor) {
        if (professor != null) {
            this.professors.add(professor);
        }
    }

    public void addCourse (Course course) {
        if (course != null) {
            this.courses.add(course);
        }
    }

    public void addBranch (Branch branch) {
        if (branch != null) {
            this.branches.add(branch);
        }
    }

    //TODO probar con for-each y luego con Streams
    public DegreeProgram searchDegreeProgram(String searchedProgramCode) {
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
}
