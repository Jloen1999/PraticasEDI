package es.unex.cum.edi.practica.tablero;

import es.unex.cum.edi.practica.celda.Celda;

/**
 * Clase abstracta Tablero
 * 
 * @author Jose Luis Obiang
 * @version 1.0
 */
public abstract class Tablero {

    protected int numFilas;
    protected int numColumnas;
    protected Celda[][] tablero;

    /**
     * Constructor por defecto. Inicializa todos los
     * atributos de la clase
     */
    public Tablero() {
        numFilas = 3;
        numColumnas = 3;
        tablero = new Celda[numFilas][numColumnas];
    }

    /**
     * Constructor parametrizado. Inicializa todos los
     * atributos de la clase con los nuevos valores
     * recibidos
     * 
     * @param numFilas    Recibe un valor de tipo entero
     * @param numColumnas Recibe un valor de tipo entero
     */
    public Tablero(int numFilas, int numColumnas) {
        this.numFilas = numFilas;
        this.numColumnas = numColumnas;
        tablero = new Celda[numFilas][numColumnas];
    }

    /**
     * Metodo que nos permite obtener el valor del atributo
     * numFilas
     * 
     * @return numFilas Devuelve un valor de tipo entero
     */
    public int getNumFilas() {
        return numFilas;
    }

    /**
     * Metodo que modifica el valor del atributo numFilas
     * 
     * @param numFilas Recibe un valor de tipo entero
     */
    public void setNumFilas(int numFilas) {
        this.numFilas = numFilas;
    }

    /**
     * Metodo que nos permite obtener el valor del atributo
     * numColumnas
     * 
     * @return numColumnas Devuelve un valor de tipo entero
     */
    public int getNumColumnas() {
        return numColumnas;
    }

    /**
     * Metodo que modifica el valor del atributo numColumnas
     * 
     * @param numColumnas Recibe un valor de tipo entero
     */
    public void setNumColumnas(int numColumnas) {
        this.numColumnas = numColumnas;
    }

    /**
     * Metodo que nos permite obtener el valor del atributo
     * tablero
     * 
     * @return tablero Devuelve un array de tipo Celda
     */
    public Celda[][] getTablero() {
        return tablero;
    }

    /**
     * Metodo que se encarga de modificar el estado de una
     * Celda del Tablero a partir de una fila y columna
     * 
     * @param fila    Recibe un valor de tipo entero
     * @param columna Recibe un valor de tipo entero
     * @param estado  Recibe un valor de tipo entero
     */
    public void setEstado(int fila, int columna, int estado) {
        tablero[fila][columna].setEstado(estado);
    }

    /**
     * Metodo que se encarga de obtener el estado de una Celda
     * del Tablero a partir de una fila y columna
     * 
     * @param fila    Recibe un valor de tipo entero
     * @param columna Recibe un valor de tipo entero
     * @return Devuelve el valor entero del estado obtenido
     */
    public int getEstado(int fila, int columna) {
        return tablero[fila][columna].getEstado();
    }

    /**
     * Metodo que se encarga de obtener una Celda del Tablero
     * a partir de una fila y columna
     * 
     * @param fila    Recibe un valor de tipo entero
     * @param columna Recibe un valor de tipo entero
     * @return Devuelve el objeto Celda obtenido
     */
    public Celda getCelda(int fila, int columna) {
        return tablero[fila][columna];
    }

    public abstract void inicializar();

    public abstract void repartir();

    public abstract void mostrar();
}
