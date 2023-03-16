package Clase4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

public class Ejercicio3_clase4 {

    public static void main(String[] args) throws IOException {

        String archivo1 = "src\\Clase4\\fileEntrada.txt";
        Files.write(Path.of(archivo1), "Texto de prueba para el metodo codificacion".getBytes());

        String archivo2 = "src\\Clase4\\fileSalida.txt";


        metodoCodificacion(new File(archivo1), new File(archivo2), "codificar", 3);
        metodoCodificacion(new File(archivo2), new File(archivo1), "decodificar", 3);
    }

    public static void metodoCodificacion(File file1, File file2, String opcion ,int desplazo) throws IOException {

        String result = "";

        for (String linea : Files.readAllLines(Paths.get(file1.toURI()))){
            //linea.replace(" ", "");
            char [] cifradoVector = linea.toCharArray();

            for(int i = 0; i < cifradoVector.length; i++){
                if(Objects.equals(opcion, "codificar")){
                    cifradoVector[i] += desplazo;
                    result += cifradoVector[i];
                }
                else if(Objects.equals(opcion, "decodificar")){
                    cifradoVector[i] -= desplazo;
                    result += cifradoVector[i];
                }
            }
        }
        Files.writeString(file2.toPath(), result);;
        for (String linea : Files.readAllLines(Paths.get(file2.toString()))){
            System.out.println(linea);
        }
    }
}
