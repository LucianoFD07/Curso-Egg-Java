/*Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2
 a) Método constructor con todos los atributos pasados por parámetro.
 b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
 */
package EntidadOpe;


public class Operacion {
   private int Numero1,numero2;
   

    public Operacion() {
    }

    public Operacion(int Numero1, int numero2) {
        this.Numero1 = Numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return Numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero1(int Numero1) {
        this.Numero1 = Numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

   
}
