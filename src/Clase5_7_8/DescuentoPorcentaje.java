package Clase5_7;

public class DescuentoPorcentaje extends Descuento{

    private double valorDescuento;

    public DescuentoPorcentaje() {}

    public DescuentoPorcentaje(double valorDescPorcentaje) {
        this.valorDescuento = valorDescPorcentaje;
    }

    @Override
    public double getValorDescuento() {
        return this.valorDescuento;
    }

    @Override
    public void setValorDescuento(double valorDescuento) {
        this.valorDescuento = valorDescuento;
    }

    @Override
    public double calcularDescuento(Carrito carrito) {
        double getTotal = carrito.calcularTotal();
        double resultDescuento = (getTotal * this.valorDescuento) / 100;
        return getTotal - resultDescuento;
    }
}
