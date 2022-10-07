/*
 * Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente
 */
package Entidad;

/**
 *
 * @author lf531
 */
public class Caballo extends Animal {
    
    public Caballo(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
        System.out.println("Nombre del Caballo :"+nombre+" Edad :"+edad+" Raza :"+raza);
    }
    
}
