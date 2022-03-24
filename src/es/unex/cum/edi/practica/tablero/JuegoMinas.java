package es.unex.cum.edi.practica.tablero;

import java.io.IOException;

import es.unex.cum.edi.practica.celda.*;

/**
 * Clase JuegoMinas
 *
 * @author Jose Luis Obiang Ela Nanguan
 * @version 1.0_24/03/2022
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
     * Metodo en el que realizamos un bucle que se encarga
     * de pedir una posicion (x,y) del tablero y establecer
     * si se quiere descubrir o anotar como mina
     * 
     * @throws IOException Lanza una excepcion
     */
    @Override
    public void jugar() throws IOException {
        int x, y, option;
        boolean endMines=false;
        Teclado t = new Teclado();

        while (!verSiFin() && !endMines) {

            // Nos aseguramos de que se introduzcan bien los datos
            x = t.literalConEntero("Introduce la posicion x [0," + (tMinas.getNumFilas() - 1) + "]");
            while (x < 0 || x >= tMinas.getNumFilas()) {
                System.out.println("Error:");
                x = t.literalConEntero("Vuelve a introducir la posicion x [0," + (tMinas.getNumFilas() - 1) + "]");
            }

            y = t.literalConEntero("Introduce la posicion y [0," + (tMinas.getNumColumnas() - 1) + "]");
            while (y < 0 || y >= tMinas.getNumColumnas()) {
                System.out.println("Error:");
                y = t.literalConEntero("Vuelve a introducir la posicion y [0," + (tMinas.getNumColumnas() - 1) + "]");
            }

            // Obtenemos la CeldaMinas de las posiciones introducidas
            CeldaMinas cMinas = (CeldaMinas) tMinas.getCelda(x, y);

            String[] args = { "1. Descubrir la celda", "2. Anotar la celda como mina" };
            option = t.Menu(args, 1, 2);
            if (option == 1) {
                cMinas.setDescubierta(true);
            } else {
                int c = tMinas.countMinesTab();
                if (c < tMinas.getNumMaximo()) {
                    // Ponemos el estado de la celda como mina 1
                    tMinas.setEstado(x, y, 1);
                }
            }
            // Mostramos el tablero actualizado
            tMinas.mostrar();
            System.out.println(((CeldaMinas) tMinas.getCelda(x, y)).toString() + "\n");

            // !OJO! El juego tambien finaliza si la celda actual es "mina descubierta"
            if (cMinas.isDescubierta() && cMinas.getEstado() == 1) {
                endMines = true; // Salimos del bucle
            }
        }
    }

    /**
     * Metodo que se encarga de cambiar el estado de la
     * celda segun lo realizado en el paso anterior
     */
    @Override
    public void resolver() {

    }

    /**
     * Metodo que se encarga de ver si el juego ha acabado
     * (finaliza si todas las celdas estan descubiertas menos
     * las minas)
     * 
     * @return Devuelve un valor de tipo booleano
     */
    @Override
    public boolean verSiFin() {
        int cellsUncovered;

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

        // Comprobamos que sea el total de las celdas del tablero, 
        // lo que supone que se han descubierto todas las celdas no minas
        return (cells == (tMinas.getNumFilas()) * tMinas.getNumColumnas());
    }
}
