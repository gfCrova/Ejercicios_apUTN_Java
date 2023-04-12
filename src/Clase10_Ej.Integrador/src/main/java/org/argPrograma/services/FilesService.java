package org.argPrograma.services;

import org.argPrograma.entities.Materia;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilesService {

    public FilesService() {
    }

    private final String pathInscripciones = "src\\Clase10_Ej.Integrador\\src\\main\\java\\org\\argPrograma\\inputFiles\\inscripciones.csv";
    private final String pathMaterias = "src\\Clase10_Ej.Integrador\\src\\main\\java\\org\\argPrograma\\inputFiles\\materias.csv";
    private final String pathAlumnos = "src\\Clase10_Ej.Integrador\\src\\main\\java\\org\\argPrograma\\inputFiles\\alumnos.csv";

    public List<String> leerInscripciones() throws IOException {
        Path file = Paths.get(pathInscripciones);
        return Files.readAllLines(file);
    }

    public List<String> leerMaterias() throws IOException {
        Path file = Paths.get(pathMaterias);
        return Files.readAllLines(file);
    }

    public List<String> leerAlumnos() throws IOException {
        Path file = Paths.get(pathAlumnos);
        return Files.readAllLines(file);
    }

    public String buscarAlumnos(int legajo) throws IOException {
        String lineaAlumno = "";
        List<String> lineaAlumnos = leerAlumnos();

        for (int i = 0; i < lineaAlumnos.size(); i++) {
            if (i != 0) {
                String lineas = lineaAlumnos.get(i);
                int leg = Integer.parseInt(lineas.split(",")[1]);

                if (leg == legajo) {
                    lineaAlumno = lineas;
                }
            }
        }
        return lineaAlumno;
    }

    public String buscarCorrelativa(String materia) throws IOException {

        String lineaMateria = "";

        for (String linea : Files.readAllLines(Paths.get(pathMaterias))) {
            String mat = linea.split(",")[0];
            if (materia.equals(mat)) {
                lineaMateria = linea;
                return lineaMateria;
            }
        }
        return lineaMateria;
    }
}
