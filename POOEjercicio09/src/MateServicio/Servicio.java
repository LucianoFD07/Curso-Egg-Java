/*
 * 
 */
package MateServicio;

import MatematicaEntidad.Matematica;

/**
 *
 * @author lf531
 */
public class Servicio {

    public static double devolverMayor(Matematica n1) {

        return Math.max(n1.getNum1(), n1.getNum2());
    }

    public static int calcularPotencia(Matematica n1) {
        int a = 1;
        int b = (int) Math.round(devolverMayor(n1));
        int c = (int) Math.min(n1.getNum1(), n1.getNum2());
        for (int i = 0; i < c; i++) {
            a = a * c;

        }
        if (c == 0) {
            a = 1;

        }
        return a;

    }
    public static double calculaRaiz(Matematica n1){
        double a = Math.abs(Math.min(n1.getNum1(),n1.getNum2()));
        return Math.sqrt(a);
    }
     public static void Operadro(Matematica n1){
         System.out.println("Operadores");
         System.out.println("Numero 1"+n1.getNum1());
         System.out.println("Numero 2"+n1.getNum2());
     }
}
