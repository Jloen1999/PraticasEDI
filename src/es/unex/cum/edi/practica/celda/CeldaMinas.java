package es.unex.cum.edi.practica.celda;

/**
 * Clase CeldaMinas. Es una clase que deriva de la clase
 * abstracta Celda
 *
 * @author Jose Luis Obiang Ela Nanguan
 * @version 1.0_24/03/2022
 * @see Celda
 */
public class CeldaMinas extends Celda {

    private boolean descubierta;

    /**
     * Constructor por defecto. Inicializa todos los
     * atributos de esta clase y de su clase padre
     * Celda
     */
    public CeldaMinas() {
        super();
        descubierta = false;
    }

    /**
     * Constructor parametrizado. Inicializa todos los
     * atributos de esta clase y la de su clase padre Celda
     * con los nuevos valores recibidos
     * 
     * @param fila    Recibe un valor de tipo entero
     * @param columna Recibe un valor de tipo entero
     */
    public CeldaMinas(int fila, int columna) {
        super(fila, columna);
        descubierta = false;
    }

    /**
     * Metodo que nos permite obtener el valor del atributo
     * descubierta
     * 
     * @return descubierta Devuelve un valor de tipo booleano
     */
    public boolean isDescubierta() {
        return descubierta;
    }

    /**
     * Metodo que modifica el valor del atributo descubierta
     * 
     * @param descubierta Recibe un valor de tipo booleano
     */
    public void setDescubierta(boolean descubierta) {
        this.descubierta = descubierta;
    }

    /**
     * Metodo que nos permite obtener el valor del atributo
     * estado en formato cadena teniendo en cuenta los
     * diferentes estados que puede tener una CeldaMinas
     * 
     * @return stringStatus Devuelve un valor de tipo cadena
     */
    public String getEstadoString() {
        String stringStatus = "";

        if (!descubierta) {
            switch (this.estado) {
                case 0:
                    stringStatus = "agua oculta";
                    break;
                case 1:
                    stringStatus = "mina oculta";
                    break;
                case 2:
                    stringStatus = "agua marcada como mina";
                    break;
                case 3:
                    stringStatus = "mina marcada como mina";
            }
        } else {
            switch (this.estado) {
                case 0:
                    stringStatus = "agua descubierta";
                    break;
                case 1:
                    stringStatus = "mina descubierta. ***** FIN *****";
            }
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
        CeldaMinas cM = (CeldaMinas) obj;

        return super.equals(obj) && descubierta == cM.descubierta;
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
                " CeldaMinas [estado=" + getEstadoString() + "]";
    }
}
