package ej.Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio14 {
    public static void main(String[] args) {
        BufferedReader buffer= new BufferedReader(new InputStreamReader(System.in));
        String cadena = leerCadena(buffer);

        if (palindromo(cadena)){
            System.out.println("La palabra introducida es un palíndromo.");
        } else {
            System.out.println("La palabra introducida no es un palíndromo.");
        }
        
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

    public static boolean palindromo (String cadena) {
        String palabraInvertida = "";
        for (int i=cadena.length()-1; i>=0; i--){
            palabraInvertida = palabraInvertida+cadena.charAt(i);
        }
        if (cadena.equals(palabraInvertida)){
            return true;
        } else {
            return false;
        } 
    }
}
    
