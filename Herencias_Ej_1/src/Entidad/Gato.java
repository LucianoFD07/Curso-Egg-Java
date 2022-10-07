/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author lf531
 */
public class Gato extends Animal{
    
    public Gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
        System.out.println("Nombre del gato :"+nombre+" Edad :"+edad+" Raza :"+raza);
    }
    
}
