/*
 * Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package declaraciondevariable;

public class Intro_Java_Ejercicio_9_15 {

    public static void main(String[] args) {
        int[] vector = new int[101];
        for (int i = 0; i < 101; i++) {
            vector[i] = i;
        }
        for (int i = 100; i >= 0; i--) {
            System.out.println("Numero [" + vector[i] + "]");
        }

    }
}
