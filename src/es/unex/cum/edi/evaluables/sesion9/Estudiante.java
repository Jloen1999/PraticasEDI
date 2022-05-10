package es.unex.cum.edi.evaluables.sesion9;
import java.util.*;
public class Estudiante {
    protected String nombre;
    protected int exp;    
    protected Lista lista;
    protected Queue<Task> tasks;

    public Estudiante(String nombre, int exp) {
        this.nombre = nombre;
        this.exp = exp;
        lista=new Lista();
        tasks=new LinkedList<Task>();
    }

    public Estudiante() {
        lista=new Lista();
        nombre="";
        exp=-1;
        tasks=new LinkedList<Task>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public Lista getLista() {
        return lista;
    }

    public void setLista(Lista lista) {
        this.lista = lista;
    }
    public Queue<Task> getTasks(){
        return tasks;
    }

    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", exp=" + exp + ", lista=" + lista + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + exp;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
        Estudiante other = (Estudiante) obj;
        if (exp != other.exp)
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }

    public boolean addAsignatura(Asignatura a) {
        return lista.insertarAlPrincipio(a);        
    }

    public boolean addTask(Task t){
        return tasks.offer(t);
    }

}
