/*
 * Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
alguno de ellos es mayor a 25.
 */
package declaraciondevariable;

import java.util.Scanner;

/**
 *
 * @author lf531
 */
public class Intro_Java_ManosDeObra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int numero1;
        int numero2;
        System.out.println("Ingrese dos numero enteros");
        numero1 = read.nextInt();
        numero2= read.nextInt();
       
        if (numero1 >= numero2) {
             System.out.println("El numero mayor a 25 es :");
            System.out.println(numero1);
        }else{
            System.out.println("No es mayor");
        }
        }
    }
    
