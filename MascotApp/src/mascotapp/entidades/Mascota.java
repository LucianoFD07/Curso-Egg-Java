/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp.entidades;

/**
 *
 * @author lf531
 */
public class Mascota {

    public String Nombre;
    public String Apodo;
    public String Tipo;
    public String Color;
    public boolean Cola;
    private int Edad;
    private String Raza;
    
    public Mascota(){
        
    }
    public Mascota (String Nombres,String Apodo,String Tipo, String Color ){
        this.Nombre = Nombre;
        this.Apodo = Apodo;
        this.Tipo = Tipo;
        this.Color = Color;
        
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }
   
}

