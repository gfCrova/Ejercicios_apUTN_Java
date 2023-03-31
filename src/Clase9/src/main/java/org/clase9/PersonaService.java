package org.clase9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class PersonaService {

    List<Persona> listaPersonas = new ArrayList<>();
    Scanner scanner;

    public void ingresarPersonas() {
        Persona persona = new Persona();
        scanner = new Scanner(System.in);
        try {
            System.out.println("Agregar una nueva persona: \n");
            System.out.println("NOMBRE: ");
            persona.setNombre(scanner.nextLine());
            System.out.println("APELLIDO: ");
            persona.setApellido(scanner.nextLine());
            System.out.println("FECHA DE NACIMIENTO: ");
            System.out.println("Año 'espacio' Mes 'espacio' Día: ");
            persona.setFechaNacimiento(LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));

            if (!Objects.equals(persona.getNombre(), "") && !Objects.equals(persona.getApellido(), "") && persona.getFechaNacimiento() != null) {
                listaPersonas.add(persona);
                System.out.println("Persona agregada con éxito!! \n");
            } else {
                throw new NullPointerException("No se pueden agregar campos vacíos");
            }
            continuarSalir();

        }catch (NullPointerException e) {
            System.out.println("Error" + e.getMessage());
            e.printStackTrace();
        }
    }

    public void continuarSalir() {
        scanner = new Scanner(System.in);
        try {
            System.out.println("Desea ingresar otra persona? (Si/No)");
            String validar = scanner.nextLine();

            if (validar.equals("Si") || validar.equals("si") || validar.equals("SI")) {
                ingresarPersonas();
                System.out.println("\n");
            } else {
                listarPersonas();
            }

        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void listarPersonas() {
            int count = 1;
            System.out.println("\n Lista de personas ingresadas: \n");
            for (Persona persona : listaPersonas) {
                System.out.println(count + ": " + persona);
                count++;
            }
            System.out.println("\n EL PROGRAMA HA FINALIZADO!!!");
    }
}