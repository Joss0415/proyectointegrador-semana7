package com.uped.proyecto.modelo;

public class Docente extends Persona {
    private String especialidad;
    private int aniosExperiencia;

    public Docente(String nombre, String dui, String especialidad, int aniosExperiencia) {
        super(nombre, dui);
        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public double calcularBeneficioAnual() {
        return aniosExperiencia * 45.0; // bono de antiguedad
    }
}