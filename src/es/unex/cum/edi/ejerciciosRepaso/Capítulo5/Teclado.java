package es.unex.cum.edi.ejerciciosRepaso.Capítulo5;

import java.io.*;

public class Teclado {

    public static int leerInteger(String mensaje, int minimo, int maximo) {
	int n = 0;
	boolean salir = false;
	BufferedReader buff = new BufferedReader (new InputStreamReader(System.in));

	System.out.println(mensaje);
	
	while (!salir) {
	  try {
	    n = Integer.parseInt(buff.readLine());
	    if (n < minimo || n > maximo) {
	      System.out.println("Error: el numero tiene que estar entre " + minimo + " y " + maximo);
	      salir = false;
	    }
	    else
	      salir = true;
	  }
	  catch (IOException ex) {
	    System.out.println("Error de entrada/salida");
	    salir = false;
	  }
	  catch (NumberFormatException ex) {
	    System.out.println("Por favor, introduduzca un número");
	    salir = false;
	  }
	}

	return n;
    }
    
    public static int leerInteger(String mensaje) {
        return leerInteger(mensaje, 0, 100);
    }

    public static double leerDouble(String mensaje, double minimo, double maximo) {
	double n = 0;
	boolean salir = false;
	BufferedReader buff = new BufferedReader (new InputStreamReader(System.in));

	System.out.println(mensaje);
	
	while (!salir) {
	  try {
	    n = Double.parseDouble(buff.readLine());
	    if (n < minimo || n > maximo) {
	      System.out.println("Error: el numero tiene que estar entre " + minimo + " y " + maximo);
	      salir = false;
	    }
	    else
	      salir = true;
	  }
	  catch (IOException ex) {
	    System.out.println("Error de entrada/salida");
	    salir = false;
	  }
	  catch (NumberFormatException ex) {
	    System.out.println("Por favor, introduduzca un número");
	    salir = false;
	  }
	}

	return n;
    }

    
    
    public static String leerString(String mensaje) {
	String str = "";
	BufferedReader buff = new BufferedReader (new InputStreamReader(System.in));

	System.out.println(mensaje);
	
	try {
	    str = buff.readLine();
	}
	catch (IOException ex) {
	    System.out.println("Error de entrada/salida");
	}

	return str;
    }
    
}
