/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp.entidades;

import java.util.Date;

/**
 *
 * @author lf531
 */
public class Usuario {
    public String Nombre;
    public String Apellido;
    public int Edad;
    public Date Nacimineto;
    public String Pais;

    public Usuario() {
    }

    public Usuario(String Nombre, String Apellido, int Edad, Date Nacimineto, String Pais) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Nacimineto = Nacimineto;
        this.Pais = Pais;
    }
    
}
