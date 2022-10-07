/*
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.

 */
package declaraciondevariable;

import java.util.Scanner;

/**
 *
 * @author lf531
 */
public class Intro_Java_Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingresemos la contraseña correcta");
        String frase = read.nextLine();
        
        String frase1 = new String("eureka");
        String frase2 = new String(frase);
        
        if (frase2.equals(frase1)) {
            System.out.println("Ingreso la contraseña correcta");
            
        }else{
            System.out.println("Contraseña incorrecta , intentelo nuevamente");
        }
    }
    
}
