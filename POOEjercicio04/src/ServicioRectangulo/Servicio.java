/*También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo
 
 */
package ServicioRectangulo;

import EntidadRectangulo.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author lf531
 */
public class Servicio {

    Scanner leer = new Scanner(System.in);
    Rectangulo n1;

    public void DatoRectangulo() {
        n1 = new Rectangulo();
        System.out.println("Ingresemos la base del rectangulo");
        n1.setBase(leer.nextInt());
        System.out.println("Ingresemos la altura del rectangulo");
        n1.setAltura(leer.nextInt());

    }

    public int Superfivie() {
       
        return n1.getBase() * n1.getAltura();
    }

    public int Perimetro() { 
        return n1.getAltura() + n1.getBase() * 2;
    }
    public void dibujo(){
        
        for (int fila = 1; fila < n1.getAltura(); fila++) {
            for (int columna = 1; columna < n1.getBase(); columna++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
