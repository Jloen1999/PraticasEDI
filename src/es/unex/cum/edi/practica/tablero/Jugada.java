package es.unex.cum.edi.practica.tablero;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Clase Jugada
 *
 * @author Jose Luis Obiang Ela Nanguan
 * @version 1.0, 11/05/2022
 */
public class Jugada implements Serializable {

    private long tiempo;
    private Date fecha;
    private boolean ganado;

    /**
     * Constructor por defecto. Inicializa todos los
     * atributos de la clase
     */
    public Jugada() {
        tiempo = 0l;
        fecha = new Date();
        ganado = false;
    }

    /**
     * Constructor parametrizado. Inicializa todos los
     * atributos de la clase con los nuevos valores
     * recibidos
     * 
     * @param tiempo Recibe un valor de tipo long
     * @param fecha  Recibe un objeto de tipo Date
     * @param ganado Recibe un valor de tipo booleano
     */
    public Jugada(long tiempo, Date fecha, boolean ganado) {
        this.tiempo = tiempo;
        this.fecha = fecha;
        this.ganado = ganado;
    }

    /**
     * Metodo que nos permite obtener el valor del
     * atributo tiempo
     * 
     * @return tiempo Devuelve un valor de tipo long
     */
    public long getTiempo() {
        return tiempo;
    }

    /**
     * Metodo que modifica el valor del atributo tiempo
     * 
     * @param tiempo Recibe un valor de tipo long
     */
    public void setTiempo(long tiempo) {
        this.tiempo = tiempo;
    }

    /**
     * Metodo que nos permite obtener el valor del
     * atributo fecha
     * 
     * @return fecha Devuelve un objeto de tipo Date
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Metodo que modifica el valor del atributo fecha
     * 
     * @param fecha Recibe un valor de tipo Date
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Metodo que nos permite obtener el valor del
     * atributo ganado
     * 
     * @return ganado Devuelve un valor de tipo booleano
     */
    public boolean isGanado() {
        return ganado;
    }

    /**
     * Metodo que modifica el valor del atributo ganado
     * 
     * @param ganado Recibe un valor de tipo booleano
     */
    public void setGanado(boolean ganado) {
        this.ganado = ganado;
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
        Jugada j = (Jugada) obj;

        return tiempo == j.getTiempo() && fecha.equals(j.getFecha()) && ganado == j.isGanado();
    }

    /**
     * Metodo redefinido para mostrar todos los atributos de
     * esta clase
     *
     * @return Devuelve un valor de tipo cadena
     */
    @Override
    public String toString() {
        SimpleDateFormat formato = new SimpleDateFormat("dd-MMMM-yyyy hh:mm:ss a");
        String fechaFormateada = formato.format(fecha);

        return "Jugada [Fecha: " + fechaFormateada + ", Ganado: " + (ganado ? "sí" : "no") +
                ", Tiempo: " + (new MetodosGenerales()).tiempoCadena(tiempo) + "]";
    }
}
