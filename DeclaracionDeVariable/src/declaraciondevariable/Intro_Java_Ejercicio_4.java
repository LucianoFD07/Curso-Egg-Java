/*
 *  Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5
 */
package declaraciondevariable;

import java.util.Scanner;

/**
 *
 * @author lf531
 */
public class Intro_Java_Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner leer = new Scanner(System.in);
        double f, c;
        System.out.println("INGRESE LOS GRADOS A COMVERTIR");
        c = leer.nextDouble();

        f = 32 + (9 * c / 5);
        System.out.println(c + ", GRADOS EQUIVALEN A , " + f + " ,GRADOS FAHRENHEIT");
    }
    
}
