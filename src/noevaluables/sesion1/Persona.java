/*
    @Description: Se trata de una clase de crear una Persona
    @Author: Jose Luis Obiang Elan
    @Version: 17/02/2022
    @return: String nombre, String apellidos, int edad, int dni, char setSexo

 */


//Primero llamamos a las bibliotecas necesarias
package noevaluables.sesion1;

import java.util.Objects;

public class Persona { //Creamos la clase con el mismo nombre que el fichero
    //Creamos los atributos
    private String nombre;
    private String apellidos;
    private int edad;
    private int dni;
    private char sexo;
    private int numPersonas=0;

    public Persona() { //Creamos el constructor por defecto
        nombre = "Jose Luis";
        apellidos = "Ela Nanguan";
        edad = 21;
        dni = 123456;
        sexo='H';
        contarPersona();
    }

    public Persona(String nombre, String apellidos, int edad, int dni, char sexo) {//Creamos el constructor parametrizado
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
        this.sexo=sexo;
        contarPersona();
    }

    public Persona(Persona p){
        this.nombre=p.getNombre();
        this.apellidos=p.getApellidos();
        this.dni=p.getDni();
        this.edad=p.getEdad();
    }

    public Persona mostrarPersonaClonada(){
        return new Persona(this.nombre,this.apellidos,this.edad,this.dni,this.sexo);
    }

    public char getSex()
    {
        return sexo;
    }

    public void contarPersona(){
        numPersonas++;
    }
    public int mostrarTotalPersonas(){
        return numPersonas;
    }



    //Luego creamos los metodos getter and setter
    public String getSexo(){
        String s = "";
        sexo=Character.toUpperCase(sexo); //Convertimos el sexo introducido en mayuscula de manera que no me importe si el usuairo a introducido el sexo en mayuscula o en minuscula
        s = switch (sexo) {
            case 'H' -> "Hombre";
            case 'M' -> "Mujer";
            default -> "Desconocido";
        };

        return s;
    }
    public void setSexo(char s) {
        sexo=s;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;

    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getDni() {
        return dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString(){
      return "Persona{" +
              "Nombre='"+getNombre()+'\''+
              ", apellidos='"+getApellidos()+'\''+
              ", edad="+getEdad()+
              ", dni="+getDni()+

              "}";
    }

    @Override
    public boolean equals(Object o)
    {
        boolean result;
        if(this==o) result=true;
        if(o==null || getClass() != o.getClass()) result=false;
        Persona p= (Persona) o;
        result= (dni==p.getDni() && edad==p.getEdad() && Objects.equals(nombre,p.getNombre()) && Objects.equals(apellidos,p.getApellidos()));
        return result;
    }


    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos, edad, dni, sexo, numPersonas);
    }
}
