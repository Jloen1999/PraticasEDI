package es.unex.cum.edi.ejerciciosRepaso.Capítulo5;
/**
 * Esta clase determina si una frase es palindroma o no.
 * Esta solución utiliza arrays de caracteres.
 */
import java.io.*;

public class Palindromo1
{
    private char[] frase;

    /**
     * Lee un string y lo convierte a array de caracteres
     */
    public void leer()
    {
        String str = null;
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        try {
            str = buff.readLine();
        }
        catch (IOException e) {}
        frase = str.toCharArray();
    }

    /**
     * Cuenta el numero de caracteres validos (no espacios) en la frase
     */
    private int contarCaracteresValidos()
    {
        int cont = 0;
        for (int i = 0; i < frase.length; i++) {
            if (frase[i] != ' ') cont++;
        }
        return cont;
    }

    /**
     * Elimina los espacios de la frase
     */
    public void quitarEspacios()
    {
        char[] nuevo = new char[contarCaracteresValidos()];
        
        int i = 0;
        int j = 0;
        for (i = 0; i < frase.length; i++) {
            if (frase[i] != ' ') {
                nuevo[j] = frase[i];
                j++;
            }
        }
        frase = nuevo;
    }
    
    
    /**
     * Muestra el contenido del array
     */
    public void mostrar() {
        int i;
        for (i = 0; i < frase.length; i++) {
               System.out.print(frase[i]);
        }
        System.out.println();
    }
            
        
    
    /**
     * Comprobamos si la frase es palindroma recorriéndola desde el extremo izquierdo
     * (variable i) y desde el derecho (variable j). Si encontramos alguna pareja diferente,
     * sabremos que la frase no es palindroma.
     */
    public boolean esPalindromo() {
        int i = 0;
        int j = frase.length-1;
        boolean palindromo = true;
        
        while (i < j && palindromo) {
            if (frase[i] != frase[j])
                palindromo = false;
            i++;
            j--;
        }
        
        return palindromo;
    }
}
