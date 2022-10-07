/*
 * En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package ServicioAlumno;

import ModeloAlumno.Alumno;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author lf531
 */
public class Servicio {

    HashMap<String, Alumno> alumnos = new HashMap();
    Scanner read = new Scanner(System.in).useDelimiter("\n");

    // crear bucle para crear objetos de tipo alumno
 
    public void generarAlumnos() {//bucle para crear alumnos

        String respuesta, nombre;
        int nota1, nota2, nota3 = 0;
        boolean generarAlumnos = true;
        while (generarAlumnos == true) {
            System.out.println("¿Desea ingresar alumnos? SI/NO");// pregunta si quiere crear otro alumno o no?
            respuesta = read.next();
            if (respuesta.equalsIgnoreCase("no")) {
                generarAlumnos = false;
                break;
            }
            System.out.println("Ingrese el nombre del Alumno");
            nombre = read.next();
            System.out.println("Ingrese las notas del Alumno");
            nota1 = read.nextInt();
            System.out.println("Matematica : " + nota1);
            nota2 = read.nextInt();
            System.out.println("Lengua : " + nota2);
            nota3 = read.nextInt();
            System.out.println("Ingles :" + nota3);

            Alumno alumnoAcrear = crearAlumno(nombre, nota1, nota2, nota3);
            guardaAlumno(alumnoAcrear);
        }

    }

    private Alumno crearAlumno(String nombre, int nota1, int nota2, int nota3) { //crear alumno
        Alumno alumno = new Alumno();
        alumno.setNombre(nombre);
        alumno.agregarNota(nota1);
        alumno.agregarNota(nota2);
        alumno.agregarNota(nota3);
        return alumno;

    }

    private void guardaAlumno(Alumno alumno) {//guardar alumno en la lista
        String clave = alumno.getNombre();
        alumnos.put(clave, alumno);
    }

    private double notaFinal(int nota1, int nota2, int nota3) {//calcula nota final
        int total = nota1 + nota2 + nota3;
        double promedio = total / 3;
        return promedio;

    }

    public double ratornarNotaFinal() {//crear metodo nota final   
        System.out.println("Ingresemos alumno para saber nota final");
        String nombreAbuscar = read.next();
        Alumno alumnoBuscado;
        double promedio = 0;
        alumnoBuscado = alumnos.get(nombreAbuscar);// sacamos alumno de la lista de alumno usando su nombre como clave
        if (alumnoBuscado == null) {
            System.out.println("El alumno no se encuentra en la lista ");

        } else {

            promedio = notaFinal(alumnoBuscado.getNota1(), alumnoBuscado.getNota2(), alumnoBuscado.getNota3());
           
        }
         return promedio;
    }

}
