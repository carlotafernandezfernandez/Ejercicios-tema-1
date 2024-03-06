package ej.Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int []array= new int [100];

        System.out.println("Introduzca un numero: ");
        int numero = scanner.nextInt();

        int n = 0;
        while (numero >= 0) {
            array[n] = numero;
            n++;
        }

        @SuppressWarnings("unused")
        int maximo = calcularMaximo(array);
        @SuppressWarnings("unused")
        int minimo = calcularMinimo(array);
    }

    public static int calcularMinimo (int []array){
        int minim = Integer.MAX_VALUE;
            for (int numero : array) {
                if (numero < minim) {
                    minim = numero;
                }
            }
            return minim;
        }

        public static int calcularMaximo(int[] array) {
            int maxim = Integer.MIN_VALUE;
            for (int numero : array) {
                if (numero > maxim) {
                    maxim = numero;
                }
            }
            return maxim;
        }
    }
    
