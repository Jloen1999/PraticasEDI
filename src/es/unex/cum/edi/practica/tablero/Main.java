package es.unex.cum.edi.practica.tablero;

/**
 * Clase Main. Es la clase principal que ejecuta
 * esta aplicacion
 * 
 * @author Jose Luis Obiang
 * @version 1.0
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

        System.out.println("***********************************************************************");
        System.out.println("**************************** TABLERO MINAS ****************************");
        System.out.println("Numero de filas: " + jMinas.getTMinas().getNumFilas());
        System.out.println("Numero de columnas: " + jMinas.getTMinas().getNumColumnas());
        System.out.println("Numero máximo de minas: " + jMinas.getTMinas().getNumMaximo());
        System.out.println("***********************************************************************");

        System.out.println("********* Inicializando ********");
        jMinas.getTMinas().inicializar();
        System.out.println("********* Repartiendo ********");
        jMinas.getTMinas().repartir();
        jMinas.getTMinas().mostrar(); // mostramos el tablero inicial

        System.out.println("********* Jugando ********");
        jMinas.jugar();
    }

    public void initialData() throws Exception {
        int rows, columns, maxNumeric;
        char response;

        response = t.literalConCaracter("¿Deseas utilizar parametros por defecto (S|N)?");
        while (response != 's' && response != 'S' && response != 'n' && response != 'N') {
            System.out.println("Error:");
            response = t.literalConCaracter("¿Deseas utilizar parametros por defecto (S|N)?");
        }

        if (response == 'N' || response == 'n') {
            System.out.println("Datos iniciales");
            
            rows = t.literalConEntero("Introduce el número de filas");
            while (rows < 0) {
                rows = t.literalConEntero("Error: vuelve a introducir el número de filas");
            }

            columns = t.literalConEntero("Introduce el número de columnas");
            while (columns < 0) {
                columns = t.literalConEntero("Error: vuelve a introducir el número de columnas");
            }

            maxNumeric = t.literalConEntero("Introduce el número máximo de minas [0," + ((rows * columns) - 1) +"]");
            while (maxNumeric < 0 || maxNumeric >= (rows * columns)) {
                maxNumeric = t.literalConEntero("Error: vuelve a introducir el número máximo de minas [0," + ((rows * columns) - 1) +"]");
            }

            TableroMinas tab = new TableroMinas(rows, columns, maxNumeric);
            jMinas = new JuegoMinas(tab);
        } else {
            jMinas = new JuegoMinas();
        }
    }
}
