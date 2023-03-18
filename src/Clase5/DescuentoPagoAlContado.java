package Clase5;

public class DescuentoPagoAlContado extends Descuento{

    private final double valorDescuentoAlContado = 12.5;

    @Override
    public double getValorDescuento() {
        return this.valorDescuentoAlContado;
    }
    @Override
    public void setValorDescuento(double valorDescuentoAlContado) {
        super.setValorDescuento(this.valorDescuentoAlContado);
    }

    @Override
    public double calcularDescuento(Carrito carrito) {
        double getTotal = carrito.calcularTotal();
        double resultDescuento = (getTotal * this.getValorDescuento()) / 100;
        return getTotal -= resultDescuento;
    }
}
