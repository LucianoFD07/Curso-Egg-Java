/*
 * Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
22
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package ServicioPelicula;

import Comparador.Comparadores;
import EntidadPelicula.Pelicula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import java.util.Scanner;
import java.util.function.Consumer;

/**
 *
 * @author lf531
 */
public class Servicio {

    public ArrayList<Pelicula> generarPeliculas() { //CREAR PELICULAS Y MOSTRAR
        ArrayList<Pelicula> peli = new ArrayList();
        Scanner read = new Scanner(System.in);
        String director, titulo, respuesta;
        double tiempo;
        boolean crearPelicula = true;

        while (crearPelicula == true) {
            System.out.println("¿Desea crear una Pelicula? SI/NO");// pregunta si quiere crear otro pelicula o no?
            respuesta = read.next();
            if (respuesta.equalsIgnoreCase("no")) {
                crearPelicula = false;
                break;
            }
            System.out.println("INGRESE LA PELICULAS QUE DESEA CREAR");
            System.out.println("Titulo ");
            titulo = read.next();

            System.out.println("Director ");
            director = read.next();
            System.out.println("Duracion de pelicula ");
            tiempo = read.nextDouble();
            System.out.println("•••••••••••••••••••••••••••••••••••••••••••••••");
            Pelicula peli1 = new Pelicula(titulo, director, tiempo);
            peli.add(peli1);

        }
        for (Pelicula aux : peli) {
            System.out.println(aux.toString());
        }
        return peli;
    }

    public void mostrarMayor1hs(ArrayList<Pelicula> peli) {
        System.out.println("MOSTRAREMOS PELICULA MAYOR A UNA HORA");
        Collections.sort(peli, Comparadores.ordenarPorTiempo);
        for (Pelicula aux : peli) {
            if (aux.getTiempo() > 1) {
                System.out.println("\n* " + aux.toString());
            }

        }

    }

    public void mostrarPeliMayorMenor(ArrayList<Pelicula> peli) {
        System.out.println("MOSTRAREMOS DE MAYOR A MENOR LA DURACION DE PELICULAS");
        Collections.sort(peli, Comparadores.ordenarPorTiempo);
        for (Pelicula aux : peli) {
            System.out.println("\n* " + aux.toString());
        }
    }
    
    public void mostrarMenorMayor(ArrayList<Pelicula> peli){
        System.out.println("MOSTRAREMOS DE MENOR A MAYOR LA DURACION DE PELICULAS");
        Collections.sort(peli, Comparadores.ordenarPorTiempoMenor);
        for (Pelicula aux : peli) {
            System.out.println("\n* "+aux.toString());
            
        }
    }//• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
    public void mostrarTituloAlfabet(ArrayList<Pelicula> peli){
        System.out.println("MOSTRAREMOS TITULOS ORDENADOS ALFABETICAMENTE");
        Collections.sort(peli, Comparadores.mostrarTituloAlfabeticamente);
        for (Pelicula aux : peli) {
            System.out.println("\n* " +aux.toString());
            
        }
        
    }
   // • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
    public void mostrarDirectorAlfabet(ArrayList<Pelicula> peli){
        System.out.println("MOSTRAREMOS DIRECTORES ORDENADOS ALFABETICAMENTE");
        Collections.sort(peli, Comparadores.mostrarDirectorAlfabeticamente);
        for (Pelicula aux : peli) {
             System.out.println("\n* " + aux.toString());
        }
       
    }
}
