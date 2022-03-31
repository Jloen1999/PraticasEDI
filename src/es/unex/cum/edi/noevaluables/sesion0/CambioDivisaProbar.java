package es.unex.cum.edi.noevaluables.sesion0;
import  java.io.InputStreamReader;
import java.io.BufferedReader;
import  java.io.IOException;
public class CambioDivisaProbar {
    public static void main(String[] args) throws IOException{
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(read);
        CambioDivisa cam;
        cam=new CambioDivisa();
        System.out.print("Introduce la cantidad de euros: ");
        double euro = Double.parseDouble(input.readLine());
        System.out.println(euro+" euros son: "+cam.euroToLibra(euro));
        System.out.print("Introduce la cantidad de libras: ");
        double libra = Double.parseDouble(input.readLine());
        System.out.println(libra+" libras son: "+cam.libraToEuro(libra));
    }

}
