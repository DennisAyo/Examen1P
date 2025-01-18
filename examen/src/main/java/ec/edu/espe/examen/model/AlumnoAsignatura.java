package ec.edu.espe.examen.model;

import jakarta.persistence.*;
import java.io.Serializable;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "ALUMNO_ASIGNATURA")
@Embeddable

public class AlumnoAsignatura implements Serializable {

    @Id
    @NotNull
    @Column(name = "COD_ALUMNO")
    private Long codAlumno;

    @Id
    @NotNull
    @Column(name = "COD_ASIGNATURA")
    private String codAsignatura;

    @Column(name = "CALIFICACION1")
    private Double calificacion1;

    @Column(name = "CALIFICACION2")
    private Double calificacion2;

    @Column(name = "CALIFICACION3")
    private Double calificacion3;

    @Column(name = "PROMEDIO")
    private Double promedio;

    @Column(name = "ESTADO", length = 3)
    private String estado;

    public AlumnoAsignatura() {
    }

    public AlumnoAsignatura(Long codAlumno, String codAsignatura, Double calificacion1, Double calificacion2, Double calificacion3, Double promedio, String estado) {
        this.codAlumno = codAlumno;
        this.codAsignatura = codAsignatura;
        this.calificacion1 = calificacion1;
        this.calificacion2 = calificacion2;
        this.calificacion3 = calificacion3;
        this.promedio = promedio;
        this.estado = estado;
    }

    public Long getCodAlumno() {
        return this.codAlumno;
    }

    public String getCodAsignatura() {
        return this.codAsignatura;
    }

    public Double getCalificacion1() {
        return this.calificacion1;
    }

    public Double getCalificacion2() {
        return this.calificacion2;
    }

    public Double getCalificacion3() {
        return this.calificacion3;
    }

    public Double getPromedio() {
        return this.promedio;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setCodAlumno(Long codAlumno) {
        this.codAlumno = codAlumno;
    }

    public void setCodAsignatura(String codAsignatura) {
        this.codAsignatura = codAsignatura;
    }

    public void setCalificacion1(Double calificacion1) {
        this.calificacion1 = calificacion1;
    }

    public void setCalificacion2(Double calificacion2) {
        this.calificacion2 = calificacion2;
    }

    public void setCalificacion3(Double calificacion3) {
        this.calificacion3 = calificacion3;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public AlumnoAsignatura codAlumno(Long codAlumno) {
        this.codAlumno = codAlumno;
        return this;
    }

    public AlumnoAsignatura codAsignatura(String codAsignatura) {
        this.codAsignatura = codAsignatura;
        return this;
    }

    public AlumnoAsignatura calificacion1(Double calificacion1) {
        this.calificacion1 = calificacion1;
        return this;
    }

    public AlumnoAsignatura calificacion2(Double calificacion2) {
        this.calificacion2 = calificacion2;
        return this;
    }

    public AlumnoAsignatura calificacion3(Double calificacion3) {
        this.calificacion3 = calificacion3;
        return this;
    }

    public AlumnoAsignatura promedio(Double promedio) {
        this.promedio = promedio;
        return this;
    }

    public AlumnoAsignatura estado(String estado) {
        this.estado = estado;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " codAlumno='" + getCodAlumno() + "'" + ", codAsignatura='" + getCodAsignatura() + "'" +
            ", calificacion1='" + getCalificacion1() + "'" + ", calificacion2='" + getCalificacion2() + "'" +
            ", calificacion3='" + getCalificacion3() + "'" + ", promedio='" + getPromedio() + "'" +", estado='" + getEstado() + "'" + "}";
    }

}
