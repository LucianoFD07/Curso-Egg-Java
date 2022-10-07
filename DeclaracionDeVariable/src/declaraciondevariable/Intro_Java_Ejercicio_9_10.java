/*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package declaraciondevariable;

import java.util.Scanner;


public class Intro_Java_Ejercicio_9_10 {

    
    public static void main(String[] args) {
         Scanner read = new Scanner(System.in);
        int num1 ;
        int numM ;
        num1 =0;
        System.out.println("INGRESE NUMERO MAXIMO");
        numM = read.nextInt();
        System.out.println(" INGRESEMOS NUMERO HASTA SUPERAR EL MAXIMO");
        do {
            num1+=read.nextInt();
        } while (num1<=numM);
          
        System.out.println("EL numero maximo es  :" +numM+ " CON LA SUMA DE " +num1); 
        
    }
    
}
