package Clase3;
import java.util.ArrayList;

public class Ejercicio1_A {

    public static void main(String[] args) {

        // A
        metodoCalcular("Hola mundo", 'd');
        metodoCalcular("El arte desafia a la tecnologia y la tecnologia desafia al arte", 'a');

        // B


        
        // C
    }

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
}
