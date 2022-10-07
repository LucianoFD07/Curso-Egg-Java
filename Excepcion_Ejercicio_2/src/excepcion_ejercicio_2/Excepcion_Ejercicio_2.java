/*
 * Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
 */
package excepcion_ejercicio_2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

/**
 *
 * @author lf531
 */
public class Excepcion_Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] array=new int[5];
        try {
            array[8]=6;
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Fuera de rango");
        }
    }
   
}
