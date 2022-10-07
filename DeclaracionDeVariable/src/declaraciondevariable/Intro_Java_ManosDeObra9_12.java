/*
 * Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
segundo, sino informe que no lo son.
 */
package declaraciondevariable;

import java.util.Scanner;


public class Intro_Java_ManosDeObra9_12 {

    public static void main(String[] args) {
      Scanner read = new Scanner(System.in);//Creamos Scanner para ingresar por teclado la inf
        System.out.println("Ingresemos dos numero por teclado..");
      int numero = read.nextInt();//Definimos una variable Int numerico ingresado por teclaco y guardarlo
      int numero1=read.nextInt();
      EsMultiplo(numero,numero1);  
    }
    public static void EsMultiplo(int numero,int numero1){
        int contador;//Creamos una variable int contador
        contador=numero/numero1;//Evaluamos si el primer numero es multiplo del segundo
        
        if (contador==0) {//Ingresamos un if para certificar si es multiplo 
            System.out.println("El primer numero es multiplo del segundo");
        }else{
            System.out.println("El primer numero no es multiplo del segundo");
        }
    }
}
