/*Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 *
 */
package pooejercicio11;

import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class POOEjercicio11 {

    public static void main(String[] args) {
        int dia = 0;
        int mes = 0;
        int anio = 0;
        Scanner read = new Scanner(System.in);
        System.out.println("INGRESEMOS UNA  FECHA ");
        System.out.println("Ingrese una fecha");
        dia = read.nextInt();
        System.out.println("Ingresemos el mes con numeros");
        mes = read.nextInt();
        System.out.println("Ingresemos año en numeros entero");
        anio = read.nextInt();

        Date FechaNueva = new Date(anio, mes, dia);
        System.out.println("La fecha nueva es :" + FechaNueva);
        Date FechaActual = new Date();
        System.out.println("Fecha Actual es :" + FechaActual);
        //me quedan las fechas en milisegundo

        long diferencia = FechaActual.getTime() - FechaNueva.getTime();
        //clase de java para hacer converciones de tiempo "TimeUnit", time es una variable
        TimeUnit time = TimeUnit.DAYS;
        long diferenciaDias = time.convert(diferencia, TimeUnit.MILLISECONDS);
        long diferenciaAnio = diferenciaDias / 365;
        System.out.println("La diferencia de años entre el Actual y el colocado es: " + diferencia + " Años ");
    }

}
