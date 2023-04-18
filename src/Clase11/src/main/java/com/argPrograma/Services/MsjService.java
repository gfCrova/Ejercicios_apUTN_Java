package com.argPrograma.Services;

import com.argPrograma.Entidades.Mensaje;
import com.argPrograma.Entidades.Usuario;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class MsjService {

    public static void escribirMensaje(Usuario u, PathService p) throws IOException {

        // Solicitar mensaje
        Scanner sc = new Scanner(System.in);
        Mensaje mensaje = new Mensaje();

        System.out.println("Escriba su mensaje:");
        mensaje.setContenidoMsj(sc.nextLine());
        String texto = mensaje.getContenidoMsj();

        // Escribir mensaje en archivo
        try(BufferedWriter fileM = Files.newBufferedWriter(p.getPathMj(), StandardOpenOption.WRITE, StandardOpenOption.APPEND)) {
            fileM.write(u.getNombre() + ": " + texto + "\n");
            System.out.println("Mensaje enviado");
        }
    }

    public static void leerMensajes(Usuario u, PathService p) throws IOException {

        String mensajes = Files.readString(p.getPathMj());
        System.out.println(mensajes);
    }
}

