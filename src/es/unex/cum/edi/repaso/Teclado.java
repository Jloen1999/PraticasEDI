package es.unex.cum.edi.repaso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Teclado{
    private boolean CV;
    private static BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
    public Teclado(){
        CV=false;
    }
    public Teclado(boolean CV)
    {
        this.CV=CV;
    }

    public int leerEntero() throws IOException {
        while(true){
            String s=input.readLine();
            try{
                return Integer.valueOf(s.trim()).intValue();
            }catch(NumberFormatException e){
                if(!CV){
                    System.out.println("Error en el numero, prueba de nuevo: ");
                }
            }
        }

    }
    public double leerDouble() throws IOException
    {
        while(true)
        {
            String s=input.readLine();
            try{
                return Double.valueOf(s.trim()).doubleValue();
            }catch(NumberFormatException e)
            {
                if(!CV)
                {
                    System.out.println("Error en el numero, prueba de nuevo: ");
                }
            }
        }
    }

    public float leerFloat() throws IOException
    {
        while(true)
        {
            String s=input.readLine();
            try{
                return Float.valueOf(s.trim()).floatValue();
            }catch(NumberFormatException e)
            {
                if(!CV)
                {
                    System.out.println("Error en el numero, prueba de nuevo: ");
                }
            }
        }
    }

    public char leerCaracter() throws IOException
    {
        while(true)
        {
            String s=input.readLine();
            try{
                return s.trim().charAt(0);
            }catch(StringIndexOutOfBoundsException e)
            {
                if(!CV)
                {
                    System.out.println("Error, vuelve a introducir el caracter: ");
                }
            }
        }
    }

    public String leerLiteral() throws IOException
    {
        return input.readLine();
    }

    public int menu(String[] args, int min, int max) throws IOException {
        int opcion=0;
        do{
            if(!CV)
            {
                System.out.println("*********  MENU *********");
                    for(int i=0; i<args.length; i++)
                    {
                        System.out.println(args[i]);
                    }
            }

            opcion=leerEntero();
        }while(!(opcion>=min) || !(opcion<=max));
        return opcion;
    }
}