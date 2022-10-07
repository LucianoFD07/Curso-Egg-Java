
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
public class EncuestaCine {
    int opcion;
    Scanner leer = new Scanner(System.in);
    System.out.println(""); 
            
    opcion = leer.nextInt();
    
    if (opcion >=1 && opcion <=5){
    
    switch (opcion){
        case 1:
        case 2:
            System.out.println("NOS SENTIMOS APENADOS QUE NO TE HAYA DIFRUTADO LA PELI");
            
              break;
        case 3:
            System.out.println("HAS CLASIFICADO LA PELI COMO BUENA");
              break;
        case 4:
            System.out.println("HAS CLASIFICADO LA PELI COMO BUY BUENA");
              break;
        case 5;
            System.out.println("FANTASTICO QUE HAYAS DIFRUTADO EXELENTE ESPETACULO");
              break;
              //El equvalente de caso del *OtroModo* es el *Default*
              //Default:
              //<ACCIONES>
    } 
}else if (opcion= 0 ){
 System.out.println("Una opcion negativa");
}else if (opcion == 0);{
    System.out.println("El valor" + opcion +"no es valido. (");
}else {
    System.out.println(opcion + "muy bueno");
}    
System.out.println("hasta la proxima");
}
