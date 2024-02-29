public class Ejercicio1 {
    public static void main (String[]args){
        short dias_anio= 365;
        short horas_dia=60;
        short minutos_hora=60;
        short segundos_minuto=60;

        calculo(dias_anio, horas_dia, minutos_hora, segundos_minuto);
        System.out.println("Los segundos que hay en un anio son: "+calculo);

        //short final= calculo(dias_anio, horas_dia, minutos_hora, segundos_minuto);
        //System.out.println("Los segundos que hay en un anio son: "+final);
        
    }

    public short calculo (short dias, short horas, short minutos, short segundos){
        short resultado= dias*horas*minutos*segundos;
        return resultado;
    }
}