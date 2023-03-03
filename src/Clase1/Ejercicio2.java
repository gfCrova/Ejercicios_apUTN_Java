package Clase1;

public class Ejercicio2 {

    public static void main(String[] args) {

        //EJEMPLO Familia1: ingresos mensuales $245678, 2 vehiculos, el de más antiguedad 12 años, 2 inmuebles, no demuestra capacidad económica plena.
        verificarCategoria(245678, 2, 12, 2, false);

        //EJEMPLO Familia2: ingresos mensuales $652900, 4 vehiculos, el de más antiguedad 4 años y 5 inmuebles, demuestra capacidad económica plena.
        verificarCategoria(652900, 4, 14, 5, true);
    }

    static float ingresosTotales = 489083f;
    static int cantidadVehiculos = 3;
    static int antiguedadDeVehiculos = 5;
    static int cantidadInmuebles = 3;

    public static void verificarCategoria(float ing, int vehiculo, int antiguedad, int inmueble, boolean capEconomicaPlena) {
            if (ing >= ingresosTotales || (vehiculo >= cantidadVehiculos &&  antiguedad < antiguedadDeVehiculos) || inmueble >= cantidadInmuebles || capEconomicaPlena) {
                System.out.println("Pertenece a la Categoría de Ingresos Altos");
            } else {
                System.out.println("NO pertenece a la Categoría de Ingresos Altos");
            }
    }
}
