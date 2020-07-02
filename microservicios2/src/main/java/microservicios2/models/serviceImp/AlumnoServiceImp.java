package microservicios2.models.serviceImp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import microservicios2.models.entity.Alumno;
import microservicios2.models.entity.Registro;
import microservicios2.models.service.IRegistroDao;

@Service
public class AlumnoServiceImp implements IRegistroDao{
	@Autowired
	private RestTemplate clienteRestTemplate;
	@Override
	public List<Registro> readAll() {
		// TODO Auto-generated method stub
		List<Alumno> alumnos = Arrays.asList(clienteRestTemplate.getForObject("http://localhost:9001/listar", Alumno[].class));
		return alumnos.stream().map(a->new Registro(a)).collect(Collectors.toList());
	}

	@Override
	public Registro readBy(Long id) {
		// TODO Auto-generated method stub
		Map<String, String> datos = new HashMap<String, String>();
		datos.put("id", id.toString());
		Alumno alumno = clienteRestTemplate.getForObject("http://localhost:9001/listar/{id}", Alumno.class, datos);
		return new Registro(alumno);
	}

}
