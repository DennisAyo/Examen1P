package ec.edu.espe.examen.repository;

import ec.edu.espe.examen.model.Colegio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ColegioRepository extends JpaRepository<Colegio, Long> {
    List<Colegio> findByNombreContaining(String nombre);
}
