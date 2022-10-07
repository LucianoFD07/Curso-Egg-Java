/*
 * Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package ServicioPais;


import EntidadesPais.Pais;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author lf531
 */
public class Servicio {

    Scanner read = new Scanner(System.in);

    public TreeSet<Pais> generarPais() {
        TreeSet<Pais> paises = new TreeSet();
        String pais;
        String repuesta;
        boolean otropais = true;
        while (otropais == true) {
            System.out.println("DESEA INGRESAR PAISES? -- SI/NO");
            repuesta = read.next();
            System.out.println();
            if (repuesta.equalsIgnoreCase("no")) {
                System.out.println("•••••••••••••••••••••••••••••••••••••••••••••••");
                otropais = false;
                break;
            }
            System.out.println("•••••••••••••••••••••••••••••••••••••••••••••••");
            System.out.println("INGRESEMOS LOS PAISES QUE USTED DESEE");
            pais = read.next();
            System.out.println("•••••••••••••••••••••••••••••••••••••••••••••••");
            Pais paises1 = new Pais(pais);
            paises.add(paises1);
        }
        for (Pais aux : paises) {
            System.out.println(aux);
            System.out.println();

        }
        return paises;
    }

    public void mostrarPaisesAlfabet(TreeSet<Pais> paises) {
        System.out.println("\"•••••••••••••••••••••••••••••••••••••••••••••••\"");
        System.out.println("MOSTRAREMOS LOS PAISES ALFABETICAMENTE");
        
        for (Pais aux : paises) {
            System.out.println("\n* " + aux.toString());
            System.out.println();

        }
    }

    public void selectionBorra(TreeSet<Pais> paises) {
        System.out.println("\"•••••••••••••••••••••••••••••••••••••••••••••••\"");
        System.out.println("BUSCAREMOS UN PAIS PARA ELIMINAR Y MOSTRAR EL CONJUNTO");
        String eliminar = read.next();
        boolean centinela = false;
        Iterator<Pais> it = paises.iterator();
        while (it.hasNext()) {
            if (it.next().getPais().equals(eliminar)) {
                it.remove();
                centinela = true;
            }
        }
        if (centinela==true) {
            System.out.println("•••••••••••••••••••••••••••••••••••••••••••••••");
            System.out.println(" PAIS ELIMINADO");
            System.out.println("•••••••••••••••••••••••••••••••••••••••••••••••");
            System.out.println("PAISES EN CONJUNTO :");
            
        for (Pais aux : paises) {
            System.out.println(aux.toString());
            System.out.println("\"•••••••••••••••••••••••••••••••••••••••••••••••\"");
        }
        
    }else{
            System.out.println("•••••••••••••••••••••••••••••••••••••••••••••••");
            System.out.println("EL PAIS NO SE ENCUENTRA");
        }
    }
}
