
package EJERCICIOS;

import java.util.Scanner;

public class Ejercicio29 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        int edd = 0;
        double promedio = 0;
        int cntdr = 0;
        double suma = 0;

        System.out.println("ingrese una edad: ");
        edd = input.nextInt();
        suma += solicitar(edd);
        while (edd != 0) {
            System.out.println("ingrese una edad: ");
            edd = input.nextInt();
            suma += solicitar(edd);
            if (edd > 18) {
                cntdr++;
            }
            System.out.println("Digite 0 para poder finalizarla.......");
        }
        promedio = suma / cntdr;
        System.out.println("El promedio calculado es de : " + promedio);
    }

    public static double solicitar(int edad) {
        if (edad > 18) {
            return edad;
        } else {
            return 0;
        }
    }
    
}
