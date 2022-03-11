package unex.cum.edi.practica.celda;

import java.util.Objects;

public abstract class Celda {//Clase abstracta
    //Declaraciones
    protected int fila;
    protected int columna;
    protected String imageReverso;
    protected String imageFrontal;
    protected int estado;

    /**
     * Constructor por Defecto. Inicializa todos los atributos de la clase.
     */
    public Celda() {
        fila = -1;
        columna = -1;
        imageReverso = new String();
        imageFrontal = new String();
        estado = 0;
    }

    /**
     * Constructor Parametrizado. Recibe valores:
     *
     * @param fila
     *            De tipo entero
     * @param columna
     *            De tipo entero
     */
    public Celda(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    /**
     * Constructor Parametrizado. Recibe valores:
     *
     * @param imagenReverso
     *            De tipo entero
     * @param imagenFrontal
     *            De tipo cadena
     * @param estado
     *            De tipo entero
     */
    public Celda(String imagenReverso, String imagenFrontal, int estado) {
        this.imageReverso = imagenReverso;
        this.imageFrontal = imagenFrontal;
        this.estado = estado;
    }

    /**
     * Modifica el valor del atributo fila
     *
     * @param fila
     *            Recibe un nuevo valor de tipo entero
     */
    public void setFila(int fila) {
        this.fila = fila;
    }

    /**
     * Recupera el valor del atributo fila
     *
     * @return fila Devuelve un valor de tipo entero
     */
    public int getFila() {
        return fila;
    }

    /**
     * Modifica el valor del atributo columna
     *
     * @param columna
     *            Recibe un nuevo valor de tipo entero
     */
    public void setColumna(int columna) {
        this.columna = columna;
    }

    /**
     * Recupera el valor del atributo fila
     *
     * @return fila Devuelve un valor de tipo entero
     */
    public int getColumna() {
        return columna;
    }

    /**
     * Modifica el valor del atributo imageReverso
     *
     * @param imageReverso
     *            Recibe un nuevo valor de tipo cadena
     */
    public void setImageReverso(String imageReverso) {
        this.imageReverso = imageReverso;
    }

    /**
     * Recupera el valor del atributo imageReverso
     *
     * @return imageReverso Devuelve un valor de tipo cadena
     */
    public String getImageReverso() {
        return imageReverso;
    }

    /**
     * Modifica el valor del atributo imageFrontal
     *
     * @param imageFrontal
     *            Recibe un nuevo valor de tipo cadena
     */
    public void setImageFrontal(String imageFrontal) {
        this.imageFrontal = imageFrontal;
    }

    /**
     * Recupera el valor del atributo imageFrontal
     *
     * @return imageFrontal Devuelve un valor de tipo cadena
     */
    public String getImageFrontal() {
        return imageFrontal;
    }

    /**
     * Modifica el valor del atributo estado
     *
     * @param estado
     *            Recibe un nuevo valor de tipo entero
     */
    public void setEstado(int estado) {
        this.estado = estado;
    }

    /**
     * Recupera el valor del atributo estado
     *
     * @return estado Devuelve un valor de tipo entero
     */
    public int getEstado() {
        return estado;
    }

    /**
     * Redefinici�n del metodo equals de la clase Object
     *
     * @param obj
     *            Recibe un objeto de tipo Object
     * @return true si los objectos son iguales y false en caso contrario
     */
    public boolean equals(Object obj) {
        Celda cel = (Celda) obj;

        return this.fila == cel.fila && this.columna == cel.columna && this.imageReverso.equals(cel.imageReverso)
                && this.imageFrontal.equals(cel.imageFrontal) && this.estado == cel.estado;
    }

    /**
     * Devuelve una cadena con todos los valores en formato String
     *
     * @return Cadena Valor de tipo cadena
     */
    public String toString() {

        return ("Celda [fila=" + this.fila + ", columna=" + this.columna + ", imagen reverso=" + this.imageReverso
                + ", imagen frontal=" + this.imageFrontal + ", estado= " + this.estado + "]");
    }

}
