/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparador;

import EntidadPelicula.Pelicula;
import java.util.Comparator;

/**
 *
 * @author lf531
 */
public class Comparadores {
    public static Comparator<Pelicula> ordenarPorTiempo = new Comparator<Pelicula>() {//• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getTiempo().compareTo(t.getTiempo());
           
        }
    };
        public static Comparator<Pelicula> ordenarPorTiempoMenor = new Comparator<Pelicula>() {//• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTiempo().compareTo(t1.getTiempo());
           
        }
    };
    public static Comparator<Pelicula> mostrarTituloAlfabeticamente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
            
        }
    };//• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.//
    
    public static Comparator<Pelicula> mostrarDirectorAlfabeticamente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareTo(t1.getDirector());
           
        }
    }; //• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
}
