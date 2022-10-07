
package PersonaEntidad;

import java.util.Date;
import java.util.Scanner;


public class Persona {
    Scanner read =new Scanner(System.in);
    Date nacimiento ;
    String nombre;

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public Persona() {
    }
    
    //Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
//en cuenta que para conocer la edad de la persona también se debe conocer la fecha
//actual.
    public int calcularEdad(){
        int edad=0;
        Date fecha=new Date();
        edad=fecha.getYear()-nacimiento.getYear();
        System.out.println("SU EDAD ES DE " +edad+ "AÑOS");
        return edad;
        
    }
    // Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
//edad y retorna true en caso de que el receptor tenga menor edad que la persona que
//se recibe como parámetro, o false en caso contrario.
    public boolean menorQue(int edad){
        System.out.println("INGRESE SU EDAD.");
        int nuevaEdad=read.nextInt();
        boolean comparacion=false;
        comparacion = nuevaEdad>edad;
        System.out.println("LA EDAD ANTERIOR ES IGUAL A LA ACTUAL?.. " +comparacion);
        return comparacion;
        
    }
    // Metodo mostrarPersona(): este método muestra la persona creada en el método
        //anterior.
    public void mostrarPersona(){
        System.out.println("EL NOMBRE DE LA PERSONA ES .. " +nombre);
        System.out.println("LA FECHA DE NACIMIENTO  DE LA PERSONA ES ... "+nacimiento);
    }
}
