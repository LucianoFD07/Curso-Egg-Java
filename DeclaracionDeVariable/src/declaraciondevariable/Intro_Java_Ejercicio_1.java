/*
 Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */
package declaraciondevariable;

import java.util.Scanner;


public class Intro_Java_Ejercicio_1 {

   
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int numero1;
        
        int numero2;
        
        System.out.println("Ingresemos 2 numeros");
        System.out.println("Primer numero");
        numero1=read.nextInt();
        System.out.println("Segundo numero");
        numero2=read.nextInt();
       
        System.out.println("La suma de los numero pedidos son ..");
        System.out.println(numero1+numero2);
    }
    
}
