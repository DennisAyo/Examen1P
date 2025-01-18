package ec.edu.espe.examen.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "ASIGNATURA")
public class Asignatura {

    @Id
    @Column(name = "COD_ASIGNATURA", length = 10)
    private String codAsignatura;

    @NotNull
    @Column(name = "NOMBRE", length = 50, nullable = false)
    private String nombre;

    @NotNull
    @Column(name = "CREDITOS", nullable = false)
    private Integer creditos;

    public Asignatura() {
    }

    public Asignatura(String codAsignatura, String nombre, Integer creditos) {
        this.codAsignatura = codAsignatura;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    public String getCodAsignatura() {
        return this.codAsignatura;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Integer getCreditos() {
        return this.creditos;
    }

    public void setCodAsignatura(String codAsignatura) {
        this.codAsignatura = codAsignatura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    public Asignatura codAsignatura(String codAsignatura) {
        this.codAsignatura = codAsignatura;
        return this;
    }

    public Asignatura nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public Asignatura creditos(Integer creditos) {
        this.creditos = creditos;
        return this;
    }

    @Override
    public String toString() {
        return "{" + " codAsignatura='" + getCodAsignatura() + "'" + ", nombre='" + getNombre() + "'" + ", creditos='"
                + getCreditos() + "'" + "}";
    }
    
}
