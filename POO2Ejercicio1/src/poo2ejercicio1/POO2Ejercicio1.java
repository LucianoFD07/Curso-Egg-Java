/*
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList. 

 */
package poo2ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author lf531
 */
public class POO2Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");

        ArrayList<String> perros = new ArrayList();
        String raza, rep;

        System.out.println("******************************************");
        System.out.println("INGRESEMOS RAZAS DE  PERROS");
        System.out.println("******************************************");

        do {

            perros.add(read.next());
            System.out.println("DESEA AGREGAR MAS RAZAS (SI)---(NO)");
            rep = read.next();
            if (rep.equalsIgnoreCase("no"));
            System.out.println("INGRESEMOS OTRAS RAZA ");
        } while (rep.equalsIgnoreCase("si"));
        System.out.println(perros);
    }
}
