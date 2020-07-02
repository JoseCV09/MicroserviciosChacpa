package microservicios2.models.service;

import java.util.List;

import microservicios2.models.entity.Registro;

public interface IRegistroDao {
	public List<Registro> readAll();
	public Registro readBy(Long id);

}
