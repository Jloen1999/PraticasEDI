package es.unex.cum.edi.practica.tablero;

import java.io.IOException;

/**
 * Interface Juego.
 * 
 * @author Jose Luis Obiang
 * @version 1.0
 */
public interface Juego {

    public void jugar() throws IOException;

    public void resolver();

    public boolean verSiFin();
}
