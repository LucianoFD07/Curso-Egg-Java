/*
 * lase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.

10
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author lf531
 */
public class Juego {
    ArrayList<Jugador>jugadores=new ArrayList();
    Revolver revolver;

    public Juego() {
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }
    
     public void llenarJuego(ArrayList<Jugador>jugadores, Revolver r){
        this.jugadores=jugadores;
        revolver=r;
    }
      public boolean ronda(){
        for (Jugador jugador : jugadores) {
           jugador.disparo(revolver);
            System.out.println(" ");

           if(jugador.isMojado()){
               System.out.println("Game Over. El jugador mojado es: "+jugador.getNombre());
               return true;
           }
        }
        return false;
    }
}
