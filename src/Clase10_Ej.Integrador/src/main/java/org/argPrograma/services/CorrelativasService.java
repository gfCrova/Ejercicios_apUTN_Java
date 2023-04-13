package org.argPrograma.services;

import org.argPrograma.entities.Inscripcion;
import org.argPrograma.entities.InscripcionEnum;
import org.argPrograma.entities.Materia;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CorrelativasService {

    private final FilesService fileServicio;
    private final AlumnosService alumnosService = new AlumnosService();
    private List<String> materiasAprobadas;
    private List<String> materiasCorrelativas;

    public CorrelativasService(FilesService fileServicio) {
        this.fileServicio = fileServicio;
    }

    public void buscarCorrelativas(String materia) throws IOException{
        String lineaMateria = fileServicio.buscarCorrelativa(materia);
        String[] arrCorrelativas = lineaMateria.split(",");

        materiasCorrelativas = new ArrayList<String>();

        if (arrCorrelativas.length > 1) {
            for (int i = 1; i < arrCorrelativas.length; i++) {
                materiasCorrelativas.add(arrCorrelativas[i]);
            }
            System.out.println("Correlativas para la materia '" + materia + "' son: ");
            System.out.println(materiasCorrelativas);
        }
    }

    public void buscarMateriasAprobadas(int legajo) throws IOException {
        String lineaAlumno = alumnosService.buscarAlumnos(legajo);
        String[] arrAlumno = lineaAlumno.split(",");

        materiasAprobadas = new ArrayList<String>();

        if (arrAlumno.length > 2) {
            for (int i = 2; i < arrAlumno.length; i++) {
                materiasAprobadas.add(arrAlumno[i]);
            }
            System.out.println("Materias Rendidas: " + materiasAprobadas);
        }
    }

    public InscripcionEnum validarInscripcion() {

        InscripcionEnum aprobada = InscripcionEnum.APROBADA;
        InscripcionEnum rechazada = InscripcionEnum.RECHAZADA;

        for (String correlativa : materiasCorrelativas ) {
            if (materiasAprobadas.contains(correlativa)) {
                System.out.println("SOLICITUD: " + aprobada);
                return aprobada;
            }
            break;
        }
        System.out.println("SOLICITUD: " + rechazada);
        return rechazada;
    }
}
