package noevaluables.sesion0;
import java.util.Scanner;
public class MiNumeroPrueba {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        MiNumero number = new MiNumero();
        number.setNumero(3);
        int numero2;
        numero2=input.nextInt();
        number.suma(numero2);
        number.resta(numero2);
        System.out.println(number.toString());
    }
}
