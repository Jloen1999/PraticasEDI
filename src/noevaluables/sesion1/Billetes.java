/**
 * @Description: Dada una cantidad de dinero en euros (número positivo, si no mostrar el mensaje "error")
 * calcule el número mínimo de billetes y monedas necesario, sabiendo que disponemos de billetes
 * de 500, 200, 100, 50, 20, 10 y 5 euros, y monedas de 1 y 2 euros,  y 50, 20, 10, 5, 2 y 1 céntimo.
 * Las monedas o billetes que NO se necesiten para el cálculo NO deben mostrarse. Si se necesita
 * más de una moneda o billete se debe mostrar el plural ("3 monedas" en lugar de "3 moneda") .
 * @Author: Jose Luis Obiang Ela Nanguan
 * @Version: 04/02/2022
 */

package noevaluables.sesion1;

import java.util.Scanner;

public class Billetes {
    public Billetes() {
        Scanner input = new Scanner(System.in);
        int[] cantidadEuros = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] cantidadCentimos = new int[6];
        String[] salidaEuros = {" euros", " euros", " euros", " euros", " euros", " euros", " euros", " euros", " euro"};
        String[] salidaCentimos = {" centimos", " centimos", " centimos", " centimos", " centimos", " centimo"};
        System.arraycopy(cantidadEuros, 3, cantidadCentimos, 0, 6);
        int[] contadorEuros = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] contadorCentimos = new int[6];
        System.arraycopy(contadorEuros, 3, contadorCentimos, 0, 6);
        double dinero;
        int parteEntera,parteDecimal;
        System.out.print("Introduce el dinero: ");
        dinero = input.nextDouble();
        parteEntera = (int) dinero;
        parteDecimal = (int) Math.round((Math.round((dinero%1) * 100.0) / 100.0)*100);

        //Empezamos con los euros
        obtenerContador(cantidadEuros, contadorEuros, parteEntera, salidaEuros);
        //Centimos
        obtenerContador(cantidadCentimos, contadorCentimos, parteDecimal, salidaCentimos);

    }

    private static void obtenerContador(int[] cantidad, int[] contador, int parte, String[] salida) {
        for (int i = 0; i < cantidad.length; i++) {
            while (parte >= cantidad[i]) {
                contador[i]++;
                parte -= cantidad[i];
            }
        }
        if (cantidad.length == 9) {
            for (int j = 0; j < cantidad.length; j++) {
                if (contador[j] == 1 && cantidad[j] > 2) {
                    System.out.println(contador[j] + " billete de " + cantidad[j] + salida[j]);
                } else if (contador[j] > 1 && cantidad[j] > 2) {
                    System.out.println(contador[j] + " billetes de " + cantidad[j] + salida[j]);
                } else if (contador[j] == 1 && cantidad[j] <= 2) {
                    System.out.println(contador[j] + " moneda de " + cantidad[j] + salida[j]);
                } else if (contador[j] > 1 && cantidad[j] <= 2) {
                    System.out.println(contador[j] + " monedas de " + cantidad[j] + salida[j]);
                }
            }
        } else {
            for(int k=0; k<cantidad.length; k++) {
                if (contador[k] == 1) {
                    System.out.println(contador[k] + " moneda de " + cantidad[k] + salida[k]);
                } else if (contador[k] > 1) {
                    System.out.println(contador[k] + " monedas de " + cantidad[k] + salida[k]);
                }
            }
        }

    }


    public static void main(String[] args) {
        new Billetes();

    }
}
