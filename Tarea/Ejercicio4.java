
package Tarea;
//import java.lang.Math; 
import java.util.Scanner;

//Dados dos (2) números calcule la suma, resta, multiplicación, división y módulo.
public class Ejercicio4 {

    public static void main(String[] args) {
        //Entrada
      Scanner scanner = new Scanner (System.in);
    double numero1;
    double numero2;
// EMTRADA 
    System.out.println("Escribe dos números para obtener el resultado de su suma, "
            + "resta, multiplicación y división");
    System.out.print("Digite su primer numero : ");
      numero1 = scanner.nextDouble();
    System.out.print("Digite su segundo numero : ");
      numero2 = scanner.nextDouble();
// SALIDA
    System.out.println("La suma de estos números es " + (numero1 + numero2));
    System.out.println("La resta de estos números es " + (numero1 - numero2));
    System.out.println("La multiplicación de estos números es " + (numero1 * numero2));
    System.out.println("La división de estos números es " + (numero1 / numero2));
//    System.out.println(Math.floorMod(numero1, numero2));
  System.out.println("EL Mod de estos números es " + (numero1 % numero2));
  }
    }
    