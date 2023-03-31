package org.clase9;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Persona {

    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;

    @Override
    public String toString() {
        return nombre + ", " + apellido + ", " + fechaNacimiento + ";";
    }
}