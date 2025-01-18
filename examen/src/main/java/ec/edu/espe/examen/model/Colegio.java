package ec.edu.espe.examen.model;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "COLEGIO")
public class Colegio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_COLEGIO")
    private Long cod_colegio;

    @NotNull
    @Column(name = "NOMBRE", length = 100, nullable = false)
    private String nombre;

    public Colegio() {
    }

    public Colegio(Long cod_colegio, String nombre) {
        this.cod_colegio = cod_colegio;
        this.nombre = nombre;
    }

    public Long getId() {
        return this.cod_colegio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setId(Long cod_colegio) {
        this.cod_colegio = cod_colegio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Colegio id(Long cod_colegio) {
        this.cod_colegio = cod_colegio;
        return this;
    }

    public Colegio nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    @Override
    public String toString() {
        return "{" + " cod_colegio='" + getId() + "'" + ", nombre='" + getNombre() + "'" + "}";
    }
}

