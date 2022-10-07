/*
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package declaraciondevariable;

import java.util.Scanner;

/**
 *
 * @author lf531
 */
public class Intro_Java_Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        double numero,numero1,numero2,raiz;
        
        System.out.println("Ingresemos un numero");
        numero=read.nextInt();
        System.out.println("El doble del numero es :");
        numero1=numero*2;
        System.out.println(numero1);
        System.out.println("El triple del numero es :");
        numero2=numero*3;
        System.out.println(numero2);
        System.out.println("La raiz cuadrada del numero es :");
        raiz=Math.sqrt(numero);
        System.out.println(numero);
                        
    }
    
}
