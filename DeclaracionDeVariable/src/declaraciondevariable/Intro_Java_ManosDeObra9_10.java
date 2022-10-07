/*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package declaraciondevariable;

import java.util.Scanner;

/**
 *
 * @author lf531
 */
public class Intro_Java_ManosDeObra9_10 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingresemos Numeros . Segun cuantos * quieras que se impriman");
        int num = read.nextInt();
        int num1 = read.nextInt();
        int num2 = read.nextInt();
        int num3 = read.nextInt();

        System.out.println("Mostramos ");
        System.out.print(num);
        for (int i = 0; i < num; i++) {

            System.out.print(" *");
        }
        System.out.println("  ");
        System.out.print(num1);
        for (int i = 0; i < num1; i++) {

            System.out.print(" *");
        }
        System.out.println("  ");
        System.out.print(num2);
        for (int i = 0; i < num2; i++) {
             System.out.print(" *");
           
        }
        System.out.println("  ");
        System.out.print(num3);
        for (int i = 0; i < num3; i++) {
        System.out.print(" *");
            
        }

    }

}
