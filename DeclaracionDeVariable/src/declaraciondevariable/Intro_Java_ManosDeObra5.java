/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package declaraciondevariable;

import java.util.Scanner;

/**
 *
 * @author lf531
 */
public class Intro_Java_ManosDeObra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner read = new Scanner(System.in);
        char letra;
        double numero;
        boolean verdadero=true;
        
        System.out.println("Letra char");
        letra=read.next().charAt(0);
        System.out.println(letra);
        System.out.println("Numero double");
        numero=read.nextDouble();
        System.out.println(numero);
        System.out.println("Verdadero boolean");
        verdadero=false;
        System.out.println(verdadero);
    }
    
}
