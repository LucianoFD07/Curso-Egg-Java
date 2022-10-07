/*
 * *Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
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
package EntidadPelicula;

//crear clase PELLICULA

import java.util.ArrayList;

//METODOS TITULO,DIRECTOR,DUARCION DE PELICULA,
/**
 *
 * @author lf531
 */
public class Pelicula {

 
    String titulo;
     String director;
      
     Double tiempo;
    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Double tiempo) {
        this.titulo = titulo;
        this.director = director;
        this.tiempo = tiempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public Double getTiempo() {
        return tiempo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setTiempo(Double tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "SALAS DE PELICULAS : { " +  "\n* Titulo  " + titulo + "\n* Director  " + director + "\n* Duracion  " + tiempo + '}';
    }

   
}
