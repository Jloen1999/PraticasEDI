package es.unex.cum.edi.ejerciciosRepaso.Capítulo4;
class Color {

   // Las clases Blanco y Negro están anidadas en Color

   class Blanco {
      Blanco() {
         System.out.println("Soy un color blanco");
      }
   }

   class Negro {
      Negro() {
         System.out.println("Soy un color negro");
      }

      // Aquí empiezan los métodos de la clase Color

      void pintaBlanco() {
         Blanco bl = new Blanco();
      }

      void pintaNegro() {
         Negro ng = new Negro();
      }
   }
}
