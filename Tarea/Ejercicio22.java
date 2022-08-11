
package EJERCICIOS;

import java.io.IOException;
import java.util.Scanner;


public class Ejercicio22 {

 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int num;
        int cifras;
        char car;
        do {
            System.out.print("Introduce un número entero: ");
            num = input.nextInt();
            cifras = 0;    
            while (num != 0) {             
                num = num / 10;         
                cifras++;          
            }
            System.out.println("El número cuenta con  " + cifras + " cifras");
            System.out.print("Desea Continuar? ");
            car = (char) System.in.read();
        } while (car != 'n' && car != 'N');
    }
}
    
