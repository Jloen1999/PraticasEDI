package noevaluables.sesion0;

public class TemperaturaProbar {
    public static void main(String[] args){
        Temperatura tem;
        tem=new Temperatura();
        tem.setTempC(23);
        tem.setTempF(56);
        System.out.println(tem.getTempC()+"Grados Celsius son "+tem.celsiusToFarenheit()+" grados Farenheit");
        System.out.println(tem.getTempF()+"Grados Farenheit son: "+tem.farenheitToCelsius()+" grados Celsius");
    }
}
