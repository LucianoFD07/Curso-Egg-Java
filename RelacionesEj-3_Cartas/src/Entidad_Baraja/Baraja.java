/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad_Baraja;

import Entidad_Carta.Carta;
import Entidad_Palo.Palo;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author lf531
 */
public class Baraja {

    ArrayList<Carta> cartas = new ArrayList();
    ArrayList<Carta> monton = new ArrayList();

    public Baraja() {
        for (Palo palos : Palo.values()) {
            for (int i = 0; i <= 12; i++) {
                if (i == 8 || i == 9) {
                    continue;
                }
                Carta carta = new Carta(palos, i);
                cartas.add(carta);
            }
        }
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public Carta siguienteCarta() {
        if (cartas.isEmpty()) {
            System.out.println("No quedan mas cartas");
            return null;
        }
        Carta siguienteCarta = cartas.remove(0);
        monton.add(siguienteCarta);
        return siguienteCarta;

    }

    public int cartaDisponible() {
        System.out.println("Quedan" + cartas.size() + "..disponible en la baraja");
        return cartas.size();
    }
    public ArrayList<Carta> darCarta(int cantidadCarta){
        if (cartas.size()<cantidadCarta) {
            System.out.println("No hay esa cantidad de cartas para dar..");
            return null;
        }
     ArrayList<Carta> cartasADar = new ArrayList();
        for (int i = 0; i < cantidadCarta; i++) {
            Carta cartaSacada = cartas.remove(0);
            cartasADar.add(cartaSacada);
        }
        monton.addAll(cartasADar);
        return cartasADar;

    } 

    public void cartasMonton() {
        System.out.println("Las cartas en el monton son: "+monton);
    }

    public void mostrarBaraja() {
        System.out.println("Las cartas en la baraja son: ");
        System.out.println(cartas);
    };
}
