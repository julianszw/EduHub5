package enums;

public enum Role {
	ADMINISTRADOR("Administrador"), // Administrator
	BIBLIOTECARIO("Bibliotecario"), // Librarian
	COORDINADOR_DE_ESTUDIOS("Coordinador de Estudios"), // Study Coordinator
	CONSEJERO_ACADEMICO("Consejero Académico"), // Academic Advisor
	DECANO("Decano"), // Dean
	DIRECTOR_DE_CARRERA("Director de Carrera"), // Program Director
	DIRECTOR_DE_INVESTIGACION("Director de Investigación"), // Director of Research
	INVESTIGADOR("Investigador"), // Researcher
	JEFE_DE_DEPARTAMENTO("Jefe de Departamento"), // Department Head
	PERSONAL_DE_APOYO("Personal de Apoyo"), // Support Staff
	PROFESOR("Profesor"), // Professor
	RECTOR("Rector"), // Rector
	SECRETARIO_ACADEMICO("Secretario Académico"), // Academic Secretary
	TUTOR("Tutor"), // Tutor
	VICERRECTOR("Vicerrector"); // Vice Chancellor

	private final String descripcion;

	Role(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}
}
