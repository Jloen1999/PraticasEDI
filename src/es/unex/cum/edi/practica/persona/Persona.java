package es.unex.cum.edi.practica.persona;

import java.io.Serializable;

/**
 * Clase Persona. Implementa la interfaz Serializable para
 * facilitar el almacenamiento y transmision de nuestros
 * atributos
 *
 * @author Jose Luis Obiang Ela Nanguan
 * @version 1.0, 11/05/2022
 * @see Serializable
 */
public class Persona implements Serializable {

    protected int id;
    protected String nombre;

    /**
     * Constructor por defecto. Inicializa todos los
     * atributos de la clase
     */
    public Persona() {
        id = 0;
        nombre = new String();
    }

    /**
     * Constructor parametrizado. Inicializa todos los
     * atributos de la clase con los nuevos valores
     * recibidos
     * 
     * @param id     Recibe un valor de tipo entero
     * @param nombre Recibe un valor de tipo cadena
     */
    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    /**
     * Metodo que nos permite obtener el valor del
     * atributo id
     * 
     * @return id Devuelve un valor de tipo entero
     */
    public int getId() {
        return id;
    }

    /**
     * Metodo que modifica el valor del atributo id
     * 
     * @param id Recibe un valor de tipo entero
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Metodo que nos permite obtener el valor del
     * atributo nombre
     * 
     * @return nombre Devuelve un valor de tipo cadena
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que modifica el valor del atributo nombre
     *
     * @param nombre Recibe un valor de tipo cadena
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo redefinido para comparar todos los atributos
     * de la clase
     *
     * @param obj Recibe un objeto global
     * @return Devuelve un valor de tipo booleano
     */
    @Override
    public boolean equals(Object obj) {
        Persona p = (Persona) obj;

        return id == p.getId() && nombre.equals(p.getNombre());
    }

    /**
     * Metodo redefinido para mostrar todos los atributos de
     * esta clase
     *
     * @return Devuelve un valor de tipo cadena
     */
    @Override
    public String toString() {
        return "Persona [Identificador: " + id + ", Nombre: " + nombre + "]";
    }
}
