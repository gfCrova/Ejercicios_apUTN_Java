package Clase5_7_8;

public class DescuentoPorcentajeConTope extends Descuento {

    private double valorDescuento;
    private double valorTope;

    public DescuentoPorcentajeConTope() {};

    public DescuentoPorcentajeConTope(double valorDescuento, double valorTope) {
        this.valorDescuento = valorDescuento;
        this.valorTope = valorTope;
    }

    @Override
    public double getValorDescuento() {
        return this.valorDescuento;
    }
    @Override
    public void setValorDescuento(double valorDescuento) {
        this.valorDescuento = valorDescuento;
    }

    public double getValorTope() {
        return valorTope;
    }

    public void setValorTope(double valorTope) {
        this.valorTope = valorTope;
    }

    @Override
    public double calcularDescuento(Carrito carrito) {
        double getTotal = carrito.calcularTotal();
        double calculoTope = (getTotal * getValorTope() / 100);
        double calculoDescuento = (getTotal * getValorDescuento() / 100);
        if((getTotal * getValorDescuento() / 100) > getValorTope()) {
            return getTotal - calculoTope;
        } else {
            return getTotal - calculoDescuento;
        }
    }
}
