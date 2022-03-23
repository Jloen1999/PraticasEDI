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

        do {
            response = t.literalConCaracter("¿Deseas utilizar parametros por defecto (S|N)?");
            if (response != 's' && response != 'S' && response != 'n' && response != 'N') {
                System.out.println("Error");
            }
        } while (response != 's' && response != 'S' && response != 'n' && response != 'N');

        if (response == 'N' || response == 'n') {
            System.out.println("Datos iniciales");
            do {
                rows = t.literalConEntero("Introduce el número de filas");
                if (rows < 0) {
                    System.out.println("Error");
                }
            } while (rows < 0);

            do {
                columns = t.literalConEntero("Introduce el número de columnas");
                if (columns < 0) {
                    System.out.println("Error");
                }
            } while (columns < 0);

            do {
                maxNumeric = t.literalConEntero("Introduce el número máximo de minas");
                if (maxNumeric < 0 || maxNumeric > (rows * columns)) {
                    System.out.println("Error");
                }
            } while (maxNumeric < 0 || maxNumeric > (rows * columns));

            TableroMinas tab = new TableroMinas(rows, columns, maxNumeric);
            jMinas = new JuegoMinas(tab);
        } else {
            jMinas = new JuegoMinas();
        }
    }
}
