package es.unex.cum.edi.noevaluables.sesion1;

import java.util.Date;

public class EjecutarEstudiante {
    public static void main(String[] args)
    {
        Estudiante est=new Estudiante("Jose Luis","Obiang",23,34,'H',new Date(),31342424);
        est.setSexo('S');
        System.out.println(est.toString());
    }
}
