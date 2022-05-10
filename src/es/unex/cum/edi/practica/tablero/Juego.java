package es.unex.cum.edi.practica.tablero;

import java.io.IOException;

/**
 * Interface Juego. Contiene los metodos generales que seran usados
 * en todos los juegos (JuegoMinas, JuegoParejas o JuegoRaya)
 *
 * @author Jose Luis Obiang Ela Nanguan
 * @version 1.0, 24/03/2022
 */
public interface Juego {

    public boolean jugar() throws IOException;

    public void resolver(int row, int column);

    public boolean verSiFin();
}
