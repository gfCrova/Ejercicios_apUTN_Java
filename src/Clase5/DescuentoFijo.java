package Clase5;

public class DescuentoFijo extends Descuento{

    private final double valorDescuentoFijo;

    public DescuentoFijo(double valorDescuento){
        this.valorDescuentoFijo = valorDescuento;
    }


    @Override
    public double getValorDescuento() {
        return this.valorDescuentoFijo;
    }

    @Override
    public double calcularDescuento(Carrito carrito) {
        double getTotal = carrito.calcularTotal();
        return getTotal - this.valorDescuentoFijo;
    }
}
