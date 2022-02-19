package noevaluables.sesion0;
import java.lang.System;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class ConversionGradosCelsiusFarenheit{
    public ConversionGradosCelsiusFarenheit() throws IOException{
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(read);
        double C,F;
        System.out.print("Introduce los grados Celsius: ");
        C=Double.parseDouble(input.readLine());
        System.out.print("Introduce los grados Farenheit: ");
        F=Double.parseDouble(input.readLine());

        System.out.println("Los grados Farenheit son: "+F);
        System.out.println("Los grados Celsius son: "+C);

    }

    public double convertirACelsius(double F){
        return (F-32)/1.8;
    }
    public double convertirAFarenheit(double C){
        return 1.8*C+32;
    }



    public static void main(String[] args) throws IOException{
        new ConversionGradosCelsiusFarenheit();
    }
}