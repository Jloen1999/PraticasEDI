package es.unex.cum.edi.repaso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Repaso{
    private static BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
    private static Teclado t=new Teclado();
    public static void main(String[] args) throws IOException
    {

        double cantidad=Double.parseDouble(input.readLine());
        int resp=t.menu(new String[]{"1.-Convertir a Grados Farenheit", "2.-Convertir a grados Celsius"},1,2);
        if(resp==1)
        {
            cantidad=convertToFarenheit(cantidad);
        }else{
            cantidad=convertToCelsius(cantidad);
        }

        System.out.println("Convert: "+cantidad);

    }

    public static double convertToFarenheit(double cant)
    {
        return 1.8*cant+32;
    }
    public static double convertToCelsius(double cant)
    {
        return (cant-32)/1.8;
    }
}