
package Tarea;

import java.util.Scanner;
//Todos los años que se dividen exactamente entre 400, o que son divisibles
//exactamente entre 4 y no son divisibles exactamente entre 100 son años bisiestos.
//Usando estas premisas crea un algoritmo que lea una fecha como un número
//entero con el formato ddmmaaaa, y luego extraiga el año de la fecha indicando si
//el mismo es un año bisiesto o no
public class Session12 {
   public static void main(String[] args) {

         Scanner input=new Scanner(System.in);


         System.out.print("Ingrese un año : ");
                int anio=input.nextInt();
        
         if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))){
	System.out.println("El año es bisiesto");
         }else{
	System.out.println("El año no es bisiesto");
   }
   }
   }
  

    

