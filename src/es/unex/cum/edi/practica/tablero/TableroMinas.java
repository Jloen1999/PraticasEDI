package es.unex.cum.edi.practica.tablero;

import java.util.Random;

import es.unex.cum.edi.practica.celda.*;

/**
 * Clase TableroMinas. Es una clase que deriva de la clase
 * abstracta Tablero
 * 
 * @author Jose Luis Obiang Ela Nanguan
 * @version 1.0, 23/03/2022
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
     * @return counterMines Devuelve un valor de tipo entero
     */
    public int countMinesTab() {
        int counterMines;

        counterMines = 0;
        for (int i = 0; i < super.numFilas; i++) {
            for (int j = 0; j < super.numColumnas; j++) {
                if (super.tablero[i][j].getEstado() == 1) {
                    counterMines++;
                }
            }
        }
        return counterMines;
    }

    /**
     * Metodo que se encarga de pintar en pantalla el
     * borde superior e inferior del tablero. Le
     * ponemos color de fondo Blanco y texto negro
     */
    public void printBorderUpDown() {

        System.out.print(ANSI_WHITE_BACKGROUND + ANSI_BLACK + "---");
        for (int i = 0; i < super.numColumnas; i++) {
            System.out.print("---");
        }
        System.out.println("---" + ANSI_RESET);
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
        int nRandom, counterMines;

        nRandom = counterMines = 0;
        for (int i = 0; i < super.numFilas; i++) {
            for (int j = 0; j < super.numColumnas; j++) {
                // Numero aleatorio de 0 a 3 incluidos
                nRandom = (new Random()).nextInt(4);

                // !OJO! Nos aseguramos de que el numero de minas no exceda el maximo
                if (counterMines >= numMaximo && nRandom == 1) {
                    while (nRandom == 1) {
                        nRandom = (new Random()).nextInt(4);
                    }
                } else {
                    counterMines++;
                }
                setEstado(i, j, nRandom);
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
     * Colores de estados:
     * (verde) -> Estado 0
     * (rojo) -> Estado 1 (*)
     * (azul) -> Estado 2
     * (amarillo) -> Estado 3
     */
    @Override
    public void mostrar() {
        String color;

        printBorderUpDown();
        for (int i = 0; i < super.numFilas; i++) {
            System.out.print(ANSI_WHITE_BACKGROUND + ANSI_BLACK + "|  " + ANSI_RESET);
            for (int j = 0; j < super.numColumnas; j++) {
                CeldaMinas cM = (CeldaMinas) getCelda(i, j);
                if (cM.isDescubierta() && cM.getEstado() == 1) {
                    System.out.print(ANSI_RED + " * " + ANSI_RESET);
                } else {
                    if (cM.isDescubierta() && cM.getEstado() != 1) {

                        color = "";
                        // Establecemos los colores
                        if (cM.getEstado() == 0) { // Color azul
                            color = ANSI_BLUE + " ";
                        } else if (cM.getEstado() == 2) { // Color verde
                            color = ANSI_GREEN + " ";
                        } else { // Color amarillo
                            color = ANSI_YELLOW + " ";
                        }
                        System.out.print(color + cM.getEstado() + " " + ANSI_RESET);
                    } else {
                        System.out.print(" # ");
                    }
                }
            }
            System.out.println(ANSI_WHITE_BACKGROUND + ANSI_BLACK + "  |" + ANSI_RESET);
        }
        printBorderUpDown();
    }
}
