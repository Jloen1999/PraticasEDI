package es.unex.cum.edi.ejerciciosRepaso.Capítulo6;

import java.io.*;

public class Concatenar {

    public static void main(String[] args) {
      try {
	FileReader fi1 = new FileReader("uno.txt");
	FileReader fi2 = new FileReader("dos.txt");
	FileWriter fo  = new FileWriter("tres.txt");
	char[] c = new char[1024];
	int i;
	String s = null;
	
	System.out.println("Voy a procesar el primer archivo");
	while ( fi1.read(c, 0, 1024) != -1 ) {
	  s = s + new String(c);
	}
	fo.write(s);

	System.out.println("Voy a procesar el segundo archivo");
	while ( (i = fi2.read()) != -1 ) {
	  fo.write(i);
	}
	
	fi1.close();
	fi2.close();
	fo.close();
	System.out.println("He creado el fichero tres.txt con éxito");
      }
      catch (Exception e) { e.printStackTrace(); }
      
    }

}
