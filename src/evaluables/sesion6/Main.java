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
 * Importante: No se pide la longitud de la palabra pues se puede calcular con la propiedad length de la clase String (String nombre → nombre.length). Deberéis modificar el constructor parametrizado de palabra para que no reciba la longitud
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

package evaluables.sesion6;


import java.io.IOException;

public class  Main {

    private static Ahorcado a;
    private static Teclado t;

    public static void main(String[] args) throws IOException {
        t = new Teclado();//Instanciamos un obejto de la clase Teclado
        a = new Ahorcado();//Instanciamos un objeto de la clase Ahorcado
        int tam = 5, max = 6;//Especificamos el tamaño del array de palabras y el máximo de intentos
        initAhorcado(tam, max);//Inicializamos el ahorcado con un tamaño y maximo de intentos fijos
        a.addPalabra(new Sustantivo(new Palabra("casa","Lugar donde se habita"),1));
        a.addPalabra(new Sustantivo(new Palabra("coche","Vehiculo automatico de tamanio pequenio o mediano"),1));
        a.addPalabra(new Sustantivo(new Palabra("ahorcado","Juego de mesa para descubrir palabras"),1));
        int pos=t.literalConEntero("Introduce una posicion: ");
        a.selectWord(pos);
        while(!a.siFin() && !a.siGanado()){
            char letra=t.literalConChar("Introduce un caracter: ");
            if(a.discoverLetter(letra)){
                System.out.println("Has acertado");
            }else{
                System.out.println("NO has acertado");
            }
            if(!a.siGanado()){ //Si no se usa el CV
                System.out.println(a.showHorca());
                if(a.getIntentoActual()==3){//Si no se usa el CV
                    System.out.println("Pista: "+a.getSeleccionado().toString());
                }
            }

            if(a.siGanado()){
                System.out.println("HAS GANADO");
            }else{
                System.out.println("Otra vez sera");
            }

        }

    }
    public static void initAhorcado(int tam, int max) {//Inicializamos el ahorcado con un tamaño y maximo especificos
        a = new Ahorcado(5, 6);
    }


}