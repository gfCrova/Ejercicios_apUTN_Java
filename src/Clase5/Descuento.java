package Clase5;

public abstract class Descuento {

    private Carrito carrito;
    private double valorDescuento;

    public Descuento() {
    }

    public Descuento(Carrito carrito, double valorDescuento) {
        this.carrito = carrito;
        this.valorDescuento = valorDescuento;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    public abstract double getValorDescuento();

    public void setValorDescuento(double valorDescuento) {
        this.valorDescuento = valorDescuento;
    }

    public abstract double calcularDescuento(Carrito carrito);
}
