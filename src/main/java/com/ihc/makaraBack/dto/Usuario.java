package com.ihc.makaraBack.dto;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="usuario")
public class Usuario {

    public static final long serialVersionUID = 4894729030347835498L;

    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Date fecha_nacimiento;
    private Integer titulacion_id;

    public Usuario(){}

    public Usuario(String nombre, String apellido1, String apellido2, Date fecha_nacimiento, Integer titulacion_id) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fecha_nacimiento = fecha_nacimiento;
        this.titulacion_id = titulacion_id;
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

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Integer getTitulacion_id() {
        return titulacion_id;
    }

    public void setTitulacion_id(Integer titulacion_id) {
        this.titulacion_id = titulacion_id;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", fecha_nacimiento=" + fecha_nacimiento +
                ", titulacion_id=" + titulacion_id +
                '}';
    }
}
