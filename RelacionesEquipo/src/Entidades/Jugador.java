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
public class Jugador {
         
       private String nombre;
       private String apellido;
       private String posicion;
       private Integer numero;

    public Jugador() {
    }

    public Jugador(String nombre, String apellido, String posicion, Integer numero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.numero = numero;
    }

    public Jugador(ArrayList<Jugador> n1) {
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getPosicion() {
        return posicion;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

   @Override
    public String toString() {
        return "Jugador{" + "Nombre :" + nombre + ", Apellido :" + apellido +"\n" + ", Posicion :" + posicion + ", Numero Camiseta :" + numero + '}';
    }

    
       

    }
       
       
         
       
    
       
    

