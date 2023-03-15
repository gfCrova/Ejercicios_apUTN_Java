package Clase4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.util.Objects;
import java.util.Scanner;

public class Ejercicio2_clase4 {

    public static void main(String[] args) throws IOException {

        sumaEnArchivo(new File("fileNumbers.txt"));

        System.out.println("\n");

        suma_multiplicacion(new File("fileNumbers.txt"), "*");

    }

    public static void sumaEnArchivo(File file) {
        try {
            Scanner archivo = new Scanner(new File(file.toURI()));

            System.out.println("Los numeros dentro del archivo son: ");
            int num = 0, count = 0;
            while (archivo.hasNext()) {
                num = archivo.nextInt();
                count += num;
                System.out.print(" " + num);
            }
            System.out.println("\n");
            System.out.println("La suma de todos los numeros es de: " + count);
        } catch(FileNotFoundException e) {
            System.out.println("No se encontro el archivo" + e.getMessage());
        }
    }

    // a. Al programa anterior agreguele un parámetro para que la operación pueda ser suma o multiplicación.
    public static void suma_multiplicacion(File file,String operador) {
        try {
            Scanner archivo = new Scanner(new File(file.toURI()));

            System.out.println("Los numeros dentro del archivo son: ");
            int num = 0, sumar = 0;
            long multiplicar = 1;
            while (archivo.hasNext()) {
                num = archivo.nextInt();
                if(Objects.equals(operador, "*")){
                    multiplicar *= num;
                    System.out.print(" " + num);
                } if(Objects.equals(operador, "+")) {
                    sumar += num;
                    System.out.print(" " + num);
                }
            }
            System.out.println("\n");
            if (Objects.equals(operador, "*")){
                System.out.println("El resultado de la multiplicación de todos los numeros es de: " + multiplicar);
            }if (Objects.equals(operador, "+")){
                System.out.println("El resultado de la suma de todos los numeros es de: " + sumar);
            }
        } catch(FileNotFoundException e) {
            System.out.println("No se encontro el archivo" + e.getMessage());
        }
    }
}
