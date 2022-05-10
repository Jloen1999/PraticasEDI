package es.unex.cum.edi.practica.tablero;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import es.unex.cum.edi.practica.persona.Invitado;
import es.unex.cum.edi.practica.persona.Jugador;
import es.unex.cum.edi.practica.persona.Persona;

/**
 * Clase Minas
 *
 * @author Jose Luis Obiang Ela Nanguan
 * @version 1.0, 11/05/2022
 */
public class Minas {

    private JuegoMinas jMinas;
    private List<Persona> personas;

    private Teclado t;

    public Minas() {
        jMinas = new JuegoMinas();
        personas = new LinkedList<Persona>();
        t = new Teclado();
    }

    /**
     * Metodo que se encarga de mostrar por pantalla el
     * menu principal de la aplicacion
     * 
     * @throws Exception
     */
    public void menu() throws Exception {
        int opcion;

        do {
            String[] opciones = {
                    "1. Cargar lista de Personas.",
                    "2. Añadir una nueva Persona.",
                    "3. Loguearse.",
                    "4. Sin loguearse.",
                    "5. Salvar la lista de Personas.",
                    "6. Salir.",
            };

            opcion = t.Menu(opciones, 1, 6);
            switch (opcion) {
                case 1:
                    cargar();
                    break;
                case 2:
                    registro();
                    break;
                case 3:
                    login();
                    break;
                case 4:
                    menuNoLogin();
                    break;
                case 5:
                    salvar();
                    break;
                case 6:
                    System.out.println("\nFIN de ejecucion.\n");
                    break;
            }
        } while (opcion < 6);
    }

    /**
     * Metodo que se encarga de obtener informacion de personas
     * en un fichero de datos y almacenarlo en la coleccion de
     * personas de tipo List<Persona>
     */
    @SuppressWarnings(value = "unchecked")
    public void cargar() {

        try {
            ObjectInputStream archivoObjetosEnt = new ObjectInputStream(
                    new FileInputStream("datos.dat"));
            personas = (LinkedList<Persona>) archivoObjetosEnt.readObject();
            archivoObjetosEnt.close();

            System.out.println("\nPersonas cargadas correctamente.\n");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("\nError en la carga de Personas.\n");
        }
    }

    /**
     * Metodo que nos permite registrar una nueva persona,
     * ya sea Jugador o Invitado
     * 
     * @throws IOException Lanza una excepcion
     */
    public void registro() throws IOException {
        int id, opcion, intentos;
        boolean existe, insertado;

        System.out.println("-------------------------------------------------------------------");
        System.out.println("------------------------ Registrar Persona ------------------------");
        System.out.println("-------------------------------------------------------------------");

        opcion = t.Menu(new String[] { "1. Jugador.", "2. Invitado.", "3. Regresar." }, 1, 3);
        if (opcion < 3) {

            intentos = 0;
            id = t.literalConEntero("Introduce un nuevo identificador:");
            existe = (new MetodosGenerales()).existeJugador(personas, id);
            if (existe) {

                System.out.println("\nError: este identificador ya existe. Sólo tienes tres intentos más.\n");
                while (existe && intentos < 3) {
                    id = t.literalConEntero(
                            "Intento " + (intentos + 1) + ":\nVuelve a introducir un nuevo identificador");
                    existe = (new MetodosGenerales()).existeJugador(personas, id);

                    if (existe) {
                        System.out.println("Error: este identificador ya existe.\n");
                    }
                    intentos++;
                }
            }

            if (!existe) {
                if (opcion == 1) { // Jugador
                    String nombre = (new MetodosGenerales()).introducirNomPass(true);
                    String password = (new MetodosGenerales()).introducirNomPass(false);
                    insertado = personas.add(new Jugador(id, nombre, password)); // Nuevo jugador
                } else { // Invitado
                    insertado = personas.add(new Invitado(id, "Invitado")); // Nuevo invitado
                }

                if (insertado) {
                    System.out.println("\nRegistro realizado correctamente.");
                }
            } else if (intentos == 3) {
                System.out.println("\nLo siento, has agotado todos los intentos.");
            }
        }
    }

