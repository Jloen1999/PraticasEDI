
import evaluables.sesion5.Palabra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainS2 {

    public static void main(String []args){
        Palabra []lista= new Palabra[5];
        lista[0]=new Palabra();
        lista [1]=new Palabra ("Casa","Lugar donde se habita");
        lista [2]=new Palabra("Balon", "Pelota grande, usada en juegos");
        lista [3]=new Palabra("Coche","Vehículo automóvil de tamaño pequeño o mediano");       
        lista [4]=new Palabra("Ahorcado","Juego de mesa que consiste en descubrir palabras");       
        for(int i=0;i<lista.length;i++)
            System.out.println(lista[i].getTexto());    

    }
}
