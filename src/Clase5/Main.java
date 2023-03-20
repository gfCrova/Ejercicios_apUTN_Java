package Clase5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {

        Carrito carrito = new Carrito();
        Descuento pagoEnEfectivo = new DescuentoPagoEnEfectivo();
        Descuento pagoConDebito = new DescuentoPagoConDebito();

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
        System.out.println("Importe Total: ");
        System.out.println(carrito.calcularTotal());

        System.out.println("Total con descuento del 12.5% por pago al Contado: ");
        System.out.println(pagoEnEfectivo.calcularDescuento(carrito));

        System.out.println("Total con descuento del 15% por pago con tarjeta de debito: ");
        System.out.println(pagoConDebito.calcularDescuento(carrito));
    }
}
