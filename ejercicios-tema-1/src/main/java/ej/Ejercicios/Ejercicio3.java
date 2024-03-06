package ej.Ejercicios;

public class Ejercicio3 {
    public static void main(String[] args) {
        int inicio=1;
        int fin =100;

        int []multiplosDe5= obtenerMultiplosDe5(inicio, fin);
        int suma= sumarArray(multiplosDe5);
        
        System.out.println("Los múltiplos de 5 entre " + inicio + " y " + fin + " son:");
        for (int num : multiplosDe5) {
            System.out.print(num + " ");
        }
        System.out.println();

    
        System.out.println("La suma de los multiplos de 5 comprendidos entre 1 y 100 es: "+suma);
    }

    public static int[] obtenerMultiplosDe5 (int inicio, int fin){
        int []prueba = new int [fin];
        int numero = 0;
        for (int i = inicio; i <= fin; i++) {
            if (i % 5 == 0) {
                prueba[numero]=i;
                numero++;
            }
        }
        return prueba;
    }

    public static int sumarArray(int []array){
        int sum=0;
        for (int h=0; h<100; h++){
            sum= sum + array[h];
        }
        return sum;
    }
}

  

