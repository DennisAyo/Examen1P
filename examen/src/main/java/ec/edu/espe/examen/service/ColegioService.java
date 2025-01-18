package ec.edu.espe.examen.service;

import ec.edu.espe.examen.model.Colegio;
import ec.edu.espe.examen.repository.ColegioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColegioService {

    private final ColegioRepository colegioRepository;

    public ColegioService(ColegioRepository colegioRepository) {
        this.colegioRepository = colegioRepository;
    }

    public Colegio crearColegio(Colegio colegio) {
        return colegioRepository.save(colegio);
    }

    public List<Colegio> buscarColegiosPorNombre(String patron) {
        return colegioRepository.findByNombreContaining(patron);
    }
}
