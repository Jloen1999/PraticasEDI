package evaluables.ayuda;

public class Asignatura {
    private String nombre;
    private String curso;
    private int horas;

    public Asignatura(){
        nombre=new String();
        curso=new String("Primero");
        horas=0;
    }
    public Asignatura(String nombre, String curso, int horas) {
        this.nombre = nombre;
        this.curso = curso;
        this.horas = horas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "[" +getNombre()+','+getCurso()+','+getHoras()+"]";
    }
    @Override
    public boolean equals(Object o){
        Asignatura sup=(Asignatura) o;
        return this.getNombre().equals(sup.nombre) && this.getCurso().equals(sup.curso) && horas==sup.horas;
    }
}
