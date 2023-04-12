package org.argPrograma.services;

import org.argPrograma.entities.InscripcionEnum;
import org.argPrograma.entities.Materia;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CorrelativasService {

    private final FilesService fileServicio;
    private ArrayList<Materia> materias;
    private List<String> materiasRendidas;
    private List<String> materiasCorrelativas;

    public CorrelativasService(FilesService fileServicio) {
        this.fileServicio = fileServicio;
    }

    public void registrarInscripcion() throws IOException {
        List<String> lineas =  fileServicio.leerInscripciones();

        for (int i = 0; i < lineas.size(); i++) {

            if (i != 0) {
                String linea = lineas.get(i);
                String alumno = linea.split(",")[0];
                int legajo = Integer.parseInt(linea.split(",")[1]);
                String materiaInscripcion = linea.split(",")[2];
                System.out.println("ALUMNO: " + alumno + ". LEGAJO: " + legajo + ".");
                System.out.println("Solicita inscribirse a: " + materiaInscripcion);

                buscarAlumno(legajo);
                buscarCorrelativas(materiaInscripcion);

                for (String correlativa : materiasCorrelativas ) {
                    if (materiasRendidas.contains(correlativa)) {
                        linea += " -> " + InscripcionEnum.APROBADA;
                    } else {
                        linea += " -> " + InscripcionEnum.RECHAZADO;
                    }
                }
                registrarResultado(linea);
                System.out.println("\n");
            }
        }
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

    public void buscarAlumno(int legajo) throws IOException {
        String lineaAlumno = fileServicio.buscarAlumnos(legajo);
        String[] arrAlumno = lineaAlumno.split(",");

        materiasRendidas = new ArrayList<String>();

        if (arrAlumno.length > 2) {
            for (int i = 2; i < arrAlumno.length; i++) {
                materiasRendidas.add(arrAlumno[i]);
            }
            System.out.println("Materias Rendidas: " + materiasRendidas);
        }
    }

    public void registrarResultado(String linea) {
        System.out.println("REPORTE DE SOLICITUD:");
        System.out.println(linea);
    }
}
