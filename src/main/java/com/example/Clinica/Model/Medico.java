package com.example.Clinica.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "medico")

public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String nombre;
    @Column
    private String especialidad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}