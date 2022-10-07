/*
 * Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java
 */
package declaraciondevariable;

import java.util.Scanner;

/**
 *
 * @author lf531
 */
public class Intro_Java_Ejercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner read= new Scanner(System.in);
        System.out.println("Ingresemos una frase de 8 caracteres si se pasa saldra Incorreto ");
        String frase=read.nextLine();
        int Long=frase.length();
        
        if (Long<=8) {
            System.out.println("CORRECTO");
        }else{
            System.out.println("INTORRECTO");
        }
    }
    
  
    } 

