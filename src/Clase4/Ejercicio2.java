package Clase4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) throws IOException {

        String archivo = "src\\Clase4\\fileNumbers.txt";
        Files.write(Path.of(archivo), "34 21 55 23 2 90".getBytes());

        sumaEnArchivo(new File(archivo));
        System.out.println("\n");
        suma_multiplicacion(new File(archivo), "*");

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
                switch (operador) {
                    case "*" -> {
                        multiplicar *= num;
                        System.out.print(" " + num);
                    }
                    case "+" -> {
                        sumar += num;
                        System.out.print(" " + num);
                    }
                }
            }
            System.out.println("\n");
            if(Objects.equals(operador, "*")){
                    System.out.println("El resultado de la multiplicación de todos los numeros es de: " + multiplicar);
                } else {
                    System.out.println("El resultado de la suma de todos los numeros es de: " + sumar);
            }
        } catch(FileNotFoundException e) {
            System.out.println("No se encontro el archivo" + e.getMessage());
        }
    }
}
