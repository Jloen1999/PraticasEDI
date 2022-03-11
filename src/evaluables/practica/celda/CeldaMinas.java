package unex.cum.edi.practica.celda;

public class CeldaMinas extends Celda{
    //Declaraciones
    private int numero;
    
    public CeldaMinas() {
        super();
        numero=0;
    }
    /**
     * Constructor Parametrizado. Recibe valores:
     *
     * @param fila
     *            De tipo entero
     * @param columna
     *            De tipo entero
     */
    public CeldaMinas(int fila, int columna) {
        super(fila, columna);
    }

    /**
     * Constructor Parametrizado. Recibe valores:
     *
     * @param imagenReverso
     *            De tipo cadena
     * @param imagenFrontal
     *            De tipo cadena
     * @param estado
     *            De tipo entero
     * @param numero
     *            De tipo entero
     */
    public CeldaMinas(String imagenReverso, String imagenFrontal, int estado, int numero) {
        super(imagenReverso, imagenFrontal, estado);
        this.numero = numero;
    }

    /**
     * Modifica el valor del atributo numero
     *
     * @param numero
     *            Recibe un nuevo valor de tipo entero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Recupera el valor del atributo numero
     *
     * @return numero Devuelve un valor de tipo entero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Redefinicion del metodo equals de la clase Object
     *
     * @param obj
     *            Recibe un objeto de la clase Object
     * @return true si los objectos son iguales y false en caso contrario
     */
    public boolean equals(Object obj) {
        CeldaMinas cBingo = (CeldaMinas) obj;
        return super.equals(obj) && this.numero == cBingo.numero;
    }

    /**
     * Devuelve una cadena con todos los valores en formato String
     *
     * @return Cadena Devuelve una cadena con los valores
     */
    public String toString() {
        return (super.toString() + " Bingo[Numero: " + this.numero + "]");
    }

}
