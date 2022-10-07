/*
 * Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 */
package Entidades;

/**
 *
 * @author lf531
 */
public class Revolver {

    int posicionActual;
    int posicionAgua;

    public Revolver() {
    }

    public Revolver(int posicioAgua, int posicionActual) {
        this.posicionAgua = posicioAgua;
        this.posicionActual = posicionActual;
    }

    public int getPosicioAgua() {
        return posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicioAgua(int posicioAgua) {
        this.posicionAgua = posicioAgua;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public void llenarRevoler() {
        posicionActual = (int) (Math.random() * 6 + 1);
        posicionAgua = (int) (Math.random() * 6 + 1);
    }

    public boolean mojar() {
        boolean mojar = true;
        if (posicionActual == posicionAgua) {
            System.out.println("Perdio...");

        } else {
            mojar = false;
            System.out.println("En esta ronda tuvo suerte");
        }
        return mojar;
    }

    public void siguienteDisparo() {
        if (posicionActual == 6) {
            posicionActual = 1;
        } else {
            posicionActual += 1;
        }

    }

    @Override
    public String toString() {
        return "Revolver{" + "Posicion Actual de Disparo esta :" + posicionActual + "\n" + " Disparo esta en.." + posicionAgua + " ..";
    }

}
