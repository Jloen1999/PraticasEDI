package es.unex.cum.edi.practica.celda;

/**
 * Clase abstracta Celda
 * 
 * @author Jose Luis Obiang Ela Nanguan
 * @version 1.0
 */
public abstract class Celda {

    protected int fila;
    protected int columna;
    protected int estado;

    /**
     * Constructor por defecto. Inicializa todos los
     * atributos de la clase
     */
    public Celda() {
        fila = 0;
        columna = 0;
        estado = 0;
    }

    /**
     * Constructor parametrizado. Inicializa todos los
     * atributos de la clase con los nuevos valores
     * recibidos
     * 
     * @param fila    Recibe un valor de tipo entero
     * @param columna Recibe un valor de tipo entero
     */
    public Celda(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
        this.estado = 0;
    }

    /**
     * Metodo que nos permite obtener el valor del
     * atributo fila
     * 
     * @return fila Devuelve un valor de tipo entero
     */
    public int getFila() {
        return fila;
    }

    /**
     * Metodo que modifica el valor del atributo fila
     * 
     * @param fila Recibe un valor de tipo entero
     */
    public void setFila(int fila) {
        this.fila = fila;
    }

    /**
     * Metodo que nos permite obtener el valor del
     * atributo columna
     * 
     * @return columna Devuelve un valor de tipo entero
     */
    public int getColumna() {
        return columna;
    }

    /**
     * Metodo que modifica el valor del atributo columna
     * 
     * @param columna Recibe un valor de tipo entero
     */
    public void setColumna(int columna) {
        this.columna = columna;
    }

    /**
     * Metodo que nos permite obtener el valor del
     * atributo estado
     * 
     * @return estado Devuelve un valor de tipo entero
     */
    public int getEstado() {
        return estado;
    }

    /**
     * Metodo que modifica el valor del atributo estado
     * 
     * @param estado Recibe un valor de tipo entero
     */
    public void setEstado(int estado) {
        this.estado = estado;
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
        Celda c = (Celda) obj;

        return fila == c.fila && columna == c.columna && estado == c.estado;
    }

    /**
     * Metodo redefinido para mostrar todos los atributos de
     * esta clase
     * 
     * @return Devuelve un valor de tipo cadena
     */
    @Override
    public String toString() {
        return "Celda [fila=" + fila + ", columna=" + columna + ", estado=" + estado + "]";
    }
}
