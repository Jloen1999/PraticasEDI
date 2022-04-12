package es.unex.cum.edi.ejerciciosRepaso.Capítulo3;

class MayorMenorMedianoPrueba
{
   public static void main(String[] args)
   {
      int a, b, c;

      System.out.println("Por favor, introduzca tres números:");

      System.out.print("  Primer número: ");
      a = Integer.parseInt(System.console().readLine());

      System.out.print("  Segundo número: ");
      b = Integer.parseInt(System.console().readLine());

      System.out.print("  Tercer número: ");
      c = Integer.parseInt(System.console().readLine());

      MayorMenorMediano numeros = new MayorMenorMediano(a, b, c);

      System.out.println("El menor es: " + numeros.getMenor());
      System.out.println("El mediano es: " + numeros.getMediano());
      System.out.println("El mayor es: " + numeros.getMayor());

    }
}
