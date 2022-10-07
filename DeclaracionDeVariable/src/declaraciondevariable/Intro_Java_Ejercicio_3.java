/*
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Jav
 */
package declaraciondevariable;

import java.util.Scanner;

/**
 *
 * @author lf531
 */
public class Intro_Java_Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String frase;//Declaramos una variable string
       
        System.out.println("Ingresemos una frase para que lo muestre en mayuscula o en minuscula");
        //Transformamos la frase en minuscula con tolowerCase
        //Transformamos la frase en Mayuscula con toUpperCase
        frase=read.next().toLowerCase().toUpperCase();
        System.out.println("Mostramos");
        System.out.println(frase);
    }
    
}
