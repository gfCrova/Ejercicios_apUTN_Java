package Clase3;


public class Ejercicio2 {

    public static void main(String[] args) {
        convertString("Hola que tal");
    }

    public static void convertString(String texto) {
        String abecedario = "abcdefghijklmnopqrstuvwxyz";
        char[] c = abecedario.toCharArray();
        for (int i = 0; i < c.length; i++) {

        }
        System.out.println(String.valueOf(c));
    }
}
