package Clase5;

public class Descuento {

    private Carrito carritoConDescuento;

    public Descuento() {
    }

    public Descuento(Carrito carritoConDescuento) {
        this.carritoConDescuento = carritoConDescuento;
    }

    public Carrito getCarritoConDescuento() {
        return carritoConDescuento;
    }

    public void setCarritoConDescuento(Carrito carritoConDescuento) {
        this.carritoConDescuento = carritoConDescuento;
    }

    public double calcularDescuento() {
        return this.carritoConDescuento.calcularTotal() / 0.10;
    }
}
