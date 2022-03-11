package unex.cum.edi.sesion5;

import unex.cum.edi.practica.tablero.Teclado;

public class Ahorcado {
    private Teclado t = new Teclado();

    protected int intentoActual;
    protected int numIntentos;
    protected Palabra seleccionada;
    protected Palabra[] lista;

    public Ahorcado() {
        intentoActual = 0;
        numIntentos = 5;
        seleccionada = new Palabra();
        lista = new Palabra[4];
    }

    public Ahorcado(int tam, int max) {
        intentoActual = 0;
        numIntentos = max;
        seleccionada = new Palabra();
        lista = new Palabra[tam];
    }

    public void setIntentoActual(int intentoActual) {
        this.intentoActual = intentoActual;
    }

    public void setNumIntentos(int numIntentos) {
        this.numIntentos = numIntentos;
    }

    public void setSeleccionada(Palabra p) {
        seleccionada = p;
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

    public Palabra getSeleccionada() {
        return seleccionada;
    }

    public Palabra[] getLista() {
        return lista;
    }

    public String toString() {
        return "Ahorcado [Seleccionada: " + getSeleccionada().getTexto() + ", Intentos: " + getIntentoActual() + ", MaxIntentos: " + getNumIntentos() + "]";
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
