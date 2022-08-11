
package Tarea;

import java.util.Scanner;

public class Ejercicio11 {

   //Dado un (1) número de cuatro (4) dígitos imprimirlo por separado en unidades,
// decenas, centenas y unidades de mil.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int mill,cen,dec,uni=0;
    System.out.print("Ingrese un numero: ");
    int num=input.nextInt();
    
    uni=num%10;
     num=num/10;
      dec=num%10 ;
        num=num/10;
      cen=num%10;
         mill=num/10 ;
	
	
	
       System.out.println( " Unidades de MIll=  " + mill);
	 System.out.println( " Centenas=  " + cen);
	 System.out.println( " Decenas=  " +dec);
	 System.out.println ( " Unidades=  " + uni);
}
}
