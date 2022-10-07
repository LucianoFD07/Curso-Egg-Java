/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad_Carta;

import Entidad_Palo.Palo;

/**
 *
 * @author lf531
 */
public class Carta {
    private Palo palos;
    int numero;

    public Carta(Palo palos, int numero) {
        this.palos = palos;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return   palos + ", de ->:" + numero ;
    }
    
  
}
