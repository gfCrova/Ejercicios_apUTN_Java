package Clase6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {

        Compra compra = new Compra();
        int i = 0;

        String archivo = "src\\Clase6\\archivo.txt";
        for (String linea : Files.readAllLines(Paths.get(archivo))) {
            System.out.println(linea);
            String nombre = linea.split(";")[0];
            int cantidad = Integer.parseInt(linea.split(";")[1]);
            double precio = Integer.parseInt(linea.split(";")[2]);

            Producto producto = new Producto(nombre, precio);
            ItemCompra itemsDeCompra = new ItemCompra(producto, cantidad);

            compra.getItems()[i] = itemsDeCompra;
            i++;
        }
        System.out.println("Importe Total: ");
        System.out.println(compra.calcularTotal());
    }
}
