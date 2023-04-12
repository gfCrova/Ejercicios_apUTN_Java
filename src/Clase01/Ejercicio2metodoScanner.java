package Clase01;

import java.util.Scanner;

public class Ejercicio2metodoScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Coloque sus ingresos mensuales: ");
        float ingresos = scanner.nextFloat();

        System.out.println("Ingrese su cantidad de vehículos: ");
        int vehiculos = scanner.nextInt();

        System.out.println("Ingrese la cantidad de años de su vehiculo más antiguo");
        int antiguedadDeVehiculo = scanner.nextInt();

        System.out.println("Ingrese su cantidad de inmuebles");
        int inmuebles = scanner.nextInt();

        System.out.println("Posee una embarcación, una aeronave de lujo o es titular de activos societarios?");
        boolean capEconomica = scanner.nextBoolean();



        if (ingresos >= 489083 || (vehiculos >= 3 &&  antiguedadDeVehiculo < 5) || inmuebles >= 3 || capEconomica) {
                System.out.println("Pertenece a la Categoría de Ingresos Altos");
            } else {
                System.out.println("NO pertenece a la Categoría de Ingresos Altos");
            }
        }
}