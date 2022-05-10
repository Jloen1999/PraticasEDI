package es.unex.cum.edi.evaluables.sesion9;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.util.*;

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
        c.addEstudiante (e1);
        Estudiante e2=  new Estudiante("Ana",12);
        e2.addAsignatura(new Asignatura("EDI",r.nextInt(10)));
        e2.addAsignatura(new Asignatura("FC",r.nextInt(10)));
        e2.addAsignatura(new Asignatura("FE",r.nextInt(10)));
        c.addEstudiante (e2);
        Estudiante e3= new Estudiante("Juan",18);
        e3.addAsignatura(new Asignatura("EDI",r.nextInt(10)));
        e3.addAsignatura(new Asignatura("FC",r.nextInt(10)));
        e3.addAsignatura(new Asignatura("FE",r.nextInt(10)));
        c.addEstudiante (e3);
        
        c.addTask("EDI",new Date(), "1EF","Juego tablero");
        c.addTask("EDI",new Date(), "1ES","Entrega de Java");
        c.removeTasks(4);
        c.showTasks(4);//No deberia haber
        c.showTasks(12);
        c.evaluateTask(12,1, 9.0F);
        c.showTasks(12); //Debe mostrar un 9 en la tarea 1
        c.evaluateTask(12,2, 8.0F); //Debe mostrar un 9 en t1 y un 8 en t2
        c.evaluateAllTask(18, 5.0F);
        c.showTasks(18); //todas las tareas tienen un 5
    }
    
    
    
}
