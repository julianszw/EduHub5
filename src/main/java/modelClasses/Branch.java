package modelClasses;

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
        //setBranchDirector
        availablePrograms = new ArrayList<>();
    }

    //Setters
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
        if (ObjectValidator.isNotNull(branchDirector))
            this.branchDirector = branchDirector;
    }


    //Getters
    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public Employee getBranchDirector() {
        return branchDirector;
    }



    //Available degree programs manipulations
    public DegreeProgram searchProgram(String programCode) {
        DegreeProgram programFound = null;
        int i = 0;
        while (programFound == null && i < this.availablePrograms.size()) {
            if (this.availablePrograms.get(i).getProgramCode().equals(programCode)) {
                programFound = this.availablePrograms.get(i);
            }
            i++;
        }
        return programFound;
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
