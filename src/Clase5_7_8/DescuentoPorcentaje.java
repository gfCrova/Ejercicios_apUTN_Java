package Clase5_7_8;

import Clase5_7_8.exceptions.NoValorCero;
import Clase5_7_8.exceptions.NoValorNegativo;

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
        if (getTotal == 0) {
            throw new NoValorCero();
        } if (getTotal - getValorDescuento() < 0) {
            throw new NoValorNegativo();
        }
        double resultDescuento = (getTotal * this.valorDescuento) / 100;
        return getTotal - resultDescuento;
    }
}
