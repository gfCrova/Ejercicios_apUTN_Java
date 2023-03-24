package Clase5_7;

public class Carrito {

    private ItemCarrito[] item = new ItemCarrito[3];
    private Descuento descuento;

    public Carrito() {
    }

    public Carrito(ItemCarrito[] item) {
        this.item = item;
    }

    public ItemCarrito[] getItem() {
        return item;
    }

    public void setItem(ItemCarrito[] item) {
        this.item = item;
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemCarrito obj : item) {
            total += obj.getProducto().getPrecio();
        }
        return total;
    }
}
