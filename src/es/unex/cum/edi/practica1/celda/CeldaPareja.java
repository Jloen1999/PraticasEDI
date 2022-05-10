package es.unex.cum.edi.practica.celda;

/**
 * Clase CeldaPareja. Es una clase que deriva de la clase
 * abstracta Celda
 *
 * @author Jose Luis Obiang Ela Nanguan
 * @version 1.0, 22/03/2022
 * @see Celda
 */
public class CeldaPareja extends Celda {

    private int valor;

    /**
     * Constructor por defecto. Inicializa todos los
     * atributos de esta clase y la de su clase padre
     * Celda
     */
    public CeldaPareja() {
        super();
        this.valor = 0;
    }

    /**
     * Constructor parametrizado. Inicializa todos los
     * atributos de esta clase y la de su clase padre
     * Celda con los nuevos valores recibidos
     *
     * @param fila    Recibe un valor de tipo entero
     * @param columna Recibe un valor de tipo entero
     */
    public CeldaPareja(int fila, int columna) {
        super(fila, columna);
        this.valor = 0;
    }

    /**
     * Metodo que nos permite obtener el valor del atributo
     * valor
     *
     * @return valor Devuelve un valor de tipo entero
     */
    public int getValor() {
        return valor;
    }

    /**
     * Metodo que modifica el valor del atributo valor
     *
     * @param valor Recibe un valor de tipo entero
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * Metodo que nos permite obtener el valor del atributo
     * estado en formato cadena teniendo en cuenta los
     * diferentes estados que puede tener una CeldaPareja
     *
     * @return stringStatus Devuelve un valor de tipo cadena
     */
    public String getEstadoString() {
        String stringStatus = "";

        switch (this.estado) {
            case 1:
                stringStatus = "Mostrada";
                break;
            case 2:
                stringStatus = "MostradaEmparejada";
                break;
            default:
                stringStatus = "NoMostrada";
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
        CeldaPareja cP = (CeldaPareja) obj;

        return super.equals(obj) && valor == cP.valor;
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
                " CeldaPareja [estado=" + getEstadoString() + ", valor=" + valor + "]";
    }
}
