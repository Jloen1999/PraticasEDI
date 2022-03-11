package unex.cum.edi.practica.tablero;

import unex.cum.edi.practica.celda.Celda;

import java.util.Arrays;

public abstract class Tablero { //Clase abstracta
    //Declaraciones
    protected int numFilas;//Número de filas (modificable en el constructor)
    protected int numColumnas;// Número de columnas (modificable en el constructor)
    protected Celda[][] tablero;//Matriz bidimensional de Celdas

    /**
     * @Description Constructor por Defecto. Inicializa todos los atributos de la clase
     *
     */
    public Tablero() {
        numFilas = 0;
        numColumnas = 0;
        tablero = new Celda[3][3];
    }
    /**
     * @Description Constructor Parametrizado
     *
     * @param numFilas Recibe una valor de tipo entero
     * @param numColumnas Recibe una valor de tipo entero
     */
    public Tablero(int numFilas, int numColumnas) {
        this.numFilas = numFilas;
        this.numColumnas = numColumnas;
        this.tablero = new Celda[this.numFilas][this.numColumnas];
    }


    /**
     * Modifica el estado de la celda indicada por la fila y la columna
     *
     * @param fila
     *            Recibe un valor de tipo entero
     * @param columna
     *            Recibe un valor de tipo entero
     * @param estado
     *            Recibe un valor de tipo entero
     */
    public void setEstado(int fila, int columna, int estado) {
        tablero[fila][columna].setEstado(estado);
    }

    /**
     * @Description Recupera el valor del estado de la celda indicada
     *
     * @param fila Recibe un valor de tipo entero
     * @param columna Recibe un valor de tipo entero
     * @return estado Devuelve el estado de la celda indicada en la fila y la columna
     */
    public int getEstado(int fila, int columna) {

        return tablero[fila][columna].getEstado();
    }

    /**
     * Recupera el valor de una Celda
     *
     * @param fila
     *            Recibe un valor de tipo entero
     * @param columna
     *            Recibe un valor de tipo entero
     * @return Celda Devuelve la Celda indicada en la fila y la columna
     */
    public Celda getCelda(int fila, int columna) {

        return tablero[fila][columna];
    }

    /**
     * Se encarga de inicializar el tablero a las celdas, que es llamado en la clase
     * TableroBingo
     */
    public abstract void inicializar();

    /**
     * Se encarga de repartir
     */
    public abstract void repartir();

    /**
     * Se encarga de mostrar el Tablero en un formato grafico
     */
    public abstract void mostrar();

}
