package Clase5_7_8.test;

import Clase5_7_8.*;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TestDescuentos {

    Carrito carrito;
    DescuentoFijo descuento;
    DescuentoPorcentaje descuento2;
    DescuentoPorcentajeConTope descuento3;

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
    public void testDescuentoFijo() {
        crearCarrito();

        descuento = new DescuentoFijo(250);

        double result = descuento.calcularDescuento(carrito);
        double resultadoEsperado = 2750;

        assertEquals(result, resultadoEsperado);
    }

    @org.junit.jupiter.api.Test
    public void testDescuentoPorcentaje() {
        crearCarrito();

        descuento2 = new DescuentoPorcentaje(25);

        double result = descuento2.calcularDescuento(carrito);
        double resultadoEsperado = 2250;

        assertEquals(result, resultadoEsperado);
    }

    @org.junit.jupiter.api.Test
    public void testDescuentoPorcentajeConTope() {
        crearCarrito();

        descuento3 = new DescuentoPorcentajeConTope(40, 35);

        double result = descuento3.calcularDescuento(carrito);

        double resultadoEsperado = 1950;

        assertEquals(result, resultadoEsperado);
    }
}




