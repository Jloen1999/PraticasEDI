package es.unex.cum.edi.practica.persona;

/**
 * Clase Invitado. Es una clase que deriva de la clase
 * Persona
 *
 * @author Jose Luis Obiang Ela Nanguan
 * @version 1.0, 11/05/2022
 * @see Persona
 */
public class Invitado extends Persona {

    /**
     * Constructor por defecto. Inicializa todos los
     * atributos de esta clase y de su clase padre
     * Persona
     */
    public Invitado() {
        super();
    }

    /**
     * Constructor parametrizado. Inicializa todos los
     * atributos de su clase padre Persona con los
     * nuevos valores recibidos
     * 
     * @param id     Recibe un valor de tipo entero
     * @param nombre Recibe un valor de tipo cadena
     */
    public Invitado(int id, String nombre) {
        super(id, nombre);
    }
}
