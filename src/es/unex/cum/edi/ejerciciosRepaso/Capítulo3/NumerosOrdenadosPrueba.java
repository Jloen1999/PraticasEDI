package es.unex.cum.edi.ejerciciosRepaso.Capítulo3;

class NumerosOrdenadosPrueba
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

      NumerosOrdenados num = new NumerosOrdenados(a, b, c);

      if (num.estanOrdenados())
         System.out.println("Los números están ordenados");
      else
         System.out.println("Los números NO están ordenados");

      if (num.sonConsecutivos())
         System.out.println("Los números son consecutivos");
      else
         System.out.println("Los números NO son consecutivos");

    }
}
