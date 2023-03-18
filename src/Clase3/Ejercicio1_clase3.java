package Clase3;
import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio1_clase3 {

    public static void main(String[] args) {

        // Salida A
        metodoCalcular("El arte desafía a la tecnología y la tecnología desafía al arte", 'a');
        System.out.println("\n");

        // Salida B
        ordenarNumeros(83, 11, 25);
        System.out.println("\n");

        // Salida C
        main1(20);
    }

    /***************** método A ****************************/
    public static void metodoCalcular(String texto, char letra) {
        int count = 0, posicion = 0;
        posicion = texto.indexOf(letra);
        while(posicion != -1) {
            posicion = texto.indexOf(letra, posicion + 1);
            count++;
        }
        System.out.println("La letra '" + letra + "' se repite: " + count + " veces. En la cadena de texto: '" + texto + "'");
    }

    /***************** método B ****************************/
    public static void ordenarNumeros(int num1, int num2, int num3) {
        int[] vectorNumeros = new int[3];
        vectorNumeros[0] = num1;
        vectorNumeros[1] = num2;
        vectorNumeros[2] = num3;
        for (int i = 0; i < vectorNumeros.length; i++) {
            for (int j = 0; j < vectorNumeros.length; j++) {
                if (vectorNumeros[i] < vectorNumeros[j]) {
                    int comparar = vectorNumeros[i];
                    vectorNumeros[i] = vectorNumeros[j];
                    vectorNumeros[j] = comparar;
                }
            }
        }
        System.out.println("Se obtuvo el siguiente array con los numeros ordenados de menor a mayor: \n" + Arrays.toString(vectorNumeros));
    }

    /***************** método C ****************************/
    public static void main1(int x) {
        int[] vectorNumeros = {5, 9, 15, 21, 44, 62};
        int suma = 0;
        for (int vectorNumero : vectorNumeros) {
            if (vectorNumero > x) {
                suma += vectorNumero;
            }
        }
        System.out.println("La suma de los elementos del array mayores a " + x + " es de: " + suma);
    }
}
