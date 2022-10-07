/*c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 
 */
package ServiCuenta;

import EntidadCuentaBancaria.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author lf531
 */
public class Servicio {

    Scanner leer = new Scanner(System.in);
    CuentaBancaria n1;
    //c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.

    public void cuenta() {
        n1 = new CuentaBancaria();
        System.out.println("Ingresemos Numero de cuenta ");
        n1.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingresemos DNI");
        n1.setDNI(leer.nextInt());
        System.out.println("Saldo actual");
        n1.setSaldoActual(leer.nextInt());

    }
//d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
//y se la sumara a saldo actual.

    public CuentaBancaria ingresar() {
        double ing, suma;
        System.out.println("Ingrese la suma de dinero que desea ingresar ");
        ing = leer.nextDouble();
        suma = n1.setSaldoActual() + ing;
        System.out.println("Usted ingreso la suma de : " + ing);
        System.out.println("Tiene un total de " + suma);
        return n1;

    }
    //Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
//restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
//saldo actual en 0.

    public CuentaBancaria retirar() {
        double ret, resta;
        System.out.println("Ingrese la cantidad que desea retirar ");
        ret = leer.nextDouble();
        if (n1.getSaldoActual() >= ret) {
            resta = n1.getSaldoActual() - ret;
            System.out.println("Usted va retirar " + ret);
            System.out.println("Tiene un total de :" + resta);
        } else {
            System.out.println("Su saldo actual es 0");
        }
        return n1;
    }
//f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
//usuario no saque más del 20%.

    public CuentaBancaria extraccionRapida() {
        double extr, resta,porc;
        
        System.out.println("Ingrese Extracion Rapida ");
        extr = leer.nextDouble();
        porc=n1.getSaldoActual()*extr/200;
        if (n1.getSaldoActual() >= porc) {
            resta = n1.getSaldoActual() - porc;
            System.out.println("Usted va retirar " + extr);
            System.out.println("Tiene un total de :" + resta);
            
                   
        } else {
            
            System.out.println("En extracion rapida tiene un limite de 20%");
        }
        return n1;

 
    }
    
    //g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    public void consultarSaldo(){
        System.out.println("Su saldo actual es de ") ;
       
    }
   // h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
   
    public void  consultarDatos(){
        
        System.out.println("Su numero de cuenta es : " );
        System.out.println("Su DNI es :");
      
        
              
    } 
    
  
}
