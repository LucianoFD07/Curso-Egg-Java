/*
 *  Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.
13
• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author lf531
 */
public class Electrodomestico {

    Scanner read = new Scanner(System.in);
    //atributos: precio, color,consumo energético (letras entre A y F) y peso.
    protected double precio;
    protected String color;
    protected char consumoElectrico;
    protected int peso;

    //• Un constructor vacío.
    public Electrodomestico() {
    }
    //• Un constructor con todos los atributos pasados por parámetro.

    public Electrodomestico(double precio, String color, char consumoElectrico, int peso) {
        this.precio = precio;
        this.color = comprobarColor(color);
        this.consumoElectrico = comprobarConsumo(consumoElectrico);
        this.peso =peso;
        
    }
    //• Métodos getters y setters de todos los atributos.

    public double getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoElectrico() {
        return consumoElectrico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumoElectrico(char consumoElectrico) {
        this.consumoElectrico = consumoElectrico;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    /*• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.*/
    private char comprobarConsumo(char letra) {
        String letraString = String.valueOf(letra).toUpperCase();
        letra=letraString.charAt(0);
        char letras[] = {'A', 'B', 'C', 'D', 'E', 'F'};
        boolean encontrado = false;
        for (int i = 0; i < letras.length ; i++) {
            if ( letras[i]== letra ) {
               encontrado = true;
            } 

            
        }
          if (!encontrado) {
            letra = 'F';
        }
        return consumoElectrico=letra;
          
        
    }

    /*
    • Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.
     */
    public String comprobarColor(String color) {
        String colores[] = {"Blanco", "Negro", "Rosa", "Azul", "Gris"};
        boolean encontrado = false;
        for (int i = 0; i < colores.length; i++) {
            if (colores[i]== color) {
                encontrado = true;
            }
        }
        if (!encontrado) {
         color = "Blanco";
        }
        return color;
    }

    /*
    • Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
     */
    public void crearElectrodomestico() {
           
        System.out.println("INGRESE LAS CARACTERISTICAS DEL ELECTRODOMESTICO DESEADO ");
        System.out.println();
        System.out.println("Seleccione el color :");
        color = comprobarColor(read.next());
        System.out.println("Indique el consumo [A-B-C-D-E- F]:");
        consumoElectrico = comprobarConsumo(read.next().charAt(0));
        System.out.println("Indique el peso :");
        int peso = read.nextInt();
        this.peso=peso;
        System.out.println("El precio base sera de $1000, el valor varia segun lo seleccionado");
        double valor =read.nextDouble();
        if (valor < 1000) {
            valor = 1000;
        }
      
        this.precio=valor;
           

    }

    /*
    • Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
     */
    public double precioFinal() {
        
       double precio1=0;
        
        switch (consumoElectrico) {
            case 'A':
            case 'a':
                precio1 += 1000;
                break;
            case 'B':
            case 'b':

                precio1 += 800;
                break;
            case 'C':
            case 'c':
                precio1 += 600;
                break;
            case 'D':
            case 'd':
                precio1 += 500;
                break;
            case 'E':
            case 'e':
                precio1 += 300;
                break;
            case 'F':
            case 'f':
                precio1 += 100;

        }
        if (peso >= 0 && peso <= 19) {
            precio1 += 100;
        } else if (peso >= 20 && peso <= 49) {
            precio1 += 500;
        } else if (peso >= 50 && peso <= 79) {
            precio1 += 800;
        } else if (peso >= 80) {
            precio1 += 1000;
        }
        
          this.precio+=precio1;
          
        return precio;
    }
}
