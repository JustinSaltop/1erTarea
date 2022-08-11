
package Tarea;

import java.util.Scanner;

public class Ejercicio6 {
//Dados dos (2) lados de un triángulo en cm, calcular la hipotenusa del mismo.

    public static void main(String[] args) {

Scanner input=new Scanner(System.in);
double hypo = 0;
//Preguntamos al usuario el valor de los catetos
System.out.print("Valor cateto A: ");
double a=input.nextDouble();
System.out.print("Valor cateto B: ");
double b=input.nextDouble();
hypo = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

Math.hypot(a,b);
//Servimos el platillo :3
System.out.println("--------------------------");
System.out.println("Valor de Hipotenusa: "+hypo);
}
}