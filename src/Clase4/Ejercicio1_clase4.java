package Clase4;

import java.util.*;

import static java.util.Collections.sort;

public class Ejercicio1_clase4 {

    public static void main(String[] args) {

        // Salida Método A
        System.out.println("Ejecutando el metodo A: ");
        ordenarNumerosA(12, 11, 42, 'a'); // 'a' para seleccionar en orden Ascendente
        ordenarNumerosA(12, 11, 42, 'd'); // 'd' para seleccionar en orden Descendente

        System.out.println("\n");

        // Salida Método B
        System.out.println("Ejecutando el metodo B: ");
        Scanner scann = new Scanner(System.in);
        System.out.println("Ingrese el 1° número");
        String num1 = scann.nextLine();
        System.out.println("Ingrese el 2° número");
        String num2 = scann.nextLine();
        System.out.println("Ingrese el 3° número");
        String num3 = scann.nextLine();
        System.out.println("Ingrese la letra 'a' para ordenarlos en ascendente o 'd' en descendente: ");
        String posicion = scann.nextLine();

        ArrayList<Integer> vector = new ArrayList<>();
        vector.add(Integer.valueOf(num1));
        vector.add(Integer.valueOf(num2));
        vector.add(Integer.valueOf(num3));

        ordenarNumerosB(vector, posicion);

        System.out.println("\n");

        // Salida Método C
        // Si algún parámetro es Null o Cero, se deberá pasar el valor por consola!!
        System.out.println("Ejecutando el metodo C");
        ordenarNumerosC(31, null, 17, 'd');
    }
    // ***************************** Método A *****************************
    public static void ordenarNumerosA(int num1, int num2, int num3, char posicion) {
        Integer[] vectorNumeros = new Integer[3];
        vectorNumeros[0] = num1;
        vectorNumeros[1] = num2;
        vectorNumeros[2] = num3;
        if(posicion == 'a') {
            Arrays.sort(vectorNumeros);
            System.out.println("De Menor a Mayor " + Arrays.toString(vectorNumeros));
        } else if (posicion == 'd') {
            Arrays.sort(vectorNumeros, Collections.reverseOrder());
            System.out.println("De Mayor a Menor " + Arrays.toString(vectorNumeros));
        } else {
            System.out.println("Ingrese: 'a' o 'd' para ordenar la lista");
        }
    }

    // ***************************** Método B *****************************
    public static void ordenarNumerosB(List<Integer> vector, String posicion) {
        if(Objects.equals(posicion, "a")) {
            Collections.sort(vector);
            System.out.println("Ordenados de Menor a Mayor > \n" + vector);
        } else if (Objects.equals(posicion, "d")) {
            vector.sort(Collections.reverseOrder());
            System.out.println("Ordenados de Mayor a Menor < \n" + vector);
        } else {
            System.out.println("Error: Elegir unicamente entre los caracteres 'a' o 'd'");
        }
    }

    // ***************************** Método C *****************************
    public static void ordenarNumerosC(Integer num1, Integer num2, Integer num3, char posicion) {
        if(num1 == null || num1 == 0) {
            Scanner scann = new Scanner(System.in);
            System.out.println("Ingrese el 1° número");
            num1 = Integer.parseInt(scann.nextLine());
        } else if(num2 == null || num2 == 0) {
            Scanner scann2 = new Scanner(System.in);
            System.out.println("Ingrese el 2° número");
            num2 = Integer.parseInt(scann2.nextLine());
        } else if (num3 == null || num3 == 0) {
            Scanner scann3 = new Scanner(System.in);
            System.out.println("Ingrese el 3° número");
            num3 = Integer.parseInt(scann3.nextLine());
        }
        ArrayList<Integer> vector = new ArrayList<>();
        vector.add(num1);
        vector.add(num2);
        vector.add(num3);

        if(posicion == 'a') {
            Collections.sort(vector);
            System.out.println("Ordenados de Menor a Mayor > \n" + vector);
        } else if (posicion == 'd') {
            vector.sort(Collections.reverseOrder());
            System.out.println("Ordenados de Mayor a Menor < \n" + vector);
        } else {
            System.out.println("Error: Elegir unicamente entre los caracteres 'a' o 'd'");
        }
    }
}
