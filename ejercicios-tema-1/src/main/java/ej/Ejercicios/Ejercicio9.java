package ej.Ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud de los vectores: ");
        int dimension = scanner.nextInt();

        int[] vector1 = leerVector(scanner, dimension);
        int[] vector2 = leerVector(scanner, dimension);

        int productoEscalar = calcularProductoEscalar(vector1, vector2);

        System.out.println("Los valores del vector 1 son: ");
        for (int numero : vector1){
            System.out.println(numero);
        }
        System.out.println();
        System.out.println("Los valores del vector 2 son: ");
        for (int numero : vector2){
            System.out.println(numero);
        }
        System.out.println();

        System.out.println("El producto escalar de los dos vectores es: " + productoEscalar);
    }

    public static int[] leerVector(Scanner scanner, int dimension) {
        int[] vector = new int[dimension];
        System.out.print("Ingrese los elementos del vector: ");
        for (int i = 0; i < dimension; i++) {
            vector[i] = scanner.nextInt();
        }
        return vector;
    }

    public static int calcularProductoEscalar(int[] vector1, int[] vector2) {
        if (vector1.length != vector2.length) {
            System.out.println("error");
        }

        int productoEscalar = 0;
        for (int i = 0; i < vector1.length; i++) {
            productoEscalar= productoEscalar+ (vector1[i] * vector2[i]);
        }
        return productoEscalar;
    }        
    }




