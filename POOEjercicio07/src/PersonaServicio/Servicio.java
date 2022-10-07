/*Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
un booleano.
 */
package PersonaServicio;

import PersonaEntidad.Persona;
import java.util.Scanner;

public class Servicio {

    Scanner read = new Scanner(System.in);

    public Persona crearPersona() {
        Persona n1 = new Persona();
        boolean val = false;

        System.out.println("Ingrese Nombre");
        String nombre = read.next();
        n1.setNombre(nombre);
        System.out.println("Ingrese la Edad");
        int edad = read.nextInt();
        n1.setEdad(edad);
        while (val == false) {
            System.out.print(" Ingrese sexo [M → Masculino | F → Femenino]: ");
            String sexo = read.next();
            if (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")) {
                System.out.println();
                System.out.println("Error: el sexo ingresado no es válido.");
                System.out.println("Presione intro para seguir...");
                read.next();
            } else {
                val = true;
                n1.setSexo(sexo);
            }

        }
        System.out.print("» Ingrese peso [kg]: ");
        double peso = read.nextDouble();
        n1.setPeso(peso);
        System.out.print("» Ingrese altura [m]: ");
        double altura = read.nextDouble();
        n1.setAltura(altura);
        System.out.println();
        return n1;

    }
    public Persona getMetodCrear() {
            return crearPersona();
     }

    public int calcularIMC(Persona pers) {
        int ret = 0;
        int imc = (int) (pers.getPeso() / Math.pow(pers.getAltura(), 2));
        pers.setPesoIdeal(false);
        if (imc < 20) {
            ret = -1;
        } else if (imc >= 20 && imc <= 25) {
            pers.setPesoIdeal(true);
            ret = 0;
        } else if (imc > 25) {
            ret = 1;
        }
        return ret;
    }

    public boolean esMayorEdad(Persona pers) {
        return pers.getEdad() > 17;
    }

    

    
}
