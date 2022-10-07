/*
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla
 */
package declaraciondevariable;

import java.util.Scanner;

/**
 *
 * @author lf531
 */
public class Intro_Java_Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        String nombre;
        
        System.out.println("Ingrese su nombre ");
        nombre=read.next();
        System.out.println("El nombre Ingresado es :"+nombre);
    }
    
}
