/*
 * Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 */
package declaraciondevariable;

import java.util.Scanner;

public class Intro_Java_Ejercicio_9_11 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num1;
        int num2;
        int opcion;
        boolean Salida;
        String OpcionSalida;
        System.out.println("***************************************************");
        System.out.println("***************************************************");
        System.out.println("INGRESEMOS DOS NUMEROS ENTEROS POSITIVOS");
        num1 = read.nextInt();
        num2 = read.nextInt();
        Salida = false;

        do {
            MostarOpcion();
            opcion = read.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Suma entre " + num1 + " y " + num2 + " es :" + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resta entre " + num1 + " y " + num2 + " es :" + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Multiplicacion entre " + num1 + " y " + num2 + " es :" + (num1 * num2));
                    break;
                case 4:
                    System.out.println("Dividir entre " + num1 + " y " + num2 + " es :" + (num1 / num2));
                    break;
                case 5:
                    System.out.println("*** Desea salir: S *** Desea continuar N ***");
                    OpcionSalida = read.next();
                    if (OpcionSalida.toUpperCase().equals("S")) {
                        Salida = true;
                    }
                    break;

                default:
                    System.out.println("El numero ingresado no esta en programa");
            }

        } while (Salida = false);

    }

    private static void MostarOpcion() {
        System.out.println("ELEJIR UNA OPCION");
        System.out.println("******************************************");
        System.out.println(" 1 ---- SUMAR----");
        System.out.println(" 2 ---- RESTAR----");
        System.out.println(" 3 ---- MULTIPILCAR----");
        System.out.println(" 4 ---- DIVIDRIR----");
        System.out.println(" 5 ---- SALIR----");
    }
}
