package Clase5;

import java.time.LocalDate;

public class Producto {

    private String nombre;
    private String descripcion;
    private LocalDate fechaAlta;
    private double precio;
    private Integer pesoKg;

    public Producto() {
    }

    public Producto(String nombre, String descripcion, LocalDate fechaAlta, double precio, Integer pesoKg) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaAlta = fechaAlta;
        this.precio = precio;
        this.pesoKg = pesoKg;
    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Integer getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(Integer pesoKg) {
        this.pesoKg = pesoKg;
    }
}
