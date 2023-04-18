package org.argPrograma.services;

import org.argPrograma.services.entities.Inscripcion;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FilesService {

    public FilesService() {
    }

    private final String pathInscripciones = "src\\Clase10_Ej.Integrador\\src\\main\\java\\org\\argPrograma\\inputFiles\\inscripciones.csv";
    private final String pathMaterias = "src\\Clase10_Ej.Integrador\\src\\main\\java\\org\\argPrograma\\inputFiles\\materias.csv";
    private final String pathAlumnos = "src\\Clase10_Ej.Integrador\\src\\main\\java\\org\\argPrograma\\inputFiles\\alumnos.csv";
    private final String pathResultados = "src\\Clase10_Ej.Integrador\\src\\main\\java\\org\\argPrograma\\outputFiles\\resultadoInscripciones.csv";

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

    public void guardarResultados(Inscripcion inscripcion) throws IOException {
        String grabarTexto = inscripcion.grabarArchivo();
        Path leerPath = Paths.get(pathResultados);

        try(BufferedWriter writer = Files.newBufferedWriter(leerPath, StandardOpenOption.WRITE, StandardOpenOption.APPEND)){
            writer.write(grabarTexto + "\n");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
