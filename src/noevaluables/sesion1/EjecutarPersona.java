package noevaluables.sesion1;
import java.lang.String;
import java.awt.image.ImagingOpException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjecutarPersona {

    public static void main(String[] args) throws IOException {
         InputStreamReader read=new InputStreamReader(System.in);
         BufferedReader input=new BufferedReader(read);
        Persona per=new Persona("Jose Luis","Ela Nanguan",21,232324);
        Persona per1=new Persona();
        System.out.println(per.toString());
        System.out.print("Nombre: ");
        per1.setNombre(input.readLine());
        System.out.print("Apellidos: ");
        per1.setApellidos(input.readLine());
        System.out.print("DNI: ");
        per1.setDni(Integer.parseInt(input.readLine()));
        System.out.print("Edad: ");
        per1.setEdad(Integer.parseInt(input.readLine()));
    }

}
