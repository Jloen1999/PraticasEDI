import java.io.*;
/**
 * billetes
 */
//Algoritmo:
//1) El cliente me comunica la cantidad a cambiar
//2) Busco la moneda mas grande inferior a la cantidad recibida
//3) Resto la moneda a la cantidad recibida, habre utilizado una moneda.
//4) Repito el proceso siendo la cantidad recibida la diferencia de la resta anterior.
//5) Pararé cuando la diferencia sea 0.
import java.math.BigDecimal;
import java.util.Scanner;
public class Billetes {
    //Cada posicion del array ocupa una cantidad, es como una caja registradora.
    static BigDecimal[] monedas= {BigDecimal.valueOf(500.00), BigDecimal.valueOf(200.00), BigDecimal.valueOf(100.00), BigDecimal.valueOf(50.00), BigDecimal.valueOf(20.00), BigDecimal.valueOf(10.00), BigDecimal.valueOf(05.00), BigDecimal.valueOf(02.00), BigDecimal.valueOf(01.00), BigDecimal.valueOf(0.50), BigDecimal.valueOf(0.20), BigDecimal.valueOf(0.10), BigDecimal.valueOf(0.05), BigDecimal.valueOf(0.02), BigDecimal.valueOf(0.01)};
    static int usado[]={0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0, 0};
    static BigDecimal   minuendo;
    public static void main(String[] args) throws IOException {
        boolean a=false;
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserte una cantidad: ");
        String s=scan.next();
        BigDecimal minuendo = new BigDecimal(s);
        scan.close();
        if (minuendo.compareTo(BigDecimal.ZERO)==-1 || minuendo.compareTo(BigDecimal.ZERO)==0){
            print(a);
        }
        else{
            cambio(minuendo);
            print(!a);
        }  
    }
    public static void print(boolean a){
        if (a==false) {
            System.out.println("error");
        }
        else{
            for (int i = 0; i < usado.length; i++) {
                if (usado[i]==1) {
                    if (monedas[i].compareTo(BigDecimal.valueOf(2.00))==1) {
                        System.out.println(usado[i]+ " billete de "+ monedas[i].intValue()+" euros");
                    }
                    else if((monedas[i].compareTo(BigDecimal.valueOf(2.00))==0 || monedas[i].compareTo(BigDecimal.valueOf(2.00))==-1) && (monedas[i].compareTo(BigDecimal.valueOf(1.00))==1)){
                        System.out.println(usado[i]+ " moneda de "+ monedas[i].intValue()+" euros");
                    }
                    else if((monedas[i].compareTo(BigDecimal.valueOf(0.01))==0)){
                        System.out.println(usado[i]+ " moneda de "+ monedas[i].multiply(BigDecimal.valueOf(100)).intValue()+" céntimo"); 
                    }
                    else if (monedas[i].compareTo(BigDecimal.valueOf(1.00))==0) {
                        System.out.println(usado[i]+ " moneda de "+ monedas[i].intValue()+" euro");
                    }
                    else{
                        System.out.println(usado[i]+ " moneda de "+ monedas[i].multiply(BigDecimal.valueOf(100)).intValue()+" céntimos");
                    }
                }
                else if (usado[i]>1) {
                    if (monedas[i].compareTo(BigDecimal.valueOf(2.00))==1) {
                        System.out.println(usado[i]+ " billetes de "+ monedas[i].intValue()+" euros");  
                    }
                    else if((monedas[i].compareTo(BigDecimal.valueOf(2.00))==0 || monedas[i].compareTo(BigDecimal.valueOf(2.00))==-1) && (monedas[i].compareTo(BigDecimal.valueOf(1.00))==0 || monedas[i].compareTo(BigDecimal.valueOf(1.00))==1)){
                        System.out.println(usado[i]+ " monedas de "+ monedas[i].intValue()+" euros");
                    }
                    else if((monedas[i].compareTo(BigDecimal.valueOf(0.01))==0)){
                        System.out.println(usado[i]+ " monedas de "+ monedas[i].multiply(BigDecimal.valueOf(100)).intValue()+" céntimo"); 
                    }
                    else if (monedas[i].compareTo(BigDecimal.valueOf(1.00))==0) {
                        System.out.println(usado[i]+ " monedas de "+ monedas[i].intValue()+" euro");
                    }
                    else{
                        System.out.println(usado[i]+ " monedas de "+ monedas[i].multiply(BigDecimal.valueOf(100)).intValue()+" céntimos");
                    }
                }  
            }
        }
    }
    public static void cambio (BigDecimal a) {
        BigDecimal c=BigDecimal.ZERO;
        boolean flag=false;
        int i=0;
        while(!flag && i<monedas.length){
            if (a.subtract(monedas[i]).signum()==0||a.subtract(monedas[i]).signum()==1){
                c=a.subtract(monedas[i]);
                usado[i]++;
                flag=!flag;
            }
            else{
                i++;
            }
        }
        if(!c.equals(BigDecimal.ZERO)){
            cambio(c);
        }
    }
}