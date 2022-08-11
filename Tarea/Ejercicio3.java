
package Tarea;

import javax.swing.JOptionPane;


public class Ejercicio3 {

    //Ejercicio
    public static void main(String[] args) {
          int x1 = 0;
        int x2 = 0;
        int a = 350;
        int b = 24;
        int c = 5;
        x1 = (a + (b / c)) / ((a / b) + c);
        x2 = (a / (a + b)) / (a / (a - b));

        JOptionPane.showMessageDialog(null, "El resultado de la operacion es : " + x1
                + " \n y el segundo resultado es : " + x2);
    }
    
}
