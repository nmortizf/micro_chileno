package inicio.services;

import org.springframework.stereotype.Service;

import com.example.commons.alumno.models.entity.Alumno;

import inicio.models.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository> implements AlumnoService {

	
}
