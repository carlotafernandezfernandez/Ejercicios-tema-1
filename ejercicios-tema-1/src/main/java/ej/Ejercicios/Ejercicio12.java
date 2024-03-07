package ej.Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio12 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer= new BufferedReader(new InputStreamReader(System.in));
       String cadena = leerCadena(buffer);
       int numeroVocales = contarVocales(cadena);

       System.out.println("La palabra introducida es " +cadena+ " y tiene " +numeroVocales+ " vocales.");

    }

    public static String leerCadena (BufferedReader buffer) throws IOException{
        System.out.println("Introduzca una cadena de caracteres: ");
        String stringLeido;
        stringLeido = buffer.readLine();
        return stringLeido;
    }

    public static int contarVocales(String cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (esVocal(caracter)) {
                contador++;
            }
        }
        return contador;
    }
    
    public static boolean esVocal(char caracter) {
        if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'){
            return true;
        } return false;
        
}
}
