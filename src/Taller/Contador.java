package Taller;

import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.util.Arrays;

public class Contador {

    public void leerArchivo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese ruta completa del archivo");
        String ruta = leer.nextLine();
        Path directorio = Paths.get(ruta);
        String[] aTexto;
        try {
            aTexto = new String(Files.readAllBytes(directorio)).split("\n");
            System.out.println("El contenido del archivo es:");
            System.out.println(String.join("\n", aTexto));
            contarArchivo(aTexto);
        } catch (IOException e) {
            System.out.println("El archivo no pudo ser leido");
            leerArchivo();
        }
        System.out.println("Operacion terminada.");
    }

    private void contarArchivo(String[]texto) {
        long nChar;
        long nLineas;
        long nPalabras;
        
            nPalabras = (String.join(" ", texto)).split(" ").length;
            nLineas = texto.length;
            nChar = (String.join(" ", texto).length()) - 2*(nLineas - 1);
            System.out.println("numero caracteres = " + nChar);
            System.out.println("numero palabras = " + nPalabras);
            System.out.println("numero lineas = " + nLineas);
       

    }
}
