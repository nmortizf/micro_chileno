package inicio.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.example.commons.alumno.models.entity.Alumno;

@Entity
@Table(name="cursos")
public class Curso {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	
	@Column(name="create_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createAt;
	
	@OneToMany(fetch=FetchType.LAZY)
	private List<Alumno> alumnos;
	
	public Curso() {
		this.alumnos = new ArrayList<>();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	@PrePersist
	public void prePersist() {
		this.createAt = new Date();
	}
	
	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
	public void addAlumno(Alumno alumno) {
		this.alumnos.add(alumno);
	}
	
	public void removeAlumno(Alumno alumno) {
		this.alumnos.remove(alumno);
	}
	
}
