package org.argPrograma.services;

import org.argPrograma.entities.Alumno;
import org.argPrograma.entities.Inscripcion;
import org.argPrograma.entities.InscripcionEnum;
import org.argPrograma.entities.Materia;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AlumnosService {

    private final FilesService fileServicio = new FilesService();

    public String buscarAlumnos(int legajo) throws IOException {
        String lineaAlumno = "";
        List<String> lineaAlumnos = fileServicio.leerAlumnos();

        for (int i = 0; i < lineaAlumnos.size(); i++) {
            if (i != 0) {
                String lineas = lineaAlumnos.get(i);
                int leg = Integer.parseInt(lineas.split(",")[1]);
                String materiasApr = lineas.split(",")[2];

                if (leg == legajo) {
                    lineaAlumno = lineas;
                }
            }
        }
        return lineaAlumno;
    }

    public void registrarAlumnos(String nombre, int legajo, Materia materia, InscripcionEnum solicitud) throws IOException{

        Alumno alumno = new Alumno(nombre, legajo);
        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno(nombre, legajo));

        Inscripcion inscripcion = new Inscripcion(alumno, materia, solicitud);

        for (int i = 0; i < alumnos.size(); i++) {
            fileServicio.guardarResultados(inscripcion);
        }
    }
}
