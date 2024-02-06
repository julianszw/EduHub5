package validators;

import exceptions.*;
import model.classes.*;

public class ObjectValidator {
	public static boolean isNotNull(Object object) {
		return object != null;
	}

	public static void checkDegreeProgramIsNotNull(DegreeProgram degreeProgram) {
		if (degreeProgram == null) {
			throw new DegreeProgramNotFoundException("La carrera no ha sido encontrada");
		}
	}

	public static void checkStudentIsNotNull(Student student) {
		if (student == null) {
			throw new StudentNotFoundException("El alumno no ha sido encontrado");
		}
	}

	public static void checkCourseIsNotNull(Course course) {
		if (course == null) {
			throw new CourseNotFoundException("El curso no ha sido encontrado");
		}
	}

	public static void checkBranchIsNotNull(Branch branch) {
		if (branch == null) {
			throw new BranchNotFoundException("La sucursal no ha sido encontrada");
		}
	}

	public static void checkProfessorIsNotNull(Professor professor) {
		if (professor == null) {
			throw new ProfessorNotFoundException("El profesor no ha sido encontrado");
		}
	}

}
