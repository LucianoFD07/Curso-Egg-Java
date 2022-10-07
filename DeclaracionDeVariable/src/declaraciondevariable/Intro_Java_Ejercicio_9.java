/*
 *Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java.
 */
package declaraciondevariable;

import java.util.Scanner;

/**
 *
 * @author lf531
 */
public class Intro_Java_Ejercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        
            System.out.println("ingresemos una frase o letra  ");
            System.out.println("Si la primera vocal de frase o letra es A se imprimira CORRECTO ");
            String frase = read.nextLine();
            String primera = frase.substring(0, 1);
            if (primera.equals("A")) {
                System.out.println("CORRECTO");
            }else{
                System.out.println("INCORRECTO");
            }
        
        
    }
    
}
