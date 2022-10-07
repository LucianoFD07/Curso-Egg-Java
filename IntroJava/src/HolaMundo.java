
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lf531
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //se crea una variablr scanner que se utiliza para leer dato del usuario
        Scanner leer = new Scanner(System.in);
        //Se crea una Variable cadena (String)que se utiliza para leer dato del usuario
        String nombre;
        //se muestra un mensaje por pantalla
        System.out.println("Ingresa tu Nombre:");
        //leemos el nombre de la persona en la variable nombre
        nombre=leer.next();
        //Mostramos por consola un saludos personalizado
        System.out.println("Hola Mundo!! soy " +nombre+" y estoy programando en Java! ");
    }
    
}Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java
Scanner read = new Scanner(System.in);
        int contadorCorrecto = 0;
        int contadorIncorrecto = 0;
        String codigo;
        
        do{
            System.out.println("Ingrese un codigo de 5 digitos");
             codigo = read.nextLine();
            if (codigo.length()==5){
                String primerDigito = codigo.substring(0, 1);
                String ultimoDigito = codigo.substring(4);
                System.out.println(" primer "+ primerDigito + " segundo " + ultimoDigito);
                    if (primerDigito.equalsIgnoreCase("x") & ultimoDigito.equalsIgnoreCase("o")){
                        
                        contadorCorrecto = contadorCorrecto+1;
                        
                    }else{
                        
                        contadorIncorrecto = contadorIncorrecto + 1;
                        
                    }
                
            }else {
                System.out.println("Ingrese un codigo con la cantidad de digitos correctos");
