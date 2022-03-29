package es.unex.cum.edi.practica.tablero;

import java.io.IOException;

import es.unex.cum.edi.practica.celda.*;

/**
 * Clase JuegoMinas
 *
 * @author Jose Luis Obiang Ela Nanguan
 * @version 1.0, 24/03/2022
 * @see Juego
 */
public class JuegoMinas implements Juego {

    private TableroMinas tMinas;

    /**
     * Constructor por defecto. Inicializa todos los
     * atributos de la clase
     */
    public JuegoMinas() {
        tMinas = new TableroMinas();
    }

    /**
     * Constructor parametrizado. Inicializa todos los
     * atributos de la clase con los nuevos valores
     * obtenidos
     *
     * @param tMinas Recibe un objeto de tipo TableroMinas
     */
    public JuegoMinas(TableroMinas tMinas) {
        this.tMinas = tMinas;
    }

    /**
     * Metodo que nos permite obtener el atributo tMinas
     *
     * @return tMinas Devuelve un objeto de tipo TableroMinas
     */
    public TableroMinas getTMinas() {
        return tMinas;
    }

    /**
     * Metodo que modifica el valor del atributo tMinas
     *
     * @param tMinas Recibe un objeto de tipo TableroMinas
     */
    public void setTMinas(TableroMinas tMinas) {
        this.tMinas = tMinas;
    }

    /**
     * Metodo que nos permite introducir por teclado dos
     * valores enteros, una fila y columna especificas y nos devolvera un entero
     * despues de comprobar su correcta introduccion
     *
     * @param t    Recibe un objeto de tipo Teclado
     * @param coor valor de la fila o columna
     * @param xy   caracter x o y
     * @return coor
     * @throws IOException Lanza una excepcion
     */

    public int enterParametersXY(Teclado t, int coor, char xy) throws IOException {
        if (xy == 'x') {
            coor = t.literalConEntero("Introduce la posicion " + xy + " [0," + (tMinas.getNumFilas() - 1) + "]");
            while (coor < 0 || coor >= tMinas.getNumFilas()) {
                System.out.println("Error:");
                coor = t.literalConEntero("Vuelve a introducir la posicion " + xy + " [0," + (tMinas.getNumFilas() - 1) + "]");
            }
        } else {
            coor = t.literalConEntero("Introduce la posicion " + xy + " [0," + (tMinas.getNumColumnas() - 1) + "]");
            while (coor < 0 || coor >= tMinas.getNumColumnas()) {
                System.out.println("Error:");
                coor = t.literalConEntero("Vuelve a introducir la posicion " + xy + " [0," + (tMinas.getNumColumnas() - 1) + "]");
            }
        }

        return coor;
    }

    /**
     * Metodo que se encarga de mostrar por pantalla todas
     * las celdas que tienen el estado 1 (mina)
     */
    public void showCellsMines() {

        for (int i = 0; i < tMinas.getNumFilas(); i++) {
            for (int j = 0; j < tMinas.getNumColumnas(); j++) {
                CeldaMinas cM = (CeldaMinas) tMinas.getCelda(i, j);
                if (cM.getEstado() == 1) {
                    System.out.println(cM.toString());
                }
            }
        }
    }

    /**
     * Metodo en el que realizamos un bucle que se encarga
     * de pedir una posicion (x,y) del tablero y establecer
     * si se quiere descubrir o anotar como mina
     *
     * @throws IOException Lanza una excepcion
     */
    @Override
    public void jugar() throws IOException {
        int x = 0, y = 0, option;
        char xy;
        boolean endGame;
        Teclado t = new Teclado();

        endGame = false;
        do {
            xy = 'x';
            x = enterParametersXY(t, x, xy); //Introducimos una fila
            xy = 'y';
            y = enterParametersXY(t, y, xy); //Introducimos una columna

            // Obtenemos la CeldaMinas de las posiciones introducidas
            CeldaMinas cMinas = (CeldaMinas) tMinas.getCelda(x, y);

            String[] args = {"1. Descubrir la celda.", "2. Anotar la celda como mina."};
            option = t.Menu(args, 1, 2);
            if (option == 1) {
                cMinas.setDescubierta(true);
            } else {
                resolver(x, y);
            }

            // Mostramos el tablero actualizado
            tMinas.mostrar();
            System.out.println(cMinas.toString() + "\n");

            // !OJO! El juego tambien finaliza si la celda actual es "mina descubierta"
            if (cMinas.isDescubierta() && cMinas.getEstado() == 1) {
                endGame = true;
            }

            if (!endGame) {
                endGame = verSiFin();
            }
        } while (!endGame);

        System.out.println("***** FIN *****");
    }

    /**
     * Metodo que se encarga de cambiar el estado de la
     * celda a partir de una posicion x e y. Anotamos una
     * celda como mina cambiando su estado a 1
     *
     * @param x Recibe un valor de tipo entero
     * @param y Recibe un valor de tipo entero
     */
    @Override
    public void resolver(int x, int y) {
        int c;

        c = ((TableroMinas) tMinas).countMinesTab();
        if (c < tMinas.getNumMaximo()) {
            tMinas.setEstado(x, y, 1);
        }
    }

    /**
     * Metodo que se encarga de ver si el juego ha finalizado
     * (finaliza si todas las celdas no minas estan descubiertas
     * o si el total de minas anotadas es igual al maximo de minas
     *
     * @return endGame Devuelve un valor de tipo booleano
     */
    @Override
    public boolean verSiFin() {
        int cellsUncovered;
        boolean endGame;

        endGame = false;
        // Obtenemos todas las celdas descubiertas que no son minas
        cellsUncovered = 0;
        for (int i = 0; i < tMinas.getNumFilas(); i++) {
            for (int j = 0; j < tMinas.getNumColumnas(); j++) {
                if (tMinas.getTablero()[i][j].getClass().equals(CeldaMinas.class)) {
                    CeldaMinas cM = (CeldaMinas) tMinas.getCelda(i, j);
                    if (cM.isDescubierta() && cM.getEstado() != 1) {
                        cellsUncovered++;
                    }
                }
            }
        }

        // Celdas descubiertas no minas + todas las minas del tablero
        int cells = cellsUncovered + ((TableroMinas) tMinas).countMinesTab();
        if (cells == (tMinas.getNumFilas()) * tMinas.getNumColumnas()) {
            // Si se descubre todas las celdas que no son minas
            System.out.println("Todas las celdas no minas han sido descubiertas.");
            endGame = true;
        }

        // Si anotamos todas las minas
        if (tMinas.countMinesTab() == tMinas.getNumMaximo()) {
            System.out.println("Todas las minas han sido anotadas.");
            showCellsMines();

            endGame = true;
        }
        return endGame;
    }
}
