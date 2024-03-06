package ej.Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Introduzca un numero: ");
        int numero = scanner.nextInt();

        int [] factores = Descomposicion (numero);

        System.out.print(numero + " = ");
        for (int i = 0; i < factores.length; i++) {
            System.out.print(factores[i]);
            if (i < factores.length - 1) {
                System.out.print(" * ");
            }
        }
    }

    public static int []Descomposicion (int numero){
        int[] factoresPrimos = new int[10]; 
        int indice = 0;
        int divisor = 2;

        while (numero > 1) {
            while (numero % divisor == 0) {
                factoresPrimos[indice] = divisor;
                indice++;
                numero = numero / divisor;
            }
            divisor++;
        }
        return factoresPrimos;
    }
    }
