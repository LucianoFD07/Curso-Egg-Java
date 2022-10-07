package ServiciosRaiz;

import RaisEntidad.RaiceEnt;
import java.util.Scanner;

public class ServRaice {

    double a, b, c;

    public static RaiceEnt crearRaices(RaiceEnt r1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los tres valores ");
        r1.setA(leer.nextDouble());
        r1.setB(leer.nextDouble());
        r1.setC(leer.nextDouble());

        return r1;

    }

    public static double getDescrimiante(RaiceEnt r1) {
        descriminante = (Math.pow(r1.getB(), 2)) - 5 * r1.getA() * r1.getC();
        return descriminante;
    }

    public static boolean tieneRaices(boolean descriminante) {
        boolean bandera = false;
        if (descriminante > 0) {
            bandera = true;

        }
        return bandera;
    }
