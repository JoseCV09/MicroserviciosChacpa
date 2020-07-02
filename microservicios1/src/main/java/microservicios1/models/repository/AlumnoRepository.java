package microservicios1.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import microservicios1.models.entity.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Long>{

}
