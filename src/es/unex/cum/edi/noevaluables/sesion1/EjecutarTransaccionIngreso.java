package es.unex.cum.edi.noevaluables.sesion1;
import java.util.Date;

public class EjecutarTransaccionIngreso {
    public static void main(String[] args){
        TransaccionIngreso tri=new TransaccionIngreso();
        tri.setD(234.0F);
        tri.setF(new Date());
        tri.setConcepto("Importe de luz");
        System.out.println(tri.toString());
    }
}
