/*
 * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package relacionesej.pkg1;

import EntidadPersona_Perro.Perro;
import EntidadPersona_Perro.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 2 clases persona y perro //atributos perro nombre raza edad y tamaño //nombre
 * apellido edad documento y Perro //crear 2 personas y 2 perros //asignar 1
 * perro a cada persona //mostrar desde person la informacion del perro y la
 * persona
 *
 */
public class RelacionesEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        Perro perro1 = new Perro("firu", "Chihuahua", 5, "Chico");
        Perro perro2 = new Perro("Malevo", "Doberman", 8, "Grande");

        Persona pers1 = new Persona("Martin", "Colucci", 35, 32666909, perro1);
        Persona pers2 = new Persona("Lucho", "Fernandez", 36, 33656989, perro2);
        System.out.println(pers1);
        System.out.println(pers2);

    }

}
