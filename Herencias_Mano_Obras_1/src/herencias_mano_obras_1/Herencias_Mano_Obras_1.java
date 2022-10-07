/*
 Vamos a crear una clase Animal que tenga un método hacerRuido() que devuelva un saludo
“Hola”. Luego haremos clase Perro y clase Gato que extiendan de Animal y sobreescriban el
método hacerRuido() con el ruido que corresponda a cada uno. Luego, en el main vamos a crear
un ArrayList de animales y los siguientes animales
Animal a = new Animal();
Animal b = new Perro();
Animal c = new Gato();
Agregaremos a la lista a cada uno y luego, con un for each, recorreremos la lista llamando al
método hacerRuido() de cada ítem.
 */
package herencias_mano_obras_1;

import EntidadAnimal.Animal;
import EntidadAnimal.Gato;
import EntidadAnimal.Perro;
import java.util.ArrayList;

/**
 *
 * @author lf531
 */
public class Herencias_Mano_Obras_1 {

    public static void main(String[] args) {
        ArrayList<Animal> animal = new ArrayList<>();

        Animal a = new Animal();
        Perro b = new Perro();
        Gato c = new Gato();

        animal.add(a);
        animal.add(b);
        animal.add(c);

        for (Animal anima : animal) {
          anima.hacerRuido();
           anima.comer();
           anima.jugar(1);
        }
    }
}
 /*  if (aux instanceof Perro) {
                Perro object = (Perro) aux;
               b.hacerRuido();
               continue;
            }
            if (aux instanceof Gato) {
                Gato object = (Gato) aux;
                c.hacerRuido();
                continue;
            }
           
             if (aux instanceof Animal ) {
                Animal object = (Animal) aux;
                a.hacerRuido();
             }
        }
        
        }*/