/*
 * Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package relacionespersona;

import EntidaPersona.DNI;
import EntidaPersona.Persona;


/**
 *
 * @author lf531
 */
public class RelacionesPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Persona pers = new Persona("Luciano","Fernandez", new DNI(34191458,'a'));
        System.out.println("Nombre :"+pers.getNombre());
        System.out.println("Apellido :"+pers.getApellido());
        System.out.println(pers.getDNI());
    }
    
}
