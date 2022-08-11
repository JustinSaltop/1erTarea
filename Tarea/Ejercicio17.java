
package Tarea;

public class Ejercicio17 {
//En un estacionamiento el monto a pagar se calcula multiplicando el número de
//horas que permaneció el automóvil dentro del estacionamiento por Bs. 4 y se
//incrementa esta cantidad en Bs. 2,50 por cada media hora adicional.
//Ahora se desea que usted elabore un algoritmo que a partir de la hora de entrada
//y la hora de salida de un vehículo (las mismas corresponden a un mismo día)
//calcule el monto a pagar por el dueño del vehículo.
//La entrada vendrá dada por dos enteros positivos el primero representa las horas
//y el segundo los minutos, además por último se debe leer un carácter (A o P) que
//indica si la hora es AM o PM.
    public static void main(String[] args) {
      java.util.Scanner input=new java.util.Scanner(System.in);
        int horas=0;
        int bs=4;
       int bs2= 0;
       double total ;
        System.out.println("Ingrese el total de horas");
        horas=input.nextInt();
        
        if (horas >= 1) {
          total= horas * 4;
          System.out.println("El numero de horas "+horas);
        } else {
            if (horas > 3 && horas <= 24) {
//            precio = (3 * 4) + ((horas - 3) * 2.50);
//            if (horas == 24) {
//                precio = 4;
//            }
//        } else if (horas > 24) {
//            precio = ((int) (horas / 24)) * 250 + (horas % 24 * 15);
//        }
      
    }}
        
    }
    
}
