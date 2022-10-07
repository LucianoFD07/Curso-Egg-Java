/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArreglosEntidades;


public class Arreglo {
   private double[] arregloA= new double[50] ;
   private double[] arregloB= new double[20];

    public Arreglo() {
    }

    public void setArregloA(double[] arregloA) {
        this.arregloA = arregloA;
    }

    public void setArregloB(double[] arregloB) {
        this.arregloB = arregloB;
    }

    public double[] getArregloA() {
        return arregloA;
    }

    public double[] getArregloB() {
        return arregloB;
    }

    public int setArregloA() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int setArregloB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
