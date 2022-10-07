/*
 * Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package EntidaPersona;


public class DNI {
    private Integer DNI ;
    private Character serie ;

    public DNI() {
    }

    public DNI(Integer DNI, Character serie) {
        this.DNI = DNI;
        this.serie = serie;
    }

    

    public Integer getDNI() {
        return DNI;
    }

    public Character getSerie() {
        return serie;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public void setSerie(Character serie) {
        this.serie = serie;
    }

    @Override
    public String toString() {
        return "Numero :{" + "DNI :" + DNI + "\n*"+", Serie :" + serie + '}';
    }

  
    
}
