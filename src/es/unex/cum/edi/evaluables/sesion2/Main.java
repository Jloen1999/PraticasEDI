package es.unex.cum.edi.evaluables.sesion2;

//Bibliotecas

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(read);
        int tamanio=Integer.parseInt(input.readLine());//Introducimos el tamaño del array
        int media, suma=0, mayor = 0;
        Libro[] libros=new Libro[tamanio]; //Vector de la clase creada
        for(int i=0; i<libros.length; i++){//Rellenamos el vector
            libros[i] = new Libro(input.readLine(),input.readLine(),Integer.parseInt(input.readLine()));
        }

        //Mostramos los valores
        for(int i=0; i<libros.length; i++){
            System.out.println(libros[i].toString());
        }

        //Media y valor mas alto
        for(int i=0; i<libros.length; i++){
            if(libros[i].getIsbn()>=mayor){
                mayor=libros[i].getIsbn();
            }
            suma+=libros[i].getIsbn();
        }

        System.out.print("Media: "+(double)suma/ libros.length+" Alto: "+mayor);

    }
}
