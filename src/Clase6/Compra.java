package Clase6;

import java.time.LocalDateTime;

public class Compra {

    private LocalDateTime fechaCompra;
    private ItemCompra[] items = new ItemCompra[10];

    public Compra() {
    }

    public Compra(LocalDateTime fechaCompra, ItemCompra[] items) {
        this.fechaCompra = fechaCompra;
        this.items = items;
    }

    public LocalDateTime getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDateTime fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public ItemCompra[] getItems() {
        return items;
    }

    public void setItems(ItemCompra[] items) {
        this.items = items;
    }

    public double calcularTotal() {
        double total = 0;
        try {
            total = 0;
            for (int i = 0; i < 10; i++) {
                ItemCompra item = items[i];
                total += item.calcularSubTotal();
            }
        } catch (NullPointerException ignored) {
        }
        return total;
    }
}
