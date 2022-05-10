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

    private JuegoMinas jMinas = new JuegoMinas();
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

        char response = t.literalConCaracter("¿Deseas utilizar parametros por defecto (S|N)?"); //Se trata de inicializar el tablero con el numero de filas, columnas y maximo de minas establecidos en el constructor por defecto
        response = Character.toUpperCase(response);
        while (response != 'S' && response != 'N') {
            System.out.println("Error:");
            response = t.literalConCaracter("¿Deseas utilizar parametros por defecto (S|N)?");
        }

        if (response == 'S') {
            jMinas = new JuegoMinas(); // Constructor por defecto
        } else {
            System.out.println("Datos iniciales");

            Integer[] parameters = enterParameters();

            TableroMinas tab = new TableroMinas(parameters[0], parameters[1], parameters[2]);
            jMinas = new JuegoMinas(tab); // Constructor parametrizado
        }
    }

    /**
     * Metodo que recibe y devuelve un numero de filas o columnas despues
     * de comprobar su correcta introduccion
     * @param coor de tipo entero, indica la cantidad de filas o columnas
     * @param xy de tipo String
     * @return coor, devuelve una cantidad de filas y columnas
     * @throws IOException devuelve una excepcion
     */
    public int controlFilColum(int coor,String xy) throws IOException{
        if(xy.equals("filas")){
            coor=t.literalConEntero("Introduce el número de filas");
            while (coor < 0) {
                coor = t.literalConEntero("Error: vuelve a introducir el número de filas");
            }
        }else{
            coor = t.literalConEntero("Introduce el número de columnas");
            while (coor < 0) {
                coor = t.literalConEntero("Error: vuelve a introducir el número de columnas");
            }
        }

        return coor;

    }


    /**
     * Metodo que nos permite introducir por teclado el
     * numero de filas, columnas y el numero maximo de minas
     * que tendra el tablero
     *
     * @return parameters Devuelve un array de enteros
     * @throws IOException Lanza una excepcion
     */
    public Integer[] enterParameters() throws IOException {
        int rows=0,columns=0;
        String xy;
        xy="filas";
        rows=controlFilColum(rows,xy);
        xy="columnas";
        columns=controlFilColum(rows,xy);
        int maxNumeric = t.literalConEntero("Introduce el número máximo de minas [0," + ((rows * columns) - 1) + "]");
        while (maxNumeric < 0 || maxNumeric >= (rows * columns)) {
            maxNumeric = t.literalConEntero(
                    "Error: vuelve a introducir el número máximo de minas [0," + ((rows * columns) - 1) + "]");
        }
        Integer[] parameters = { rows, columns, maxNumeric };

        return parameters;
    }
}
