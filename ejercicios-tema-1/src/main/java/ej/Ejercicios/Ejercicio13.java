package ej.Ejercicios;

import java.io.*;

public class Ejercicio13 {
    public static void main(String[] args) {
        BufferedReader buffer= new BufferedReader(new InputStreamReader(System.in));
        String cadena = leerCadena(buffer);
        String cadenaInvertida = invertirCadena(cadena);
        System.out.println("La cadena invertida es: " + cadenaInvertida);
    }

    public static String leerCadena(BufferedReader buffer) {
        System.out.println("Introduce una cadena de caracteres:");
        try {
            return buffer.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String invertirCadena (String cadena) {
        String palabraInvertida = "";
        for (int i=cadena.length()-1; i>=0; i--){
            palabraInvertida = palabraInvertida+cadena.charAt(i);
        }
        return palabraInvertida;
    } 
}
