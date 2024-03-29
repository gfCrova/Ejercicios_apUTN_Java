package org.argPrograma.services;

import org.argPrograma.services.entities.Materia;

import java.io.IOException;
import java.util.List;

public class InscripcionService {

    private final FilesService fileServicio;

    private final CorrelativasService correlativasService;
    private final AlumnosService alumnosService = new AlumnosService();

    public InscripcionService(FilesService fileServicio, CorrelativasService correlativasService) {
        this.fileServicio = fileServicio;
        this.correlativasService = correlativasService;
    }

    public void registrarInscripcion() throws IOException {
        List<String> lineas = fileServicio.leerInscripciones();

        for (int i = 0; i < lineas.size(); i++) {
            String alumno;
            int legajo;
            String materiaInscripcion;

            if (i != 0) {
                String linea = lineas.get(i);
                alumno = linea.split(",")[0];
                legajo = Integer.parseInt(linea.split(",")[1]);
                materiaInscripcion = linea.split(",")[2];

                System.out.println("ALUMNO: " + alumno + ". LEGAJO: " + legajo + ". INSCRIPCIÓN A: '" + materiaInscripcion + "'");

                if (materiaInscripcion == null || materiaInscripcion.equals("")) {
                    materiaInscripcion = "La materia no existe";
                }
                Materia matInscripcion = new Materia(materiaInscripcion);
                correlativasService.buscarCorrelativas(materiaInscripcion);

                alumnosService.registrarAlumnos(alumno, legajo, matInscripcion, correlativasService.buscarMateriasAprobadas(legajo), correlativasService.validarInscripcion());

                System.out.println("\n");
            }
        }
    }
}
