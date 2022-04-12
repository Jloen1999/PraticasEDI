package es.unex.cum.edi.ejerciciosRepaso.Capítulo6;

import java.io.*;


public class GeneraHTML{

  private String textoTitulo, colorTitulo, tamTitulo;
  private String textoCuerpo, colorCuerpo, tamCuerpo;

  public void leerDatos() {
      System.out.println("Introduce el texto del título:");
      textoTitulo = System.console().readLine();
      System.out.println("Introduce el color del título:");
      colorTitulo = System.console().readLine();
      System.out.println("Introduce el tamaño del título:");
      tamTitulo = System.console().readLine();
      
      System.out.println("Introduce el texto del cuerpo:");
      textoCuerpo = System.console().readLine();
      System.out.println("Introduce el color del cuerpo:");
      colorCuerpo = System.console().readLine();
      System.out.println("Introduce el tamaño del cuerpo:");
      tamCuerpo = System.console().readLine();
  }
  
  
  public void generarHTML() {
    try {
      FileWriter fw = new FileWriter("pagina.html");
      
      fw.write("<html>\n\t<head>\n\t\t<meta charset='UTF-8'>\n\t\t<title>Ejemplo Java</title>\n\t</head>\n");
      fw.write("<body><p style = 'font-size: " + tamTitulo + 
               " ; color:" + colorTitulo + "'>" + 
                 textoTitulo + "</p>");
                 
      fw.write("<p style = 'color:" + colorCuerpo + 
                "; font-size: " + tamCuerpo + "'>" + textoCuerpo + "</p></body></html>");
      fw.close();
    }
    catch (IOException e) { e.printStackTrace(); }
                
  }

  
  
  
  
  
  
  
  
  
  
  
  
  

}
