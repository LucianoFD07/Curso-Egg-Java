/*Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
 */
package excepcion_ejercicio_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepcion_Ejercicio_3 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        try{
            
        
        
        System.out.println("Ingresemos dos int en forma de cadenas");
        String cadena = read.next();
        String cadena1 = read.next();
        System.out.println("Mostraremos las cadenas pasado a integer");
        int num = Integer.parseInt(cadena);
        int num1 = Integer.parseInt(cadena1);
        System.out.println(Integer.parseInt(cadena));
        System.out.println(Integer.parseInt(cadena1));
        System.out.println("Ahora dividamos los numero ingresados ");
        int dividir=0;
        dividir=num/num1;
        System.out.println(dividir);
        }catch(InputMismatchException e){
            System.out.println(e.getMessage());
        }catch(NumberFormatException i){
            System.out.println(i.getMessage());
        }catch(ArithmeticException o){
            System.out.println(o.getMessage());
        }
        
        /*Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones*/
    }
}
