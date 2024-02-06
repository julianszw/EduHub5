package model.classes;

public enum Role {
	ADMINISTRADOR("Administrator"), // Administrator
	BIBLIOTECARIO("Librarian"), // Librarian
	COORDINADOR_DE_ESTUDIOS("Study Coordinator"), // Study Coordinator
	CONSEJERO_ACADEMICO("Academic Advisor"), // Academic Advisor
	DECANO("Dean"), // Dean
	DIRECTOR_DE_CARRERA("Program Director"), // Program Director
	DIRECTOR_DE_INVESTIGACION("Director of Research"), // Director of Research
	INVESTIGADOR("Researcher"), // Researcher
	JEFE_DE_DEPARTAMENTO("Department Head"), // Department Head
	PERSONAL_DE_APOYO("Support Staff"), // Support Staff
	PROFESOR("Professor"), // Professor
	RECTOR("Rector"), // Rector
	SECRETARIO_ACADEMICO("Academic Secretary"), // Academic Secretary
	TUTOR("Tutor"), // Tutor
	VICERRECTOR("Vice Chancellor"); // Vice Chancellor

	private final String descripcion;

	Role(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}
}