    /**
     * Metodo que permite a una persona iniciar sesion, donde
     * si la persona es Jugador, debe introducir su identificador
     * y contraseña. Y si es un Invitado, debe introducir solo el
     * identificador. Dicha persona previamente debe estar registrado,
     * ya sea Jugador o Invitado
     * 
     * @throws Exception Lanza una excepcion
     */
    public void login() throws Exception {
        int id, opcion, intentos;
        String password;
        Persona p = null;

        System.out.println("-------------------------------------------------------------------");
        System.out.println("----------------------- Iniciar sesion como -----------------------");
        System.out.println("-------------------------------------------------------------------");

        intentos = 0;
        String[] opciones = { "1. Jugador.", "2. Invitado.", "3. Regresar." };
        opcion = t.Menu(opciones, 1, 3);
        if (opcion < 3) {

            if (opcion == 1) { // Jugador

                id = t.literalConEntero("Introduce el identificador de un Jugador:");
                password = t.literalConString("Introduce su contraseña:");

                p = (new MetodosGenerales()).getPersona(personas, opcion, id, password);
                if (p == null) {

                    System.out.println(
                            "Error: el identificador y la contraseña introducido no pertenecen a ningun Jugador.");
                    System.out.println("Solo tienes tres intentos mas.");
                    while (p == null && intentos < 3) {

                        System.out.println("\nIntento " + (intentos + 1));
                        id = t.literalConEntero("Introduce el identificador de un Jugador:");
                        password = t.literalConString("Introduce su contraseña:");
                        p = (new MetodosGenerales()).getPersona(personas, opcion, id, password);
                        if (p == null) {
                            System.out.println(
                                    "Error: el identificador y la contraseña introducido no pertenecen a ningun Jugador.");
                        }
                        intentos++;
                    }
                }

                // Esta condicion es independiente a la anterior
                if (p != null) {
                    menuJugador(p);
                }
            } else { // Invitado

                id = t.literalConEntero("Introduce el identificador de un Invitado:");
                p = (new MetodosGenerales()).getPersona(personas, opcion, id, ""); // Comprobamos su existencia
                if (p == null) {

                    System.out.println(
                            "Error: el identificador introducido no pertenece a ningun INVITADO. \nSolo tienes tres intentos mas.");
                    while (p == null && intentos < 3) {

                        System.out.println("\nIntento " + (intentos + 1));
                        id = t.literalConEntero("Introduce el identificador de un Invitado:");
                        p = (new MetodosGenerales()).getPersona(personas, opcion, id, "");
                        if (p == null) {
                            System.out.println("Error: el identificador introducido no pertenece a ningun INVITADO.");
                        }
                        intentos++;
                    }
                }

                // Esta condicion es independiente a la anterior
                if (p != null) {
                    menuInvitado(p);
                }
            }
        }

        if (p == null && intentos == 3) {
            System.out.println("\nLo siento, has agotado todos los intentos.");
        }
    }

    /**
     * Metodo que ejecuta otros metodos relacionados con la ejecucion de un
     * Jugador. Un Jugador puede jugar, visualizar su propia informacion,
     * visualizar sus jugadas y visualizar su cola de movimientos
     * 
     * @param p Recibe un objeto de tipo Persona
     * @throws Exception
     */
    public void menuJugador(Persona p) throws Exception {
        int opcion;

        System.out.println("----------------------------------------------------------------------");
        System.out.println("--------- BIENVENIDO como jugador: " + p.getNombre() + " ------");
        System.out.println("----------------------------------------------------------------------");

        do {

            String[] opciones = {
                    "1. Jugar.",
                    "2. Mostrar mi información.",
                    "3. Mostrar mis jugadas.",
                    "4. Mostrar la cola de movimientos /celdas de la última partida.",
                    "5. Regresar.",
            };

            opcion = t.Menu(opciones, 1, 5);
            switch (opcion) {
                case 1:
                    jugando(p);
                    break;
                case 2:
                    mostrarInformacion(p);
                    break;
                case 3:
                    mostrarMisJugadas(((Jugador) p).getJugadas());
                    break;
                case 4:
                    jMinas.mostrarMovimientos();
                    break;
                case 5:
                    System.out.println("Regresando");
                    break;
            }
        } while (opcion != 5);
    }

