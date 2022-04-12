package es.unex.cum.edi.ejerciciosRepaso.Capítulo6;

public class Contacto implements java.io.Serializable {
    
    protected int id;
    protected String nombre, apellido1, apellido2;
    
    Contacto(int id, String nombre, String ap1, String ap2) {
        this.id = id; 
        this.nombre = nombre;
        apellido1 = ap1;
        apellido2 = ap2;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }
    
    public int getId() { return id; }
    
    public String toString() {
        return "CONTACTO: " + id + " - " + nombre + " " + apellido1 + " " + apellido2;
    }

}
