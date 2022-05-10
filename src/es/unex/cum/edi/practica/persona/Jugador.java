package es.unex.cum.edi.practica.persona;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import es.unex.cum.edi.practica.tablero.Jugada;

/**
 * Clase Jugador. Es una clase que deriva de la clase
 * Persona e implementa la interfaz Serializable para
 * facilitar el almacenamiento y transmision de nuestros
 * objetos y colecciones
 *
 * @author Jose Luis Obiang Ela Nanguan
 * @version 1.0, 11/05/2022
 * @see Persona, Serializable
 */
public class Jugador extends Persona implements Serializable {

    private String password;
    private List<Jugada> jugadas;

    /**
     * Constructor por defecto. Inicializa todos los
     * atributos de la clase
     */
    public Jugador() {
        super();
        password = new String();
        jugadas = new ArrayList<Jugada>();
    }

    /**
     * Constructor parametrizado. Inicializa todos los
     * atributos de esta clase y la de su clase padre
     * Persona con los nuevos valores recibidos
     * 
     * @param id       Recibe un valor de tipo entero
     * @param nombre   Recibe un valor de tipo cadena
     * @param password Recibe un valor de tipo cadena
     */
    public Jugador(int id, String nombre, String password) {
        super(id, nombre);
        this.password = password;
        jugadas = new ArrayList<Jugada>();
    }

    /**
     * Metodo que nos permite obtener el valor del
     * atributo password
     * 
     * @return password Devuelve un valor de tipo cadena
     */
    public String getPassword() {
        return password;
    }

    /**
     * Metodo que modifica el valor del atributo password
     * 
     * @param password Recibe un valor de tipo cadena
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Metodo que nos permite obtener la lista de jugadas
     * 
     * @return jugadas Devuelve una coleccion de tipo List
     */
    public List<Jugada> getJugadas() {
        return jugadas;
    }

    /**
     * Metodo que nos permite agregar una nueva jugada en la
     * lista de jugadas
     * 
     * @param j Recibe un objeto de tipo Jugada
     * @return true si se agrega, false en caso contrario
     */
    public boolean addJugada(Jugada j) {

        if (j != null) {
            return jugadas.add(j);
        }
        return false;
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
        Jugador j = (Jugador) obj;

        return super.equals(obj) && password.equals(j.password);
    }

    /**
     * Metodo redefinido para mostrar todos los atributos de
     * esta clase
     *
     * @return Devuelve un valor de tipo cadena
     */
    @Override
    public String toString() {
        return super.toString() + " Jugador [Contraseña: " + password + "]";
    }
}
