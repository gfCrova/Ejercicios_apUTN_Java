package Clase05_07_08.test;

import Clase05_07_08.Carrito;
import Clase05_07_08.ItemCarrito;
import Clase05_07_08.Producto;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TestCarrito {
    Carrito carrito;

    public void crearCarrito(){
        ArrayList<ItemCarrito> items = new ArrayList<>();
        carrito = new Carrito(items);

        Producto producto1 = new Producto("Product1", 1500);
        Producto producto2 = new Producto("Product2", 500);
        Producto producto3 = new Producto("Product3", 1000);

        ItemCarrito item1 = new ItemCarrito(producto1, 22);
        ItemCarrito item2 = new ItemCarrito(producto2, 3);
        ItemCarrito item3 = new ItemCarrito(producto3, 45);

        items.add(item1);
        items.add(item2);
        items.add(item3);
    }

    @org.junit.jupiter.api.Test
    public void testTotal() {

        crearCarrito();

        double resultadoTotal = carrito.calcularTotal();
        double resultadoEsperado = 3000;

        assertEquals(resultadoTotal, resultadoEsperado);
    };
    
}