    /**
     * Metodo que nos permite ejecutar el metodo para jugar,
     * permitiendole seguir jugando si lo desea
     * 
     * @param p Recibe un objeto de tipo Persona
     * @throws Exception Lanza una excepcion
     */
    public void jugando(Persona p) throws Exception {
        char respuesta = ' ';
        boolean iniciado;

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("-------------------------------- Jugando --------------------------------");
        System.out.println("-------------------------------------------------------------------------");

        do {

            iniciado = (new MetodosGenerales()).iniciarDatos(jMinas);
            if (iniciado) {
                jugarMinas(p);

                respuesta = t.literalConCaracter("\n¿Deseas volver a jugar (S|N)?");
                respuesta = Character.toUpperCase(respuesta);
                while (respuesta != 'S' && respuesta != 'N') {
                    System.out.println("Error:");
                    respuesta = t.literalConCaracter("¿Deseas volver a jugar (S|N)?");
                }
            }
        } while (respuesta == 'S' && !iniciado);
    }

    /**
     * Metodo que se encarga de ejecutar otros metodos que incializa
     * el tablero, reparte los valores de las celdas, juega y obtiene
     * el tiempo de la jugada
     * 
     * @param p Recibe un objeto de tipo Persona
     * @throws Exception
     */
    public void jugarMinas(Persona p) throws Exception {
        boolean ganado;

        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("---------------------------- JUEGO MINAS (Tablero) ----------------------------");
        System.out.println("Numero de filas: " + jMinas.getTMinas().getNumFilas());
        System.out.println("Numero de columnas: " + jMinas.getTMinas().getNumColumnas());
        System.out.println("Numero maximo de minas: " + jMinas.getTMinas().getNumMaximo());
        System.out.println("-------------------------------------------------------------------------------");

        System.out.println("------------------------- Inicializando -------------------------");
        jMinas.getTMinas().inicializar();
        System.out.println("-------------------------- Repartiendo --------------------------");
        jMinas.getTMinas().repartir();
        System.out.println("----------------- Tablero inicial con el reparto ----------------");
        jMinas.getTMinas().mostrar(); // mostramos el tablero inicial

        long tInicial = new Date().getTime(); // Se coge el tiempo actual
        ganado = jMinas.jugar(); // Jugar
        long tFinal = new Date().getTime(); // Se coge el tiempo final

        // Agregamos una nueva jugada a la coleccion de jugadas del jugador actual
        Jugada jugada = new Jugada((tFinal - tInicial), new Date(), ganado);
        if (p.getClass().equals(Jugador.class)) {
            Jugador jugador = (Jugador) p;
            jugador.addJugada(jugada);
        }
        (new MetodosGenerales()).despedida(p, jugada);
    }

    /**
     * 
     * @param p
     */
    public void mostrarInformacion(Persona p) {

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("----------------------- Mi información personal -----------------------");
        System.out.println("-----------------------------------------------------------------------");

        System.out.println("Identificador: " + p.getId());
        System.out.println("Nombre: " + p.getNombre());
        if (p.getClass().equals(Jugador.class)) {
            System.out.println("Contraseña: " + ((Jugador) p).getPassword());
        }
    }

    /**
     * 
     * @param jugadas
     */
    public void mostrarMisJugadas(List<Jugada> jugadas) {

        if (!jugadas.isEmpty()) {

            System.out.println("-----------------------------------------------------------------------");
            System.out.println("----------------------------- Mis Jugadas -----------------------------");
            System.out.println("-----------------------------------------------------------------------");
            for (int i = 0; i < jugadas.size(); i++) {
                System.out.println(jugadas.get(i).toString());
            }
        } else {
            System.out.println("Todavia no has realizado ninguna jugada.");
        }
    }

