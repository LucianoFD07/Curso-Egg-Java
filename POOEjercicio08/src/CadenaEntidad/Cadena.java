/*
 * ealizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
y su longitud.
 */
package CadenaEntidad;

/**
 *
 * @author lf531
 */
public class Cadena {

     private String frase;
    private int longitud;

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
        longitud = frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
        longitud = frase.length();
    }

    public int getLongitud() {
        return longitud;
    }
}


