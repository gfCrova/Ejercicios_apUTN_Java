package Clase5_7_8;

public class DescuentoFijo extends Descuento{

    private double valorDescuento;

    public DescuentoFijo(){}

    public DescuentoFijo(double valorDescuento) {
        this.valorDescuento = valorDescuento;
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
        return getTotal - this.valorDescuento;
    }
}
