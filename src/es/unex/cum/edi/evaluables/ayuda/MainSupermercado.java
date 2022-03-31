package es.unex.cum.edi.evaluables.ayuda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainSupermercado {
    public static void main(String[] args) throws IOException {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(read);
        int tm=Integer.parseInt(input.readLine());//Introducimos el tamaño del array
        int suma=0, mayor = 0;
        Supermercado[] sup=new Supermercado[tm]; //Vector de la clase creada
        for(int i=0; i<sup.length; i++){//Rellenamos el vector
            sup[i] = new Supermercado(input.readLine(),input.readLine(),Integer.parseInt(input.readLine()));
        }

        //Mostramos los valores
        for(int i=0; i<sup.length; i++){
            System.out.println(sup[i].toString());
        }

        //Media y valor mas alto
        for(int i=0; i<sup.length; i++){
            if(sup[i].getNumProductos()>=mayor){
                mayor=sup[i].getNumProductos();
            }
            suma+=sup[i].getNumProductos();
        }

            double media=(double)suma/ sup.length;
        System.out.print("Media: "+media+" Alto: "+mayor);

    }
}
