/*
 *Considera que estás desarrollando una web para una empresa que fabrica motores (suponemos
que se trata del tipo de motor de una bomba para mover fluidos). Definir una variable tipoMotor y
permitir que el usuario ingrese un valor entre 1 y 4. El programa debe mostrar lo siguiente:
o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de
gasolina”.
o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de
hormigón”.
o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta
alimenticia”.
o Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor
válido para tipo de bomba”
 */
package declaraciondevariable;

import java.util.Scanner;


public class Intro_Java_ManosDeObra7 {

    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int tipoMotor;
        System.out.println("Ingresemos el tipo de Motor, del 1 al 4 :");
        tipoMotor=read.nextInt();
        switch (tipoMotor){
            case 1:
                System.out.println("El tipo de motor , Bomba agua");
                break;
            case 2:
                System.out.println("El tipo de motor , Bomba de gasolina");
                break;
            case 3:
                System.out.println("El tipo de motor , Bomba de hormigon");
                break;
            case 4:
                System.out.println("El tipo de motor , Bomba de Pasta alimentaria");
                break;
                
             
        }
    }
    
}