    /**
     * Metodo que ejecuta otros metodos relacionados con la ejecucion de
     * un Invitado. Un Invitado solo puede jugar y visualizar sus propios
     * movimientos si los hay
     * 
     * @param p Recibe un objeto de tipo Persona
     * @throws Exception Lanza una excepcion
     */
    public void menuInvitado(Persona p) throws Exception {
        int opcion;

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("----------------------- BIENVENIDO como INVITADO ----------------------");
        System.out.println("-----------------------------------------------------------------------");
        do {

            String[] opciones = {
                    "1. Jugar.",
                    "2. Mostrar mi información.",
                    "3. Mostrar la cola de movimientos de la última partida.",
                    "4. Regresar.",
            };

            opcion = t.Menu(opciones, 1, 4);
            switch (opcion) {
                case 1:
                    jugando(p);
                    break;
                case 2:
                    mostrarInformacion(p);
                    break;
                case 3:
                    jMinas.mostrarMovimientos();
                    break;
                case 4:
                    System.out.println("Regresando");
                    break;
            }

        } while (opcion != 4);
    }

    /**
     * 
     * 
     * @throws IOException
     */
    public void menuNoLogin() throws IOException {
        int opcion;

        System.out.println(
                "------------------------------------------------------------------------------------------------");
        System.out.println(
                "-------------------------------------- Sin iniciar sesion --------------------------------------");
        System.out.println(
                "------------------------------------------------------------------------------------------------");

        do {
            String[] opciones = {
                    "1. Mostrar los tres últimos tiempos de cada jugador.",
                    "2. Mostrar la media de tiempo por cada jugador en resolver el juego.",
                    "3. Mostrar la media de tiempo en resolver el juego de todos los jugadores (general).",
                    "4. Mostrar el jugador que menos tiempo ha tardado en resolver el juego.",
                    "5. Mostrar el nombre de los jugadores cuya media es superior a la media general.",
                    "6. Regresar.",
            };

            opcion = t.Menu(opciones, 1, 6);
            switch (opcion) {
                case 1:
                    mostrarUltimosTiempos();
                    break;
                case 2:
                    mostrarMediaTiempo();
                    break;
                case 3:
                    mostrarMediaTiempoGeneral();
                    break;
                case 4:
                    mostrarJugMenosTiempo();
                    break;
                case 5:
                    mostrarNombreJugadores();
                    break;
            }
        } while (opcion != 6);
    }

    /**
     * Metodo que muestra por pantalla las tres ultimas jugadas
     * de cada jugador. Para ello, recorremos todas las personas
     * de tipo Jugador y por cada uno, recorremos sus jugadas
     * desde el final al comienzo hasta obtener 3 jugadas
     */
    public void mostrarUltimosTiempos() {
        int j, limite;

        if (!personas.isEmpty()) {

            System.out.println("------------------------------------------------------------------");
            System.out.println("------- Mostrando los tres últimos tiempos de cada jugador -------");
            System.out.println("------------------------------------------------------------------");

            for (int i = 0; i < personas.size(); i++) {

                if (personas.get(i).getClass().equals(Jugador.class)) {
                    Jugador jugador = (Jugador) personas.get(i);

                    System.out.println("Jugador: " + jugador.getNombre());
                    System.out.println("--------------------------------------------");
                    List<Jugada> jugadas = jugador.getJugadas();
                    if (!jugadas.isEmpty()) {

                        j = limite = jugadas.size() - 1;
                        while (j > -1 && (limite - j) <= 3) {
                            System.out
                                    .println("Tiempo de jugada " + (j + 1) + ": "
                                            + (new MetodosGenerales()).tiempoCadena(jugadas.get(j).getTiempo()));
                            j--;
                        }
                    } else {
                        System.out.println("No tiene jugadas.");
                    }
                    System.out.println();
                }
            }
        } else {
            System.out.println("No hay jugadores.");
        }
    }

