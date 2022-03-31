package es.unex.cum.edi.evaluables.sesion1; /**
*             @Description:
* Escribir un programa que calcule
la suma de todos los número introducidos por
teclado hasta que se introduzca el -1.

* @Author: Jose Luis Obiang Ela Nanguan

* @Version: 03/02/2022

*/

//Importamos las librerias necesarias

import java.util.Scanner;

//Creamos la clase con el mismo nombre que el fichero del programa
public class SumaNumero{
    //Declaramos variables globales
    long suma;//Variable acumulador para sumar los numeros introducidos siempre que no sean igual a -1
    public SumaNumero(){
        suma = 0;
        Scanner input=new Scanner(System.in);//Clase para la entrada de datos
        long numero=input.nextInt();//Declaramos la variable el cual contendra los numeros que introduzcamos. Es de tipo Long para aceptar muchos mas digitos
        while(numero!=-1){//Controlamos que al introducir -1 el usuario deje de introducir datos por pantalla
            suma=sumarNumeros(numero);//Almacenamos el valor que nos devuelva la funcion en una variable del mismo tipo
            numero=input.nextInt();//Volvemos a pedir al usuario que introduzca el numero por teclado
        }
        System.out.println("La suma de números es "+suma);//Mostramos la suma por pantalla
    }

    public long sumarNumeros(long numero){//Creamos una funcion de tipo long para sumar todos los numeros introducidos
        suma+=numero;
        return suma;//Devuelve la suma
    }

    public static void main(String[] args){//Programa Principal de Ejecucion
       new SumaNumero();//Instanciamos el constructor por defecto
    }
}