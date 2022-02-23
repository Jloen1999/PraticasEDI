package evaluables.ayuda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainProcesador {
    public static void main (String[] args) throws IOException
    {

        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(read);
        int tm=Integer.parseInt(input.readLine());//Introducimos el tamaño del array
        int media, suma=0, mayor = 0;
        Procesador[] asig=new Procesador[tm]; //Vector de la clase creada
        for(int i=0; i<asig.length; i++){//Rellenamos el vector
            asig[i] = new Procesador(input.readLine(),input.readLine(),Integer.parseInt(input.readLine()));
        }

        //Mostramos los valores
        for(int i=0; i<asig.length; i++){
            System.out.println(asig[i].toString());
        }

        //Media y valor mas alto
        for(int i=0; i<asig.length; i++){
            if(asig[i].getCapacidad()>=mayor){
                mayor=asig[i].getCapacidad();
            }
            suma+=asig[i].getCapacidad();
        }

        System.out.print("Media: "+(double)suma/ asig.length+" Alto: "+mayor);
    }
}
