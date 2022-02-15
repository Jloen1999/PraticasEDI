package noevaluables.sesion1;

import java.util.Objects;

public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private int dni;

    public Persona(String nombre, String apellidos, int edad, int dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public int getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", dni=" + dni +
                '}';
    }
    public Persona(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
}
