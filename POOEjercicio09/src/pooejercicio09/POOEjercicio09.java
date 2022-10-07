/*Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 
 */
package pooejercicio09;

import MateServicio.Servicio;
import MatematicaEntidad.Matematica;

public class POOEjercicio09 {

    public static void main(String[] args) {
        Matematica n1 = new Matematica();
        n1.setNum1(Math.random() * 10);
        n1.setNum2(Math.random() * 10);
        Servicio.Operadro(n1);
        System.out.println("EL MAYOR NUMERO ES " + Servicio.devolverMayor(n1));
        System.out.println("LA POTENCIA DEL MAYOR NUMERO ES " + Servicio.calcularPotencia(n1));
        System.out.println("LA RAIZ CUADRADA DEL NUMERO MENOR  ES " + Servicio.calculaRaiz(n1));

    }

}


