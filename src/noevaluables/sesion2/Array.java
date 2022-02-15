package noevaluables.sesion2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Description:
 * Se debe definir un array de 10 enteros e introducir los 10 datos por teclado.
 * A continuación se pedirá un número más y mostrará (calculará los siguientes casos)
 *
 * Suma elementos del array (Suma: XXX)
 * Media del array (Media: XXXX)
 * La primera posición del elemento introducido (Primera: YYY) (En caso que no exista se mostrará -1)
 * Número de ocurrencias de un determinado elemento (Ocurrencias: ZZZ)
 * El número más alto del array (Alto: WWWW)
 * Por tanto el resultado sería: Suma:Val1 Media:Val2 Primera: Val3 Ocurrencias: Val4 Alto:Val5
 *
 * @Author:  Jose Luis Obiang Ela Nanguan
 * @Version: 14/02/2022
 */

public class Array{

    public static void main(String[] args) throws IOException {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(read);
        int[] vector=new int[10];//Declaramos el array de 10 elementos
        int suma=0;//acumulador, almacenara la suma de todos los elementos del array
        int pos=-1;//Indica la posicion del elemento introducido, en caso de que no exista se mostrara -1
        boolean enc=false;//Variable de parada en caso de encontrar el numero en el array
        int cont=0, mayor=0;
        for(int i=0; i<vector.length; i++){//Recorremos el array en 10 posiciones
            vector[i]=Integer.parseInt(input.readLine());//Llenamos el array de numeros enteros
        }
        //Show: Mostramos todos los elementos del Array
//        for(int i=0; i<vector.length; i++){
//            System.out.println(vector[i]+" ");
//        }
        int numeroBuscado=Integer.parseInt(input.readLine());//Introducimos el nuevo numero
        for(int i=0; i<vector.length; i++){
            suma+=vector[i];
        }
        System.out.print("Suma: "+suma);//Suma elementos del array (Suma: XXX)
        System.out.print(" Media: "+(float)suma/vector.length);//Media del array (Media: XXXX)

        //La primera posición del elemento introducido (Primera: YYY) (En caso que no exista se mostrará -1)
        while(cont<vector.length && !enc){
            if(numeroBuscado==vector[cont]){
                pos=cont;//Almacenamos el contador en la variable posicion
                enc=true;//Al encontrar el valor en el array modificamos la bandera a true
            }else{
                cont++;//incrementamos el contador siempre que no encontramos el valor buscado
            }
        }

        System.out.print(" Primera: "+pos);//Mostramos la posicion
        cont=0;
        //Número de ocurrencias de un determinado elemento (Ocurrencias: ZZZ)
        for(int i=0; i<vector.length; i++){
            if(vector[i]==numeroBuscado){
                cont++;
            }
        }
        System.out.print(" Ocurrencias: "+cont);

        //El número más alto del array (Alto: WWWW)
        for(int i=0; i<vector.length; i++){
            if(vector[i]>=mayor){
                mayor=vector[i];
            }
        }
        System.out.print(" Alto: "+mayor);


    }
}
