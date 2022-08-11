
package Tarea;

public class Ejercicio2 {

//Ejercicio 2.
//¿Siguiendo la prioridad de operadores, convierta a expresión matemática,
//resuelva e indique en cuál tipo de variable almacenará el resultado de las
//siguientes expresiones:

    public static void main(String[] args) {
        boolean rslt1 = (5+3*2)+9>3*5*14%3;
        double sl = 2*(4-10+8)/2*36*(1/2);
        double rslt2 = 260 / 12 + 54 % 3 - 85 % 7;
        boolean rslt3 = (48<2*3) || (2*7<12);
        boolean  rslt4 =((8>2) || (932<23)) && 4==2;

        System.out.println("Solucion: "+rslt1);
        System.out.println("Solucion: "+sl);
        System.out.println("Solucion: "+rslt2);
        System.out.println("Solucion: "+rslt3);
        System.out.println("Solucion: "+rslt4);
    }
    
}
