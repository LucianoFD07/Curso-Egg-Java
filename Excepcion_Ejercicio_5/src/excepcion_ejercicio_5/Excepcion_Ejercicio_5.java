/*
 * Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */
package excepcion_ejercicio_5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author lf531
 */
public class Excepcion_Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        int num;
        int conteo=0;
        int intento;
        boolean gano= false;
        
        System.out.println("Jugaremos a divinar el numero entre 1 al 500");
        
        num=(int)Math.floor(Math.random()*500);
        
        while(!gano){
        try{
            intento= read.nextInt();
            
            if (intento<num) {
                System.out.println("El numero es mayor que el ingresado");    
            }else if (intento>num){
                System.out.println("El numero es menor al ingresado");
            }else{
                System.out.println("Adivino.. El numero era el ."+num);
                gano=true;
            }
            conteo++;
        }catch(InputMismatchException  e){
            System.err.println("\nERROR: Debe ingresar un numero .No un caracter");
            read.next();
            conteo++;
        }
    }
        System.out.println("Se intento :"+conteo+" veces de adivinar el numero");
    }
    
}
