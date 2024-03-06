package ej.Ejercicios;

public class Ejercicio6 {
    public static void main(String[] args) {
        int n=100;
        int[] numerosPrimos = encontrarPrimos(n);

        System.out.println("Los numeros primos del 1 al 100 son: ");
        for (int numero : numerosPrimos) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }

    public static int[] encontrarPrimos(int n) {
        int[] primos = new int[n];
        int contador = 0;
        int numero = 2; // Comenzamos desde el primer número primo
        
        // Iteramos hasta que hayamos encontrado los N primeros primos
        while (contador < n) {
            if (esPrimo(numero)) {
                primos[contador] = numero;
                contador++;
            }
            numero++;
        }
        return primos;
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
