package ej.Ejercicios;

import java.io.*;
@SuppressWarnings("unused")

public class Ejercicio10 {
    public static void main(String[] args) throws IOException {
        System.out.println("Introduzca la dimension 1 de la matriz: "); 
        String stringLeido;
        BufferedReader consola= new BufferedReader(new InputStreamReader(System.in));
        stringLeido = consola.readLine();
        int dimension1= Integer.parseInt (stringLeido);

        int [][] matriz= new int [dimension1][dimension1];

        rellenarMatriz(matriz, dimension1);
        imprimirMatriz(matriz, dimension1);
    }

    public static void rellenarMatriz(int[][] matriz, int dimension) {
        for (int i = 0; i < dimension; i++) {
            for (int j = i; j < dimension; j++) {
                int numeroAleatorio = (int) (Math.random() * 100) + 1; // Generar número aleatorio entre 1 y 100
                matriz[i][j] = numeroAleatorio;
                matriz[j][i] = numeroAleatorio; // Hacer la matriz simétrica
            }
        }
    }
    
    public static void imprimirMatriz(int[][] matriz, int dimension) {
        System.out.println("Matriz generada:");
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
}
