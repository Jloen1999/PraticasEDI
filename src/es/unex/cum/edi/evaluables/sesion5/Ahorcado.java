package es.unex.cum.edi.evaluables.sesion5;

import java.util.Random;
import java.io.IOException;

public class Ahorcado {
    private Teclado t = new Teclado();

    private int intentoActual;
    private int numIntentos;
    private Palabra seleccionado;
    private Palabra[] lista;

    public Ahorcado() {
        intentoActual = 0;
        numIntentos = 5;
        seleccionado = new Palabra();
        lista = new Palabra[4];
    }

    public Ahorcado(int tam, int max) {
        intentoActual = 0;
        numIntentos = max;
        seleccionado = new Palabra();
        lista = new Palabra[tam];
    }

    public void setIntentoActual(int intentoActual) {
        this.intentoActual = intentoActual;
    }

    public void setNumIntentos(int numIntentos) {
        this.numIntentos = numIntentos;
    }

    public void setSeleccionado(Palabra p) {
        seleccionado = p;
    }

    public void setLista(Palabra[] p) {
        this.lista = p;
    }

    public int getIntentoActual() {
        return intentoActual;
    }

    public int getNumIntentos() {
        return numIntentos;
    }

    public Palabra getSeleccionado() {
        return seleccionado;
    }

    public Palabra[] getLista() {
        return lista;
    }

    public String toString() {
        return "Ahorcado [Seleccionada: " + getSeleccionado().getTexto() + ", Intentos: " + getIntentoActual() + ", MaxIntentos: " + getNumIntentos() + "]";
    }

    public boolean addPalabra(Palabra p) {//En una composición Naria en lugar de usar set usamos add
        boolean add = false;
        int cont = 0;
        while (cont < lista.length && lista[cont] != null) {
            cont++;
        }
        if (cont == lista.length) {
            add = false;
        } else {
            lista[cont] = p; //Añadimos un nuevo dato en el array siempre y cuando el array no este lleno
            add = true;
        }
        return add;
    }


}
