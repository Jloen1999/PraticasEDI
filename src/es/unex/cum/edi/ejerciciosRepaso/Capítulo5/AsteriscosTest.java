package es.unex.cum.edi.ejerciciosRepaso.Capítulo5;

public class AsteriscosTest {
   
   public static void main(String[] args) {

      String str = "Hola, Mundo";
      Asteriscos1 a1 = new Asteriscos1(str);
      Asteriscos2 a2 = new Asteriscos2(str);
      Asteriscos3 a3 = new Asteriscos3(str);

      a1.convertir();
      a2.convertir();
      a3.convertir();

      a1.mostrar();
      a2.mostrar();
      a3.mostrar();
   }

}
