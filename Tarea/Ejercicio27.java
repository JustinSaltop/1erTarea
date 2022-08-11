
package EJERCICIOS;

public class Ejercicio27 {

    public static void main(String[] args) {
      String num0 = "", num1 = "", num2 = "", num3 = "", num4 = "", num5 = "", num6 = "";
        for (int i = 0; i <= 6; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == 0) {
                    num0 = "|" + i + "|" + j + "| ";
                } else if (i == 1) {
                    num1 += "|" + i + "|" + j + "| ";
                } else if (i == 2) {
                    num2 += "|" + i + "|" + j + "| ";
                } else if (i == 3) {
                    num3 += "|" + i + "|" + j + "| ";
                } else if (i == 4) {
                    num4 += "|" + i + "|" + j + "| ";
                } else if (i == 5) {
                    num5 += "|" + i + "|" + j + "| ";
                } else if (i == 6) {
                    num6 += "|" + i + "|" + j + "| ";
                }
            }

        }
        System.out.println(num0);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
    }
    
}
