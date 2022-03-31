package es.unex.cum.edi.evaluables.sesion1;//Importamos las librerias necesarias

import java.io.IOException;

public class Multiplo2y5{ //Creamos la clase con el mismo nombre que el programa
    public static void main(String[] args) throws IOException{//Creamos el metodo que ejecuta el programa
        int i=1;//inicializamos el contador i
        boolean cont=true;//Variable booleana que me indicara cuando se termina la recursividad
        mostrarMultiplos(i,cont);//procedimiento que muestra solo los numeros multiplos del 2 y 5, siempre y cuando pertecezcan al intervalo [0-1000]
            
        
    }
    
    public static void mostrarMultiplos(int i,boolean cont) throws IOException{
        if(i>0 && i<=1000 && cont){//Controlamos que los numeros a mostrar entre [0-1000]
            if(i%2==0 && i%5==0){ //Controlamos que solo se puedan mostrar numeros multiplos de 2 y 5
                System.out.print(i+" ");//Mostramos los numeros siempre y cuando hayan cumplido las dos primeras condiciones
                i++;//Incrementamos el contador
                if(i>1000){//Controlamos que el contador al superar los 1000 se cancele la resursividad
                   cont=false;//Para ello asignamos al booleano el valor a false, entonces se terminaría el programa
                }else{//En caso contrario, siempre y cuando no supere los 1000 se seguirá repitiendo el procedimiento
                   mostrarMultiplos(i,cont);
                }
                
             }else{//Si el numero esta dentro del intervalo pero no es un multiplo de 2 ni de 5 
                  i++;//seguimos incrementando el contador
                  if(i==1000){//Si el numero es igual a 1000 solo nos mostrara el numero sin el espacio
                    System.out.print(i);
                  }else{
                      mostrarMultiplos(i,cont);//En caso contrario se repetiria la recursividad    
                  }
           
         }//FIN IF
     }//FIN IF
    }//FIN de la ejecucion del programa
}//FIN de la clase