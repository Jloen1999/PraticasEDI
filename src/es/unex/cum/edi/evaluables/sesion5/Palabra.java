/**
 *   @Description:
 *   El programa funcionará como se describe a continuación:
 * Inicialización: En primer lugar se definirá un objeto ahorcado cuyo constructor fijará el máximo de palabras en 5 y el número máximo de intentos en 6
 *
 * Rellenar información: A continuación se procederá a rellenar dicho array de palabras. Para ello se mostrará un menú que permita añadir Palabras al array de ahorcado. El menú será: 1. Sustantivo 2. Verbo 3. Adjetivo (es decir hay que leer un entero).
 *
 * Si es sustantivo se leerá el texto (String), pista (String) y número (int, 1 singular, 2 plural)
 *
 * Si es adjetivo se leerá el texto (String), pista (String) y género (int, 1 masculino, 2 femenino, 3 neutro)
 *
 * Si es verbo se leerá el texto (String), pista (String) y número (int, 1 Primera, 2 Segunda, 3 tercera)
 *
 * Importante: No se pide la longitud de la palabra pues se puede calcular con la propiedad length de la clase String (String nombre ? nombre.length). Deberéis modificar el constructor parametrizado de palabra para que no reciba la longitud
 *
 * Información extra: Una vez rellenado el array de palabras se leerá un entero entre 1-5 para establecer la palabra seleccionada del array de palabras.
 *
 * Mostrar info ahorcado: A continuación se mostrará la información del objeto ahorcado creado con el siguiente formato: Ahorcado [Seleccionada: XXX Intentos: YYY MaxIntentos: ZZZ] donde XXX es el valor del texto de la palabra seleccionada, YYY es el valor actual de Intentos y ZZZ es el valor de MaxIntentos. (con retorno de Carro)
 *
 * Mostrar Info Palabra Seleccionada: A continuación se mostrará la información de la palabra seleccionada (toString() de seleccionada)(con retorno de carro). La información a mostrar es:
 *
 * Sustantivo: Palabra[Texto: XXX, Pista: YYY, Longitud:ZZZ] Sustantivo[Numero: WWW]
 *
 * Adjetivo: Palabra[Texto: XXX, Pista: YYY, Longitud:ZZZ] Adjetivo[Genero: WWW]
 *
 * Verbo: Palabra[Texto: XXX, Pista: YYY, Longitud:ZZZ] Verbo[Conjugacion: WWW]
 *
 * Mostrar info de todas las palabras: A continuación se mostrará la información de todas las palabras del array (toString() de cada palabra) (con retorno de carro por cada palabra). La información a mostrar es:
 *
 * Sustantivo: Palabra[Texto: XXX, Pista: YYY, Longitud:ZZZ] Sustantivo[Numero: WWW]
 *
 * Adjetivo: Palabra[Texto: XXX, Pista: YYY, Longitud:ZZZ] Adjetivo[Genero: WWW]
 *
 * Verbo: Palabra[Texto: XXX, Pista: YYY, Longitud:ZZZ] Verbo[Conjugacion: WWW]
 *
 * Mostrar Info Longitud: A continuación se calculará la longitud total de todas las palabras del ahorcado con el formato: Longitud Total: XXX donde XXX es su valor (con retorno de Carro)
 *
 * Mostrar el atributo propio de cada palabra: El objetivo del último paso será mostrar la información específica de cada clase. Para ello se recorrerá todo el array y se comprobará que tipo de objeto es (getClass()). Se mostrará la siguiente información:
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