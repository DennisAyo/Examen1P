package ec.edu.espe.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec.edu.espe.examen.model.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {
}
