package unex.cum.edi.sesion5;

import java.util.Random;
import java.io.IOException;

public class Ahorcado {
    private Teclado t = new Teclado();

    private int intentoActual;
    private int numIntentos;
    private Palabra seleccionado;
    private Palabra[] lista;

    private int numPalabrasQueTengo;
    private int numLetrasAcertadas;
    private boolean[] aciertos;


    public Ahorcado() {
        intentoActual = 0;
        numIntentos = 5;
        seleccionado = new Palabra();
        lista = new Palabra[4];
        numPalabrasQueTengo = 0;
        numLetrasAcertadas = 0;
        aciertos = new boolean[seleccionado.getTexto().length()];
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

    //Introducimos la lógica del juego
    public int controlarPos(int pos) throws IOException {//Controlamos que la posición introducida esté entre 0 y la cantidad de palabras que tengo
        t = new Teclado();//Instanciamos un objeto de la clase teclado
        while (pos < 0 || pos > numPalabrasQueTengo) {
            pos = t.literalConEntero("Introduce una nueva posicion: ");//El usuario tiene que volver a introducir la posición cuando siempre que no se cumpla la condicion
        }
        return pos;//Devolvemos la posicion correcta
    }

    public void seleccionarPalabra(int pos) throws IOException {//Método para seleccionar la palabra desde una posición especificada
        pos = controlarPos(pos);
        seleccionado = lista[pos];//Almacenamos la palabra que ocupa la posición especificada
        aciertos = new boolean[seleccionado.getTexto().length()];//Asignamos el array de aciertos un tamaño que sea igual al tamaño de la palabra seleccionada

    }

    public void seleccionarPalabra() {//Metodo que selecciona una palabra en una posicion aleatoria del array
        Random r = new Random(); //Primero creamos un objeto de la clase Random
        int alea = r.nextInt(numPalabrasQueTengo);//Almacenamos un numero aleatorio entre el 0(incluido) y numPalabrasQueTengo(excluido) en una variable de tipo entero
        seleccionado = lista[alea];//Obtenemos la palabra seleccionada que ocupa dicha posicion aleatoria
        aciertos = new boolean[seleccionado.getTexto().length()];//Asignamos el array de aciertos un tamaño que sea igual al tamaño de la palabra seleccionada
    }

    public boolean descubrirLetra(char letra) {//Metodo: Dada una letra comprobamos que se encuentra en la palabra seleccionada
        boolean enc = false;//Booleano para comprobar si la letra es encontrada
        String texto = seleccionado.getTexto();//Obtenemos la palabra seleccionada;
        //Recorremos el array de todos los caracteres de la palabra seleccionada
        for (int i = 0; i < texto.length(); i++) {
            if (letra == texto.charAt(i) && !aciertos[i]) {//Si la letra no esta y he acertado
                enc = true;//si la letra es encontrada
                numLetrasAcertadas++;//incrementamos el numero de letras acertadas
                aciertos[i] = true;//Almacenamos en un array de booleanos
            }
        }

        if (enc) {
            return true;
        } else {
            intentoActual++;
            return false;
        }

    }

    public boolean siGanado() { //Si ya esta todo acertado
        if(numLetrasAcertadas==seleccionado.getTexto().length()){
            return true;
        } else {
            return false;
        }
    }

    public boolean siFracaso(){
        return intentoActual==numIntentos;
    }

}
