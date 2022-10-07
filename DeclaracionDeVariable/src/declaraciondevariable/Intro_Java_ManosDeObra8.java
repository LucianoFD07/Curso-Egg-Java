/*
 *Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
pedirá de nuevo hasta que la nota sea correcta.
 */
package declaraciondevariable;

import java.util.Scanner;

/**
 *
 * @author lf531
 */
public class Intro_Java_ManosDeObra8 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int nota;

        do {
            System.out.println("Ingresemos notas del 1 al 10");
            nota = read.nextInt();
            if (nota <= 10) {
                System.out.println("Correcto");
            }
        } while (nota > 10);
          
    }
}
