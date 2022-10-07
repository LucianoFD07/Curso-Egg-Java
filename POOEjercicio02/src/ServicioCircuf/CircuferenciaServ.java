/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioCircuf;

import CircufEntidad.Circuferencia;
import java.util.Scanner;

/**
 *
 * @author lf531
 */
public class CircuferenciaServ {

    Scanner read = new Scanner(System.in);

    public Circuferencia crearCircuferencia() {
        System.out.println("Ingrese el radio de la circuferencia: ");
        double rad = read.nextDouble();
        return new Circuferencia(rad);
    }

    public double aeraCircuferencia(Circuferencia circ) {
        double area, rad, pi = 3.141592654;
        rad = circ.getRad();
        area = pi * Math.pow(rad, 2);
        return area;
    }

    public double perimCircuferencia(Circuferencia circ) {
        double perim, rad, pi = 3.141592654;
        rad = circ.getRad();
        perim = 2*pi*rad;
        return perim;
    }
}
