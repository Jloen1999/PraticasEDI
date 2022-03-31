package es.unex.cum.edi.noevaluables.sesion1;

import java.util.Date;

public class EjecutarPersona {
    public static void main(String[] args){
        Persona a = new Persona();
        Persona d = new Persona();
        Persona c=new Persona(a);
        Date fechaActual=new Date();
// Ahora vamos a mostrar por pantalla la información
// para asegurarnos que todo se ha almacenado correctamente

        //System.out.println(a.toString());
      Persona b=new Persona("Jose","Luis",2,3,'m',fechaActual);
      System.out.println(c.equals(a));
      b.contarPersona();
        System.out.println(a.toString());
        System.out.println(c.mostrarPersonaClonada());
        System.out.println(a.hashCode());
        System.out.println(c.hashCode());
        System.out.println("Has creado "+ (int)(a.mostrarTotalPersonas()+b.mostrarTotalPersonas()));


    }
}
