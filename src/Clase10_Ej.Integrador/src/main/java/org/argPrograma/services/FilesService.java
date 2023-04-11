package org.argPrograma.services;

import org.argPrograma.entities.Alumno;
import org.argPrograma.entities.Materia;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FilesService {

    private final String pathMaterias = "src\\Clase10_Ej.Integrador\\src\\main\\java\\org\\argPrograma\\outputFiles\\materias.csv";
    private final String pathAlumnos = "src\\main\\java\\org\\argPrograma\\outputFiles\\alumnos.csv";

    public List<String> leerArchivo() throws IOException {
        String pathInscripciones = "src\\main\\java\\org\\argPrograma\\inputFiles\\inscripciones.csv";
        Path rutaArchivo = Paths.get(pathInscripciones);

        return Files.readAllLines(rutaArchivo);
    }

    public void guardarMateria(Materia materia) throws IOException {



        /*for (int i = 0; i < materia.getCorrelativas().size(); i++) {
            String correlativa
        }*/
        /*for ( List<Materia> materia : materia.getCorrelativas()) {

        }*/
        Files.writeString(Paths.get(pathMaterias), materia.grabarArchivo() + "\n", StandardOpenOption.APPEND);
    }

    public void guardarAlumno(Alumno alumno) throws IOException {

        Files.writeString(Paths.get(pathAlumnos), alumno.grabarArchivo() + "\n", StandardOpenOption.APPEND);
    }

    public String buscarAlumno(int legajo) throws IOException {
        System.out.println(legajo);
        String lineaAlumno = "";

        for (String linea : Files.readAllLines(Paths.get(pathAlumnos))) {
            System.out.println("linea a evaluar");
            System.out.println(linea);
            int leg = Integer.parseInt(linea.split(",")[1]);
            System.out.println("LEG leido");
            System.out.println(leg);
            if (leg == legajo) {
                System.out.println("hay igualdaaaaad");
                lineaAlumno = linea;

                return lineaAlumno;
            }
        }

        return lineaAlumno;
    }

    public String buscarCorrelativa(String materia) throws IOException {
        System.out.println("materia a buscar RECIBIDA: " + materia);
        String lineaMateria = "";

        for (String linea : Files.readAllLines(Paths.get(pathMaterias))) {
            System.out.println("linea a evaluar de materias...: ");
            System.out.println(linea);
            String mat = linea.split(",")[0];
            System.out.println("son iguales: " + materia + " vs " + mat);
            System.out.println(materia.equals(mat));

            if (materia.equals(mat)) {
                System.out.println("hay igualdaaaad de materiaaa");
                lineaMateria = linea;

                return lineaMateria;
            }
        }

        return lineaMateria;
    }

    public void registrarResultado(String linea) {
        System.out.println("LINEA FINAL Recibida");
        System.out.println(linea);
    }
}
