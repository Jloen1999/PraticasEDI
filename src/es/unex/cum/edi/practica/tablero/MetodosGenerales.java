package es.unex.cum.edi.practica.tablero;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import es.unex.cum.edi.practica.persona.Invitado;
import es.unex.cum.edi.practica.persona.Jugador;
import es.unex.cum.edi.practica.persona.Persona;

/**
 * Clase OtrosMetodos. Clase que contiene algunos metodos generales
 * utilizados en mas de una clase
 *
 * @author Jose Luis Obiang Ela Nanguan
 * @version 1.0, 11/05/2022
 */
public class MetodosGenerales {

    private Teclado t;

    public MetodosGenerales() {
        t = new Teclado();
    }

    /**
     * Metodo que se encarga de comprobar si un identificador pertenece a un
     * jugador
     * 
     * @param personas Recibe una coleccion de personas de tipo List
     * @param id       Recibe un valor de tipo entero
     * @return true si existe, false en caso contrario
     */
    public boolean existeJugador(List<Persona> personas, int id) {

        Iterator<Persona> it = personas.iterator();
        while (it.hasNext()) {
            if (id == it.next().getId()) {
                return true;
            }
        }
        return false;
    }

    /**
     * Metodo que se encarga de obtener el tiempo de una jugadad en formato cadena,
     * especificando los minutos y segundos
     * 
     * @param tiempo Recibe un valor de tipo long
     * @return text Devuelve un valor de tipo cadena
     */
    public String tiempoCadena(long tiempo) {

        long segundos = (TimeUnit.MILLISECONDS.toSeconds(tiempo) % 60);
        long minutos = TimeUnit.MILLISECONDS.toMinutes(tiempo);

        String text = "";
        if (minutos == 1 && segundos == 1) {
            text = minutos + " minuto, " + segundos + " segundo";
        } else if (minutos == 1 && segundos != 1) {
            text = minutos + " minuto, " + segundos + " segundos";
        } else if (minutos != 1 && segundos == 1) {
            text = minutos + " minutos, " + segundos + " segundo";
        } else {
            text = minutos + " minutos, " + segundos + " segundos";
        }
        return text;
    }

    /**
     * Metodo que nos permite validar la introduccion por teclado
     * de una cadena, asegurandonos de que no salga hasta que se
     * inserte correctamente
     * 
     * @param tipo Recibe un valor de tipo booleano
     * @return cadena Devuelve un valor de tipo cadena
     * @throws IOException Lanza una excepcion
     */
    public String introducirNomPass(boolean tipo) throws IOException {
        String cadena;

        do {
            // tipo: true si es "nombre", false si es "contraseña"
            cadena = t.literalConString((tipo ? "Introduce un Nombre:" : "Introduce una Contraseña:"));
            if (cadena.length() == 0) {
                System.out.println("Error:");
            }
        } while (cadena.length() == 0);

        return cadena;
    }

    /**
     * Metodo que nos permite obtener una persona a partir de su identificador y
     * contraseña (Jugador) o de identificador sin contraseña (Invitado)
     * 
     * @param personas Recibe una coleccion de personas de tipo List
     * @param opcion   Recibe un valor de tipo entero
     * @param id       Recibe un valor de tipo entero
     * @param password Recibe un valor de tipo cadena
     * @return p Devuelve un objeto de tipo Persona
     */
    public Persona getPersona(List<Persona> personas, int opcion, int id, String password) {
        Persona persona = null;

        Iterator<Persona> it = personas.iterator();
        while (it.hasNext() && persona == null) {

            Persona p = (Persona) it.next();
            if (id == p.getId()) {

                if (opcion == 1) {
                    if (p.getClass().equals(Jugador.class)) {
                        Jugador j = (Jugador) p;
                        if (password.equals(j.getPassword())) {
                            persona = j;
                        }
                    }
                } else {
                    if (p.getClass().equals(Invitado.class)) {
                        persona = p;
                    }
                }
            }
        }
        return persona;
    }

