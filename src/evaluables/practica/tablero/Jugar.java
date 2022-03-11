package unex.cum.edi.practica.tablero;

import java.io.IOException;

public class Jugar {
    private Teclado t = new Teclado();
    private JuegoMinas jMinas = new JuegoMinas();
    private String[] menu = { "1. Jugar hasta obtener el premio BINGO.", "2. Jugar con diferentes Premios.", "3. FIN" };

    public static void main(String[] args) throws IOException {
        int opcion;
        char resp;

        Jugar j = new Jugar();

        resp = j.t.literalConChar("Deseas Jugar S/N ? ");
        while (resp != 's' && resp != 'S' && resp != 'n' && resp != 'N') {
            resp = j.t.literalConChar("ERROR: vuelve a introducir S/N: ");
        }

        while (resp == 'S' || resp == 's') {
            opcion = j.t.Menu(j.menu, 1, 3);

            j.jMinas = new JuegoMinas();

            switch (opcion) {
                case 1:
                    j.parteComun();
                    j.hastaBingo();
                    break;
                case 2:
                    j.parteComun();
                    j.difPremios(j.numBolas());
                    break;
                case 3:
                    resp = 'N';
                    break;
            }

            System.out.println("\n Resultado:");
            System.out.println("     " + j.jMinas.getContarCantados() + " n�meros CANTADOS");
            System.out.println("     " + j.jMinas.getContarNoCantados() + " n�meros NO cantados");

            if (resp == 's' || resp == 'S') {
                resp = j.t.literalConChar("\n Deseas volver a Jugar S/N? ");
                while (resp != 's' && resp != 'S' && resp != 'n' && resp != 'N') {
                    resp = j.t.literalConChar("ERROR: vuelve a introducir S/N: ");
                }
            }
        }
        if (resp == 'n' || resp == 'N') {
            System.out.println("FIN DEL JUEGO");
        }
    }

    /**
     * Permite al usuario introducir el numeros de fila y de columnas si lo desea,
     * controlando que las respuestas sean las correctas. Hace llamada a los metodos
     * inicializar, inicializaraux, repartir y mostrar.
     *
     * @throws IOException Controla las excepciones
     */
    public void parteComun() throws IOException {
        int c_intr, f_intr, opc;
        c_intr = 0;
        f_intr = 0;

        opc = t.literalConChar("Introducir el numero de filas y de columnas que tendr� el tablero S/N ?");
        while (opc != 's' && opc != 'S' && opc != 'n' && opc != 'N') {
            opc = t.literalConChar("ERROR: vuelve a introducir S/N: ");
        }

        if (opc == 's' || opc == 'S') {
            f_intr = t.literalConEntero("Introducir Fila 1-9: ");
            while (f_intr <= 0 || f_intr > 9) {
                f_intr = t.literalConEntero("ERROR: vuelve a introducir fila 1-9: ");
            }

            c_intr = t.literalConEntero("Introducir Columna 1-10: ");
            while (c_intr <= 0 || c_intr > 10) {
                c_intr = t.literalConEntero("ERROR: vuelve a introducir columna 1-10: ");
            }
        }

        if (f_intr != 0 && c_intr != 0) {
            jMinas.tMinas = new TableroMinas(f_intr, c_intr);
        } else {
            jMinas.tMinas = new TableroMinas(3, 5);
        }

        System.out.println("------------------------------------------------------");
        System.out.println("########             JUEGO: BINGO 90         ########");
        System.out.println("------------------------------------------------------\n");

        jMinas.tMinas.inicializar();
        jMinas.inicializarVAux();

        jMinas.tMinas.repartir();
        System.out.println("-------------- TABLERO DE " + jMinas.tMinas.numFilas + "x" + jMinas.tMinas.numColumnas
                + " -----------\n");
        jMinas.tMinas.mostrar();
        System.out.println("\n");
    }

    /**
     * Repite el juego hasta conseguir cantar todos los numeros del tablero Hace
     * llamada a los metodos verSiFin, tachatNumero, mostrar, mostrarPremio.
     */
    public void hastaBingo() {
        boolean fin;

        fin = jMinas.verSiFin();
        while (!fin) {
            System.out.println();
            jMinas.tacharNumero(jMinas.sacarNumero());
            jMinas.tMinas.mostrar();
            fin = jMinas.verSiFin();
        }
        System.out.println();
        jMinas.mostarPremio();
    }

    /**
     * Muestra los distintos premios que puede obtener un usuario
     *
     * @param numBolas
     *            Recibe un valor de tipo entero
     */
    public void difPremios(int numBolas) {
        for (int i = 0; i < numBolas; i++) {
            System.out.println();
            jMinas.tacharNumero(jMinas.sacarNumero());
            jMinas.tMinas.mostrar();
        }
        System.out.println();
        jMinas.mostarPremio();
    }

    /**
     * Pide al usuario el numero de bolas que se desea tirar
     *
     * @return numBolas Devuelve un valor de tipo entero
     * @throws IOException Controla las excepciones
     */
    public int numBolas() throws IOException {
        int numBolas;
        numBolas = t.literalConEntero("Introducir el numero de bolas 1-90: ");
        while (numBolas < 1 || numBolas > 90) {
            numBolas = t.literalConEntero("ERROR: vuelva a introducir el numero de bolas 1-90: ");
        }

        return numBolas;
    }
}
