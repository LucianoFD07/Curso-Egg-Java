/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp;

import java.util.Scanner;
import mascotapp.entidades.Mascota;

/**
 *
 * @author lf531
 */
public class MascotApp {

    /**
//     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Mascota m1 = new Mascota("Luciano", "Puchi", "Perro", "Gris");
     m1.setEdad(6);
        System.out.println("la edad es " +m1.getEdad() );
        m1.setRaza("Mantez");
        System.out.println("La raza es "+m1.getRaza());
     
        
        System.out.println(m1.Nombre+" "+m1.Apodo+" "+m1.Tipo+" "+m1.Color+" ");
//public String Nombre;
//    public String Apodo;
//    public String Tipo;
//    public String Color;
//    public boolean Cola;
//    public int Edad;
//    public String Raza; 
    }
}