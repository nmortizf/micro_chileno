package inicio.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.commons.alumno.models.entity.Alumno;

public interface AlumnoRepository extends CrudRepository<Alumno, Long> {
	
	

}