    /**
     * Metodo que recibe y devuelve un numero de filas o columnas despues
     * de comprobar su correcta introduccion
     * 
     * @param coor de tipo entero, indica la cantidad de filas o columnas
     * @param tipo de tipo String
     * @return coor, devuelve una cantidad de filas y columnas
     * @throws IOException Lanza una excepcion
     */
    public int controlFilColum(int coor, String tipo) throws IOException {

        if (tipo.equals("filas")) {
            coor = t.literalConEntero("Introduce el numero de filas (de 2 a 10 incluidos)");
            while (coor <= 1 || coor > 10) {
                coor = t.literalConEntero("Error: vuelve a introducir el numero de filas (de 2 a 10 incluidos)");
            }
        } else {
            coor = t.literalConEntero("Introduce el numero de columnas (de 2 a 10 incluidos)");
            while (coor <= 1 || coor > 10) {
                coor = t.literalConEntero("Error: vuelve a introducir el numero de columnas (de 2 a 10 incluidos)");
            }
        }
        return coor;
    }

    /**
     * Metodo que nos permite introducir por teclado el
     * numero de filas, columnas y el numero maximo de minas
     * que tendra el tablero
     *
     * @return parametros Devuelve un array de enteros
     * @throws IOException Lanza una excepcion
     */
    public Integer[] introducirParametros() throws IOException {
        int filas = 0, columnas = 0;

        filas = controlFilColum(filas, "filas");
        columnas = controlFilColum(filas, "columnas");
        int maximoMinas = t
                .literalConEntero(
                        "Introduce el numero maximo de minas (de 1 a " + ((filas * columnas) - 1) + " incluidos)");
        while (maximoMinas < 0 || maximoMinas >= (filas * columnas)) {
            maximoMinas = t.literalConEntero(
                    "Error: vuelve a introducir el numero maximo de minas ( de 1 a " + ((filas * columnas) - 1)
                            + " incluidos)");
        }
        Integer[] parametros = { filas, columnas, maximoMinas };

        return parametros;
    }

    /**
     * 
     * @return iniciado true si es correcto, false caso contrario
     * @throws Exception
     */
    public boolean iniciarDatos(JuegoMinas jMinas) throws Exception {
        int intentos = 0;
        boolean iniciado = false;

        char respuesta = t.literalConCaracter("¿Deseas utilizar parametros por defecto (S|N)?");
        respuesta = Character.toUpperCase(respuesta);
        if (respuesta != 'S' && respuesta != 'N') {

            System.out.println("Error: solo tienes tres intentos mas.");
            while (respuesta != 'S' && respuesta != 'N' && intentos < 3) {
                System.out.println("\nIntento " + (intentos + 1));
                respuesta = t.literalConCaracter("¿Deseas utilizar parametros por defecto (S|N)?");
                respuesta = Character.toUpperCase(respuesta);
                if (respuesta != 'S' && respuesta != 'N') {
                    System.out.println("Error.");
                    intentos++;
                }
            }

            if (respuesta != 'S' && respuesta != 'N') {
                System.out.println("\nLo siento, has agotado todos los intentos.");
            }
        }

        if (respuesta == 'S' || respuesta == 'N') {
            if (respuesta == 'S') {
                jMinas = new JuegoMinas(); // Constructor por defecto
            } else {
                System.out.println("Datos iniciales");

                Integer[] parametros = introducirParametros();

                TableroMinas tab = new TableroMinas(parametros[0], parametros[1], parametros[2]);
                jMinas = new JuegoMinas(tab); // Constructor parametrizado
            }
            iniciado = true;
        }
        return iniciado;
    }

    /**
     * Metodo que se encarga mostrar por pantalla el
     * resultado final de una jugada
     * 
     * @param p Recibe un objeto de tipo Persona
     * @param j Recibe un objeto de tipo Jugada
     */
    public void despedida(Persona p, Jugada j) {

        System.out.println("-------------------------------------------------------------------");
        System.out.println("------------------------- Resultado final -------------------------");
        System.out.println("-------------------------------------------------------------------");

        System.out.println(j.isGanado() ? ("Enhorabuena " + p.getNombre() + ", has GANADO esta jugada.")
                : ("Lo siento " + p.getNombre() + ", has perdido esta jugada. Suerte para la próxima!"));

        System.out.println("Duracion de la jugada: " + tiempoCadena(j.getTiempo()));

        System.out.println("\n***** FIN de la jugada *****");
    }
}
