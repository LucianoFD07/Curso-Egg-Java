/*
 * *) Toma la Lista, el Conjunto y el Mapa del ejemplo y agrega 5 objetos a cada uno.
   *) Toma la Lista, el Conjunto y el Mapa que hiciste previamente y elimina en cada uno un objeto de
cada forma que aprendiste arriba.
 */
package poo2manosalaobra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class POO2ConjuntoMapa {

    public static void main(String[] args) {
 //LISTAS
        ArrayList<Integer> numerosA = new ArrayList();
        int n = 20;
        numerosA.add(n);
        int n1 = 25;
        numerosA.add(n1);
        int n2 = 30;
        numerosA.add(n2);
        int n3 = 35;
        numerosA.add(n3);
        int n4 = 40;
        numerosA.add(n4);
        numerosA.remove(40);
        
//CONJUNTOS
        HashSet<Integer> numerosB = new HashSet();
        int Y = 20;
        numerosB.add(Y);
        int Y1 = 25;
        numerosB.add(Y1);
        int Y2 = 30;
        numerosB.add(Y2);
        int Y3 = 35;
        numerosB.add(Y3);
        int Y4 = 40;
        numerosB.add(Y4);
        numerosB.remove(Y4);

//MAPAS
        HashMap<Integer, String> personas = new HashMap();
        int dni = 34191458;
        String nombrePersona = "Lucho";
        personas.put(dni, nombrePersona);

        int dni1 = 31343698;
        String nombrePersona1 = "NOELIA";
        personas.put(dni1, nombrePersona1);

        int dni2 = 32356988;
        String nombrePersona2 = "IGNASI";
        personas.put(dni2, nombrePersona2);

        int dni3 = 21215865;
        String nombrePersona3 = "PUCHI";
        personas.put(dni3, nombrePersona3);

        int dni4 = 98741236;
        String nombrePersona4 = "AKD";
        personas.put(dni4, nombrePersona4);
        
        personas.remove(98741236);

    }

}
