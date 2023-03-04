package Clase3;

public class Ejercicio1 {

    public static void main(String[] args) {
        metodo("Palabra", 'a');
    }

    public static void metodo(String str, char ch) {
        System.out.println("La letra indicada se encuentra en: ");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                System.out.println("Posicion: " + str.indexOf(ch, i));
            }
        }
        System.out.println("En total la letra '" + ch + "' se repite: " + str + " veces. En la cadena de texto: " + str);
    }
}
