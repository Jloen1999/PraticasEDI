package es.unex.cum.edi.noevaluables.sesion1;
import java.util.Date;
import java.util.Calendar;
public class UsoFechas {
    public static void main(String[] args)
    {
        Calendar c= Calendar.getInstance(); //Declaramos un objeto de la clase Calendar para nosotros poder establecer nuestra propia fecha
        c.set(Calendar.MONTH, 3);//Indicamos el mes
        c.set(Calendar.DATE,20);//Indicamos el dia
        c.set(Calendar.YEAR,2022);//Indicamos el año

        Date getFecha=c.getTime();//Obtenemos la fecha establecida
        System.out.println("Fecha Calendario: "+getFecha);

        Date fechaActual=new Date();//Instanciamos un objeto que nos mostrara la fecha actual
        System.out.println("Fecha Actual: "+fechaActual);

        //Procedemos a comparar ambas fechas
        if(getFecha.compareTo(fechaActual)==0){
            System.out.println("Ambas fechas son iguales");
        }else{
            System.out.println("Ambas fechas son distintas");
        }
    }
}
