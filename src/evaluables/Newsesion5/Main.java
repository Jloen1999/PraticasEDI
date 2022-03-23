package evaluables.Newsesion5;

import java.io.IOException;

public class Main {

    private static Ahorcado a;
    private static Teclado t;

    public static void main(String[] args) throws IOException {
        t = new Teclado();//Instanciamos un obejto de la clase Teclado
        a = new Ahorcado();//Instanciamos un objeto de la clase Ahorcado
        int tam = 5, max = 6;//Especificamos el tamaño del array de palabras y el máximo de intentos
        initAhorcado(tam, max);//Inicializamos el ahorcado con un tamaño y maximo de intentos fijos
        fillWordArray();//Rellenamos el array de palabras
        int numero = controlarIndice();//Introducimos un numero entre 1 y 5
        a.setSeleccionada(a.getLista()[numero]);//Obtenemos la palabra que ocupa dicha posicion
        System.out.println(a.toString());//Mostramos dicha palabra seleccionada
        getSelectedWord(a.getSeleccionada());
        showAllWords();//Mostramos todas las palabras del array
        System.out.println("Longitud Total: " + getLongitudTotal());//Mostramos la longitud total de la suma de las longitudes de todas las palabras del array
        showOwnAttributes();//Mostrar el atributo propio de las clases derivadas(Sustantivo, Adjetivo,Verbo)

    }

    public static void initAhorcado(int tam, int max) {//Inicializamos el ahorcado con un tamaño y maximo especificos
        a = new Ahorcado(5, 6);
    }

    public static void fillWordArray() throws IOException {//rellenamos el array de palabras
        int tipo;//Creamos un entero para introducir las palabras en el array dependiendo de la clase hija o derivada
        for (int i = 0; i < a.getLista().length; i++) {//Recorremos el array de palabras
            //tipo=t.Menu(new String[] {"1. Sustantivo","2. Verbo","3. Adjetivo"},1,3); //Mostramos el menu
            tipo = t.leerEntero();//Introducimos el tipo
            switch (tipo) {//Según el tipo que hemos introducido previamente añadiremos un sustantivo(tipo-->1), verbo(tipo-->2) o adjetivo(tipo-->3)
                case 1: a.addPalabra(new Sustantivo(t.literalConString("Introduce el texto: "), t.literalConString("Introduce la pista:"), t.literalConEntero("Introduce el numero: ")));//añadimos un sustantivo
                break;
                case 2: a.addPalabra(new Verbo(t.literalConString("Introduce el texto: "), t.literalConString("Introduce la pista:"), t.literalConEntero("Introduce el numero: ")));//añadimos un verbo
                break;
                case 3: a.addPalabra(new Adjetivo(t.literalConString("Introduce el texto: "), t.literalConString("Introduce la pista:"), t.literalConEntero("Introduce el numero: ")));//añadimos un adjetivo
                break;
            }
        }
    }

    public static int controlarIndice() throws IOException {//Controlamos que el numero introducido para mostrar la Palabra que ocupa dicha posicion no sea menor que 1 ni mayor que 5
        int numero = t.leerEntero();//Introducimos el numero
        while (numero < 1 || numero > 5) {//Controlamos que no este fuera del rango
            numero = t.leerEntero();//En caso de estar fuera del rango tenemos que volver a introducir el numero
        }
        return numero;//Retornamos el numero siempre y cuando cumple la condicion
    }

    public static void getSelectedWord(Palabra p) {//Motramos la palabra seleccionada
        //Para ello primero tenemos que saber de que clase se trata
        if (p.getClass().equals(Sustantivo.class)) {
            Sustantivo sus = (Sustantivo) p;
            System.out.println(sus.toString());
        } else if (p.getClass().equals(Adjetivo.class)) {
            Adjetivo ad = (Adjetivo) p;
            System.out.println(ad.toString());

        } else if (p.getClass().equals(Verbo.class)) {
            Verbo verb = (Verbo) p;
            System.out.println(verb.toString());
        }

    }

    public static void showAllWords() {//Mostramos todas las palabras del array de palabras
        for (Palabra p : a.getLista()) {//Recorremos el array de palabras
            getSelectedWord(p);//Mostramos la palabra que ocupa la posicion correspondiente
        }
    }

    public static int getLongitudTotal() { //Mostramos la longitud total de todas las palabras
        int suma = 0; //Inicializamos el acumulador
        for (Palabra p : a.getLista()) {//Recorremos el array de palabras
            suma += p.getLongitud(); //Vamos acumulando las longitudes de cada palabra
        }
        return suma;//Retornamos la longitud total
    }

    public static void showOwnAttributes() { //Mostramos los atributos especificos de cada clase hija
        for (Palabra p : a.getLista()) { //Recorremos el array de palabras
            //Verificamos de que clase derivada se trata
            if (p.getClass().equals(Sustantivo.class)) {
                Sustantivo sus = (Sustantivo) p;//Hacemos upcasting para instanciar un objeto de la clase hija correspondiente y hacer uso de sus atributos o metodos propios
                System.out.println("Sustantivo[Numero: " + sus.getNumero() + "]");//Mostramos el atributo propio de la clase Sustantivo
            } else if (p.getClass().equals(Adjetivo.class)) {
                Adjetivo ad = (Adjetivo) p;//Hacemos el upcasting de la clase Adjetivo
                System.out.println("Adjetivo[Genero: " + ad.getGenero() + "]");//Mostramos el atributo propio de la clase Adjetivo
            } else if (p.getClass().equals(Verbo.class)) {
                Verbo verb = (Verbo) p;//Hacemos el upcasting de la clase Verbo
                System.out.println("Verbo[Conjugacion: " + verb.getConjugacion() + "]");//Mostramos el atributo propio de la clase Verbo
            }
        }

    }


}
