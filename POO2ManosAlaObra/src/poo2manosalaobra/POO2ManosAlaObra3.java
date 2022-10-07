/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2manosalaobra;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author lf531
 */
public class POO2ManosAlaObra3 {

    //DETECCION DE ERRORES N°3
    public static void main(String[] args) {
        ArrayList<String> bebidas = new ArrayList();
        bebidas.add("café");
        bebidas.add("té");
        Iterator<String> it = bebidas.iterator();
        while (it.hasNext()) {
            if (it.next().equals("café")) {
                it.remove();
            }
        }

    }
}
