/*
 * 
 */
package declaraciondevariable;

import java.util.Scanner;


public class Intro_Java_Ejercicio_9_16 {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el numero que desea buscar");
        int buscar= leer.nextInt();
        int numeroAleatorio;
        int []vector= new int[10];
        int posicionBuscar = -1;
        boolean repetido = false;
        for (int i=0; i<10; i++){
            //el num aleatorio devuelbe un double por eso lo pue asi.
            numeroAleatorio = (int) (Math.random()*5+1);
            vector[i]=numeroAleatorio ;
            System.out.print("["+numeroAleatorio+"]");
        }
        System.out.println("");
        for (int i=0; i<10; i++){
            if (vector[i] == buscar && posicionBuscar == -1){
                posicionBuscar = i;
            } else if (vector[i] == buscar && posicionBuscar != -1) {
                repetido = true;
            }
        }
        if (posicionBuscar != -1) {
            System.out.println("El numero "+buscar+" se encontro en la posicion "+posicionBuscar);
            if (repetido) {
                System.out.println("Y se encontro mas de una vez");
            }
        } else {
            System.out.println("El numero "+buscar+" no se encontro en el arreglo");
        }
    }
    
}
