/*
    @Description: Se trata de una clase de crear una Persona
    @Author: Jose Luis Obiang Elan
    @Version: 17/02/2022
    @return: String nombre, String apellidos, int edad, int dni, char setSexo

 */


//Primero llamamos a las bibliotecas necesarias
package noevaluables.sesion1;

public class Persona { //Creamos la clase con el mismo nombre que el fichero
    //Creamos los atributos
    private String nombre;
    private String apellidos;
    private int edad;
    private int dni;
    private char sexo;

    public Persona() { //Creamos el constructor por defecto
        nombre = "Jose Luis";
        apellidos = "Ela Nanguan";
        edad = 21;
        dni = 123456;
    }

    public Persona(String nombre, String apellidos, int edad, int dni, char sexo) {//Creamos el constructor parametrizado
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
    }

    //Luego creamos los metodos getter and setter
    public void getSexo(char sexo){
        this.sexo=sexo;
    }

    public String setSexo(){
        String s;
        sexo=Character.toUpperCase(sexo); //Convertimos el sexo introducido en mayuscula de manera que no me importe si el usuairo a introducido el sexo en mayuscula o en minuscula
        s = switch (sexo) {
            case 'h' -> "Hombre";
            case 'm' -> "mujer";
            default -> "Desconocido";
        };

        return s;
    }

    public void getNombre(String nombre) {
        this.nombre = nombre;
    }

    public String setnombre() {
        return nombre;

    }

    public void getApellidos() {
        this.apellidos = apellidos;
    }

    public String setApellidos(String apellidos) {
        return apellidos;
    }

    public void getDni() {
        this.dni = dni;
    }

    public int setDni(int dni) {
        return dni;
    }

    public void getEdad() {
        this.edad = edad;
    }

    public int setEdad(int edad) {
        return edad;
    }

    @Override
    public String toString() {//Creamos el metodo toString para mostrar los valores de los atributos de la clase
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", dni=" + dni +
                ", sexo=" + sexo +
                '}';
    }
}
