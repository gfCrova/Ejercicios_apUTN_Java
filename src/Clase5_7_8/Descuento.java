package Clase5_7_8;

public abstract class Descuento {

    private Carrito carrito;

    public Descuento() {
    }

    public Descuento(Carrito carrito) {
        this.carrito = carrito;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    public abstract double getValorDescuento();

    public abstract void setValorDescuento(double valorDescuento);

    public abstract double calcularDescuento(Carrito carrito);
}
