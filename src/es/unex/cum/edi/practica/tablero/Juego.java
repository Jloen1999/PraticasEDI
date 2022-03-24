package es.unex.cum.edi.practica.tablero;

import java.io.IOException;

/**
 * Interface Juego, declaramos sin implementar los metodos que seran usados en JuegoMinas
 *
 * @author Jose Luis Obiang Ela Nanguan
 * @version 1.0_24/03/2022
 */
public interface Juego {

    public void jugar() throws IOException;

    public void resolver();

    public boolean verSiFin();
}
