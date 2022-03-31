package es.unex.cum.edi.noevaluables.sesion1;/*
*                    @Description:
         Dado un número entero introducido por teclado,
         comprobar si es par o impar.
         La salida debe ser exactamente "Impar" o "Par"
*  @Author: Jose Luis Obiang Ela Nanguan
*  @Version: 05/02/2022
*/

import java.util.Scanner;

public class ParImpar{
    static Scanner input=new Scanner(System.in);
    String salida;

    public ParImpar(){
        salida="";
        int numero=input.nextInt();
        salida=mostrarParidad(numero);
        System.out.println(salida);
    }

    public String mostrarParidad(int numero){
        if(numero%2==0){
            salida="Par";
        }else{
            salida="Impar";
        }

        return salida;
    }

    public static void main(String[] args){
        new ParImpar();
    }
}