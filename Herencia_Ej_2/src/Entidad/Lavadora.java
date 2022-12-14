/*
 * A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes
llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set del atributo carga.
• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.
 */
package Entidad;

/**
 *
 * @author lf531
 */
public class Lavadora extends Electrodomestico {

    protected double Carga;

//• Un constructor vacío
    public Lavadora() {
    }

    /*
    • Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes
llamar al constructor de la clase padre.
     */
    public Lavadora(double Carga) {
        this.Carga = Carga;
    }

    public Lavadora(Integer Carga, double precio, String color, char consumoElectrico, int peso) {
        super(precio, color, consumoElectrico, peso);
        this.Carga = Carga;
    }
    //• Método get y set del atributo carga.

    public double getCarga() {
        return Carga;
    }

    public void setCarga(Integer Carga) {
        this.Carga = Carga;
    }

    /*
    • Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.

     */
    public void crearLavadora() {

        crearElectrodomestico();
        System.out.println("Ingrese la  carga de lavadora :");
        double car = read.nextInt();
        this.Carga = car;

    }


/*
     • Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.
 */
@Override
        public double precioFinal() {
        
    if (Carga > 30) {
          precio  += 500;
        }
         
        return super.precioFinal(); 
    }
}

