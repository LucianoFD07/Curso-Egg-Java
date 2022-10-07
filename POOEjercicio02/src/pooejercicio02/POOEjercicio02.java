
import CircufEntidad.Circuferencia;
import ServicioCircuf.CircuferenciaServ;

/*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).
package pooejercicio02;

/**
 *
 * @author lf531
 */
public class POOEjercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CircuferenciaServ serv = new CircuferenciaServ();
        Circuferencia circ = serv.crearCircuferencia();
        System.out.println("Area: "+serv.aeraCircuferencia(circ));
        System.out.println("Perimetro: "+serv.perimCircuferencia(circ));
        
    }
    
}
