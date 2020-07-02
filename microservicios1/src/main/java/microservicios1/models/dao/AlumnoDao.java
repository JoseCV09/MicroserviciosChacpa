package microservicios1.models.dao;

import java.util.List;

import microservicios1.models.entity.Alumno;

public interface AlumnoDao {
	public List<Alumno> readAll();
	public Alumno readById(Long id);
	
}
