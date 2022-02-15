package evaluables.sesion1;//Llamamos las librerias necesarias

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci{//Creamos la clase fibonnaci con el mismo nombre que le fichero del programa
    String fib="";//Variable de tipo String para la concatenacion de cada uno de los terminos de la serie
    InputStreamReader read=new InputStreamReader(System.in);//Lector de cadena
    BufferedReader input=new BufferedReader(read);//Lector de memoria
    public Fibonacci() throws IOException {
        String entrada=input.readLine();//Introducimos el dato en formato String
        long numero=Long.parseLong(entrada);//Transformamos el String al tipo de dato Long
        fib=fibonacci(numero);//Almacenamos el valor que devuelve la funcion en una variable del mismo tipo que la funcion
        System.out.print(fib);//Mostramos la serie de fibonacci
    }

    public String fibonacci(long numero){//Creamos la funcion de tipo String que nos devolvera la serie de fibonacci
        if(numero<=0){
            fib="error";//Si el numero introducido es 0 mostrara al usuario "error"
        }else if(numero==1)
        {
            fib="1";//Si el numero introducido es 1 mostrara 1
        }else{
            long f0=1, f1=1,fn=0;//La serie de fibonacci se iniciara en 1 hasta n terminos -2 debido a que para el 0 y el 1 son casos especiales
            fib+=f0+" "+f1; //concatenamos los primeros dos terminos 1 1
            for(long i=3; i<=numero; i++){//Iniciamos el contador en 3
                fn=f0+f1;//Obtenemos fn que es la suma de los dos terminos anteriores
                f0=f1;//El ultimo termino se convierte en el nuevo primer termino
                f1=fn;//El segundo termino ahora sera la suma de los dos terminos anteriores
                fib+=" "+fn;//Concatenamos nuevamente
            }
        }
        return fib;
    }

    public static void main(String[] args) throws IOException {//Programa Principal de ejecucion
        new Fibonacci();//Instanciamos el constructor por defecto
    }

}