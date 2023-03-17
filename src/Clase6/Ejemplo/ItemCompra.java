package Clase6.Ejemplo;

public class ItemCompra {

    private Producto product;
    private int cantidad;

    public ItemCompra() {}

    public ItemCompra(Producto producto, int cantidad) {
        this.product = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return product;
    }

    public void setProducto(Producto producto) {

        this.product = producto;
    }

    public int getCantidad() {

        return cantidad;
    }

    public void setCantidad(int cantidad) {

        this.cantidad = cantidad;
    }

    public double calcularSubTotal(){
        double subTotal = 0;
        subTotal = cantidad * product.getPrecio();
        return subTotal;
    }
}
