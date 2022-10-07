package ModeloAlumno;


import java.util.ArrayList;

/*
 * crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.


 */

/**
 *
 * @author lf531
 */
public class Alumno {//TRABAJEMOS CON UN MAP PARA INGRESAR LOS DATOS DEL ALUMNO
 //nombre 
 //listas de notas
 //constructor -- crear objetos de la clase alumno   
 // getter -- setter   
  String nombre;
  
  ArrayList<Integer> notas = new ArrayList();
  
  public void agregarNota(int nota){
      
     notas.add(nota);
      
  }
    public int getNota1(){
      return  notas.get(0);
        
    } 
     public int getNota2(){
      return  notas.get(1);
        
    } 
      public int getNota3(){
      return  notas.get(2);
        
    } 
    public Alumno() {
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }
  
    
}


