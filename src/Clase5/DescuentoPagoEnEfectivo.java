package Clase5;

public class DescuentoPagoEnEfectivo extends Descuento{

    private final double valorDescuentoEfectivo = 12.5;

    @Override
    public double getValorDescuento() {
        return this.valorDescuentoEfectivo;
    }
    @Override
    public void setValorDescuento(double valorDescuentoAlContado) {
        super.setValorDescuento(this.valorDescuentoEfectivo);
    }

    @Override
    public double calcularDescuento(Carrito carrito) {
        double getTotal = carrito.calcularTotal();
        double resultDescuento = (getTotal * this.getValorDescuento()) / 100;
        return getTotal -= resultDescuento;
    }
}
