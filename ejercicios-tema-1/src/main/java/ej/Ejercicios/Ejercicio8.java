package ej.Ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner (System.in);
        int [] array = new int [100];

        System.out.println("Introduzca un numero (con el 0 se terminara la posibilidad de introducir numeros): ");
        int numero;
        while ((numero = scanner.nextInt()) != 0){
            for (int i =0; i<array.length; i++){
                array [i]= numero;
            }
        }
        
        int media= calcularMedia(array);
        int minimo= calcularMinimo(array);
        int maximo= calcularMaximo(array);

        System.out.println("La media de los números es: " + media);
        System.out.println("El mínimo de los números es: " + minimo);
        System.out.println("El máximo de los números es: " + maximo);

    }
    
    public static int calcularMedia(int []array){
        int suma= 0;
        for (int i=0; i<array.length; i++){
            suma= suma + array[i];
        }
        return suma/array.length;
    }

    public static int calcularMinimo(int[] array) {
        int minimo = array[0]; 
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimo) {
                minimo = array[i];
            }
        }
        return minimo;
    }

    public static int calcularMaximo(int[] array) {
        int maximo = array[0]; 

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maximo) {
                maximo = array[i];
            }
        }

        return maximo;
    }

    }
