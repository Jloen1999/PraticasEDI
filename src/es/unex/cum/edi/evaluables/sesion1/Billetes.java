package es.unex.cum.edi.evaluables.sesion1;
/*
 *             @Description:
 * Dada una cantidad de dinero en euros (número positivo, si no mostrar el mensaje "error")
 * calcule el número mínimo de billetes y monedas necesario, sabiendo que disponemos de billetes
 * de 500, 200, 100, 50, 20, 10 y 5 euros, y monedas de 1 y 2 euros,  y 50, 20, 10, 5, 2 y 1 céntimo.
 * Las monedas o billetes que NO se necesiten para el cálculo NO deben mostrarse. Si se necesita
 * más de una moneda o billete se debe mostrar el plural ("3 monedas" en lugar de "3 moneda") .

 * @Author: Jose Luis Obiang Ela Nanguan

 * @Version: 04/02/2022

 */

//Llamamos las librerias necesarias

import java.util.Scanner;

public class Billetes {//Creamos la clase Billete con el mismo nombre que el fichero del programa

    //Creamos una funcion de acceso estatico de tipo void que recibe varios parametros
    /*contadorEuro-->contador del auro
     *contadorCentimo-->contador del centimo
     * euro-->valor del euro
     * centimo-->valor del centimo
     */
    public static void mostrarDinero(int contadorEuro, int contadorCentimo, int euro, int centimo) {
        //Controlamos la salida en base a los contadores y las cantidades
        if (euro == 1 && contadorEuro == 1) {
            System.out.println(contadorEuro + " billete de " + euro + " euro");
        } else if (euro > 1 && contadorEuro == 1 && euro != 2) {
            System.out.println(contadorEuro + " billete de " + euro + " euros");
        } else if (euro > 1 && contadorEuro > 1 && euro != 2) {
            System.out.println(contadorEuro + " billetes de " + euro + " euros");
        } else if (euro == 1 && contadorEuro > 1) {
            System.out.println(contadorEuro + " billetes de " + euro + " euro");
        } else if (euro == 2 && contadorEuro > 1) {
            System.out.println(contadorEuro + " monedas de " + euro + " euros");
        } else if (euro == 2 && contadorEuro == 1) {
            System.out.println(contadorEuro + " moneda de " + euro + " euros");
        } else if (centimo == 1 && contadorCentimo == 1) {
            System.out.println(contadorCentimo + " moneda de " + centimo + " céntimo");
        } else if (centimo > 1 && contadorCentimo == 1) {
            System.out.println(contadorCentimo + " moneda de " + centimo + " céntimos");
        } else if (centimo > 1 && contadorCentimo > 1) {
            System.out.println(contadorCentimo + " monedas de " + centimo + " céntimos");
        } else if (centimo == 1 && contadorCentimo > 1) {
            System.out.println(contadorCentimo + " monedas de " + centimo + " céntimo");

        }
    }

    public static void obtenerContador(int parteEntera, double parteDecimal, int contadorEuro, int contadorCentimo, int euro, int centimo) {
        if (contadorEuro == 0) {
            while (parteDecimal >= centimo) {
                contadorCentimo++;
                parteDecimal -= centimo;
            }
            mostrarDinero(contadorEuro, contadorCentimo, 0, centimo);
            contadorCentimo = 0;
        } else {
            while (parteEntera >= euro) {
                contadorEuro++;
                parteEntera -= euro;
            }
            mostrarDinero(contadorEuro, contadorCentimo, euro, 0);
            contadorEuro = 0;
        }
    }


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);//Creamos un objeto de la clase Scanner para la entrada de datos por teclado
        int contadorEuro = 0, euro;//Declaramos e Inicializamos los contadores
        int contadorCentimo = 0, centimo;
        double dinero = leer.nextDouble();//Introducimos el dinero por teclado
        if (dinero < 0) {//Controlamos si el numero es negativo nos saldra un mensaje de error
            System.out.println("error");
        } else {//En caso contrario
            double decimal = dinero % 1;//Obtenemos la parte decimal
            double parteDecimal = (Math.round(decimal * 100.0) / 100.0);//Solo necesitamos dos cifras en la parte decimal, la cual multiplicamos por 100 para quedarnos sin decimales

            int parteEntera = (int) dinero;//Obtenemos la parte entera

            //Empezamos con la parte entera/Euros
            euro = 500;//Asignamos a la variable euro las cantidades de referencia y
            // mientras que el dinero introducido sea mayor o igual
            // a dicha cantidad se seguira incrementando hasta que sea menor y entonces repetimos
            // el proceso con el resto de cantidades de referencia
            obtenerContador(parteEntera, 0, contadorEuro, contadorCentimo, euro, 0);
            euro = 200;
            obtenerContador(parteEntera, 0, contadorEuro, contadorCentimo, euro, 0);
            euro = 100;
            obtenerContador(parteEntera, 0, contadorEuro, contadorCentimo, euro, 0);

            euro = 50;
            obtenerContador(parteEntera, 0, contadorEuro, contadorCentimo, euro, 0);

            euro = 20;
            obtenerContador(parteEntera, 0, contadorEuro, contadorCentimo, euro, 0);

            euro = 10;
            obtenerContador(parteEntera, 0, contadorEuro, contadorCentimo, euro, 0);

            euro = 5;
            obtenerContador(parteEntera, 0, contadorEuro, contadorCentimo, euro, 0);

            euro = 2;
            obtenerContador(parteEntera, 0, contadorEuro, contadorCentimo, euro, 0);

            euro = 1;
            obtenerContador(parteEntera, 0, contadorEuro, contadorCentimo, euro, 0);

            //Parte decimal/Centimos
            centimo = 50;//Repetimos el mismo proceso que con los euros
            obtenerContador(0, parteDecimal, contadorEuro, contadorCentimo, 0, centimo);
            centimo = 20;
            obtenerContador(0, parteDecimal, contadorEuro, contadorCentimo, 0, centimo);
            centimo = 10;
            obtenerContador(0, parteDecimal, contadorEuro, contadorCentimo, 0, centimo);
            centimo = 5;
            obtenerContador(0, parteDecimal, contadorEuro, contadorCentimo, 0, centimo);
            centimo = 2;
            obtenerContador(0, parteDecimal, contadorEuro, contadorCentimo, 0, centimo);
            centimo = 1;
            obtenerContador(0, parteDecimal, contadorEuro, contadorCentimo, 0, centimo);
        }
    }
}