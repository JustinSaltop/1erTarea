
package Tarea;

import java.util.Scanner;

public class Ejercicio15 {
//Para un valor entero positivo que representa una cantidad en segundos, indicar
//su equivalente en minutos, horas y días.

    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int num,min,hora,seg=0;
        int dia=0;
        System.out.print("Ingrese una cantidad en segundos : ");
        num=input.nextInt();
        dia=num/86400;
        hora=num/3600;
        min=(num-(hora*3600))/60;
        seg=(num- ((hora * 3600)+ (min*60)));
        System.out.println("Los dias son = "+dia);
        System.out.println("Las horas son = "+hora);
        System.out.println("Los minutos son = "+min);
         System.out.println("Los segundo son = "+seg);
    }
    
}
