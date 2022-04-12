package es.unex.cum.edi.ejerciciosRepaso.Capítulo5;

/**
 * Esta clase sustituye las vocales de una cadena por asteriscos.
 * En esta implementación, el string es un array de caracteres.
 */
public class Asteriscos1 {
    
    char[] caracteres;
    
    public Asteriscos(String s) {
        // Convertimos el string en un array de caracteres
        caracteres = s.toCharArray();
    }
    
    // Muestra el contenido del array de caracteres
    public void mostrar(){
        
        for(int i = 0; i < caracteres.length; i++){
            
            System.out.println(caracteres[i]);
        }
    }

    // Convierte las vocales en asteriscos
    public void convertir(){
        
        for(int i = 0; i < caracteres.length; i++){
            
            if (caracteres[i]=='a'||caracteres[i]=='e'||caracteres[i]=='i'||caracteres[i]=='o'||caracteres[i]=='u'){
                caracteres[i] = '*';
            }
        }
    }
}
