package es.unex.cum.edi.noevaluables.sesion0;

import java.io.*;


public class Evaluacion
{
    public static void main (String[] args)  throws IOException
    {    
       
	float valor;
	float masAlto=0.0F;
        InputStreamReader reader=new InputStreamReader(System.in); 
        BufferedReader Input=new BufferedReader (reader); 
        for (int i=0;i<10;i++){
	  System.out.print ("Introduce la nota: ");  
	  String nota= Input.readLine(); 
	  valor=Float.parseFloat(nota); //Convertir de cadena a Float. Integer.parseInt(nota);
	  String calificacion;
	  if (valor >= 9){calificacion="Sobresaliente";}
	  else if (valor >= 8){calificacion="Notable"; }
  	  else if (valor >= 6){calificacion="Bien";}
	  else if(valor >= 5){calificacion="Aprobado";}
	  else{ calificacion="Suspenso";}
	  //Se comprueba si tenemos un valor más alto
	  if (masAlto<valor) masAlto=valor;
	  System.out.println ("Tu nota es: " + calificacion);
	}

	System.out.println ("El número más alto es: " + masAlto);
    
     }
}



