
package CircufEntidad;

import java.util.Scanner;


public class Circuferencia {
    Scanner read = new Scanner(System.in);
    private double rad;

    public Circuferencia() {
    }

    public Circuferencia(double rad) {
        this.rad = rad;
    }

    public double getRad() {
        return rad;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }
    
    
}
