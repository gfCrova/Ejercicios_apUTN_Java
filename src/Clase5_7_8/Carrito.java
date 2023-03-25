package Clase5_7_8;

import java.util.ArrayList;

public class Carrito {

    private ArrayList<ItemCarrito> item = new ArrayList<>();

    public Carrito() {
    }

    public Carrito(ArrayList<ItemCarrito> item) {
        this.item = item;
    }

    public ArrayList<ItemCarrito> getItem() {
        return item;
    }

    public void setItem(ArrayList<ItemCarrito> item) {
        this.item = item;
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemCarrito items : item) {
            total += items.getProducto().getPrecio();
        }
        return total;
    }
}
