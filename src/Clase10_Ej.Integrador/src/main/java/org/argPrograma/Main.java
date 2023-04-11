package org.argPrograma;

import org.argPrograma.services.CorrelativasService;
import org.argPrograma.services.FilesService;

import java.io.IOException;

public class Main {
    private static final FilesService fileServicio = new FilesService();
    private static final CorrelativasService correlativeSrv = new CorrelativasService(fileServicio);
    public static void main(String[] args) {

        // Nueva inscripción
        // leer archivo de inscripciones
        try {
            correlativeSrv.registrarMaterias();
            correlativeSrv.registrarAlumnos();

            correlativeSrv.registrarInscripcion();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}