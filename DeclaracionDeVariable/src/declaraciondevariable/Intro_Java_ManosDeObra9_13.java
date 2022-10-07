/*
 * Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante
 */
package declaraciondevariable;

import java.util.Scanner;

/**
 *
 * @author lf531
 */
public class Intro_Java_ManosDeObra9_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String Equipo[];//Declaramos varible y señalisamos vector

        Equipo = new String[4];//Le indicamos la cantidad de cariable que vamos usar en el vector
        for (int i = 0; i < Equipo.length; i++) {//Usaremos un FOR para usar la variable con la cantodad ingresada
            System.out.println("Ingresemos los nombre de nuestro compañeros");
            Equipo[i] = read.next();
          
        }

    }
  
    

}
