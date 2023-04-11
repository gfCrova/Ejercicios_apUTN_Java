package org.argPrograma.services;

import org.argPrograma.entities.Alumno;
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
        List<String> lineas = fileServicio.leerArchivo();

        for (int i = 0; i < lineas.size(); i++) {

            if (i != 0) {
                System.out.println(lineas.get(i));
                String linea = lineas.get(i);
                int legajo = Integer.parseInt(linea.split(",")[1]);
                String materiaInscripcion = linea.split(",")[2];
                System.out.println("El alumno " + linea.split(",")[0] + ", legajo: " + legajo + "a materia: " + materiaInscripcion);
                buscarAlumno(legajo);
                buscarCorrelativas(materiaInscripcion);

                boolean resultadoValidacion = validarInscripcion();
                linea += "," + resultadoValidacion;

                fileServicio.registrarResultado(linea);
            }
        }

        //for (String linea: lineas) {
        //}
    }

    public void buscarAlumno(int legajo) throws IOException {
        String lineaAlumno = fileServicio.buscarAlumno(legajo);
        String[] arrAlumno = lineaAlumno.split(",");

        materiasRendidas = new ArrayList<String>();

        if (arrAlumno.length > 2) {
            for (int i = 2; i < arrAlumno.length; i++) {
                materiasRendidas.add(arrAlumno[i]);
            }
            System.out.println("Arr materias rendidas");
            System.out.println(materiasRendidas);
        }

        //return materializarAlumno(lineaAlumno);
    }

    public void buscarCorrelativas(String materia) throws IOException {
        String lineaMateria = fileServicio.buscarCorrelativa(materia);
        String[] arrCorrelativas = lineaMateria.split(",");

        materiasCorrelativas = new ArrayList<String>();

        if (arrCorrelativas.length > 1) {
            for (int i = 1; i < arrCorrelativas.length; i++) {
                materiasCorrelativas.add(arrCorrelativas[i]);
            }
            System.out.println("array Correlativas para la materia " + materia);
            System.out.println(materiasCorrelativas);
        }
    }

    public boolean validarInscripcion() {

        boolean aprobada = true;
        boolean arrValidaciones[] = new boolean[materiasCorrelativas.size()];


        for (String correlativa : materiasCorrelativas) {
            if (!materiasRendidas.contains(correlativa)) {
                aprobada = false;
                break;
            }
        }

        return aprobada;
    }

    public void registrarMaterias() throws IOException {

        materias = new ArrayList<Materia>();
        //crear materias
        materias.add(new Materia("MatematicaI"));

        materias.add(new Materia("MatematicaII"));
        materias.add(new Materia("MatematicaIII"));

        //añadir correlativas
        materias.get(1).agregarCorrelativa(materias.get(0));
        materias.get(2).agregarCorrelativa(materias.get(0));
        materias.get(2).agregarCorrelativa(materias.get(1));

        for (Materia materia : materias) {
            System.out.println("materia a guardar:");
            System.out.println(materia.getNombre());
            fileServicio.guardarMateria(materia);
        }

    }

    public void registrarAlumnos() throws IOException {

        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

        alumnos.add(new Alumno("Javier", "9227"));
        //alumnos.add(new Alumno("Gonzalo", "10930"));
        //alumnos.add(new Alumno("Matias", "1215"));

        // registrar materias aprobadas
        alumnos.get(0).agregarMateriaAprobada(materias.get(0));
        alumnos.get(0).agregarMateriaAprobada(materias.get(1));
        //alumnos.get(1).agregarMateriaAprobada(materias.get(0));
        //alumnos.get(2).agregarMateriaAprobada(materias.get(0));
        //alumnos.get(2).agregarMateriaAprobada(materias.get(1));

        for (Alumno alumno : alumnos) {
            System.out.println("alumno a guardar:");
            System.out.println(alumno.getNombre());
            fileServicio.guardarAlumno(alumno);
        }

    }

    /*public void registrarMateriasAprobadas(Alumno alumno) {

    }*/

    public void añadirCorrelativas(Materia materia) {

    }
}
