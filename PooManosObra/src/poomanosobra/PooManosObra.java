/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poomanosobra;

import poomanosobra.Entidades.Persona;

/**
 *
 * @author lf531
 */
public class PooManosObra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona m1 = new Persona("Luciano","Lucho", "Arg");
       m1.setAño(32);
        System.out.println("Los años "+m1.getAño()   );
        m1.setEquipo("RACING");
        System.out.println("El equipo es " +m1.getEquipo());
        System.out.println(m1.Nombre+" "+m1.Apodo+" "+m1.Pais+" ");
             
    }
    
}
