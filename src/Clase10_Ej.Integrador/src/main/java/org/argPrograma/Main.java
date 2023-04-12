package org.argPrograma;

import org.argPrograma.services.CorrelativasService;
import org.argPrograma.services.FilesService;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        FilesService fileServicio = new FilesService();
        CorrelativasService correlativasService = new CorrelativasService(fileServicio);

        correlativasService.registrarInscripcion();
    }
}