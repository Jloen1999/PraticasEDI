import java.io.*;

class ConversorDivisasPrueba
{
   public static void main(String[] args)
   {
      System.out.println("¿Qué tipo de cambio quieres?");
      double tipo;
      
      tipo = Double.parseDouble(System.console().readLine());
   
      ConversorDivisas f1 = new ConversorDivisas();    // Establece tipo de cambio a su valor por defecto (0.85)
      ConversorDivisas f2 = new ConversorDivisas(tipo);// Establece tipo de cambio al valor introducido por teclado
      double euros = 100.0;
      double libras = 100.0;
      
      System.out.println("Con el tipo de cambio = " + f1.getTipoCambio() + ":");
      System.out.println(euros + " euros son " + f1.eurosToLibras(euros) + " libras.");
      System.out.println(libras + " libras son " + f1.librasToEuros(libras) + " euros.\n");

      System.out.println("Con el tipo de cambio = " + f2.getTipoCambio() + ":");
      System.out.println(euros + " euros son " + f2.eurosToLibras(euros) + " libras.");
      System.out.println(libras + " libras son " + f2.librasToEuros(libras) + " euros.");
    }
}
