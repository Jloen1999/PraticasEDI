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
}
