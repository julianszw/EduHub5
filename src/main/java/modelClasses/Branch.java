package modelClasses;

import java.util.ArrayList;

import auxiliarClasses.ObjectValidator;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Employee getBranchDirector() {
		return branchDirector;
	}

	public void setBranchDirector(Employee branchDirector) {
		this.branchDirector = branchDirector;
	}

	public void addProgram(DegreeProgram program) {
		if (program != null) { //ObjectValidator.isNotNull
			this.availablePrograms.add(program);			
		}
	}
	
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


	
}
