package Clase4;

import java.util.*;

import static java.util.Collections.sort;

public class NuevoEjercicio {

    public static void main(String[] args) {

        // Salida Método A
        ordenarNumeros(12, 11, 42, 'a'); // 'a' para seleccionar en orden Ascendente
        ordenarNumeros(12, 11, 42, 'e'); // 'd' para seleccionar en orden Descendente

        // Salida Método B
        Scanner scann = new Scanner(System.in);
        System.out.println("Ingrese 3 valores numericos separados por un espacio: ");
        String arrayNumeros = scann.nextLine();
        System.out.println("Ingrese la letra 'a' para ordenarlos en ascendente o 'd' en descendente: ");
        String posicion = scann.nextLine();

        int i = 0;
        ArrayList<Integer> vector = new ArrayList<>(arrayNumeros.split(" ").length);
        for(String numerosStr : arrayNumeros.split(" ")){
            vector.add(Integer.valueOf(numerosStr));
            i++;
        }
        ordenarNumeros2(vector, posicion);
    }
    // Método A *****************************
    public static void ordenarNumeros(int num1, int num2, int num3, char posicion) {
        Integer[] vectorNumeros = new Integer[3];
        vectorNumeros[0] = num1;
        vectorNumeros[1] = num2;
        vectorNumeros[2] = num3;
        if(posicion == 'a') {
            Arrays.sort(vectorNumeros);
            System.out.println("De Menor a Mayor > \n" + Arrays.toString(vectorNumeros));
        } else if (posicion == 'd') {
            Arrays.sort(vectorNumeros, Collections.reverseOrder());
            System.out.println("De Mayor a Menor < \n" + Arrays.toString(vectorNumeros));
        } else {
            System.out.println("Ingrese: 'a' o 'd' para ordenar la lista");
        }
    }

    // Método B *****************************
    public static void ordenarNumeros2(List<Integer> vector, String posicion) {
        if(Objects.equals(posicion, "a")) {
            Collections.sort(vector);
            System.out.println("De Menor a Mayor > \n" + vector);
        } else if (Objects.equals(posicion, "d")) {
            vector.sort(Collections.reverseOrder());
            System.out.println("De Mayor a Menor < \n" + vector);
        } else {
            System.out.println("Ingrese: 'a' o 'd' para ordenar la lista en Ascendente o Descendente");
        }
    }



}
