package Clase3;

public class Ejercicio2 {

    public static void main(String[] args) {
        convertirString("Hola que tal", 1);
        convertirString("Hola que tal", 2);
    }

    public static void convertirString(String texto, int desplazo) {
        String str = texto.replace(" ", "");
        char[] textoChar = str.toCharArray();
        for (int i = 0; i < textoChar.length; i++) {
            textoChar[i] += desplazo;
        }
        String result = new String(textoChar);
        System.out.println(result);
    }
}
