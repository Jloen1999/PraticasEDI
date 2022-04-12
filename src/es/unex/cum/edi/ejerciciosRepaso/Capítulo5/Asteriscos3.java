package es.unex.cum.edi.ejerciciosRepaso.Capítulo5;

/**
 * Esta clase sustituye las vocales de una frase por asteriscos.
 * En esta solución utilizamos un String convencional.
 */
public class Asteriscos3 {
    
    String frase;
    
    public Asteriscos3(String s) {
        frase = s;
    }
    
    // Mostramos el estado actual de String    
    public void mostrar(){
        System.out.println(frase);
    }
    
    // Sustituimos las vocales por asteriscos
    public void convertir(){
        frase = frase.replace('a', '*');
        frase = frase.replace('e', '*');
        frase = frase.replace('i', '*');
        frase = frase.replace('o', '*');
        frase = frase.replace('u', '*');
    }
}
