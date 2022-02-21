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

    //Redefino el metodo toString()

//    public String toString(){
//        return "Estudiante{" +
//                "Numero de expediente=" +getNumExpediente()+super.toString()+
//                "}";
//    }

    //Redefino el metodo toString
    public String toString(){
        return "Estudiante[" +
                "nombre=" +nombre+ //acceso como atributo directo
                "dni=" +super.getDni() +//acceso mediante el metodo getters
                "edad="+super.edad+ //acceso al atributo por super
                "Numero de expediente="+numExpediente+
                "]";
    }

    //Redefino el metodo equals
    public boolean equals(Object o){
        if(this==o) return true;
        if(getClass()!=o.getClass() && o==null) return false;
        Estudiante est=(Estudiante) o;
        return this.numExpediente==est.numExpediente && super.equals(o);
    }


    //Quiero redefinir metodo happyBirthDay
    //En persona se define public void happyBirthDay
    public void happyBirthDay(){
        edad++;
        System.out.println("!!!happyBirthDay!!!");
    }

}
