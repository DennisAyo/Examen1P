package ec.edu.espe.examen.service;

import ec.edu.espe.examen.model.Alumno;
import ec.edu.espe.examen.model.Colegio;
import ec.edu.espe.examen.repository.AlumnoRepository;
import ec.edu.espe.examen.repository.ColegioRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class AlumnoService {

    private final AlumnoRepository alumnoRepository;
    private final ColegioRepository colegioRepository;

    public AlumnoService(AlumnoRepository alumnoRepository, ColegioRepository colegioRepository) {
        this.alumnoRepository = alumnoRepository;
        this.colegioRepository = colegioRepository;
    }

    public Alumno crearAlumno(Alumno alumno) {
        Colegio colegio = colegioRepository.findById(alumno.getColegio().getId())
                .orElseThrow(() -> new IllegalArgumentException("Colegio no registrado"));

        if (alumno.getFechaNacimiento().isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Fecha de nacimiento inválida");
        }

        return alumnoRepository.save(alumno);
    }
}

