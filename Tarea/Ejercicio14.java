
package Tarea;

import java.util.Scanner;

public class Ejercicio14 {

   //Cree un algoritmo que tome por entrada las horas y minutos de un día y dé como
//resultado su equivalente en segundos.
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int hora,min, seg,seg1;
    
    System.out.print("Ingrese la cantidad de horas : ");
    hora=input.nextInt();
    System.out.print("Ingrese la cantidad de minutos : ");
    min=input.nextInt();
    
    seg=hora*3600;
    seg1=min*60;
    
    System.out.println("La cantidad de segundos que ahi en las "+hora+" horas es de  "+seg+"seg.");
        System.out.println("Y la  cantidad de segundos que ahi en los  "+min+" minutos es de "+seg1+"seg.");
    
}
  
    
    
} 
    
    

