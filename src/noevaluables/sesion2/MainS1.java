
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainS1 {

    public static void main(String []args) throws IOException{
        Palabra p1= new Palabra();
        System.out.println(p1.toString());
        //Cambio el texto
        p1.setTexto("Casa");
        System.out.println(p1.toString());
        //Cambio el texto otra vez y damos la pista
        p1.setTexto("Luna");
        p1.setPista("Unico satelite natural de la tierra");
        System.out.println(p1.toString());
        //Declaramos otro objeto
        Palabra p2=new Palabra("Casa", "Lugar donde se habita");
        System.out.println(p2.toString());
        //Otra palabra
        Palabra p3=new Palabra("Casa", "Lugar donde se habita");
        System.out.println(p3.toString());
        //Comparamos incorrectamente
        if (p3==p2) System.out.println("Son iguales");
        else System.out.println("Son Distintos");
        //Comparamos bien
        if (p3.equals(p2)) System.out.println("Son iguales");
        else System.out.println("Son Distintos");
    }

}
