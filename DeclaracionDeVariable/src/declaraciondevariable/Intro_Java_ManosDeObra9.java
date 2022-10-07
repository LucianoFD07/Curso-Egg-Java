/*
 * Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.
 */
package declaraciondevariable;

import java.util.Scanner;

/**
 *
 * @author lf531
 */
public class Intro_Java_ManosDeObra9 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int numero1 = 0;
        int numeros;

        for (int i = 0; i < 19; i++) {
            System.out.println("Ingresemos numeros hasta el 20");
            numeros = read.nextInt();
            if (numeros == 0) {
                System.out.println("Se capturo el numero 0");
            
            if (numeros > 0) {
                numero1 = numeros + numero1;
            }
           
        }
         System.out.println("Lasuma de los numero ingresados son : " + numero1);

    }
}
}
