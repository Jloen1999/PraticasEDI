/**
 *   @Description:
 *   El programa funcionar� como se describe a continuaci�n:
 * Inicializaci�n: En primer lugar se definir� un objeto ahorcado cuyo constructor fijar� el m�ximo de palabras en 5 y el n�mero m�ximo de intentos en 6
 *
 * Rellenar informaci�n: A continuaci�n se proceder� a rellenar dicho array de palabras. Para ello se mostrar� un men� que permita a�adir Palabras al array de ahorcado. El men� ser�: 1. Sustantivo 2. Verbo 3. Adjetivo (es decir hay que leer un entero).
 *
 * Si es sustantivo se leer� el texto (String), pista (String) y n�mero (int, 1 singular, 2 plural)
 *
 * Si es adjetivo se leer� el texto (String), pista (String) y g�nero (int, 1 masculino, 2 femenino, 3 neutro)
 *
 * Si es verbo se leer� el texto (String), pista (String) y n�mero (int, 1 Primera, 2 Segunda, 3 tercera)
 *
 * Importante: No se pide la longitud de la palabra pues se puede calcular con la propiedad length de la clase String (String nombre ? nombre.length). Deber�is modificar el constructor parametrizado de palabra para que no reciba la longitud
 *
 * Informaci�n extra: Una vez rellenado el array de palabras se leer� un entero entre 1-5 para establecer la palabra seleccionada del array de palabras.
 *
 * Mostrar info ahorcado: A continuaci�n se mostrar� la informaci�n del objeto ahorcado creado con el siguiente formato: Ahorcado [Seleccionada: XXX Intentos: YYY MaxIntentos: ZZZ] donde XXX es el valor del texto de la palabra seleccionada, YYY es el valor actual de Intentos y ZZZ es el valor de MaxIntentos. (con retorno de Carro)
 *
 * Mostrar Info Palabra Seleccionada: A continuaci�n se mostrar� la informaci�n de la palabra seleccionada (toString() de seleccionada)(con retorno de carro). La informaci�n a mostrar es:
 *
 * Sustantivo: Palabra[Texto: XXX, Pista: YYY, Longitud:ZZZ] Sustantivo[Numero: WWW]
 *
 * Adjetivo: Palabra[Texto: XXX, Pista: YYY, Longitud:ZZZ] Adjetivo[Genero: WWW]
 *
 * Verbo: Palabra[Texto: XXX, Pista: YYY, Longitud:ZZZ] Verbo[Conjugacion: WWW]
 *
 * Mostrar info de todas las palabras: A continuaci�n se mostrar� la informaci�n de todas las palabras del array (toString() de cada palabra) (con retorno de carro por cada palabra). La informaci�n a mostrar es:
 *
 * Sustantivo: Palabra[Texto: XXX, Pista: YYY, Longitud:ZZZ] Sustantivo[Numero: WWW]
 *
 * Adjetivo: Palabra[Texto: XXX, Pista: YYY, Longitud:ZZZ] Adjetivo[Genero: WWW]
 *
 * Verbo: Palabra[Texto: XXX, Pista: YYY, Longitud:ZZZ] Verbo[Conjugacion: WWW]
 *
 * Mostrar Info Longitud: A continuaci�n se calcular� la longitud total de todas las palabras del ahorcado con el formato: Longitud Total: XXX donde XXX es su valor (con retorno de Carro)
 *
 * Mostrar el atributo propio de cada palabra: El objetivo del �ltimo paso ser� mostrar la informaci�n espec�fica de cada clase. Para ello se recorrer� todo el array y se comprobar� que tipo de objeto es (getClass()). Se mostrar� la siguiente informaci�n:
 *
 * Sustantivo: Sustantivo[Numero: WWW]
 *
 * Adjetivo: Adjetivo[Genero: WWW]
 *
 * Verbo: Verbo[Conjugacion: WWW]
 *
 *    @author: Jose Luis Obiang Ela Nanguan
 *    @version: 10/03/2022
 *
 */

package es.unex.cum.edi.evaluables.sesion5;

public class Palabra{
    protected String texto;
    protected String pista;
    protected int longitud;

    public Palabra(){
        texto=new String();
        pista=new String();
        longitud=0;
    }

    public Palabra(String t, String p){
        texto=t;
        pista=p;
        longitud=texto.length();
    }

    public void setTexto(String texto){
        this.texto=texto;
        setLongitud(texto.length());
    }
    public void setPista(String pista)
    {
        this.pista=pista;

    }
    public void setLongitud(int longitud){
        this.longitud=longitud;
    }
    public String getTexto()
    {
        return texto;
    }
    public String getPista()
    {
        return pista;
    }
    public int getLongitud()
    {
        return longitud;
    }

    public String toString()
    {
        return "Palabra ["+
                "texto="+ this.getTexto()+ ", pista="+this.getPista()+", longitud="+this.getLongitud()+"]";
    }

    public boolean equals(Object o)
    {
        if(this==o) return true;
        if(getClass()!=o.getClass()) return false;
        Palabra p=(Palabra)o;
        return this.texto.equals(p.texto) && this.pista.equals(p.pista) && this.longitud==p.longitud;
    }



}