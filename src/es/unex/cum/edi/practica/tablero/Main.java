package es.unex.cum.edi.practica.tablero;

import java.io.IOException;

/**
 * Clase Main. Es la clase principal que ejecuta
 * esta aplicacion
 * 
 * @author Jose Luis Obiang Ela Nanguan
 * @version 1.0, 24/03/2022
 */
public class Main {

    private JuegoMinas jMinas;
    private Teclado t;

    public static void main(String[] args) throws Exception {

        Main m = new Main();
        m.t = new Teclado();

        m.initialData();
        m.jugarMinas();
    }

    public void jugarMinas() throws Exception {

        System.out.println("*******************************************************************************");
        System.out.println("**************************** JUEGO MINAS (Tablero) ****************************");
        System.out.println("Numero de filas: " + jMinas.getTMinas().getNumFilas());
        System.out.println("Numero de columnas: " + jMinas.getTMinas().getNumColumnas());
        System.out.println("Numero máximo de minas: " + jMinas.getTMinas().getNumMaximo());
        System.out.println("*******************************************************************************");

        System.out.println("********* Inicializando ********");
        jMinas.getTMinas().inicializar();
        System.out.println("********* Repartiendo ********");
        jMinas.getTMinas().repartir();
        System.out.println("********* Tablero inicial con el reparto *********");
        jMinas.getTMinas().mostrar(); // mostramos el tablero inicial

        System.out.println("********* Jugando ********");
        jMinas.jugar();
    }

    public void initialData() throws Exception {

        String response = t.literalConString("¿Deseas utilizar parametros por defecto (S|N)?");
        while (!response.toUpperCase().equals("S") && !response.toUpperCase().equals("N")) {
            System.out.println("Error:");
            response = t.literalConString("¿Deseas utilizar parametros por defecto (S|N)?");
        }

        if (response.toUpperCase().equals("S")) {
            jMinas = new JuegoMinas(); // Constructor por defecto
        } else {
            System.out.println("Datos iniciales");

            Integer[] parameters = enterParemeters();

            TableroMinas tab = new TableroMinas(parameters[0], parameters[1], parameters[2]);
            jMinas = new JuegoMinas(tab); // Constructor parametrizado
        }
    }

    /**
     * Metodo que nos permite introducir por teclado el
     * numero de filas, columnas y el numero maximo de minas
     * que tendra el tablero
     * 
     * @return parameters Devuelve un array de enteros
     * @throws IOException Lanza una excepcion
     */
    public Integer[] enterParemeters() throws IOException {

        int rows = t.literalConEntero("Introduce el número de filas");
        while (rows < 0) {
            rows = t.literalConEntero("Error: vuelve a introducir el número de filas");
        }

        int columns = t.literalConEntero("Introduce el número de columnas");
        while (columns < 0) {
            columns = t.literalConEntero("Error: vuelve a introducir el número de columnas");
        }

        int maxNumeric = t.literalConEntero("Introduce el número máximo de minas [0," + ((rows * columns) - 1) + "]");
        while (maxNumeric < 0 || maxNumeric >= (rows * columns)) {
            maxNumeric = t.literalConEntero(
                    "Error: vuelve a introducir el número máximo de minas [0," + ((rows * columns) - 1) + "]");
        }
        Integer[] parameters = { rows, columns, maxNumeric };

        return parameters;
    }
}
