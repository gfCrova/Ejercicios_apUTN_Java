package Clase05_07_08;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {

        Carrito carrito = new Carrito();

        try {
            int i = 0;
            String archivo = "src\\Clase5_7_8\\archivo.csv";
            for (String linea : Files.readAllLines(Paths.get(archivo))) {
                System.out.println(linea);
                String nombre = linea.split(", ")[0];
                int cantidad = Integer.parseInt(linea.split(", ")[1]);
                double precio = Integer.parseInt(linea.split(", ")[2]);

                Producto producto = new Producto(nombre, precio);
                ItemCarrito itemsDeCarrito = new ItemCarrito(producto, cantidad);

                carrito.getItem().add(i, itemsDeCarrito);
                i++;
            }
            System.out.println("Importe Total: $" + carrito.calcularTotal() + "\n");

            DescuentoFijo descFijo = new DescuentoFijo(25);
            System.out.println("Con Descuento Fijo de $ " + descFijo.getValorDescuento());
            System.out.println("Importe Total es: $" + descFijo.calcularDescuento(carrito) + "\n");

            DescuentoPorcentaje descPorcentaje = new DescuentoPorcentaje(15);
            System.out.println("Con Descuento de " + descPorcentaje.getValorDescuento() + "%");
            System.out.println("Importe Total es: $" + descPorcentaje.calcularDescuento(carrito) + "\n");

            DescuentoPorcentajeConTope descPorcentajeConTope2 = new DescuentoPorcentajeConTope(50, 30);
            // Si el descuento es mayor al valor del tope se anula y se descuenta el valor del tope!
            System.out.println("Con Descuento de " + descPorcentajeConTope2.getValorDescuento() + "% y Tope Fijo de " + descPorcentajeConTope2.getValorTope() + "%");
            System.out.println("Importe Total es: $" + descPorcentajeConTope2.calcularDescuento(carrito));

        } catch (IOException e) {
                System.out.println("No se encontro el archivo " + e.getMessage());
        }
    }
}
