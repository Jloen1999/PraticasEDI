package es.unex.cum.edi.noevaluables.sesion1;
import java.lang.StringBuilder;
public class UsoStringBuilder {
  public static void main(String[] args)
  {
      StringBuilder cadena=new StringBuilder("Jose Luis");
      cadena.append(" Ela Nanguan");
      cadena.delete(1,4);
      System.out.println(cadena.toString());
  }
}
