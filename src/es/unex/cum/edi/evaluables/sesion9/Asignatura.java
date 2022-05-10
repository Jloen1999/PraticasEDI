package es.unex.cum.edi.evaluables.sesion9;
import java.util.*;
public class Asignatura {
    protected String nombre;
    protected float nota;
    protected HashSet<Task> taskDone;
    public Asignatura() {
        nombre = "";
        nota = 0;
        taskDone=new HashSet<Task>();
    }

    public Asignatura(String nombre, float nota) {
        this.nombre = nombre;
        this.nota = nota;
        taskDone=new HashSet<Task>();
    }
    
    public Asignatura(String nombre){
        this.nombre = nombre;
        this.nota = 0.0F;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNota(){
        float suma=0;
        if(taskDone.isEmpty()) return 0.0F;
        Iterator tarea=taskDone.iterator();
        while(tarea.hasNext()){
            Task t=(Task) tarea.next();
            suma+=t.getMark();
        }
        return suma;
    }
    
    public void setNota(float nota) {
        this.nota = nota;
    }

    public HashSet<Task> getTaskDone() {
        return taskDone;
    }
    public void setTaskDone(HashSet<Task> t){
        this.taskDone=taskDone;
    }

    public boolean addTaskDone(Task t){
        return taskDone.add(t);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + Float.floatToIntBits(nota);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Asignatura other = (Asignatura) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (Float.floatToIntBits(nota) != Float.floatToIntBits(other.nota))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Asignatura [nombre=" + nombre + ", nota=" + nota + "]";
    }

}
