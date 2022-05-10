package es.unex.cum.edi.practica.tablero;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import es.unex.cum.edi.practica.celda.*;

/**
 * Clase JuegoMinas
 *
 * @author Jose Luis Obiang Ela Nanguan
 * @version 1.0, 11/05/2022
 * @see Juego
 */
public class JuegoMinas implements Juego {

    private TableroMinas tMinas;
    private Queue<CeldaMinas> celdaMinas;

    /**
     * Constructor por defecto. Inicializa todos los
     * atributos de la clase
     */
    public JuegoMinas() {
        tMinas = new TableroMinas();
        celdaMinas = new LinkedList<CeldaMinas>();
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
        celdaMinas = new LinkedList<CeldaMinas>();
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
     * Metodo que nos permite obtener la cola de celdaMinas
     * 
     * @return celdaMinas Devuelve una lista de tipo Queue
     */
    public Queue<CeldaMinas> getCeldaMinas() {
        return celdaMinas;
    }

    /**
     * Metodo que nos permite agregar una nueva CeldaMinas en
     * la cola de celdaMinas
     * 
     * @param cMina Recibe un objeto de tipo CeldaMinas
     * @return true si la CeldaMina se agregó correctamente, de lo contrario false
     */
    public boolean addCeldaMinas(CeldaMinas cMina) {

        if (cMina != null) {
            CeldaMinas c = new CeldaMinas(cMina);
            return celdaMinas.offer(c);
        }
        return false;
    }

    /**
     * Metodo que nos permite mostrar todos los datos que
     * hay en la cola de movimientos celdaMinas
     */
    public void mostrarMovimientos() {

        if (!celdaMinas.isEmpty()) {

            System.out.println("------------------------------------------------------------------------");
            System.out.println("------------ Mostrando los movimientos de la última partida ------------");
            System.out.println("------------------------------------------------------------------------");

            Iterator<CeldaMinas> it = celdaMinas.iterator();
            while (it.hasNext()) {
                CeldaMinas cMina = (CeldaMinas) it.next();
                System.out.println(cMina.toString());
            }
        } else {
            System.out.println("No hay movimientos");
        }
    }

    /**
     * Metodo que nos permite introducir por teclado dos
     * valores enteros, una fila y columna especificas y nos devolvera un entero
     * despues de comprobar su correcta introduccion
     *
     * @param t    Recibe un objeto de tipo Teclado
     * @param coor valor de la fila o columna
     * @param tipo Cadena que identifica el tipo de parametro a obtener
     * @return coor
     * @throws IOException Lanza una excepcion
     */
    public int introducirParametros(Teclado t, int coor, String tipo) throws IOException {

        if (tipo.equals("fila")) {
            coor = t.literalConEntero("Introduce una fila de 0 a " + (tMinas.getNumFilas() - 1) + " incluidos");
            while (coor < 0 || coor >= tMinas.getNumFilas()) {
                System.out.println("Error:");
                coor = t.literalConEntero(
                        "Vuelve a introducir una fila de 0 a " + (tMinas.getNumFilas() - 1) + " incluidos");
            }
        } else {
            coor = t.literalConEntero("Introduce una columna de 0 a " + (tMinas.getNumColumnas() - 1) + " incluidos");
            while (coor < 0 || coor >= tMinas.getNumColumnas()) {
                System.out.println("Error:");
                coor = t.literalConEntero(
                        "Vuelve a introducir una columna de 0 a " + (tMinas.getNumColumnas() - 1) + " incluidos");
            }
        }
        return coor;
    }

    /**
     * Metodo que se encarga de mostrar por pantalla todas
     * las celdas que tienen el estado 1 (mina)
     */
    public void mostrarCeldasMinas() {

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
     * Metodo en el que realizamos un bucle que se encarga de pedir una posicion
     * (x,y) del tablero y establecer si se quiere descubrir o anotar como mina
     *
     * @return ganado true si ganas, false en caso contrario
     * @throws IOException Lanza una excepcion
     */
    @Override
    public boolean jugar() throws IOException {
        int fila = 0, columna = 0, opcion;
        boolean finalizarJuego, continuarJuego, ganado;
        Teclado t = new Teclado();

        finalizarJuego = ganado = false;
        do {
            continuarJuego = false;

            fila = introducirParametros(t, fila, "fila"); // Introducimos una fila
            columna = introducirParametros(t, columna, "columna"); // Introducimos una columna

            // Obtenemos la CeldaMinas de las posiciones introducidas
            CeldaMinas cMinas = (CeldaMinas) tMinas.getCelda(fila, columna);

            String[] opciones = { "1. Descubrir la celda.", "2. Anotar la celda como mina.", "3. Regresar." };
            opcion = t.Menu(opciones, 1, 3);
            if (opcion == 1) {
                if (!cMinas.isDescubierta()) {
                    cMinas.setDescubierta(true);
                    continuarJuego = true;
                }
            } else if (opcion == 2) {
                if (!cMinas.isDescubierta()) {
                    if (cMinas.getEstado() != 1) {
                        resolver(fila, columna);
                        continuarJuego = true;
                    }
                }
            }

            if (opcion != 3 && continuarJuego) {

                addCeldaMinas(cMinas);

                // Mostramos el tablero actualizado
                tMinas.mostrar();
                System.out.println(cMinas.toString() + "\n");

                // !OJO! El juego tambien finaliza si la celda actual es "mina descubierta"
                if (cMinas.isDescubierta() && cMinas.getEstado() == 1) {
                    finalizarJuego = true;
                }

                if (!finalizarJuego) {
                    finalizarJuego = verSiFin();
                    ganado = finalizarJuego;
                }
            } else if (!continuarJuego) {

                if (cMinas.isDescubierta()) {
                    System.out.println("Error: esta celda ya esta descubierta.");
                } else {
                    if (opcion == 2 && cMinas.getEstado() == 1) {
                        System.out.println("Error: esta celda ya es una mina.");
                    }
                }
                // Mostramos el tablero actualizado
                System.out.println(cMinas.toString());
                tMinas.mostrar();
            }
        } while (!finalizarJuego);

        return ganado;
    }

    /**
     * Metodo que se encarga de cambiar el estado de la
     * celda a partir de una posicion fila y columna.
     * Anotamos una celda como mina cambiando su estado a 1
     *
     * @param fila    Recibe un valor de tipo entero
     * @param columna Recibe un valor de tipo entero
     */
    @Override
    public void resolver(int fila, int columna) {
        int c;

        c = ((TableroMinas) tMinas).contarMinasTablero();
        if (c < tMinas.getNumMaximo()) {
            tMinas.setEstado(fila, columna, 1);
        }
    }

    /**
     * Metodo que se encarga de ver si el juego ha finalizado
     * (finaliza si todas las celdas no minas estan descubiertas,
     * si el total de minas anotadas es igual al maximo de minas o
     * si una celda mina es descubierta)
     *
     * @return finalizarJuego Devuelve un valor de tipo booleano
     */
    @Override
    public boolean verSiFin() {
        int celdasDescubiertas;
        boolean finalizarJuego;

        finalizarJuego = false;
        // Obtenemos todas las celdas descubiertas que no son minas
        celdasDescubiertas = 0;
        for (int i = 0; i < tMinas.getNumFilas(); i++) {
            for (int j = 0; j < tMinas.getNumColumnas(); j++) {
                if (tMinas.getTablero()[i][j].getClass().equals(CeldaMinas.class)) {
                    CeldaMinas cM = (CeldaMinas) tMinas.getCelda(i, j);
                    if (cM.isDescubierta() && cM.getEstado() != 1) {
                        celdasDescubiertas++;
                    }
                }
            }
        }

        // Celdas descubiertas no minas + todas las minas del tablero
        int celdas = celdasDescubiertas + ((TableroMinas) tMinas).contarMinasTablero();
        if (celdas == (tMinas.getNumFilas()) * tMinas.getNumColumnas()) {
            // Si se descubre todas las celdas que no son minas
            System.out.println("Todas las celdas no minas han sido descubiertas.");
            finalizarJuego = true;
        }

        // Si anotamos todas las minas
        if (tMinas.contarMinasTablero() == tMinas.getNumMaximo()) {
            System.out.println("Todas las minas han sido anotadas.");
            mostrarCeldasMinas();

            finalizarJuego = true;
        }
        return finalizarJuego;
    }
}
