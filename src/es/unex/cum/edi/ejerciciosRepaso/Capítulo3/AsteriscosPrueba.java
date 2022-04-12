package es.unex.cum.edi.ejerciciosRepaso.Capítulo3;

class AsteriscosPrueba {

  public static void main(String[] args) {
    Asteriscos a = new Asteriscos();

    // *** Este trozo de código dibuja los patrones pedidos en el ejercicio ***
    System.out.println("Un triángulo:");
    a.dibujaTriangulo(2,5);
    
    System.out.println("\n\nUn rombo relleno hecho con dos triángulos:");
    a.dibujaTriangulo(2,5);
    a.dibujaTrianguloInvertido(3,4); 
    
    System.out.println("\n\nOtro rombo relleno:");
    a.dibujaRombo(2,10);
    
    System.out.println("\n\nUn rombo hueco hecho con dos triángulos:");
    a.dibujaTrianguloHueco(2,5);     // Rombo hueco (triángulo hueco + triángulo invertido hueco)
    a.dibujaTrianguloHuecoInvertido(3,4);
    
    System.out.println("\n\nOtro rombo hueco:");
    a.dibujaRomboHueco(2,10);
    
    System.out.println("\n\nPara terminar, un árbol de Navidad:");
    a.dibujaTriangulo(5,2);          // Árbol de navidad (3 triángulos + 1 rectángulo)
    a.dibujaTriangulo(3,4);
    a.dibujaTriangulo(0,7);
    a.dibujaRectangulo(5,3,7);
    System.out.println("\n\n");

    // *** Este trozo de código dibuja una iglesia ***
    /*
    a.dibujaRectangulo(29,1,4);
    a.dibujaRectangulo(25,10,1);
    a.dibujaRectangulo(29,1,4);
    a.dibujaTriangulo(10,20);
    a.dibujaRectangulo(10,40,20);
    */
    

  }
  
  
}
