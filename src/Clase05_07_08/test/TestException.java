package Clase05_07_08.test;

import Clase05_07_08.*;
import Clase05_07_08.exceptions.NoValorCero;
import Clase05_07_08.exceptions.NoValorNegativo;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

public class TestException {

    ArrayList<ItemCarrito> items = new ArrayList<>();
    Carrito carrito = new Carrito(items);
    DescuentoFijo descuento;
    DescuentoPorcentaje descuento2;
    Producto producto1 = new Producto("Product1", -50);
    Producto producto2 = new Producto("Product2", 20);
    Producto producto3 = new Producto("Product3", 10);

    ItemCarrito item1 = new ItemCarrito(producto1, 1);
    ItemCarrito item2 = new ItemCarrito(producto2, 1);
    ItemCarrito item3 = new ItemCarrito(producto3, 1);


    @Test(expected=NoValorNegativo.class)
    public void testValorNegativo() throws IOException {

        items.add(item1);
        items.add(item2);
        items.add(item3);

        descuento = new DescuentoFijo(5);

        double resultadoTotal = carrito.calcularTotal();
        double result = descuento.calcularDescuento(carrito);

        if (resultadoTotal - result < 0) {
            throw new NoValorNegativo();
        }
    }

    @Test(expected=NoValorCero.class)
    public void testValorCero() throws IOException {

        item1.getProducto().setPrecio(-10);
        item2.getProducto().setPrecio(0);
        item3.getProducto().setPrecio(10);

        descuento2 = new DescuentoPorcentaje(5);

        double resultadoTotal = carrito.calcularTotal();
        double result = descuento2.calcularDescuento(carrito);

        if (resultadoTotal == 0) {
            throw new NoValorCero();
        }
    }
}
