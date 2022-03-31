package es.unex.cum.edi.noevaluables.sesion1;
import java.util.Scanner;
public class ProbarDistancia {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        Distancia dist=new Distancia();
        System.out.print("Introduce la cantidad de millas: ");
        dist.setMillas(input.nextInt());
        System.out.println(dist.toString());

    }
}
