package microservicios2.models.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import microservicios2.models.entity.Registro;
import microservicios2.models.service.IRegistroDao;

@RestController
public class RegistroController {

	@Autowired
	private IRegistroDao iRegistroDao;
	@GetMapping("/listar")
	public List<Registro> listar(){
		return iRegistroDao.readAll();
	}
	@GetMapping("listar/{id}")
	public Registro registrar(@PathVariable Long id){
		return iRegistroDao.readBy(id);
	}
	
}
