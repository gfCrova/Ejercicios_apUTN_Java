package com.argPrograma;

import com.argPrograma.Entidades.Usuario;
import com.argPrograma.Services.MsjService;
import com.argPrograma.Services.PathService;

import java.io.*;
import java.util.*;

public class ChatMain {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        PathService pathMsj = new PathService();

        // Solicitar nombre de usuario
        System.out.println("Ingrese su nombre de usuario:");
        String name = sc.nextLine();
        Usuario user = new Usuario(name);

        // Mostrar menú
        while (true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Escribir mensaje");
            System.out.println("2. Leer mensajes");
            System.out.println("3. Salir");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> MsjService.escribirMensaje(user, pathMsj);
                case 2 -> MsjService.leerMensajes(user, pathMsj);
                case 3 -> System.exit(0);
                default -> System.out.println("Opción inválida");
            }
        }
    }
}
