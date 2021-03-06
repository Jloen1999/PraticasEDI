package es.unex.cum.edi.practica.tablero;

import java.util.Random;

import es.unex.cum.edi.practica.celda.*;

/**
 * Clase TableroMinas. Es una clase que deriva de la clase
 * abstracta Tablero
 *
 * @author Jose Luis Obiang Ela Nanguan
 * @version 1.0, 11/05/2022
 * @see Tablero, Colores
 */
public class TableroMinas extends Tablero implements Colores {

    private int numMaximo;

    /**
     * Constructor por defecto. Inicializa todos los
     * atributos de esta clase y la de su padre Tablero
     */
    public TableroMinas() {
        super();
        numMaximo = 3;
    }

    /**
     * Constructor parametrizado. Inicializa todos los
     * atributos de esta clase y la de su padre Tablero
     * con los nuevos valores recibidos
     *
     * @param numFilas    Recibe un valor de tipo entero
     * @param numColumnas Recibe un valor de tipo entero
     * @param numMaximo   Recibe un valor de tipo entero
     */
    public TableroMinas(int numFilas, int numColumnas, int numMaximo) {
        super(numFilas, numColumnas);
        this.numMaximo = numMaximo;
    }

    /**
     * Metodo que nos permite obtener el valor del atributo
     * numMaximo
     *
     * @return numMaximo Devuelve un valor de tipo entero
     */
    public int getNumMaximo() {
        return numMaximo;
    }

    /**
     * Metodo que modifica el valor del atributo numMaximo
     *
     * @param numMaximo Recibe un valor de tipo entero
     */
    public void setNumMaximo(int numMaximo) {
        this.numMaximo = numMaximo;
    }

    /**
     * Metodo que se encarga de contar el numero de minas
     * que hay en todas las celdas del tablero
     *
     * @return contador Devuelve un valor de tipo entero
     */
    public int contarMinasTablero() {
        int contador;

        contador = 0;
        for (int i = 0; i < super.numFilas; i++) {
            for (int j = 0; j < super.numColumnas; j++) {
                if (super.tablero[i][j].getEstado() == 1) {
                    contador++;
                }
            }
        }
        return contador;
    }

    /**
     * Metodo que se encarga de pintar en pantalla el
     * borde superior e inferior del tablero. Le
     * ponemos color de fondo Blanco y texto negro
     */
    public void pintarBordeSupInf() {

        System.out.print("---");
        for (int i = 0; i < super.numColumnas; i++) {
            System.out.print("---");
        }
        System.out.println("---");
    }

    /**
     * Metodo que se encarga de inicializar todas las
     * celdas del tablero a partir del contructor de
     * la clase derivada CeldaMinas
     */
    @Override
    public void inicializar() {

        for (int i = 0; i < super.numFilas; i++) {
            for (int j = 0; j < super.numColumnas; j++) {
                super.tablero[i][j] = new CeldaMinas(i, j);
            }
        }
    }

    /**
     * Metodo que se encarga de repartir datos a todas
     * las celdas del Tablero. Genera numeros aleatorios
     * en el intervalo [0,3] para todos los estados de celdas
     * del tablero, teniendo en cuenta el numero maximo de minas.
     * Previamente haber inicializado el tablero
     */
    @Override
    public void repartir() {
        int aleatorio, contador;

        aleatorio = contador = 0;
        for (int i = 0; i < super.numFilas; i++) {
            for (int j = 0; j < super.numColumnas; j++) {
                // Numero aleatorio de 0 a 3 incluidos
                aleatorio = (new Random()).nextInt(4);

                // !OJO! Nos aseguramos de que el numero de minas no exceda el maximo
                if (contador >= numMaximo && aleatorio == 1) {
                    while (aleatorio == 1) {
                        aleatorio = (new Random()).nextInt(4);
                    }
                } else {
                    contador++;
                }
                setEstado(i, j, aleatorio);
            }
        }
    }

    /**
     * Metodo que se encarga de mostrar el Tablero en un
     * formato grafico. Significados de caracteres en el
     * tablero:
     * (-) -> Borde superior e inferior del tablero
     * (|) -> Borde derecho e izquierdo del tablero
     * (*) -> Mina descubierta del tablero
     * (#) -> Casilla no descubierta
     * (0|1|2|3) -> Valor del estado de la casilla del tablero.
     */
    @Override
    public void mostrar() {

        pintarBordeSupInf();
        for (int i = 0; i < super.numFilas; i++) {
            System.out.print("|  ");
            for (int j = 0; j < super.numColumnas; j++) {
                CeldaMinas cM = (CeldaMinas) getCelda(i, j);
                if (cM.isDescubierta() && cM.getEstado() == 1) {
                    System.out.print(" * ");
                } else {
                    if (cM.isDescubierta() && cM.getEstado() != 1) {
                        System.out.print(" " + cM.getEstado() + " ");
                    } else {
                        System.out.print(" # ");
                    }
                }
            }
            System.out.println("  |");
        }
        pintarBordeSupInf();
    }
}
