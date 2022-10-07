/*
 *Crear un programa que dado un numero determine si es par o impar
 */
package declaraciondevariable;

import java.util.Scanner;

/**
 *
 * @author lf531
 */
public class Intro_Java_Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read =new Scanner(System.in);
        System.out.println("Ingresemos un numero y determinemos si es par e impar");
        int numero=read.nextInt();
        if (numero/2==0) {
            System.out.println("El numero ingresado es par :"+numero);
            
        }else{
            System.out.println("El numero ingresado es impar :"+numero);
        }
        
    }
    
}
