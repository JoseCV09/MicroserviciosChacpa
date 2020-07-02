package microservicios1.models.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import microservicios1.models.dao.AlumnoDao;
import microservicios1.models.entity.Alumno;

@RestController
public class AlumnoController {
	
	@Autowired
	private AlumnoDao alumnoDao;
	
	@GetMapping("/listar")
	public List<Alumno> listar(){
		return alumnoDao.readAll();
	}
	
	@GetMapping("/listar/{id}")
	public Alumno read(@PathVariable Long id) {
		return alumnoDao.readById(id);
	}
}
