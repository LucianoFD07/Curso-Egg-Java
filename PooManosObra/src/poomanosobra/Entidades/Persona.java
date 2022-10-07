/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poomanosobra.Entidades;

/**
 *
 * @author lf531
 */

public class Persona {
    public String Nombre;
    public String Apodo;
    public String Pais;

    public Persona() {
    }

    public Persona(String Nombre, String Apodo, String Pais) {
        this.Nombre = Nombre;
        this.Apodo = Apodo;
        this.Pais = Pais;
    }
    private String Equipo;
    private int Año;

    public String getEquipo() {
        return Equipo;
    }

    public void setEquipo(String Equipo) {
        this.Equipo = Equipo;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }

    
    
    
}
