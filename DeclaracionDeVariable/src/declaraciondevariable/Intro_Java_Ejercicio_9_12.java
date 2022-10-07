/*
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package declaraciondevariable;

import java.util.Scanner;

public class Intro_Java_Ejercicio_9_12 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int contadorCorrecto = 0;
        int contadorIncorrecto = 0;
        String codigo;

        do {
            System.out.println("INGRES UN CODIGO DE 5 DIGITOS");
            codigo = read.nextLine();
            if (codigo.length() == 5) {
                String primerDigito = codigo.substring(0, 1);
                String ultimoDigito = codigo.substring(4);
                System.out.println(" Primer " + primerDigito + " Segundo " + ultimoDigito);
                if (primerDigito.equalsIgnoreCase("X") & ultimoDigito.equalsIgnoreCase("o")) {
                    contadorCorrecto = contadorCorrecto + 1;

                } else {
                    contadorIncorrecto = contadorIncorrecto + 1;
                }
            } else {
                System.out.println("INGRESE EL COGIDO CON LA CANTIDAD CORRECTA");

            }
        } while (codigo.equals("&&&&&"));
        System.out.println("LA CANTIDAD DE LECTURA CORRECTA FUE  " + contadorCorrecto);
        System.out.println("LA CANTIDAD DE LECTURA INCORRECTA FUE  " + contadorIncorrecto);
    }
}
