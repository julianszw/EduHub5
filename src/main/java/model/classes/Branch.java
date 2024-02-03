package model.classes;

import java.util.ArrayList;

import validators.ObjectValidator;
import validators.TextValidator;

public class Branch {
    private String name;
    private String code;
    private Employee branchDirector;
    private ArrayList<DegreeProgram> availablePrograms;

    public Branch(String name, String code) {
        setName(name);
        setCode(code);
        availablePrograms = new ArrayList<>();
    }

    public void setName(String name) {
        if (TextValidator.isValidName(name)) {
            this.name = name;
        }
    }

    public void setCode(String code) {
        if (TextValidator.isValidBranchCode(code)) {
            this.code = code;
        }
    }

    public void setBranchDirector(Employee branchDirector) {
        if (ObjectValidator.isNotNull(branchDirector)) {
            this.branchDirector = branchDirector;
        }
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public Employee getBranchDirector() {
        return branchDirector;
    }


    public DegreeProgram searchProgram(String programCode) {
        return this.availablePrograms.stream()
                .filter(program -> program.getProgramCode().equals(programCode))
                .findFirst()
                .orElse(null);
    }

    public void addProgram(DegreeProgram program) {
        if (program != null && !this.availablePrograms.contains(program)) {
            this.availablePrograms.add(program);
        }
    }

    public boolean removeProgram(String code) {
        return this.availablePrograms.remove(this.searchProgram(code));
    }

}
