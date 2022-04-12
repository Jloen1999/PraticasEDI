package es.unex.cum.edi.repaso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.spec.RSAOtherPrimeInfo;

public class Repaso{
    public static void main(String[] args) throws IOException {
        String[] cadena=new String[1];
        int numero;
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        try {
            cadena[1] = input.readLine();
        }catch(Exception e){
            System.out.println("No se puede");
            e.printStackTrace();
        }




    }
}