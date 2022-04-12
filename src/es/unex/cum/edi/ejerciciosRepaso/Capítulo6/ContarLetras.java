package es.unex.cum.edi.ejerciciosRepaso.Capítulo6;

import java.io.*;

 class ContarLetras {
 
        private char[] abecedario = {'A', 'a', 'Á', 'á', 'B', 'b', 'C', 'c', 'D', 'd', 'E', 'e', 'É', 'é', 'F', 'f', 'G', 'g', 'H', 'h', 'I', 'i', 'Í', 'í', 'J', 'j', 'K', 'k', 'L', 'l', 'M', 'm', 'N', 'n', 'Ñ', 'ñ', 'O', 'o', 'Ó', 'ó', 'P', 'p', 'Q', 'q', 'R', 'r', 'S', 's', 'T', 't', 'U', 'u', 'Ú', 'ú', 'Ü', 'ü', 'V', 'v', 'W', 'w', 'Z', 'z'};
        private int[] contCaracteres = new int[abecedario.length];
        private int contador = 0;
        private int contNoImprimibles = 0;
        
        public void ContarLetras(){
	  for(int i = 0;i < abecedario.length; i++) {
	    contCaracteres[i]=0;
	  }
        }
	
	public void procesarArchivo(){
        
          try{
	    //Abrir el fichero indicado en la variable nombreFichero
	    FileReader finput = new FileReader("nombre-fichero.txt");
	    //Leer el primer carácter
	    //Se debe almacenar en una variable de tipo int
	    int caract = finput.read();
	    //Se recorre el fichero hasta encontrar el carácter -1 que es el final del archivo que marca el final del fichero
	    while(caract != -1)
	    {
		int pos = getPosicion(caract);
		if (pos != -1) {
		    contCaracteres[pos]++;
		}
		else {
		    contNoImprimibles++;
		}

          	caract = finput.read();

		//contamos cuantos caracteres tenemos:
		contador++;
	    } // while

  
	    //Cerrar el fichero
	    if (finput != null)  finput.close();
	  } //try
	  catch (IOException e) {
	    System.out.println("Error de lectura del fichero");
	  }
        
        }
        
 private int getPosicion(int car) {
      int i = 0;
      while (i < abecedario.length && abecedario[i] != car) {
	  i++;
      }
      if (i < abecedario.length)
	  return i;		// Devolvemos la posicion del caracter
      else
	  return -1;		
      
 }
 
        
        
 public void mostrarResultados(){
      System.out.println("Núm. de caracteres del archivo: "+contador);
      System.out.println("Letra     Núm.De veces que aparece        Frecuencia (%)");
      System.out.println("---------------------------------------------------------");
      int i = 0;
      while (i < abecedario.length) {
	  System.out.format("     ");
	  System.out.print(abecedario[i]);
	  System.out.print("\t");
	  int cont;
	  if (abecedario[i] == 'A' || abecedario[i] == 'E' || abecedario[i] == 'I' || abecedario[i] == 'O') {
	    cont = contCaracteres[i] + contCaracteres[i+1] + contCaracteres[i+2] + contCaracteres[i+3];
	    i = i + 4;
	  }
	  else if (abecedario[i] == 'U') {
	    cont = contCaracteres[i] + contCaracteres[i+1] + contCaracteres[i+2] + contCaracteres[i+3] + contCaracteres[i+4] + contCaracteres[i+5];
	    i = i + 6;
	  }
	  else {
	    cont = contCaracteres[i] + contCaracteres[i+1];
	    i = i + 2;
	  }
	  System.out.format("%5d\n\t", cont);
	  System.out.format("%20.2f\n",(double)(cont*100)/(contador-contNoImprimibles));
      }
      System.out.println("Caractes no imprimibles: "+contNoImprimibles);
 }
    
    
      
 
 
 
 
 
 
 
 
 }

