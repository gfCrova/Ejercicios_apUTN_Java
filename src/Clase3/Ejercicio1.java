package Clase3;
import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio1 {

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
        int count = 0;
        ArrayList<Integer> posicionChar = new ArrayList<>();
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == letra) {
                posicionChar.add(texto.indexOf(letra, i));
                count++;
            }
        }
        System.out.println("La letra '" + letra + "' se repite: " + count + " veces. En la cadena de texto: '" + texto + "'");
        System.out.println("Posicion: " + posicionChar);
    }

    /***************** método B ****************************/
    public static void ordenarNumeros(int num1, int num2, int num3) {
        int[] vectorNumeros = new int[3];
        for (int i = 0; i < vectorNumeros.length; i++) {
            vectorNumeros[0] = num1;
            vectorNumeros[1] = num2;
            vectorNumeros[2] = num3;
        }
        Arrays.sort(vectorNumeros);
        System.out.println("Se obtuvo el siguiente array con los numeros ordenados de menor a mayor: \n" + Arrays.toString(vectorNumeros));
    }

    /***************** método C ****************************/
    public static void main1(int x) {
        int[] vectorNumeros = {5, 9, 15, 21, 44, 62};
        int suma = 0;
        for (int i = 0; i < vectorNumeros.length; i++) {
            if (vectorNumeros[i] > x) {
                suma += vectorNumeros[i];
            }
        }
        System.out.println("La suma de los elementos del array mayores a " + x + " es de: " + suma);
    }
}
