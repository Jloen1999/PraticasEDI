package es.unex.cum.edi.ejerciciosRepaso.Capítulo6;

import java.io.*;

public class DescomponerTexto {

    public static void main(String[] args) {
      System.out.println("Escribe una frase, anda: ");
      String frase = System.console().readLine();
      System.out.println("Voy a guardar tu frase en el fichero salida.txt");
      System.out.println("Pondré cada palabra en una línea.");
      
      try {
	FileWriter f = new FileWriter("salida.txt");
	// La solución fácil es usar el replace() de String, así:
	//frase = frase.replaceAll(" ", "\n");
	//f.write(frase);
	
	// Pero nosotros procesaremos el String carácter a carácter, así:
	for (int i = 0; i < frase.length(); i++) {
	  if (frase.charAt(i) == ' ')
	    f.write('\n');
	  else
	    f.write(frase.charAt(i));
	}
	f.close();
       }	    
       catch (Exception e) {
	  e.printStackTrace();
       }

    }

}
