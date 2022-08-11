
package EJERCICIOS;

import java.util.Scanner;

public class Ejercicio28 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        int Num = 0;
        double suma = 0;
        double promedio = 0;
        int contador = 0;

                 System.out.println("ingrese un numero: ");
                 Num = input.nextInt();

                  suma += Num;

                      while (Num != 0) {
                            System.out.println("ingrese un numero: ");
                                Num = input.nextInt();
                                  suma += Num;
                                    contador++;
                                              }
                                          promedio = suma / contador;
                                                  System.out.println("El promedio es: " + promedio);
    }
    
}
