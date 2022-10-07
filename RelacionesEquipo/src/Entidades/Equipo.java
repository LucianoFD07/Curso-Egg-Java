/*
 * Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package Entidades;

import java.util.ArrayList;


/**
 *
 * @author lf531
 */
public class Equipo {
 
    ArrayList<Jugador> jugadores;

    public Equipo() {
    }

    public Equipo(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Equipo{" + "jugadores :" + jugadores + '}';
    }

    
    }

  
    

   

    
        
    
    
  
      
    


/*  public Equipo() {
        this.jugadores = new ArrayList();
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
      
   public void crearJugadores( Jugador nombre, Jugador apellido, Jugador posicion, Jugador numero){
       
      jugadores.add(nombre);
       jugadores.add(apellido);
       jugadores.add(posicion);
       jugadores.add(numero);
   }

    public boolean crearJugadores() {
        return false;*/