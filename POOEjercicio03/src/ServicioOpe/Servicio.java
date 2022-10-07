/*
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en
los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
package ServicioOpe;

import EntidadOpe.Operacion;
import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in);
    Operacion n1;

    public void crearOperacion() {
        System.out.println("Ingresemos Dos numero para la Operacion ");
        n1 = new Operacion();
        n1.setNumero1(leer.nextInt());
        n1.setNumero2(leer.nextInt());
    }

    public int suma() {
        int suma;
        suma = n1.getNumero1() + n1.getNumero2();
        return suma;
    }

    public int resta() {
        int resta;
        resta = n1.getNumero1() - n1.getNumero2();
        return resta;
    }

    public int Multi() {
        int multi;
        do {

            multi = n1.getNumero1() * n1.getNumero2();
            System.out.println("Ingrese nueva mente el numero");
        } while (0 > n1.getNumero1());
        return multi;
    }

    public double Dividir() {
        double dividir;
        do {

            dividir = n1.getNumero1() / n1.getNumero2();
            System.out.println("Ingrese nueva mente el numero");
        } while (0 > n1.getNumero1());
        return dividir;
    }
    public void dibujo(){
        int dibujo;
        
    }
}
