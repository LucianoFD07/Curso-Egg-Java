/*
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
 */
package declaraciondevariable;

import java.util.Scanner;


public class Intro_Java_Ejercicio_9_18 {

    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

        int[][] Amatriz= new int[4][4];
        int num_aleatorio;

        //matriz original
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
               num_aleatorio= (int) (Math.random()*20+1);
                Amatriz[i][j]= num_aleatorio;
            }

        }
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.print("["+Amatriz[i][j]+ "]");  
            }
            System.out.println("");
        }
        System.out.println("matriz original");


        //Matriz transpuesta

        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.print("["+Amatriz[j][i]+ "]");  
            }
            System.out.println("");
        }
        System.out.println("matriz transpuesta");
    }

}
    
    
