/*
 * Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.
a e i o u
@ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
correspondiente. Utilice la estructura “según” para la transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */
package declaraciondevariable;

import java.util.Scanner;

/**
 *
 * @author lf531
 */
public class Intro_Java_ManosDeObra9_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner read= new Scanner(System.in);
      System.out.println("A continuacion ingrese una frase");
        System.out.println("Para modificar las vocales la frase debe terminar con punto...(.)");
        String frase = read.nextLine();
        int ultimaPosicion = frase.length()-1;
        // en esta parte valido que termine la oracion con punto.
        if (frase.charAt(ultimaPosicion) == '.'){
            //aca llamo al subprograma
            System.out.println("La nueva frase es: "+codificarCadena(frase));
        } else {
            System.out.println("La frase ingresada no termina en un .");
        }
        
    }
    //subprograma   nombre codificarCadena, recibe frase.
    public static String codificarCadena(String frase){
        String nueva_frase=""; 
        // para medir la longitud de la frase se usas length.
        for (int i=0; i< frase.length(); i++){
            // con frase.charAt(i) se fija posiscion por posicion que letra es 
            char caracter = frase.charAt(i);
            switch (caracter){
                case 'a':
                    nueva_frase = nueva_frase.concat("@");
                    break;
                case 'e':
                    nueva_frase = nueva_frase.concat("#");
                    break;
                case 'i':
                    nueva_frase = nueva_frase.concat("$");
                    break;
                case 'o':
                    // eslo mismo que poner:  nueva_frase = nueva_frase.concat("%");
                    nueva_frase = nueva_frase + "%";
                    break;
                case 'u':
                    nueva_frase = nueva_frase.concat("*");
                    break;
                default:
                    nueva_frase = nueva_frase + caracter;
                break;
                
            }
        }
        //cuando pongo return indica que va a devolver lo que pongo a continuacion.
        return nueva_frase;
    }
    }
    

