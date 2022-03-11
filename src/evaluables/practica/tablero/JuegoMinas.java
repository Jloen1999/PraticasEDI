package unex.cum.edi.practica.tablero;

import unex.cum.edi.practica.celda.CeldaMinas;

import java.util.Random;

public class JuegoMinas {
    TableroMinas tMinas = new TableroMinas();
    private Random r = new Random();
    private boolean[] v_aux = new boolean[tMinas.getNumMaximo() + 1];
    private int contarCantados, contarNoCantados;

    /**
     * Inicializa los atributos contarConatados y contarNoCantados
     */
    public JuegoMinas() {
        contarCantados = 0;
        contarNoCantados = 0;
    }

    /**
     * Inicializa el vector auxiliar de booleano a false
     *
     */
    public void inicializarVAux() {
        for (int i = 0; i < v_aux.length; i++) {
            v_aux[i] = false;
        }
    }

    /**
     * Se encarga de sacar un numero aleatorio de 1-90. Asegura con el vector
     * booleano v_aux que el numero sacado no vuelva a salir, donde el vector es
     * verdadero en la posicion del numero aleatorio
     *
     * @return bola Devuleve un valor de tipo entero
     */
    public int sacarNumero() {
        int bola;
        bola = r.nextInt(tMinas.getNumMaximo()) + 1;
        while (v_aux[bola]) {
            bola = r.nextInt(tMinas.getNumMaximo()) + 1;
        }
        v_aux[bola] = true;

        return bola;
    }

    /**
     * Modifica el estado del numero sacado, si coincide con alguno del tablero se
     * pone el estado a 2 (numero cantado). Tambi�n muestra un mensaje de los
     * numeros cantados y no cantados.
     *
     * @param bola
     *            Recibe un valor de tipo entero
     */
    public void tacharNumero(int bola) {
        int i, j;
        boolean cantado;
        cantado = false;
        i = 0;
        while (i < tMinas.numFilas && !cantado) {
            j = 0;
            while (j < tMinas.numColumnas && !cantado) {
                if (tMinas.tablero[i][j].getClass().equals(CeldaMinas.class)) {
                    CeldaMinas cMinas = (CeldaMinas) tMinas.tablero[i][j];
                    if (cMinas.getNumero() == bola) {
                        cMinas.setEstado(2);
                        cantado = true;
                    }
                }
                j++;
            }
            i++;
        }
        if (cantado) {
            System.out.println(bola + " Cantado");
            contarCantados++;
        } else {
            System.out.println(bola + " NO cantado");
            contarNoCantados++;
        }
    }

    /**
     * Muestra todas las celdas con su formato de toString
     */
    public void mostrarFormatoToString() {
        for (int i = 0; i < tMinas.numFilas; i++) {
            for (int j = 0; j < tMinas.numColumnas; j++) {
                CeldaMinas cMinas = (CeldaMinas) tMinas.tablero[i][j];
                System.out.println(cMinas.toString());
            }
        }
    }

    /**
     * Comprueba si todos los numeros del tablero tienen el estado 2 (cantado)
     *
     * @return bandera Devuelve un valor de tipo booleano, verdadero si todos estan
     *         cantados
     */
    public boolean verSiFin() {
        int contador;
        contador = 0;
        for (int i = 0; i < tMinas.numFilas; i++) {
            for (int j = 0; j < tMinas.numColumnas; j++) {
                if (tMinas.tablero[i][j].getClass().equals(CeldaMinas.class)) {
                    CeldaMinas cMinas = (CeldaMinas) tMinas.tablero[i][j];
                    if (cMinas.getEstado() == 2) {
                        contador++;
                    }
                }
            }
        }
        return contador == (tMinas.numFilas * tMinas.numColumnas);
    }

    /**
     * Comprueba si todos los numeros de una fila del tablero tiene el estado 2
     * (cantado)
     *
     * @return linea Devuelve un valor de tipo booleano, verdadero todos los numeros
     *         de las celdas de una fila estan cantados
     */
    public boolean premioLinea() {
        int i, j, contador;
        boolean linea;
        linea = false;
        i = 0;
        while (i < tMinas.numFilas && !linea) {
            j = 0;
            contador = 0;
            while (j < tMinas.numColumnas && !linea) {
                if (tMinas.tablero[i][j].getClass().equals(CeldaMinas.class)) {
                    CeldaMinas cMinas = (CeldaMinas) tMinas.tablero[i][j];
                    if (cMinas.getEstado() == 2) {
                        contador++;
                    }
                }
                j++;
            }
            if (contador == tMinas.numColumnas) {
                linea = true;
            }
            i++;
        }
        return linea;
    }

    /**
     * Comprueba si todos los numeros de dos filas del tablero tienen el estado 2
     * (cantado)
     *
     * @return dobleLinea Devuelve un valor de tipo booleano, verdadero cuando todos
     *         los numeros de las celdas de dos filas estan cantados
     */
    public boolean premioDobleLinea() {
        int i, j, contador1, contador2;
        boolean dobleLinea;
        dobleLinea = false;
        i = 0;
        contador2 = 0;
        while (i < tMinas.numFilas && !dobleLinea) {
            j = 0;
            contador1 = 0;
            while (j < tMinas.numColumnas) {
                if (tMinas.tablero[i][j].getClass().equals(CeldaMinas.class)) {
                    CeldaMinas cMinas = (CeldaMinas) tMinas.tablero[i][j];
                    if (cMinas.getEstado() == 2) {
                        contador1++;
                    }
                }
                j++;
            }

            if (contador1 == tMinas.numColumnas) {
                contador2 += contador1;
                if (contador2 == (tMinas.numColumnas * 2)) {
                    dobleLinea = true;
                }
            }
            i++;
        }
        return dobleLinea;
    }

    /**
     * Muestra mensajes de los distintos premios que hay en el bingo
     */
    public void mostarPremio() {
        if (verSiFin()) {
            System.out.println("!!!!     BINGOOOOOOOOOO     !!!!");
        } else {
            if (premioDobleLinea()) {
                System.out.println("!!!!        PREMIO DOBLE LINEA        !!!!");
            } else {
                if (premioLinea()) {
                    System.out.println("!!!!        PREMIO LINEA        !!!!");
                }
            }
        }
    }

    /**
     * Recupera el valor del atributo contarCantados. Se usa para averiguar la
     * cantidad de numeros que han sido cantados
     *
     * @return contarCantados Devuelve un valor de tipo entero
     */
    public int getContarCantados() {
        return contarCantados;
    }

    /**
     * Recupera el valor del atributo contarNoCantados. Se usa para averiguar la
     * cantidad de numeros que han sido cantados
     *
     * @return contarNoCantados Devuelve un valor de tipo entero
     */
    public int getContarNoCantados() {
        return contarNoCantados;
    }
}
