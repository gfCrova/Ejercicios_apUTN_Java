package Clase3;
import java.util.Arrays;

public class Ejercicio1_B {

    public static void main(String[] args) {
        ordenarNumeros(43, 17, 90);
    }

    public static void ordenarNumeros(int num1, int num2, int num3) {
        int[] vectorNumeros = new int[3];
        for (int i = 0; i < vectorNumeros.length; i++) {
            vectorNumeros[0] = num1;
            vectorNumeros[1] = num2;
            vectorNumeros[2] = num3;
        }
        Arrays.sort(vectorNumeros);
        System.out.println(Arrays.toString(vectorNumeros));
    }

}
