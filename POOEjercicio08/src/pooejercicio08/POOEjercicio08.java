/*Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
través de los métodos set, se guardará la frase y la longitud de manera automática según
la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 *
 */
package pooejercicio08;


import CadenaEntidad.Cadena;
import CadenaServicio.Servicio;


import java.util.Scanner;

/**
 *
 * @author lf531
 */
public class POOEjercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        Servicio serv = new Servicio();
        Cadena frase = serv.ingFrase();
        String resp, confirm = "";
        System.out.println();
        do {
            System.out.println("▄▄▄▄▄▄▄▄▄▄");
            System.out.println("█ MENÚ FRASE █");
            System.out.println("▀▀▀▀▀▀▀▀▀▀");
            System.out.println();
            System.out.println("1] Contar vocales.");
            System.out.println("2] Invertir frase.");
            System.out.println("3] Nº de veces que se repite una letra.");
            System.out.println("4] Comparar longitudes con otra frase ingresada.");
            System.out.println("5] Unir frases.");
            System.out.println("6] Contiene letra ingresada.");
            System.out.println("7] Salir.");
            System.out.println();
            System.out.print("» Seleccione una opción [1|2|3|4|5|6|7]: ");
            resp = read.next();
            System.out.println();
            switch (resp) {
                case "1":
                    System.out.println("La frase tiene " + serv.contarVocals(frase) + " vocales.");
                    System.out.println("Presione intro para seguir...");
                    read.next();
                    break;
                case "2":
                    System.out.println("Frase invertida: " + serv.invertirFrase(frase));
                    System.out.println("Presione intro para seguir...");
                    read.next();
                    break;
                case "3":
                    System.out.print("» Ingrese una letra: ");
                    resp = read.next();
                    System.out.println("La letra se repite " + serv.vecesRepet(frase, resp) + " veces.");
                    System.out.println("Presione intro para seguir...");
                    read.next();
                    break;
                case "4":
                    System.out.print("» Ingrese una frase: ");
                    resp = read.next();
                    if(serv.compararLong(frase, resp)) {
                        System.out.println("Las frases tienen la misma longitud.");
                    } else {
                        System.out.println("Las frases no son de la misma longitud.");
                    }
                    System.out.println("Presione intro para seguir...");
                    read.next();
                    break;
                case "5":
                    System.out.print("» Ingrese una frase: ");
                    resp = read.next();
                    System.out.println("Las frases unidas: " + serv.unirFrases(frase, resp));
                    System.out.println("Presione intro para seguir...");
                    read.next();
                    break;
                case "6":
                    System.out.print("» Ingrese una letra: ");
                    resp = read.next();
                    if(serv.contiene(frase, resp)) {
                        System.out.println("Contiene la letra ingresada.");
                    } else {
                        System.out.println("No contiene la letra ingresada.");
                    }
                    System.out.println("Presione intro para seguir...");
                    read.next();
                    break;
                case "7":
                    System.out.print("¿Está seguro que desea salir? [y/n]: ");
                    confirm = read.next();
                    break;
                default:
                    System.out.println("Error: opción ingresada no válida.");
                    System.out.println("Presione intro para seguir...");
                    read.next();

            }
        } while (!confirm.equalsIgnoreCase("y"));
    }
    
}
