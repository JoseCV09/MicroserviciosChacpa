package microservicios1.models.serviceImp;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import microservicios1.models.dao.AlumnoDao;
import microservicios1.models.entity.Alumno;
import microservicios1.models.repository.AlumnoRepository;

@Service
public class AlumnoServiceImp implements AlumnoDao{
	@Autowired
	private AlumnoRepository alumnoRepository;

	@Override
	@Transactional(readOnly=true)
	public List<Alumno> readAll() {
		// TODO Auto-generated method stub
		return alumnoRepository.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Alumno readById(Long id) {
		// TODO Auto-generated method stub
		return alumnoRepository.findById(id).orElse(null);
	}
	
	
}
