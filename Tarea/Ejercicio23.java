
package EJERCICIOS;

import javax.swing.JOptionPane;

public class Ejercicio23 {

    public static void main(String[] args) {
        int num;
        int ivld;
        int auxiliar;
        int digito;
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingresar un Numero : "));
        ivld = 0;
        auxiliar = num;
        while (auxiliar > 0) {
            digito = auxiliar % 10;
            ivld = ivld * 10 + digito;
            auxiliar = auxiliar / 10;
        }
        if (num == ivld) {
            JOptionPane.showMessageDialog(null, "El numero es capicua");
        } else {
            JOptionPane.showMessageDialog(null, "El numero no es capicua");
    }
    
    }
}
