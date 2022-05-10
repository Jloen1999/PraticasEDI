package es.unex.cum.edi.evaluables.sesion9;
import java.beans.EventSetDescriptor;
import java.util.*;

public class Clase {
    protected String nombre;
    protected List <Estudiante> listaClase;
    public Clase(String nombre) {
        this.nombre = nombre;
        listaClase= new ArrayList <>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List getListaClase() {
        return listaClase;
    }

    public void setListaClase(ArrayList aux) {
        this.listaClase = aux;
    }

    public boolean addEstu(Estudiante e) {
        return listaClase.add(e);
    }

    //TODO Sesion 9

    // It adds a new task for all students which have this subject. 
    public boolean addTask(String nameSubject, Date d, String name,String desc){
        Iterator <Estudiante> it=listaClase.iterator();
        boolean retur=false;
        while(it.hasNext()){
            Estudiante e=it.next();
            //Tiene el estudiante esta asigntura??
            boolean enc=false;
            Lista laux= e.getLista();
            laux.iterator();
            while (laux.hasNext() && !enc){
                Asignatura a= (Asignatura) laux.next();
                if (a.getNombre().equals(nameSubject)){
                    e.addTask(new Task(e.getTasks().size()+1,d,name,desc,nameSubject));
                    enc=true;
                    retur=true;
                }
            }
        }
        return retur;
    }
    /*It removes the first task by a given student. The task must be shown by console and this iteration must be destructive
     *
     */

    public void removePeekTask(int exp){
        Estudiante estudiante=getEstudiante(exp);
        if (estudiante!=null) {
            Task task= estudiante.getTasks().poll();
            System.out.println("Se ha borrado la tarea "+ task.getName());
        }
    }

    /*It iterates for all tasks by a given student (exp). The tasks must be shown by console and this iteration must be destructive.  
     * 
     */
    public void removeTasks(int exp){
        Estudiante estudiante=getEstudiante(exp);
        if (estudiante!=null) {
            while (estudiante.getTasks().isEmpty()) {
                Task task= estudiante.getTasks().poll();
                System.out.println("Se ha borrado la tarea "+ task.getName());
            }
        }
    }

    /*
     * It iterates for all tasks by a given student (exp). The tasks must be shown by console and this iteration must not be destructive. 
     */
    public void showTasks(int exp){
        Estudiante estudiante=getEstudiante(exp);
        if (estudiante!=null) {
            Iterator <Task> iterator = estudiante.getTasks().iterator();
            while (!iterator.hasNext()){
                Task task= iterator.next();
                System.out.println(task.getName());
            }
        }
    }

    /*
     *  It evaluates for the given student (exp) the given task (id) with the given value (value). 

     */
    boolean evaluateTask(int exp, int id, float value) {
        Estudiante estudiante=getEstudiante(exp);
        if (estudiante!=null) {
            Iterator <Task> iterator= estudiante.getTasks().iterator();
            while (iterator.hasNext()) {
                Task task= iterator.next();
                if (task.getId()==id) {
                    task.setMark(value);

                    return true;
                }
            }
        }
        return false;
    }

    /*
     *:  It evaluates all tasks for the given student (exp) with the given value (value).   
     */
    boolean evaluateAllTask(int exp, float value){
        Estudiante estudiante=getEstudiante(exp);
        if (estudiante!=null) {
            Iterator <Task> iterator= estudiante.getTasks().iterator();
            while (iterator.hasNext()) {
                Task task= iterator.next();
                task.setMark(value);
            }
            return true;
        }
        return false;
    }

    public boolean evaluateTask(int exp, float value) {
        Estudiante estudiante=getEstudiante(exp);
        if (estudiante!=null) {
            Task tarea=estudiante.getTasks().poll();
            tarea.setMark(value);
            Lista asig=estudiante.getLista();
            asig.iterator();
            while (asig.hasNext()) {
                Asignatura as=(Asignatura) asig.next();
                if (tarea.getNameSubject().equals(as.getNombre())) {
                    as.addTaskDone(tarea);
//                    estudiante.getTasks().remove(tarea);
                    return true;
                }
            }
        }
        return false;

    }

    public boolean evaluateTask(int exp, float value) {
        Estudiante estudiante=getEstudiante(exp);
        if (estudiante!=null) {
            Task tarea=estudiante.getTasks().poll();
            tarea.setMark(value);
            Lista asig=estudiante.getLista();
            asig.iterator();
            while (asig.hasNext()) {
                Asignatura as=(Asignatura) asig.next();
                if (tarea.getNameSubject().equals(as.getNombre())) {
                    as.addTaskDone(tarea);
//                    estudiante.getTasks().remove(tarea);
                    return true;
                }
            }
        }
        return false;

    }







        //TODO
    //Util para varios ejercicios. No puntua

    public Asignatura getEstAsignatura(int exp, String name){

        return null;
    }

    public Estudiante getEstudiante(int exp){
        Iterator <Estudiante> it=this.listaClase.iterator();
        while (it.hasNext()){
            Estudiante e=(Estudiante)it.next();
            if (e.getExp()==exp)
                return e;
        }
        return null;
    }

    /**
     * Cuenta el numero de asignaturas que hay entre todos los estudiantes de la clase
     * Dificultad: Baja
     */
    public int countSubjects() {
        return 0;
    }

    /**
     * Añade un nuevo estudiante (no repetido - debe controlarse) en la lista. 
     * Devuelve true si se ha podido añadir y false en caso contrario
     * Dificultad: Baja
     */
    public boolean addEstudiante(Estudiante e) {
        return false;

    }

    /**
     * Añade una asignatura al idEstudiante recibido por parametro. Tambien recibe la asignatura
     * Si todo va bien (no existe la asignatura), devuelve verdadero y falso en caso contrario
     * Si la nota recibida no esta entre 0 y 10 se retorna false
     * 
     * @param exp
     * @param newSubject
     * Dificultad: Media
     */
    public boolean addSubjectExp(int exp, Asignatura newSubject)  {
        // TODO Auto-generated method stub
        return false;
    }

    /**
     * Añade una asignatura al estudiante recibido por parametro. Tambien recibe la asignatura
     * Si todo va bien (no existe la asignatura), devuelve verdadero y falso en caso contrario
     * Si la nota recibida no esta entre 0 y 10 se retorna false
     * @param currentStudent
     * @param newSubject
     * Dificultad: Baja
     */
    public boolean addSubject(Estudiante currentStudent, Asignatura newSubject)  {
        // TODO Auto-generated method stub
        return false;
    }

    /**
     * Cuenta el numero de asignaturas aprobadas entre todos los estudiantes de la clase
     * Dificultad: Media
     */
    public int countPassSubjects() {
        return 0;
    }

    /**
     * Calcula la media de notas del estudiante recibido. Si el estudiante no existe
     * devuelve -1.0F
     * 
     * @param exp
     * @return la nota media del estudiante
     * Dificultad: Media
     */
    public float averageMarks(int exp)  {
        return 0;
    }

    /**
     * Devuelve el numero de estudiantes que estan matriculados en EDI. 
     * Dificultad: Media
     */
    public int countStudentsEDI() {
        // TODO Auto-generated method stub
        return 0;
    }

    /**
     * Devuelve el numero de estudiantes que han aprobado EDI. 
     * Si no hay estudiantes que hayan aprobado EDI, se devuelve 0
     * Dificultad: Media
     */
    public int countPassedEDI() {
        // TODO Auto-generated method stub
        return 0;
    }

    /**
     * Devuelve el nombre del estudiante con la nota mas baja en EDI. 
     * Si no hay estudiantes que hayan aprobado EDI, se devuelve null. 
     * Si hay mas de un estudiante con la misma nota mas baja, se devuelve el ultimo de ellos
     * Dificultad: Elevada
     */
    public String lowestMark() {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * Cuenta cuantas asignaturas distintas hay
     * Dificultad: Elevada
     */
    public int countDistinctSubjects() {
        // TODO Auto-generated method stub
        return 0;
    }

    public int countNoPassedSubject(){
        Iterator<Estudiante> it=listaClase.iterator();
        while(it.hasNext()){
            Estudiante est=(Estudiante) it.next();
            Lista asig=est.getLista();
            asig.iterator();


        }


        return 0;
    }

}
