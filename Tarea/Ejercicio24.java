
package EJERCICIOS;
importar  Java . útil _ escáner ;

public class Ejercicio24 {

    public static void main(String[] args) {
        Entrada de escáner = nuevo  escáner ( System . in )
        intN  = 0 ; _
        String  palabra = "" ;
        sistema _ fuera _ println ( "ingrese la contraseña" );
        palabra = entrada . siguienteLinea ();
        N = palabra . longitud ();
            mientras ( norte != 10 ) {
                sistema _ fuera _ println ( "Cantidad de digitos tienen que ser 10, vuelva a ingresarla" );
                sistema _ fuera _ println ( "ingrese la contraseña" );
                palabra = entrada . siguienteLinea ();
                N = palabra . longitud ();
            }
             sistema _ fuera _ println ( "La contraseña es valida" );
    }
    
}