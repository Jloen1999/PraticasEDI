/*
 *                   @Description:
 * Desarrollar un algoritmo que, dado un año entre 0 y 3000
 *(si no lo está mostrar un mensaje de error), determine si ese año es un año bisiesto.
 *
 * @Author:  Jose Luis Obiang Ela Nanguan
 * @Version: 05/02/2022
 */

import java.util.Scanner;

public class Bisiesto1 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int anio = input.nextInt();
        if (anio >= 0 && anio <= 3000) {
            if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) {
                    System.out.println("si es bisiesto");
            } else {
                    System.out.println("no es bisiesto");
            }
        } else {
            System.out.println("error");
        }


    }
}