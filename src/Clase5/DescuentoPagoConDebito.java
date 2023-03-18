package Clase5;

public class DescuentoPagoConDebito extends Descuento{

    private final double valorDescuentoDiscap = 15;

    @Override
    public double getValorDescuento() {
        return this.valorDescuentoDiscap;
    }
    @Override
    public void setValorDescuento(double valorDescuentoDiscap) {
        super.setValorDescuento(this.valorDescuentoDiscap);
    }

    @Override
    public double calcularDescuento(Carrito carrito) {
        double getTotal = carrito.calcularTotal();
        double resultDescuento = (getTotal * this.getValorDescuento()) / 100;
        return getTotal - resultDescuento;
    }
}
