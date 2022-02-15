package noevaluables.sesion0;//Variable bandera
import java.util.*; 
public class Primo {
  public static void main(String[] args) {
    int num; //Variable usada para leer el numero
    int divisor=2; //se va ir dividiendo empezando por 2
    boolean bandera=false; // determinar cuando termina

    Scanner in = new Scanner (System.in) ; //Otro mecanismo de lectura
    System.out.println("Introduce un numero: " );
    num=in.nextInt(); // Lectura de un numero entero
    while(!bandera && divisor<num)  { 
      if (num%divisor==0) // si el resto es 0 --> no es primo
	bandera=true; // Se cambia el valor de la bandera
    else
      divisor++; //Se incrementa el divisor 
    }
  if (bandera) //Se comprueba si es o no primo
    System.out.println("el numero no es primo" ) ; 
  else
    System.out.println("el numero si es primo" ) ;
  }

}