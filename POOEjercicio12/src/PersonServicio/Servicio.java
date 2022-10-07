package PersonServicio;

import PersonaEntidad.Persona;
import java.util.Date;
import java.util.Scanner;

public class Servicio {

    Scanner read = new Scanner(System.in);
    private Object nacimiento;

    //Agregar un método de creación del objeto que respete la siguiente firma:
//crearPersona()
    /*
    Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
     */
    public Persona crearPersona() {
        Persona n1 = new Persona();
        String nombre;
        int dia;
        int mes;
        int anio;
        System.out.println("INGRESEMOS LOS DATOS PERSONALES");
        System.out.println("INGRESE SU NOMBRE  ");
        nombre = read.nextLine();
        n1.setNombre(nombre);
        System.out.println("INGRESOS SU FECHA DE NACIMIENTO ");
        System.out.println("Dia de nacimiento"); 
        dia=read.nextInt();
        System.out.println("Mes de nacimiento");
        mes=read.nextInt();
        System.out.println("Año de nacimiento ");
        anio=read.nextInt();
        Date nacimiento = new Date(anio-1900,mes-1,dia);
        n1.setNacimiento(nacimiento);
        System.out.println("Su fecha de nacimiento es : " +nacimiento);
        return n1;
        
        
    }   
}