    /**
     * Metodo que muestra por pantalla la media de tiempo por cada jugador en
     * resolver el juego. La media la obtenemos diviendo la acumulacion de tiempo
     * tardado de un jugador con la cantidad de jugadas de ese mismo jugador
     */
    public void mostrarMediaTiempo() {
        long tiempoTotal, media;

        if (!personas.isEmpty()) {

            System.out.println("-------------------------------------------------------------------");
            System.out.println("---------- Mostrando la media de tiempo por cada jugador ----------");
            System.out.println("-------------------------------------------------------------------");

            for (int i = 0; i < personas.size(); i++) {

                if (personas.get(i).getClass().equals(Jugador.class)) {
                    Jugador jugador = (Jugador) personas.get(i);

                    System.out.println("Jugador: " + jugador.getNombre());
                    System.out.println("--------------------------------------------");
                    List<Jugada> jugadas = jugador.getJugadas();
                    if (!jugadas.isEmpty()) {

                        tiempoTotal = 0;
                        for (int j = 0; j < jugadas.size(); j++) {
                            tiempoTotal += jugadas.get(j).getTiempo();
                        }

                        media = tiempoTotal / jugadas.size();
                        System.out.println(
                                "Ha tardado de media " + (new MetodosGenerales()).tiempoCadena(media)
                                        + " en resolver el juego.");
                    } else {
                        System.out.println("No tiene jugadas.");
                    }
                    System.out.println();
                }
            }
        } else {
            System.out.println("No hay jugadores.");
        }
    }

    /**
     * Metodo que muestra por pantalla la media general de tiempo que han tardado
     * todas las personas de tipo jugador en resolver el juego. La mediatotal la
     * obtenemos diviendo la acumulacion de todos los tiempos tardados con la
     * cantidad total de jugadas que se ha realizado
     */
    public void mostrarMediaTiempoGeneral() {
        long tiempoTotal, media;
        int totalJugadas, contarJJugados;

        if (!personas.isEmpty()) {

            System.out.println("-------------------------------------------------------------------");
            System.out.println("------- Mostrando la media de tiempo de todos los jugadores -------");
            System.out.println("-------------------------------------------------------------------");

            tiempoTotal = totalJugadas = contarJJugados = 0;
            for (int i = 0; i < personas.size(); i++) {
                if (personas.get(i).getClass().equals(Jugador.class)) {

                    List<Jugada> jugadas = ((Jugador) personas.get(i)).getJugadas();
                    if (!jugadas.isEmpty()) {

                        contarJJugados++;
                        totalJugadas += jugadas.size();
                        for (int j = 0; j < jugadas.size(); j++) {
                            tiempoTotal += jugadas.get(j).getTiempo();
                        }
                    }
                }
            }

            if (totalJugadas > 0) {
                media = tiempoTotal / totalJugadas;
                System.out.println(
                        "En " + totalJugadas + " jugadas, " + contarJJugados + " jugadores \nhan tardado de media "
                                + (new MetodosGenerales()).tiempoCadena(media) + " en resolver el juego.");
            } else {
                System.out.println("No hay jugadas.");
            }
        } else {
            System.out.println("No hay jugadores.");
        }
    }

