
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lf531
 */
public class Ej1Obligatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int num, num1,suma;
        System.out.println("Vamos a pedir dos numero enteros y despues sumarlos");
        System.out.println("Ingrese el primer numero para sumarlo");
            num = numero.nextInt();
            System.out.println("Ingresemos el segundo numero para sumarlo");
            num1 = numero.nextInt();
            suma = num+num1;
            System.out.println("El resultado de la suma entre los dos numero es , " + suma );
    }
    
}
