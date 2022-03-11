package unex.cum.edi.sesion6;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class Ahorcado {
    //Declaraciones
    private Teclado t = new Teclado();
    private int intentoActual;
    private int numIntentos;
    private Palabra seleccionado;
    private Palabra[] lista;
    private boolean[] aciertos=new boolean[20];

//Constructores
        //Por defecto
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


    //Método equals
    public boolean equals(Object o)
    {
        if(this==o) return true;
        if(getClass() == o.getClass()) return false;
        Ahorcado ah=(Ahorcado)o;
        return this.getSeleccionado().equals(ah.seleccionado) && this.intentoActual == ah.intentoActual && this.numIntentos == ah.numIntentos;

    }
       //No se compara la composición Naria
    //Método toString
    public String toString() {
        return "Ahorcado [Seleccionada: " + getSeleccionado().getTexto() + ", Intentos: " + getIntentoActual() + ", MaxIntentos: " + getNumIntentos() + "]";
    }

    public boolean addPalabra(Palabra p) {//En una composición Naria en lugar de usar set usamos add
        int cont = 0;
        while (cont < lista.length && lista[cont] != null) {
            cont++;
        }
        if (cont == lista.length) {
            return false;
        } else {
            lista[cont] = p; //Añadimos un nuevo dato en el array siempre y cuando el array no este lleno
            return true;
        }
    }

                       //Introducimos la lógica del juego:

    /**
     * @param pos
     * @throws IOException
     * @Description controlamos que la posicion introducida para seleccionar una palabra no sea menor que 1 ni mayor o igual al tamaño del array
     */

    public int controlPos(int pos) throws IOException {//Controlamos que la posición introducida esté entre 0 y la cantidad de palabras que tengo
        t = new Teclado();//Instanciamos un objeto de la clase teclado
        while (pos < 0 || pos >= lista.length) {
            pos = t.literalConEntero("Error, Introduce una nueva posicion: ");//El usuario tiene que volver a introducir la posición cuando siempre que no se cumpla la condicion
        }
        return pos;
    }


    /**
     * @Description Selecciona una palabra con la posicion introducida por teclado
     */
    public void selectWord() {//Metodo que selecciona una palabra en una posicion aleatoria del array
        Random r = new Random(); //Primero creamos un objeto de la clase Random
        int pos = r.nextInt() * lista.length;//Almacenamos un numero aleatorio entre el 0(incluido) y numPalabrasQueTengo(excluido) en una variable de tipo entero
        seleccionado = lista[pos];//Obtenemos la palabra seleccionada que ocupa dicha posicion aleatoria
        aciertos = new boolean[seleccionado.getTexto().length()];//Asignamos el array de aciertos un tamaño que sea igual al tamaño de la palabra seleccionada
        Arrays.fill(aciertos, false);//Es lo mismo que recorrer el array con un for y llenarlo con false
    }

    /**
     * @param pos es de tipo entero
     * @throws IOException
     * @Description selecciona una palabra con la posicion introducida por teclado
     */
    public void selectWord(int pos) throws IOException {//Método para seleccionar la palabra desde una posición especificada
        pos = controlPos(pos);
        seleccionado = lista[pos];//Almacenamos la palabra que ocupa la posición especificada
    }

    /**
     * @param letra Es de tipo char
     * @return enc Es de tipo booleano
     * @Description Comprueba si la letra introducida coincide con alguna del texto
     */

    public boolean discoverLetter(char letra) {//Metodo: Dada una letra comprobamos que se encuentra en la palabra seleccionada
        boolean enc = false;//Booleano para comprobar si la letra es encontrada
        String texto = seleccionado.getTexto();//Obtenemos la palabra seleccionada;
        //Recorremos el array de todos los caracteres de la palabra seleccionada
        for (int i = 0; i < seleccionado.getTexto().length(); i++) {
            if (letra == texto.charAt(i) && !aciertos[i]) {//Si la letra no esta y he acertado
                enc = true;//si la letra es encontrada
                aciertos[i] = true;//Almacenamos en un array de booleanos
            }
        }

        if (!enc) {
            intentoActual++;
        }
        return enc;

    }

    /**
     * @return Es de tipo booleano
     * @Description comprueba si ha acertado todas las letras introducidas
     */
    public boolean siGanado() { //Si ya esta todo acertado
        int i = 0;
        while (i < aciertos.length && aciertos[i]) {
            i++;
        }
        return i == aciertos.length;
    }

    /**
     * @Description Comprueba si se ha alcanzado el máximo de intentos
     * @return enc Devuelve un valor de tipo booleano
     */
    public boolean siFin() {
        return intentoActual == numIntentos;
    }


    /**
     * @Description Mostrar mensajes
     * @return
     */
    public StringBuilder showHorca()
{
    StringBuilder temp=new StringBuilder();
    switch(intentoActual){
        case 5:
            temp.append(".........\n");
            temp.append(".    0\n");
            temp.append(".  / | \\\n");
            temp.append(".    | \n");
            temp.append(".   / \\\n");
            temp.append(".........\n");
            temp.append("---FIN---\n");
            break;
        case 4:
            temp.append(".........\n");
            temp.append(".    0\n");
            temp.append(".  / | \\\n");
            temp.append(".    | \n");
            temp.append(".   / \\\n");
            temp.append(".........\n");

            break;
        case 3:
            temp.append(".........\n");
            temp.append(".    0\n");
            temp.append(".  / | \\\n");
            temp.append(".    | \n");
            temp.append(". \n");
            temp.append(".........\n");
            break;
        case 2:
            temp.append(".........\n");
            temp.append(".    0\n");
            temp.append(".    | \n");
            temp.append(".    | \n");
            temp.append(".      \n");
            temp.append(".........\n");
            break;
        case 1:
            temp.append(".........\n");
            temp.append(".    0\n");
            temp.append(".\n");
            temp.append(".\n");
            temp.append(".\n");
            temp.append(".........\n");
            break;
        case 0:
            temp.append(".........\n");
            temp.append(".\n");
            temp.append(".\n");
            temp.append(".\n");
            temp.append(".\n");
            temp.append(".........\n");
            break;
    }
    return temp;
    }
}
