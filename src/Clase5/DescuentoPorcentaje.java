package Clase5;

public class DescuentoPorcentaje extends Descuento{

    private final double valorDescPorcentaje;

    public DescuentoPorcentaje(double valorDescuento) {
        this.valorDescPorcentaje = valorDescuento;
    }

    @Override
    public double getValorDescuento() {
        return this.valorDescPorcentaje;
    }

    @Override
    public double calcularDescuento(Carrito carrito) {
        double getTotal = carrito.calcularTotal();
        double resultDescuento = (getTotal * this.valorDescPorcentaje) / 100;
        return getTotal -= resultDescuento;
    }
}
