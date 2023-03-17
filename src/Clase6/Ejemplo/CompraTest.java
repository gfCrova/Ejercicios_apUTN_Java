package Clase6;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class CompraTest {

    ItemCompra objItemCompraTest;

    @BeforeEach
    public void setUp() {
        objItemCompraTest = new ItemCompra();
    }

    @org.junit.jupiter.api.Test
    void testCalcularSubTotal() {
        objItemCompraTest.setCantidad(2);
        objItemCompraTest.setProducto(new Producto("Arroz", 200));

        double subTotal = objItemCompraTest.calcularSubTotal();
        double subTotalEsperado = 360;

        boolean resultado = ( subTotal == subTotalEsperado);
        assertTrue(resultado);
    }
}