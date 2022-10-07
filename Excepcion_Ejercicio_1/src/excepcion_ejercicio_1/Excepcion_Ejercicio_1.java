/*
 * Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar de invocar el
método esMayorDeEdad() a través de ese objeto. Luego, englobe el código con una cláusula
try-catch para probar la nueva excepción que debe ser controlada.
 */
package excepcion_ejercicio_1;

import Entidad.Persona;
import Servicio.ServicioPersona;
import java.util.Scanner;

/**
 *
 * @author lf531
 */
public class Excepcion_Ejercicio_1 {

    
    public static void main(String[] args) {
         Persona p = new Persona("Eze", null, "Hombre", 68, 1.75);
        ServicioPersona serv = new  ServicioPersona();
        try{
            if(serv.esMayorEdad(p)) {System.out.println("La persona es mayor de edad.");} 
            else {System.out.println("La persona es menor de edad.");}
        } catch(Exception e) {System.err.println(e.getMessage());}
    }
}




