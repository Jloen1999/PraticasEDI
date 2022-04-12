package es.unex.cum.edi.ejerciciosRepaso.Capítulo5;

/**
 * Esta clase sustituye las vocales de una frase por asteriscos.
 * En esta solución utilizamos un StringBuffer.
 */
public class Asteriscos2 {
    
    StringBuffer frase;
    
    public Asteriscos2(String s) {
        // Creamos un StringBuffer a partir del String
        frase = new StringBuffer(s);
    }
    
    // Muestra el contenido del string
    public void mostrar(){
        System.out.println(frase);
    }
    
    // Reemplaza las vocales por asteriscos
    public void convertir(){
        
        for(int i = 0; i < frase.length(); i++){
            
            if (frase.charAt(i)=='a'||frase.charAt(i)=='e'||frase.charAt(i)=='i'||frase.charAt(i)=='o'||frase.charAt(i)=='u'){
                frase.replace(i, i, "*");
            }
        }
    }
}
