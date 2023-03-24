package Clase5_7_8.test;

import Clase5_7_8.Carrito;
import Clase5_7_8.ItemCarrito;
import Clase5_7_8.Producto;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class TestCarrito {
    Carrito carrito;

    TestDescuentos testDescuentos;
    ItemCarrito[] items = new ItemCarrito[3];

    public void crearCarrito(){
        carrito = new Carrito(items);

        Producto producto1 = new Producto("Product1", 1500);
        Producto producto2 = new Producto("Product2", 500);
        Producto producto3 = new Producto("Product3", 1000);

        ItemCarrito item1 = new ItemCarrito(producto1, 22);
        ItemCarrito item2 = new ItemCarrito(producto2, 3);
        ItemCarrito item3 = new ItemCarrito(producto3, 45);

        items[0] = item1;
        items[1] = item2;
        items[2] = item3;
    }

    @org.junit.jupiter.api.Test
    public void testTotal() {

        crearCarrito();

        double resultadoTotal = carrito.calcularTotal();
        double resultadoEsperado = 3000;

        assertEquals(resultadoTotal, resultadoEsperado);
    };
    
}
