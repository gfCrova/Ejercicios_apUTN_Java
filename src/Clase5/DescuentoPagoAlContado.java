package Clase5;

public class DescuentoAlContado extends Descuento{
    @Override
    public double calcularDescuento(Carrito carrito, double valorDescuento) {
        double getTotal = carrito.calcularTotal();
        double resultDescuento = (getTotal * valorDescuento) / 50;
        return getTotal -= resultDescuento;
    }
}
