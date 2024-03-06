package ej.Ejercicios;

public class Ejercicio5 {
    public static void main(String[] args) {
        int n = 10; // Número de tablas de multiplicar a generar
        int[][] tablas = generarTablasDeMultiplicar(n);

        // Mostrar las tablas de multiplicar generadas
        for (int i = 0; i < tablas.length; i++) {
            System.out.println("Tabla de multiplicar del " + i + ":");
            for (int j = 0; j < tablas[i].length; j++) {
                System.out.println(i + " x " + j + " = " + tablas[i][j]);
            }
            System.out.println(); // Imprimir una línea en blanco entre tablas
        }
    }

    public static int[][] generarTablasDeMultiplicar(int n) {
        int[][] tablas = new int[10][n];

        for (int i = 0; i < tablas.length; i++) {
            for (int j = 0; j < n; j++) {
                tablas[i][j] = i * j;
            }
        }

        return tablas;
    }
}

            