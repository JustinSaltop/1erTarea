
package Tarea;

import java.util.Scanner;


public class Ejercicio16 {

//   Dados tres números enteros positivos A, B y C, determine ¿cuál de ellos es el
//mayor? y ¿cuál es el segundo mayor?
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, n3;
        System.out.print("Ingrese el  primer número: ");
        n1 = input.nextInt();
        System.out.print("Ingrese el  segundo número: ");
        n2 = input.nextInt();
        System.out.print("Ingrese el  tercer número: ");
        n3 = input.nextInt();
        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("El primer numero mayor es: " + n1);                                             
            } else {
                System.out.println("El primer numero  mayor es: " + n3);     
            }
        } else if (n2 > n3) {
            System.out.println("El primer numero  mayor es: " + n2);
        } else {
            System.out.println("El primer numero mayor   es: " + n3);
            //segundo numero mayor 
        }if (n1 > n2) {
            if (n1 < n3) {
                System.out.println("El segundo numero mayor es: " + n1);                                             
            } else {
                System.out.println("El segundo numero mayor es: " + n3);     
            }
        } else if (n2 > n1) {
             if (n2 < n3) {

            System.out.println("El segundo numero mayor es: " + n2);
        } else{
                 System.out.println("El segundo numero mayor es: " + n1);
             if (n3 > n1) {
             if (n3 < n2) {

            System.out.println("El segundo numero mayor es: " + n3);
        }
    }
}
    }
}
}

    
    

