package es.unex.cum.edi.practica.celda;

/**
 * Clase CeldaRaya. Es una clase que deriva de la clase
 * abstracta Celda
 * 
 * @author Jose Luis Obiang
 * @version 1.0
 * @see Celda
 */
public class CeldaRaya extends Celda {

    private int color;

    /**
     * Constructor por defecto. Inicializa todos los
     * atributos de esta clase y la de su clase padre
     * Celda
     */
    public CeldaRaya() {
        super();
        color = 0;
    }

    /**
     * Constructor parametrizado. Inicializa todos los
     * atributos de esta clase y la de su clase padre
     * Celda con los nuevos valores recibidos
     * 
     * @param fila    Recibe un valor de tipo entero
     * @param columna Recibe un valor de tipo entero
     */
    public CeldaRaya(int fila, int columna) {
        super(fila, columna);
        color = 0;
    }

    /**
     * Metodo que nos permite obtener el valor del atributo
     * color
     * 
     * @return color Devuelve un valor de tipo entero
     */
    public int getColor() {
        return color;
    }

    /**
     * Metodo que modifica el valor del atributo color
     * 
     * @param color Recibe un valor de tipo entero
     */
    public void setColor(int color) {
        this.color = color;
    }

    /**
     * Metodo que nos permite obtener el valor del atributo
     * estado en formato cadena teniendo en cuenta los
     * diferentes estados que puede tener una CeldaRaya
     * 
     * @return stringStatus Devuelve un valor de tipo cadena
     */
    public String getEstadoString() {
        String stringStatus = "";

        switch (this.estado) {
            case 1:
                stringStatus = "asignada a humana";
                break;
            case 2:
                stringStatus = "asignada a ordenador";
                break;
            default:
                stringStatus = "vacia";
        }
        return stringStatus;
    }

    /**
     * Metodo redefinido para comparar todos los atributos
     * de esta clase y la de su padre Celda
     * 
     * @param obj Recibe un objeto global
     * @return Devuelve un valor de tipo booleano
     */
    @Override
    public boolean equals(Object obj) {
        CeldaRaya cR = (CeldaRaya) obj;

        return super.equals(obj) && color == cR.color;
    }

    /**
     * Metodo redefinido para mostrar todos los atributos de
     * esta clase y la de su padre Celda
     * 
     * @return Devuelve un valor de tipo cadena
     */
    @Override
    public String toString() {
        return super.toString() +
                " CeldaRaya [estado=" + getEstadoString() +
                ", color=" + (color == 0 ? "rojo" : "azul") + "]";
    }
}
