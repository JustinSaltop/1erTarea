
package Tarea;

import java.util.Scanner;


public class Ejercicio18 {
//El IMC resulta de la división de la masa del individuo (en kilogramos) entre el
//cuadrado de la estatura (en metros). El índice de masa corporal es un indicador
//del peso de una persona en relación con su altura.
//Clasificación del IMC de acuerdo con la OMS de la ONU:
//a. Menor a 16: Criterio de ingreso.
//b. 16 a 16.9: infra peso.
//c. 17 a 18.4: bajo peso.
//d. 18.5 a 24.9: peso normal.
//e. 25 a 29.9: sobrepeso.
//f. 30 a 34.9: obesidad pre-mórbida.
//g. 40 a 45: obesidad mórbida.
//h. Mayor a 45: obesidad híper-mórbida.

//  Dado el peso de una persona en libras (1 libra = 0,453592 Kg) y su estatura en
//centímetros, calcule su IMC e indique como salida el peso en kilogramos, el valor
//de IMC de la persona y la categoría en la cual fue clasificado.

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int peso=0;
       int estatura=0;
         
       double imcp=0.0;
       double imce=0.0;
       double imc=0.0;
      
       System.out.println("Ingrese su peso: ");
       peso=Integer.parseInt(input.next());
       System.out.println("Ingrese su estatura: ");
       estatura=Integer.parseInt(input.next());
       
       imcp=peso*703;
       imce=estatura*estatura;
       imc=imcp/imce;
       if(imc<16){
           System.out.println("Su imc es: "+imc);
           System.out.println("Criterio de ingreso");
       }else{ 
           if(imc>=16 && imc<=16.9){
           System.out.println("Su imc es: "+imc);
           System.out.println("infra peso");
       }else{ 
           if(imc>=17 && imc<=18.4){
           System.out.println("Su imc es: "+imc);
           System.out.println("bajo peso");
       }else {
               if(imc>=18.5&& imc<=24.9){
           System.out.println("Su imc es: "+imc);
           System.out.println(" peso normal");
       }else {
                   if(imc>=25&& imc<=29.9){
           System.out.println("Su imc es: "+imc);
           System.out.println("sobrepeso");
       }else {
                       if(imc>=30&& imc<=34.9){
           System.out.println("Su imc es: "+imc);
           System.out.println("obesidad pre-Morfida");
       }else{ 
                           if(imc>=40&& imc<=45){
           System.out.println("Su imc es: "+imc);
           System.out.println("obesidad Morbida ");
       }else {
                               if(imc>45){
           System.out.println("Su imc es: "+imc);
           System.out.println("obesidad Hiper-Morbida ");
       }
       
                           }
                       }
                   }
               }
           }
           }
       }
    }
}

    

