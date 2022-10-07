/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lucianoprogramacion;

import java.util.Scanner;

/**
 *
 * @author lf531
 */
public class Do_While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int l = 0;
        Scanner n1 = new Scanner(System.in);
        do {
            System.out.println("SELECCIONE LA OPCION");
            System.out.println("1 peli");
            System.out.println("2 series");
            System.out.println("0 salir");
            l = n1.nextInt();
            switch (l) {
                case 0:
                    System.out.println("Gracias ");
                    break;
                case 1:
                    System.out.println("pelis");
                    break;
                case 2:
                    System.out.println("series");
                    break;
                default:
                    System.out.println("seleccione el correcto");
            }
        } while (l != 0);
        System.out.println("gracias");

    }

}


