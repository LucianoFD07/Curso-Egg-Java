/*Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada
 * 
 */
package poo2ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author lf531
 */
public class POO2Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in).useDelimiter("\n");

        ArrayList<String> perros = new ArrayList();

       

        String razas, rep;

        System.out.println("******************************************");
        System.out.println("INGRESEMOS RAZAS DE  PERROS");
        System.out.println("******************************************");
        String eliminar = null;
        do {

            perros.add(read.next());
            System.out.println("DESEA AGREGAR MAS RAZAS (SI)---(NO)");
            rep = read.next();
            if (rep.equalsIgnoreCase("no"));
            System.out.println("INGRESEMOS OTRAS RAZA ");
        } while (rep.equalsIgnoreCase("si"));
        System.out.println(perros);

         Iterator<String> recorre = perros.iterator();
         
        System.out.println("RAZAS ADREGADAS VISTA POR ITERATOR");
        
        String respRapida,razaEliminar = null;
        boolean esta =false;
        System.out.println("QUIERE ELIMINAR ALGUNA RAZA? SI/NO");
        respRapida=read.next();
        if(respRapida.equals("si"))
            System.out.println("INGRESE LA RAZA QUE DESEA ELIMINAR");
        razaEliminar=read.next();
        
        Iterator<String> it = perros.iterator();
        while(it.hasNext()){
            if(it.next().equals(razaEliminar)){
                it.remove();
                esta=true;
            }
        }
            if (esta==true) {
                System.out.println("LA RAZA SI ESTABA Y QUEDARIA DE ESTA MANERA");
                Collections.sort(perros);
                System.out.println(perros);
        }else {
                System.out.println("LA RAZA NO ESTABA Y QUEDARIA DE ESTA MANERA");
                Collections.sort(perros);
                System.out.println(perros);
            }
        
        /*
        System.out.println("INGRESEMOS LA RAZA QUE DESEA ELIMINAR");
       
        eliminar = null;
       
        while (n1.hasNext()) {

            if (n1.next().equals(eliminar)) {
                n1.remove();
               
            }

            

        }
Collections.sort(perros);

            System.out.println(perros + "");
    
    */
    }
    

}
