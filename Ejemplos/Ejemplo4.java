import java.util.*; 

public class Ejemplo4 {
    public static void main (String[]args){
        Random rand= new Random ();

        int i= rand.nextInt() % 100;
        int j= rand.nextInt() % 100;

        prt ("i= "+i);
        prt ("j= "+j);
    }

    static void prt(String s){
        System.out.println(s);
    }
}