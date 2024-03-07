package ej.Ejercicios;
import java.io.*;

public class Ejercicio11 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            // Solicitar dimensiones de las matrices
            int[] dimensionesA = solicitarDimensiones("Matriz A", reader);
            int[] dimensionesB = solicitarDimensiones("Matriz B", reader);

            // Solicitar valores de las matrices
            double[][] matrizA = solicitarValores("Matriz A", dimensionesA, reader);
            double[][] matrizB = solicitarValores("Matriz B", dimensionesB, reader);

            // Multiplicar matrices
            double[][] resultado = multiplicarMatrices(matrizA, matrizB);

            // Imprimir matrices y resultado
            imprimirMatriz("Matriz A", matrizA);
            imprimirMatriz("Matriz B", matrizB);
            imprimirMatriz("Resultado de la multiplicación", resultado);

    }

    // Función para solicitar las dimensiones de una matriz
    public static int[] solicitarDimensiones(String nombreMatriz, BufferedReader reader){
        System.out.println("Ingrese las dimensiones de la matriz " + nombreMatriz);
        System.out.print("Filas: ");
        int filas = Integer.parseInt(reader.readLine());
        System.out.print("Columnas: ");
        int columnas = Integer.parseInt(reader.readLine());
        return new int[]{filas, columnas};
    }

    // Función para solicitar los valores de una matriz
    public static double[][] solicitarValores(String nombreMatriz, int[] dimensiones, BufferedReader reader) throws IOException {
        System.out.println("Ingrese los valores de la matriz " + nombreMatriz);
        int filas = dimensiones[0];
        int columnas = dimensiones[1];
        double[][] matriz = new double[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Valor en la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = Double.parseDouble(reader.readLine());
            }
        }
        return matriz;
    }

    // Función para multiplicar dos matrices
    public static double[][] multiplicarMatrices(double[][] matrizA, double[][] matrizB) {
        int filasA = matrizA.length;
        int columnasA = matrizA[0].length;
        int filasB = matrizB.length;
        int columnasB = matrizB[0].length;

        if (columnasA != filasB) {
            System.out.println("No se pueden multiplicar las matrices debido a dimensiones incompatibles.");
            return null;
        }

        double[][] resultado = new double[filasA][columnasB];

        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                for (int k = 0; k < columnasA; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        return resultado;
    }

    // Función para imprimir una matriz
    public static void imprimirMatriz(String nombreMatriz, double[][] matriz) {
        System.out.println("Matriz " + nombreMatriz + ":");
        for (double[] fila : matriz) {
            for (double valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}



    

