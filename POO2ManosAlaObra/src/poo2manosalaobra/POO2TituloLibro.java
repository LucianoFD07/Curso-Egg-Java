/*
 * ¡Es tu turno! Crea una lista de Libros y muestra el título de cada uno con un bucle.
 */
package poo2manosalaobra;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lf531
 */
public class POO2TituloLibro {

    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList<String>libro=new ArrayList();
       
        
        
        
        
        
        
        String A = "PRINCIPITO";
        libro.add(A);
         String B = "ALEP";
        libro.add(B);
         String C = "PADRE RICO PADRE POBRE";
        libro.add(C);
         String D = "EVITA TE HACE POBRE";
        libro.add(D);
        libro.forEach((portada) -> {
            System.out.println(portada);
        });
        
    }
    
}
