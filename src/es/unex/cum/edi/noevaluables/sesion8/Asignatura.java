package es.unex.cum.edi.noevaluables.sesion8;

public class Asignatura {
    protected String nombre;
    protected float nota;

    public Asignatura() {
        nombre = "";
        nota = 0;
    }

    public Asignatura(String nombre, float nota) {
        super();
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
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
        if(this==obj) return true;
        if(this.getClass()!=obj.getClass() || this==null) return false;
        Asignatura as=(Asignatura) obj;
        return this.nombre.equals(as.getNombre()) && Float.floatToIntBits(nota)==as.getNota();
    }

    @Override
    public String toString() {
        return "Asignatura [nombre=" + nombre + ", nota=" + nota + "]";
    }

}
