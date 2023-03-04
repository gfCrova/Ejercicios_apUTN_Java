package Clase3;

public class Ejercicio1_C {

    public static void main(String[] args) {
        main1(20);
    }

    public static void main1(int x) {
        int[] vectorNumeros = {35, 9, 56, 105, 44, 2, 183, 92};
        int suma = 0;
        for (int i = 0; i < vectorNumeros.length; i++) {
            if (vectorNumeros[i] > x) {
               suma += vectorNumeros[i];
            }
        }
        System.out.println(suma);
    }
}
