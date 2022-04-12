package es.unex.cum.edi.ejerciciosRepaso.Capítulo3;

/**
  * Dibuja patrones con asteriscos utilizando bucles
  */

public class Asteriscos {
    
    /** Dibuja con asteriscos un patrón con forma de triángulo
      * @param offset Desplazamiento izquierdo (sangría) del triángulo
      * @param altura Altura del triángulo (en líneas de texto)
      */
    public void dibujaTriangulo(int offset, int altura) {
      
      int numAsteriscos = 1;
      int numEspacios = offset + (altura-1);

      for (int i = 1; i <= altura; i++) {
	  escribeCaracteres(' ', numEspacios);
          escribeCaracteres('*', numAsteriscos);
	  System.out.println();
	  numEspacios--;
	  numAsteriscos = numAsteriscos + 2;
      }

    }

    /** Dibuja con asteriscos un patrón con forma de triángulo invertido
      * @param offset Desplazamiento izquierdo (sangría) del triángulo
      * @param altura Altura del triángulo (en líneas de texto)
      */
    public void dibujaTrianguloInvertido(int offset, int altura) {

      int numEspacios = offset;
      int numAsteriscos = altura * 2 - 1;
      
      for (int i = 0; i < altura; i++) {
	escribeCaracteres(' ', numEspacios);
	escribeCaracteres('*', numAsteriscos);	
	System.out.println();
	numEspacios++;
	numAsteriscos = numAsteriscos - 2;
      }
    }


    /** Dibuja con asteriscos un patrón con forma de rectángulo
      * @param offset  Desplazamiento izquierdo (sangría) del rectángulo
      * @param anchura Anchura del rectángulo (en líneas de texto)
      * @param altura  Altura del rectángulo (en líneas de texto)
      */
    public void dibujaRectangulo(int offset, int anchura, int altura) {
      for (int i = 0; i < altura; i++) {
          escribeCaracteres(' ', offset);
          escribeCaracteres('*', anchura);
          System.out.println();
      }
    }

    /** Dibuja con asteriscos un patrón con forma de triángulo hueco
      * @param offset Desplazamiento izquierdo (sangría) del triángulo
      * @param altura Altura del triángulo (en líneas de texto)
      */
    public void dibujaTrianguloHueco(int offset, int altura) {


      int numEspacios = offset + altura;
      int numEspaciosInternos = 1;

      // Dibuja la punta superior
      escribeCaracteres(' ', numEspacios);
      System.out.println("*");
      numEspacios--;

      // Dibuja el resto del triángulo (menos la punta)
      for (int i = 0; i < altura; i++) {
          // Dibuja los espacios a la izquierda
          escribeCaracteres(' ', numEspacios);	  
          // Escribe el asterisco izquierdo
          System.out.print("*");
          // Dibuja los espacios interiores del rombo
          escribeCaracteres(' ', numEspaciosInternos);
          // Escribe el asterisco derecho y el salto de línea
          System.out.println("*");
          // Actualiza los contadores
	  numEspacios--;
	  numEspaciosInternos = numEspaciosInternos + 2;
      }
    }
    
    /** Dibuja con asteriscos un patrón con forma de triángulo hueco invertido
      * @param offset Desplazamiento izquierdo (sangría) del triángulo
      * @param altura Altura del triángulo (en líneas de texto)
      */
    public void dibujaTrianguloHuecoInvertido(int offset, int altura) {

      // Dibuja el triángulo (menos la punta)
      int numEspacios = offset;
      int numEspaciosInternos = altura * 2 - 1;

      for (int i = 0; i < altura; i++) {   
          // Dibuja los espacios a la izquierda
          escribeCaracteres(' ', numEspacios);
          // Escribe el asterisco izquierdo
          System.out.print("*");
          // Dibuja los espacios interiores del rombo
          escribeCaracteres(' ', numEspaciosInternos);
          // Escribe el asterisco derecho y el salto de línea
          System.out.println("*");
          // Actualiza los contadores
	  numEspacios = numEspacios + 1;
	  numEspaciosInternos = numEspaciosInternos - 2;
      }

      // Dibuja la punta inferior
      escribeCaracteres(' ', numEspacios);
      System.out.println("*");

    }


    /** Dibuja con asteriscos un patrón con forma de rombo relleno
      * @param offset Desplazamiento izquierdo (sangría) del rombo
      * @param altura Altura del rombo (en líneas de texto)
      */
    public void dibujaRombo(int offset, int altura) {
    
      // Primero dibujamos el triángulo superior
      dibujaTriangulo(offset, altura/2 + 1);
      
      // Y ahora dibujamos el triángulo inferior
      dibujaTrianguloInvertido(offset + 1, altura/2);      

   }

    /** Dibuja con asteriscos un patrón con forma de rombo hueco
      * @param offset Desplazamiento izquierdo (sangría) del rombo
      * @param altura Altura del rombo (en líneas de texto)
      */
    public void dibujaRomboHueco(int offset, int altura) {
    
      // Primero dibujamos el triángulo superior
      dibujaTrianguloHueco(offset, altura/2 + 1);
      
      // Y ahora dibujamos el triángulo inferior
      dibujaTrianguloHuecoInvertido(offset + 1, altura/2);      

   }

    
    /** Escribe en la salida estándar un carácter repetido varias veces
      * @param caracter      El carácter que va a imprimirse
      * @param repeticiones  El número de veces que el carácter debe imprimirse
      */
    public void escribeCaracteres(char caracter, int repeticiones) {
       for (int i = 0; i < repeticiones; i++) {
           System.out.print(caracter);
       }
    }
}







