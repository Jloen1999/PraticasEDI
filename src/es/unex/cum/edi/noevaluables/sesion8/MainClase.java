package es.unex.cum.edi.noevaluables.sesion8;

import java.util.Random;
public class MainClase {
    protected Clase c;
    public static void main(String[] args) {
        MainClase m = new MainClase();
        m.inicializarClase();
        m.addEstudiantes();
    }

 
    public void inicializarClase(){
        c=new Clase("1º Informática");
    }

    public void addEstudiantes() {
        Random r= new Random();
        Estudiante e1= new Estudiante("Luis",4);
        e1.addAsignatura(new Asignatura("EDI",r.nextInt(10)));
        e1.addAsignatura(new Asignatura("FC",r.nextInt(10)));
        e1.addAsignatura(new Asignatura("FE",r.nextInt(10)));
        c.addEstu (e1);
        Estudiante e2=  new Estudiante("Ana",12);
        e2.addAsignatura(new Asignatura("EDI",r.nextInt(10)));
        e2.addAsignatura(new Asignatura("FC",r.nextInt(10)));
        e2.addAsignatura(new Asignatura("FE",r.nextInt(10)));
        c.addEstu (e2);
        Estudiante e3= new Estudiante("Juan",18);
        e3.addAsignatura(new Asignatura("EDI",r.nextInt(10)));
        e3.addAsignatura(new Asignatura("FC",r.nextInt(10)));
        e3.addAsignatura(new Asignatura("FE",r.nextInt(10)));
        c.addEstu (e3);
    }


}
