package Clase5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {

        Carrito carrito = new Carrito();
        Descuento descFijo = new DescuentoFijo(25);
        Descuento descPorcentaje = new DescuentoPorcentaje(30);

        int i = 0;
        String archivo = "src\\Clase5\\archivo.txt";
        for (String linea : Files.readAllLines(Paths.get(archivo))) {
            System.out.println(linea);
            String nombre = linea.split("; ")[0];
            int cantidad = Integer.parseInt(linea.split("; ")[1]);
            double precio = Integer.parseInt(linea.split("; ")[2]);

            Producto producto = new Producto(nombre, precio);
            ItemCarrito itemsDeCarrito = new ItemCarrito(producto, cantidad);

            carrito.getItem()[i] = itemsDeCarrito;
            i++;
        }

        System.out.println("Importe Total: $" + carrito.calcularTotal());

        System.out.println("Importe Total con descuento FIJO de ($" + descFijo.getValorDescuento() + ") es: $" + descFijo.calcularDescuento(carrito));

        System.out.println("Importe Total con -" + descPorcentaje.getValorDescuento() + "% de descuento es: $" + descPorcentaje.calcularDescuento(carrito));
    }
}
