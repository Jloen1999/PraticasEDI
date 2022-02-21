package noevaluables.sesion1;
import java.util.Date;

public class Estudiante extends Persona{
    private int numExpediente;
    public Estudiante(){
        super();
        numExpediente=0;
    }
    public Estudiante(String nombre,String apellidos,int edad,int dni,char sexo,Date fechaNac){
        super(nombre,apellidos,edad,dni,sexo,fechaNac);
    }
    public Estudiante(String nombre,String apellidos,int edad,int dni,char sexo,Date fechaNac,int numExpediente){
        super(nombre,apellidos,edad,dni,sexo,fechaNac);
        this.numExpediente=numExpediente;
    }

    public void setNumExpediente(int numExpediente){
        this.numExpediente = numExpediente;
    }
    public int getNumExpediente(){
        return numExpediente;
    }

    public String toString(){
        return "Estudiante{" +
                "Numero de expediente=" +getNumExpediente()+super.toString()+
                "}";
    }
}
