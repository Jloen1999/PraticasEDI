/*
 *               @Description:
 * Escribe un programa que tenga como entrada un
 * número y determine si es un número primo.
 *
 * @Author: Jose Luis Obiang Ela Nanguan
 * @Version: 06/02/2022
 */

//Importamos las librerias necesarias

import java.util.Scanner;

//Creamos la clase con el mismo nombre que el programa
public class NumeroPrimo {
    //Declaramos las varibales que consideramos globales
    static Scanner input = new Scanner(System.in);
    boolean primo;//Variable semaforo o bandera que servira para indicarnos el numero introducido ya no es primo

    public NumeroPrimo() {
        primo = true; //Inicializamos la bandera
        int numero = input.nextInt();//Introducimos el numero
        primo = mostrarPrimo(numero,primo);//Obtenemos el valor de la bandera
        if(primo){//Si la bandera es TRUE, significa el numero es primo
            System.out.println("El número es primo");
        }else{//Si es FALSE, mostramos el numero no es primo
            System.out.println("El número NO es primo");
        }
    }

    public boolean mostrarPrimo(int numero, boolean primo) {
        for (int i = 2; i < numero; i++) {//Comprobamos el modulo del numero a evaluar con el del contador que va del 2 hasta el numero-1
            if (numero % i == 0) {//Si el numero es divisble por el contador la bandera la cambiamos a FALSE
                primo = false;
            }
        }
        return primo;
    }

    public static void main(String[] args) {
        new NumeroPrimo();//Instanciamos el constructor por defecto
    }
}