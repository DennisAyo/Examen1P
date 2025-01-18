package ec.edu.espe.examen.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "ALUMNO")
public class Alumno implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_ALUMNO")
    private Long id;

    @NotNull
    @Column(name = "CEDULA", length = 10, nullable = false, unique = true)
    private String cedula;

    @NotNull
    @Column(name = "NOMBRE", length = 100, nullable = false)
    private String nombre;

    @NotNull
    @Column(name = "FECHA_NACIMIENTO", nullable = false)
    private LocalDate fechaNacimiento;

    @NotNull
    @Column(name = "FECHA_CREACION", nullable = false)
    private LocalDateTime fechaCreacion;

    @ManyToOne
    @JoinColumn(name = "COD_COLEGIO", nullable = false)
    private Colegio colegio;

    public Alumno() {
    }

    public Alumno(Long id, String cedula, String nombre, LocalDate fechaNacimiento, LocalDateTime fechaCreacion, Colegio colegio) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaCreacion = fechaCreacion;
        this.colegio = colegio;
    }

    public Long getId() {
        return this.id;
    }

    public String getCedula() {
        return this.cedula;
    }

    public String getNombre() {
        return this.nombre;
    }

    public LocalDate getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public LocalDateTime getFechaCreacion() {
        return this.fechaCreacion;
    }

    public Colegio getColegio() {
        return this.colegio;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setColegio(Colegio colegio) {
        this.colegio = colegio;
    }

    public Alumno id(Long id) {
        this.id = id;
        return this;
    }

    public Alumno cedula(String cedula) {
        this.cedula = cedula;
        return this;
    }

    public Alumno nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public Alumno fechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
        return this;
    }

    public Alumno fechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
        return this;
    }

    public Alumno colegio(Colegio colegio) {
        this.colegio = colegio;
        return this;
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" +
            ", cedula='" + getCedula() + "'" + ", nombre='" + getNombre() + "'" + ", fechaNacimiento='" + getFechaNacimiento() + "'" +
            ", fechaCreacion='" + getFechaCreacion() + "'" + ", colegio='" + getColegio() + "'" + "}";
    }
}

