/*Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.

 */
package ArreglosServ;

import ArreglosEntidades.Arreglo;
import java.util.Arrays;
import java.util.Scanner;

public class Servicio {

    Scanner read = new Scanner(System.in);

    public Arreglo primero() {
        Arreglo n1 = new Arreglo();
        double[] arregloA = new double[50];
        //Lleno el vector y lo mostramos
        for (int i = 0; i < n1.getArregloA().length; i++) {
            arregloA[i] = (Math.random() * 10) + 1;
        }

        System.out.println(" Vector A");
        for (int i = 0; i < 50; i++) {
            System.out.println("[" + arregloA[i] + "] ");
        }
        System.out.println("*********************");
        System.out.println("*********************");
        System.out.println(" Arreglo B  ");
        double[] arregloB = new double[20];
        Arrays.sort(arregloA);
        for (int i = 0; i < n1.getArregloB().length - 1; i++) {
            if (i <= 9) {
                arregloB[i] = arregloA[i];
            } else {
                arregloB[i] = 0.5;

            }
        }
            System.out.println("Vector B (compuesto de los 10 primeros n° < de vector A y n° 0,5) ");
             for (int i = 0; i < 20; i++) {
                System.out.println("[" + arregloB[i] + "]");
             }
        return n1;
            
        }
        
    }
