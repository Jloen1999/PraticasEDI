package es.unex.cum.edi.ejerciciosRepaso.Capítulo5;
/**
 * Esta clase determina si una frase es palindroma o no.
 * Esta solución utiliza String y StringBuffer.
 */
import java.io.*;

public class Palindromo2
{
    private String frase;

    /**
     * Lee un string y lo convierte a array de caracteres
     */
    public void leer()
    {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        try {
            frase = buff.readLine();
        }
        catch (IOException e) {}
    }

    /**
     * Cuenta el numero de caracteres validos (no espacios) en la frase
     */
    private int contarCaracteresValidos()
    {
        return frase.length();
    }

    /**
     * Elimina los espacios de la frase
     */
    public void quitarEspacios()
    {
        frase = frase.replaceAll(" ", "");
    }
    
    
    /**
     * Muestra el contenido del array
     */
    public void mostrar() {
        System.out.println(frase);
    }
            
        
    
    /**
     * Comprobamos si la frase es palindroma recorriéndola desde el extremo izquierdo
     * (variable i) y desde el derecho (variable j). Si encontramos alguna pareja diferente,
     * sabremos que la frase no es palindroma.
     */
    public boolean esPalindromo() {
        StringBuffer str1 = new StringBuffer(frase);
        String fraseInvertida = str1.reverse().toString();
        
        return frase.equals(fraseInvertida);
        
    }
}
