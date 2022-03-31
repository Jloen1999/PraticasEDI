package es.unex.cum.edi.evaluables.ayuda;
import es.unex.cum.edi.evaluables.sesion2.Libro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainAsignatura
{
    public static void main (String[] args) throws IOException
    {

        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(read);
        int taman=Integer.parseInt(input.readLine());//Introducimos el tamaño del array
        int media, suma=0, mayor = 0;
        Asignatura[] asig=new Asignatura[taman]; //Vector de la clase creada
        for(int i=0; i<asig.length; i++){//Rellenamos el vector
            asig[i] = new Asignatura(input.readLine(),input.readLine(),Integer.parseInt(input.readLine()));
        }

        //Mostramos los valores
        for(int i=0; i<asig.length; i++){
            System.out.println(asig[i].toString());
        }

        //Media y valor mas alto
        for(int i=0; i<asig.length; i++){
            if(asig[i].getHoras()>=mayor){
                mayor=asig[i].getHoras();
            }
            suma+=asig[i].getHoras();
        }

        System.out.print("Media: "+(double)suma/ asig.length+" Alto: "+mayor);
    }
}
