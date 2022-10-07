/*
 *Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente
 */
package herencias_ej_1;

import Entidad.Animal;
import Entidad.Caballo;
import Entidad.Gato;
import Entidad.Perro;


public class Herencias_Ej_1 {

    public static void main(String[] args) {
        Animal perro = new Perro("Puchi", "Lechuga", 8, "Mantez");
        perro.Comer();
        System.out.println("------------------------------------------");
        
        Animal perro2 = new Perro("Milito", "Asado", 6, "ReCallejero");
        perro2.Comer();
        System.out.println("------------------------------------------");
        
        Animal gatico = new Gato("Luisa","Pollito",10,"Siamez");
        gatico.Comer();
        System.out.println("-------------------------------------------");
        
        Animal caballo = new Caballo("Tornado","Cespe",25,"Mustang Español");
        caballo.Comer();
    }

}
