package ec.edu.espe.examen.service;

import ec.edu.espe.examen.model.Alumno;
import ec.edu.espe.examen.model.AlumnoAsignatura;
import ec.edu.espe.examen.model.Asignatura;
import ec.edu.espe.examen.repository.AlumnoAsignaturaRepository;
import ec.edu.espe.examen.repository.AlumnoRepository;
import ec.edu.espe.examen.repository.AsignaturaRepository;
import org.springframework.stereotype.Service;

@Service
public class MatriculaService {

    private final AlumnoAsignaturaRepository alumnoAsignaturaRepository;
    private final AlumnoRepository alumnoRepository;
    private final AsignaturaRepository asignaturaRepository;

    public MatriculaService(AlumnoAsignaturaRepository alumnoAsignaturaRepository,
                                   AlumnoRepository alumnoRepository,
                                   AsignaturaRepository asignaturaRepository) {
        this.alumnoAsignaturaRepository = alumnoAsignaturaRepository;
        this.alumnoRepository = alumnoRepository;
        this.asignaturaRepository = asignaturaRepository;
    }

    public AlumnoAsignatura asignarAlumnoAAsignatura(int alumnoId, String codAsignatura) {
        Alumno alumno = alumnoRepository.findById(alumnoId)
                .orElseThrow(() -> new IllegalArgumentException("Alumno no registrado"));

        Asignatura asignatura = asignaturaRepository.findById(codAsignatura)
                .orElseThrow(() -> new IllegalArgumentException("Asignatura no registrada"));

        AlumnoAsignatura alumnoAsignatura = new AlumnoAsignatura();
        alumnoAsignatura.setCodAlumno(alumno.getId());
        alumnoAsignatura.setCodAsignatura(asignatura.getCodAsignatura());
        return alumnoAsignaturaRepository.save(alumnoAsignatura);
    }
}