    /**
     * Metodo que muestra por pantalla al jugador que menos tiempo ha tardado en
     * resolver el juego. Si hay mas de un jugador con el mismo tiempo menor
     * tardado, obtenemos el ultimo (tiempoMenor >= tiempo)
     */
    public void mostrarJugMenosTiempo() {
        int indiceJugador;
        long tiempoMenor;

        if (!personas.isEmpty()) {

            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("-------------- El jugador que menos tiempo ha tardado en resolver el juego ----------");
            System.out.println("-------------------------------------------------------------------------------------");

            indiceJugador = -1;
            tiempoMenor = Long.MAX_VALUE;
            for (int i = 0; i < personas.size(); i++) {
                if (personas.get(i).getClass().equals(Jugador.class)) {

                    List<Jugada> jugadas = ((Jugador) personas.get(i)).getJugadas();
                    if (!jugadas.isEmpty()) {

                        for (int j = 0; j < jugadas.size(); j++) {

                            // Obtenemos el ultimo jugador que menos tiempo ha tardado
                            if (tiempoMenor >= jugadas.get(j).getTiempo()) {
                                indiceJugador = i;
                                tiempoMenor = jugadas.get(j).getTiempo();
                            }
                        }
                    }
                }
            }

            if (indiceJugador > -1) {
                String nombre = personas.get(indiceJugador).getNombre();

                System.out.println(
                        "Es " + nombre + " el ultimo jugador que menos tiempo ha tardado en resolver el juego.\n" +
                                "Ha tardado " + (new MetodosGenerales()).tiempoCadena(tiempoMenor));
            } else {
                System.out.println("No hay jugadas.");
            }
        } else {
            System.out.println("No hay jugadores.");
        }
    }

    /**
     * Metodo que muestra por pantalla el nombre de los jugadores cuya media es
     * superior a la media general. OBtenemos primero la media general y luego
     * la media de cada jugador
     */
    public void mostrarNombreJugadores() {
        long tiempoTotal, mediaGeneral, mediaJugador;
        int totalJugadas;

        if (!personas.isEmpty()) {

            System.out
                    .println("--------------------------------------------------------------------------------------");
            System.out
                    .println("-------- El nombre de los jugadores cuya media es superior a la media general --------");
            System.out
                    .println("--------------------------------------------------------------------------------------");

            tiempoTotal = totalJugadas = 0;
            // Obtenemos lo necesario para calcular la media general
            for (int i = 0; i < personas.size(); i++) {
                if (personas.get(i).getClass().equals(Jugador.class)) {

                    List<Jugada> jugadas = ((Jugador) personas.get(i)).getJugadas();
                    if (!jugadas.isEmpty()) {

                        totalJugadas += jugadas.size();
                        for (int j = 0; j < jugadas.size(); j++) {
                            tiempoTotal += jugadas.get(j).getTiempo();
                        }
                    }
                }
            }

            if (totalJugadas > 0) {
                // Media general
                mediaGeneral = tiempoTotal / totalJugadas;

                System.out.println("\nMedia General: " + (new MetodosGenerales()).tiempoCadena(mediaGeneral) +
                        "\n----------------------------------------------------------");

                for (int i = 0; i < personas.size(); i++) {
                    if (personas.get(i).getClass().equals(Jugador.class)) {

                        tiempoTotal = 0;
                        List<Jugada> jugadas = ((Jugador) personas.get(i)).getJugadas();
                        for (int j = 0; j < jugadas.size(); j++) {
                            tiempoTotal += jugadas.get(j).getTiempo();
                        }
                        if (tiempoTotal > 0) {
                            mediaJugador = tiempoTotal / jugadas.size();

                            if (mediaJugador > mediaGeneral) {
                                System.out.println(
                                        "Jugador: " + personas.get(i).getNombre() + ", Media: "
                                                + (new MetodosGenerales()).tiempoCadena(mediaJugador));
                            }
                        }
                    }
                }
            } else {
                System.out.println("No hay jugadas.");
            }
        } else {
            System.out.println("No hay jugadores.");
        }
    }

    /**
     * Metodo que se encarga de almacenar en un fichero de
     * datos todo el contenido de la coleccion de personas
     * de tipo List<Persona>
     * 
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void salvar() throws FileNotFoundException, IOException {

        if (!personas.isEmpty()) {
            ObjectOutputStream archivoObjetosSal = new ObjectOutputStream(
                    new FileOutputStream("datos.dat"));
            archivoObjetosSal.writeObject(personas);
            archivoObjetosSal.close();

            System.out.println("\nPersonas salvadas correctamente.\n");
        } else {
            System.out.println("\nNo hay Personas.\n");
        }
    }
}
