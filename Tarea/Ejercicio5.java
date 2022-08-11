
package Tarea;

import java.util.Scanner;

public class Ejercicio5 {

//Dados tres (3) números, Hacer una aplicación que calcule la resolvente.
    public static void main(String[] args) {
        Scanner Double = new Scanner(System.in);
    double x1;
    double x2;
    
    System.out.println("Por favor, introduzca los valores.");
    System.out.print("a = ");
    double a = Double.nextDouble();
    System.out.print("b = ");
    double b;
        b = Double.nextDouble();
    System.out.print("c = ");
    double c = Double.nextDouble();
    
    
    // 0x^2 + 0x + 0 = 0
    
    if ((a == 0) && (b == 0) && (c == 0)) {
      System.out.println("Tiene infinitas soluciones.");
    }
    
    // 0x^2 + 0x + c = 0  con c distinto de 0
    
    if ((a == 0) && (b == 0) && (c != 0)) {
      System.out.println(" No tiene solución.");
    }
      
    // ax^2 + bx + 0 = 0  con a y b distintos de 0
    
    if ((a != 0) && (b != 0) && (c == 0)) {
      System.out.println("x1 = 0");
      System.out.println("x2 = " + (-b / a));
    }


    // 0x^2 + bx + c = 0  con b y c distintos de 0
    
    if ((a == 0) && (b != 0) && (c != 0)) {
      System.out.println("x1 = x2 = " + (-c / b));
    }

    // ax^2 + bx + c = 0  con a, b y c distintos de 0
    
    if ((a != 0) && (b != 0) && (c != 0)) {
        
      double discriminante = b*b - (4 * a * c);
      
      if (discriminante < 0) {
          System.out.println(" No tiene soluciones reales");
      }  else {
        System.out.println("x1 = " + (-b + Math.sqrt(discriminante))/(2 * a));
        System.out.println("x2 = " + (-b - Math.sqrt(discriminante))/(2 * a));
      }
    }

  }
}
