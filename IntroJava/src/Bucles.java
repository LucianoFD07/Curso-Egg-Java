
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
public class Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Ingrese un numero entero positivo");
            num=leer.nextInt();
            if(num>1000){
                System.out.println("Este preograma podria tardar, ¿Esta seguro?(s/n)");
                String confirmar = leer.next();
                if(confirmar.equals("s")){
                    break;
                }
            }
        }while(num<=0 || num>1000 );
        
        int j, suma;
        for(int i=1 ; i<=num ; i++){
            if(i%2 !=0)
                continue;
            suma=0;
            j=1;
            while(j<=i){
                suma += j;
                j++;
            }
                System.out.println("La suma de los "+ i + "numeros naturales es "+suma);
                
        }
        
        
    }
    
}
