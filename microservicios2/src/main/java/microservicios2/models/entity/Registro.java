package microservicios2.models.entity;

public class Registro {
	private Alumno alumno;
	
	public Registro() {
	}

	public Registro(Alumno alumno) {
		this.alumno = alumno;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	
}
