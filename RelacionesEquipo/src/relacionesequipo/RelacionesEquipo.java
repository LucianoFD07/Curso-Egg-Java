/*
 * Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package relacionesequipo;

import Entidades.Equipo;
import Entidades.Jugador;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lf531
 */
public class RelacionesEquipo {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList<Jugador> n1 = new ArrayList();

        for (int i = 0; i < 2; i++) {
            System.out.println("Ingresemos los datos del Jugador");
            System.out.println("Nombre :");
            String nombre = read.next();
            System.out.println("Apellido :");
            String apellido = read.next();
            System.out.println("Posicion :");
            String posicion = read.next();
            System.out.println("Numero de Camiseta");
            Integer numero = read.nextInt();
            Jugador jugad = new Jugador(nombre, apellido, posicion, numero);
            n1.add(jugad);
        }
        Equipo jugadores = new Equipo(n1);
        System.out.println(jugadores);

    }

}
