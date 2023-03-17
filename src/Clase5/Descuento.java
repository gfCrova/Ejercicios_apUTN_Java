package Clase5;

public class Descuento {

    private double valorDescuento;

    public Descuento() {
    }

    public double calcularDescuento(Carrito carrito, double valorDescuento) {
        double getTotal = carrito.calcularTotal();
        double resultDescuento = (getTotal * valorDescuento) / 100;
        return getTotal -= resultDescuento;
    }
}