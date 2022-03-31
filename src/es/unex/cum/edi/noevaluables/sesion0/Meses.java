package es.unex.cum.edi.noevaluables.sesion0;


import java.io.*;   


public class Meses
{
    public static void main (String[] args)  throws IOException
    {    
       
	int valor;
        InputStreamReader reader=new InputStreamReader(System.in); 
        BufferedReader Input=new BufferedReader (reader); 
        System.out.println ("Introduce el numero del mes: ");  
        String mes= Input.readLine(); 
	valor=Integer.parseInt(mes);
	switch ( valor ){
  		case 1: System.out.println( "Enero" ); break;
  		case 2: System.out.println( "Febrero" ); break;
  		case 3: System.out.println( "Marzo" ); break;
		case 4: System.out.println( "Abril" ); break;
		case 5: System.out.println( "Mayo" ); break;
		case 6: System.out.println( "Junio" ); break;
		case 7: System.out.println( "Julio" ); break;
		case 8: System.out.println( "Agosto" ); break;
		case 9: System.out.println( "Septiembre" ); break;
		case 10: System.out.println( "Octubre" ); break;
		case 11: System.out.println( "Noviembre" ); break;
		case 12: System.out.println( "Diciembre" ); break;
  		default: System.out.println( "Mes no valido" ); break;
	}
     }
}
