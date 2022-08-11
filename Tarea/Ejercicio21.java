
package EJERCICIOS;

import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        double Mntcmpr;
        double Descu = 0.020;
        double Totalp;

        System.out.print("Ingrese el monto de su compra : ");
        Mntcmpr = input.nextDouble();
        input.nextLine();

        Descu = Mntcmpr * 0.020;
        Totalp= Mntcmpr-Descu;
        
        if (Mntcmpr <= 999) {
            System.out.println("No hay ningun DESCUENTO ");
            System.out.println("EL total a pagar de la compra: "+Mntcmpr+"$");
        } else if (Mntcmpr >= 1000) {
            System.out.println("Su descuento del 20% es de: "+Descu +"$");
             System.out.println("El total a pagar es de: "+Totalp);
        }
    }
    
}
